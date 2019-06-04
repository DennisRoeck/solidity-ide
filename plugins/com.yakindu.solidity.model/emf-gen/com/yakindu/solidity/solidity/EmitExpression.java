/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.expressions.expressions.FeatureCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.EmitExpression#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getEmitExpression()
 * @model
 * @generated
 */
public interface EmitExpression extends FeatureCall {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(EventDefinition)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getEmitExpression_Event()
	 * @model
	 * @generated
	 */
	EventDefinition getEvent();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.EmitExpression#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventDefinition value);

} // EmitExpression
