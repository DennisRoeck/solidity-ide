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
 * A representation of the literals of the enumeration '<em><b>Unary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.yakindu.solidity.solidity.SolidityPackage#getUnaryOperator()
 * @model
 * @generated
 */
public enum UnaryOperator implements Enumerator {
	/**
	 * The '<em><b>Increment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCREMENT(0, "increment", "++"),

	/**
	 * The '<em><b>Decrement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DECREMENT(1, "decrement", "--"),

	/**
	 * The '<em><b>Positive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE(2, "positive", "+"),

	/**
	 * The '<em><b>Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE(3, "negative", "-"),

	/**
	 * The '<em><b>Complement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEMENT(4, "complement", "~");

	/**
	 * The '<em><b>Increment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREMENT
	 * @model name="increment" literal="++"
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENT_VALUE = 0;

	/**
	 * The '<em><b>Decrement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREMENT
	 * @model name="decrement" literal="--"
	 * @generated
	 * @ordered
	 */
	public static final int DECREMENT_VALUE = 1;

	/**
	 * The '<em><b>Positive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE
	 * @model name="positive" literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_VALUE = 2;

	/**
	 * The '<em><b>Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE
	 * @model name="negative" literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_VALUE = 3;

	/**
	 * The '<em><b>Complement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT
	 * @model name="complement" literal="~"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Unary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnaryOperator[] VALUES_ARRAY =
		new UnaryOperator[] {
			INCREMENT,
			DECREMENT,
			POSITIVE,
			NEGATIVE,
			COMPLEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Unary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnaryOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unary Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperator get(int value) {
		switch (value) {
			case INCREMENT_VALUE: return INCREMENT;
			case DECREMENT_VALUE: return DECREMENT;
			case POSITIVE_VALUE: return POSITIVE;
			case NEGATIVE_VALUE: return NEGATIVE;
			case COMPLEMENT_VALUE: return COMPLEMENT;
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
	private UnaryOperator(int value, String name, String literal) {
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
	
} //UnaryOperator
