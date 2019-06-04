/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.types.PackageMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.ImportDirective#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.ImportDirective#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getImportDirective()
 * @model
 * @generated
 */
public interface ImportDirective extends PackageMember {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getImportDirective_ImportedNamespace()
	 * @model
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.ImportDirective#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getImportDirective_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.ImportDirective#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // ImportDirective
