/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.types.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getKey <em>Key</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getMappingTypeSpecifier()
 * @model
 * @generated
 */
public interface MappingTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(TypeSpecifier)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getMappingTypeSpecifier_Key()
	 * @model containment="true"
	 * @generated
	 */
	TypeSpecifier getKey();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(TypeSpecifier value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TypeSpecifier)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getMappingTypeSpecifier_Value()
	 * @model containment="true"
	 * @generated
	 */
	TypeSpecifier getValue();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TypeSpecifier value);

} // MappingTypeSpecifier
