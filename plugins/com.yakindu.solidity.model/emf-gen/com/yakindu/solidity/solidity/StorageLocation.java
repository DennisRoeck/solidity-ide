/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Storage Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.yakindu.solidity.solidity.SolidityPackage#getStorageLocation()
 * @model
 * @generated
 */
public enum StorageLocation implements Enumerator {
	/**
	 * The '<em><b>MEMORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(0, "MEMORY", "memory"),

	/**
	 * The '<em><b>STORAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE(1, "STORAGE", "storage"),

	/**
	 * The '<em><b>CALLDATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALLDATA_VALUE
	 * @generated
	 * @ordered
	 */
	CALLDATA(2, "CALLDATA", "calldata");

	/**
	 * The '<em><b>MEMORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model literal="memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 0;

	/**
	 * The '<em><b>STORAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @model literal="storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_VALUE = 1;

	/**
	 * The '<em><b>CALLDATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALLDATA
	 * @model literal="calldata"
	 * @generated
	 * @ordered
	 */
	public static final int CALLDATA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Storage Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StorageLocation[] VALUES_ARRAY =
		new StorageLocation[] {
			MEMORY,
			STORAGE,
			CALLDATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Storage Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StorageLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Storage Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageLocation get(int value) {
		switch (value) {
			case MEMORY_VALUE: return MEMORY;
			case STORAGE_VALUE: return STORAGE;
			case CALLDATA_VALUE: return CALLDATA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StorageLocation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StorageLocation
