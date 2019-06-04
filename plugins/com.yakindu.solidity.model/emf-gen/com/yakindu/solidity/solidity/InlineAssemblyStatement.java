/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Assembly Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getKind <em>Kind</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getInlineAssemblyStatement()
 * @model
 * @generated
 */
public interface InlineAssemblyStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.yakindu.solidity.solidity.AssemblyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.yakindu.solidity.solidity.AssemblyKind
	 * @see #setKind(AssemblyKind)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getInlineAssemblyStatement_Kind()
	 * @model
	 * @generated
	 */
	AssemblyKind getKind();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.yakindu.solidity.solidity.AssemblyKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AssemblyKind value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(InlineAssemblyBlock)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getInlineAssemblyStatement_Block()
	 * @model containment="true"
	 * @generated
	 */
	InlineAssemblyBlock getBlock();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(InlineAssemblyBlock value);

} // InlineAssemblyStatement
