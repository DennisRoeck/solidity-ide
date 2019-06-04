/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity.impl;

import com.yakindu.solidity.solidity.ContractDefinition;
import com.yakindu.solidity.solidity.ContractType;
import com.yakindu.solidity.solidity.SolidityPackage;
import com.yakindu.solidity.solidity.SuperTypeArgumentList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.base.types.impl.ComplexTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.impl.ContractDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.impl.ContractDefinitionImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractDefinitionImpl extends ComplexTypeImpl implements ContractDefinition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContractType TYPE_EDEFAULT = ContractType.CONTRACT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContractType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperTypeArgumentList> argumentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityPackage.Literals.CONTRACT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ContractType newType) {
		ContractType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityPackage.CONTRACT_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperTypeArgumentList> getArgumentList() {
		if (argumentList == null) {
			argumentList = new EObjectContainmentEList<SuperTypeArgumentList>(SuperTypeArgumentList.class, this, SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST);
		}
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST:
				return ((InternalEList<?>)getArgumentList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityPackage.CONTRACT_DEFINITION__TYPE:
				return getType();
			case SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST:
				return getArgumentList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolidityPackage.CONTRACT_DEFINITION__TYPE:
				setType((ContractType)newValue);
				return;
			case SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST:
				getArgumentList().clear();
				getArgumentList().addAll((Collection<? extends SuperTypeArgumentList>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolidityPackage.CONTRACT_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST:
				getArgumentList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolidityPackage.CONTRACT_DEFINITION__TYPE:
				return type != TYPE_EDEFAULT;
			case SolidityPackage.CONTRACT_DEFINITION__ARGUMENT_LIST:
				return argumentList != null && !argumentList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ContractDefinitionImpl
