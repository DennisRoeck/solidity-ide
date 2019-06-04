/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Assembly Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.InlineAssemblyBlock#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getInlineAssemblyBlock()
 * @model
 * @generated
 */
public interface InlineAssemblyBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getInlineAssemblyBlock_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getItems();

} // InlineAssemblyBlock
