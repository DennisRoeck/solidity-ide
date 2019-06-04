/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.SolidityModel#getSourceunit <em>Sourceunit</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getSolidityModel()
 * @model
 * @generated
 */
public interface SolidityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Sourceunit</b></em>' containment reference list.
	 * The list contents are of type {@link org.yakindu.base.types.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourceunit</em>' containment reference list.
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getSolidityModel_Sourceunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.yakindu.base.types.Package> getSourceunit();

} // SolidityModel
