/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.yakindu.solidity.solidity.SolidityPackage
 * @generated
 */
public interface SolidityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolidityFactory eINSTANCE = com.yakindu.solidity.solidity.impl.SolidityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SolidityModel createSolidityModel();

	/**
	 * Returns a new object of class '<em>Pragma Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragma Directive</em>'.
	 * @generated
	 */
	PragmaDirective createPragmaDirective();

	/**
	 * Returns a new object of class '<em>Super Type Argument List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Type Argument List</em>'.
	 * @generated
	 */
	SuperTypeArgumentList createSuperTypeArgumentList();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier</em>'.
	 * @generated
	 */
	Modifier createModifier();

	/**
	 * Returns a new object of class '<em>Build In Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build In Modifier</em>'.
	 * @generated
	 */
	BuildInModifier createBuildInModifier();

	/**
	 * Returns a new object of class '<em>Modifier Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier Invocation</em>'.
	 * @generated
	 */
	ModifierInvocation createModifierInvocation();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Statement</em>'.
	 * @generated
	 */
	ThrowStatement createThrowStatement();

	/**
	 * Returns a new object of class '<em>Simple Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Statement</em>'.
	 * @generated
	 */
	SimpleStatement createSimpleStatement();

	/**
	 * Returns a new object of class '<em>Placeholder Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placeholder Statement</em>'.
	 * @generated
	 */
	PlaceholderStatement createPlaceholderStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Delete Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Statement</em>'.
	 * @generated
	 */
	DeleteStatement createDeleteStatement();

	/**
	 * Returns a new object of class '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Statement</em>'.
	 * @generated
	 */
	ContinueStatement createContinueStatement();

	/**
	 * Returns a new object of class '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Statement</em>'.
	 * @generated
	 */
	BreakStatement createBreakStatement();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>Inline Assembly Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Assembly Statement</em>'.
	 * @generated
	 */
	InlineAssemblyStatement createInlineAssemblyStatement();

	/**
	 * Returns a new object of class '<em>Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Definition</em>'.
	 * @generated
	 */
	VariableDefinition createVariableDefinition();

	/**
	 * Returns a new object of class '<em>Identifier List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier List</em>'.
	 * @generated
	 */
	IdentifierList createIdentifierList();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>Inline Assembly Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Assembly Block</em>'.
	 * @generated
	 */
	InlineAssemblyBlock createInlineAssemblyBlock();

	/**
	 * Returns a new object of class '<em>Assembly Local Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Local Binding</em>'.
	 * @generated
	 */
	AssemblyLocalBinding createAssemblyLocalBinding();

	/**
	 * Returns a new object of class '<em>Assembly Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Assignment</em>'.
	 * @generated
	 */
	AssemblyAssignment createAssemblyAssignment();

	/**
	 * Returns a new object of class '<em>Assembly Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Label</em>'.
	 * @generated
	 */
	AssemblyLabel createAssemblyLabel();

	/**
	 * Returns a new object of class '<em>Functional Assembly Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Assembly Expression</em>'.
	 * @generated
	 */
	FunctionalAssemblyExpression createFunctionalAssemblyExpression();

	/**
	 * Returns a new object of class '<em>ID Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ID Literal</em>'.
	 * @generated
	 */
	IDLiteral createIDLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Number Literal</em>'.
	 * @generated
	 */
	DecimalNumberLiteral createDecimalNumberLiteral();

	/**
	 * Returns a new object of class '<em>Address Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Literal</em>'.
	 * @generated
	 */
	AddressLiteral createAddressLiteral();

	/**
	 * Returns a new object of class '<em>Named Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Argument</em>'.
	 * @generated
	 */
	NamedArgument createNamedArgument();

	/**
	 * Returns a new object of class '<em>Simple Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Argument</em>'.
	 * @generated
	 */
	SimpleArgument createSimpleArgument();

	/**
	 * Returns a new object of class '<em>Mapping Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Type Specifier</em>'.
	 * @generated
	 */
	MappingTypeSpecifier createMappingTypeSpecifier();

	/**
	 * Returns a new object of class '<em>Array Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Specifier</em>'.
	 * @generated
	 */
	ArrayTypeSpecifier createArrayTypeSpecifier();

	/**
	 * Returns a new object of class '<em>Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Specifier</em>'.
	 * @generated
	 */
	TypeSpecifier createTypeSpecifier();

	/**
	 * Returns a new object of class '<em>Source Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Unit</em>'.
	 * @generated
	 */
	SourceUnit createSourceUnit();

	/**
	 * Returns a new object of class '<em>Pragma Solidity Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragma Solidity Directive</em>'.
	 * @generated
	 */
	PragmaSolidityDirective createPragmaSolidityDirective();

	/**
	 * Returns a new object of class '<em>Pragma Experimental Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pragma Experimental Directive</em>'.
	 * @generated
	 */
	PragmaExperimentalDirective createPragmaExperimentalDirective();

	/**
	 * Returns a new object of class '<em>Import Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Directive</em>'.
	 * @generated
	 */
	ImportDirective createImportDirective();

	/**
	 * Returns a new object of class '<em>Contract Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Definition</em>'.
	 * @generated
	 */
	ContractDefinition createContractDefinition();

	/**
	 * Returns a new object of class '<em>Using For Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Using For Declaration</em>'.
	 * @generated
	 */
	UsingForDeclaration createUsingForDeclaration();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns a new object of class '<em>Struct Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Definition</em>'.
	 * @generated
	 */
	StructDefinition createStructDefinition();

	/**
	 * Returns a new object of class '<em>Modifier Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier Definition</em>'.
	 * @generated
	 */
	ModifierDefinition createModifierDefinition();

	/**
	 * Returns a new object of class '<em>Constructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Definition</em>'.
	 * @generated
	 */
	ConstructorDefinition createConstructorDefinition();

	/**
	 * Returns a new object of class '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Definition</em>'.
	 * @generated
	 */
	EventDefinition createEventDefinition();

	/**
	 * Returns a new object of class '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Definition</em>'.
	 * @generated
	 */
	FunctionDefinition createFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Index Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Parameter</em>'.
	 * @generated
	 */
	IndexParameter createIndexParameter();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>Exponential Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Expression</em>'.
	 * @generated
	 */
	ExponentialExpression createExponentialExpression();

	/**
	 * Returns a new object of class '<em>Numerical Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Unary Expression</em>'.
	 * @generated
	 */
	NumericalUnaryExpression createNumericalUnaryExpression();

	/**
	 * Returns a new object of class '<em>New Instance Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Instance Expression</em>'.
	 * @generated
	 */
	NewInstanceExpression createNewInstanceExpression();

	/**
	 * Returns a new object of class '<em>Emit Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emit Expression</em>'.
	 * @generated
	 */
	EmitExpression createEmitExpression();

	/**
	 * Returns a new object of class '<em>Tuple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Expression</em>'.
	 * @generated
	 */
	TupleExpression createTupleExpression();

	/**
	 * Returns a new object of class '<em>Primitive Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Value Expression</em>'.
	 * @generated
	 */
	PrimitiveValueExpression createPrimitiveValueExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SolidityPackage getSolidityPackage();

} //SolidityFactory
