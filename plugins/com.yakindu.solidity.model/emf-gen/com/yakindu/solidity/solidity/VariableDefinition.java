/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.expressions.expressions.Expression;

import org.yakindu.base.types.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.VariableDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.VariableDefinition#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.VariableDefinition#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.VariableDefinition#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends Property, SimpleStatement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link com.yakindu.solidity.solidity.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see com.yakindu.solidity.solidity.Visibility
	 * @see #setVisibility(Visibility)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getVariableDefinition_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.VariableDefinition#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see com.yakindu.solidity.solidity.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getVariableDefinition_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.VariableDefinition#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link com.yakindu.solidity.solidity.StorageLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see com.yakindu.solidity.solidity.StorageLocation
	 * @see #setStorage(StorageLocation)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getVariableDefinition_Storage()
	 * @model
	 * @generated
	 */
	StorageLocation getStorage();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.VariableDefinition#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see com.yakindu.solidity.solidity.StorageLocation
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(StorageLocation value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierList)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getVariableDefinition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierList getIdentifier();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.VariableDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierList value);

} // VariableDefinition
