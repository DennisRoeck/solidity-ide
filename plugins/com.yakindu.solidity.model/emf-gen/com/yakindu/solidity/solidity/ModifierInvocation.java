/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.common.util.EList;

import org.yakindu.base.expressions.expressions.Argument;

import org.yakindu.base.types.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.ModifierInvocation#getReference <em>Reference</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.ModifierInvocation#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getModifierInvocation()
 * @model
 * @generated
 */
public interface ModifierInvocation extends Modifier {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Operation)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getModifierInvocation_Reference()
	 * @model
	 * @generated
	 */
	Operation getReference();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.ModifierInvocation#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Operation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.yakindu.base.expressions.expressions.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getModifierInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // ModifierInvocation
