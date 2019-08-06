package com.yakindu.solidity.ide.internal

import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.lsp4j.CodeAction
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.WorkspaceEdit
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2
import com.yakindu.solidity.SolidityVersion
import com.google.inject.name.Named


import static com.yakindu.solidity.validation.IssueCodes.*

class SolidityIdeCodeActionService implements ICodeActionService2 {

	@Inject @Named(SolidityVersion.SOLIDITY_VERSION) String solcVersion

	protected def addTextEdit(WorkspaceEdit edit, URI uri, TextEdit... textEdit) {
		edit.changes.put(uri.toString, textEdit)
	}
	
	override getCodeActions(Options options) {
		val resource = options.resource
		val params = options.codeActionParams
		val actions = newArrayList
		for (d : params.context.diagnostics) {
			if (d.code.hasSolution) {
				actions += Either.forRight(new CodeAction => [
					title = d.code.label
					diagnostics = #[d]
					edit = new WorkspaceEdit() => [
						addTextEdit(resource.URI, new TextEdit => [
							range = d.range
							newText = d.code.fix
						])
					]
				])
			}
		}
		return actions
	}
	
	
	def String getLabel(String issueCode) {
		switch (issueCode) {
			case WARNING_SOLIDITY_VERSION_NOT_THE_DEFAULT : '''Change version to «solcVersion»'''
			case ERROR_STATE_MUTABILITY_ONLY_ALLOWED_FOR_ADDRESS : '''Remove payable declaration'''
			case ERROR_MEMBER_TRANSFER_NOT_FOUND_OR_VISIBLE: '''Add payable to declaration'''
			case ERROR_INVALID_IMPLICID_CONVERSION_TO_ADDRESS_PAYABLE: ''''''
			default: ""
		}
	}
	
	def String getFix(String issueCode) {
		switch (issueCode) {
			case WARNING_SOLIDITY_VERSION_NOT_THE_DEFAULT : solcVersion
			case ERROR_STATE_MUTABILITY_ONLY_ALLOWED_FOR_ADDRESS: ""
			case ERROR_MEMBER_TRANSFER_NOT_FOUND_OR_VISIBLE : ''' payable'''
			case ERROR_INVALID_IMPLICID_CONVERSION_TO_ADDRESS_PAYABLE : ''' payable'''
			default: ""
		}
	}
	
	def boolean hasSolution(String issueCode) {
		return !issueCode.label.nullOrEmpty
	}

}
