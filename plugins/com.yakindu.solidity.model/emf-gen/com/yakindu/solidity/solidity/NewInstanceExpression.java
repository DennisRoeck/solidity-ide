/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.expressions.expressions.FeatureCall;

import org.yakindu.base.types.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Instance Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.NewInstanceExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getNewInstanceExpression()
 * @model
 * @generated
 */
public interface NewInstanceExpression extends FeatureCall {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeSpecifier)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getNewInstanceExpression_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeSpecifier getType();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.NewInstanceExpression#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSpecifier value);

} // NewInstanceExpression
