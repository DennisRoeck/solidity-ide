/**
 * (c) committers of YAKINDU
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.base.expressions.expressions.ExpressionsPackage;

import org.yakindu.base.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.yakindu.solidity.solidity.SolidityFactory
 * @model kind="package"
 * @generated
 */
public interface SolidityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solidity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yakindu.com/solidity/Solidity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "solidity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolidityPackage eINSTANCE = com.yakindu.solidity.solidity.impl.SolidityPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.SolidityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.SolidityModelImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSolidityModel()
	 * @generated
	 */
	int SOLIDITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Sourceunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDITY_MODEL__SOURCEUNIT = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLIDITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.PragmaDirectiveImpl <em>Pragma Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.PragmaDirectiveImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaDirective()
	 * @generated
	 */
	int PRAGMA_DIRECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_DIRECTIVE__NAME = TypesPackage.PACKAGE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_DIRECTIVE__ID = TypesPackage.PACKAGE_MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_DIRECTIVE__ANNOTATIONS = TypesPackage.PACKAGE_MEMBER__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Pragma Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_DIRECTIVE_FEATURE_COUNT = TypesPackage.PACKAGE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.SuperTypeArgumentListImpl <em>Super Type Argument List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.SuperTypeArgumentListImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSuperTypeArgumentList()
	 * @generated
	 */
	int SUPER_TYPE_ARGUMENT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE_ARGUMENT_LIST__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Super Type Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE_ARGUMENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.StatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.BlockImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ModifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 4;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.BuildInModifierImpl <em>Build In Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.BuildInModifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBuildInModifier()
	 * @generated
	 */
	int BUILD_IN_MODIFIER = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_IN_MODIFIER__TYPE = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build In Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_IN_MODIFIER_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ModifierInvocationImpl <em>Modifier Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ModifierInvocationImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifierInvocation()
	 * @generated
	 */
	int MODIFIER_INVOCATION = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_INVOCATION__REFERENCE = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_INVOCATION__ARGUMENTS = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modifier Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_INVOCATION_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ThrowStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 8;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.SimpleStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSimpleStatement()
	 * @generated
	 */
	int SIMPLE_STATEMENT = 9;

	/**
	 * The number of structural features of the '<em>Simple Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.PlaceholderStatementImpl <em>Placeholder Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.PlaceholderStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPlaceholderStatement()
	 * @generated
	 */
	int PLACEHOLDER_STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Placeholder Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ReturnStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.DeleteStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getDeleteStatement()
	 * @generated
	 */
	int DELETE_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ContinueStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 13;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.BreakStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 14;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ExpressionStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = SIMPLE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = SIMPLE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.InlineAssemblyStatementImpl <em>Inline Assembly Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.InlineAssemblyStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getInlineAssemblyStatement()
	 * @generated
	 */
	int INLINE_ASSEMBLY_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ASSEMBLY_STATEMENT__KIND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ASSEMBLY_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inline Assembly Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ASSEMBLY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.VariableDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getVariableDefinition()
	 * @generated
	 */
	int VARIABLE_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__TYPE = TypesPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__TYPE_SPECIFIER = TypesPackage.PROPERTY__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__NAME = TypesPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ID = TypesPackage.PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ANNOTATIONS = TypesPackage.PROPERTY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__CONST = TypesPackage.PROPERTY__CONST;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__READONLY = TypesPackage.PROPERTY__READONLY;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__EXTERNAL = TypesPackage.PROPERTY__EXTERNAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__VISIBILITY = TypesPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__INITIAL_VALUE = TypesPackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__STORAGE = TypesPackage.PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IDENTIFIER = TypesPackage.PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_FEATURE_COUNT = TypesPackage.PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.IdentifierListImpl <em>Identifier List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.IdentifierListImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIdentifierList()
	 * @generated
	 */
	int IDENTIFIER_LIST = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_LIST__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.IfStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.WhileStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ForStatementImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 21;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INITIALIZATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Afterthought</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__AFTERTHOUGHT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.InlineAssemblyBlockImpl <em>Inline Assembly Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.InlineAssemblyBlockImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getInlineAssemblyBlock()
	 * @generated
	 */
	int INLINE_ASSEMBLY_BLOCK = 22;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ASSEMBLY_BLOCK__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Inline Assembly Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ASSEMBLY_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.AssemblyLocalBindingImpl <em>Assembly Local Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.AssemblyLocalBindingImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyLocalBinding()
	 * @generated
	 */
	int ASSEMBLY_LOCAL_BINDING = 23;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LOCAL_BINDING__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LOCAL_BINDING__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Assembly Local Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LOCAL_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.AssemblyAssignmentImpl <em>Assembly Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.AssemblyAssignmentImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyAssignment()
	 * @generated
	 */
	int ASSEMBLY_ASSIGNMENT = 24;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNMENT__LEFT_OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNMENT__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Right Opernd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNMENT__RIGHT_OPERND = 2;

	/**
	 * The number of structural features of the '<em>Assembly Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.AssemblyLabelImpl <em>Assembly Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.AssemblyLabelImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyLabel()
	 * @generated
	 */
	int ASSEMBLY_LABEL = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LABEL__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Assembly Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LABEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.FunctionalAssemblyExpressionImpl <em>Functional Assembly Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.FunctionalAssemblyExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionalAssemblyExpression()
	 * @generated
	 */
	int FUNCTIONAL_ASSEMBLY_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ASSEMBLY_EXPRESSION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ASSEMBLY_EXPRESSION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Functional Assembly Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ASSEMBLY_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.IDLiteralImpl <em>ID Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.IDLiteralImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIDLiteral()
	 * @generated
	 */
	int ID_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LITERAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>ID Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.DecimalNumberLiteralImpl <em>Decimal Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.DecimalNumberLiteralImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getDecimalNumberLiteral()
	 * @generated
	 */
	int DECIMAL_NUMBER_LITERAL = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_LITERAL__VALUE = ExpressionsPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_LITERAL__UNIT = ExpressionsPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decimal Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_NUMBER_LITERAL_FEATURE_COUNT = ExpressionsPackage.LITERAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.AddressLiteralImpl <em>Address Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.AddressLiteralImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAddressLiteral()
	 * @generated
	 */
	int ADDRESS_LITERAL = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LITERAL__VALUE = ExpressionsPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LITERAL_FEATURE_COUNT = ExpressionsPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.NamedArgumentImpl <em>Named Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.NamedArgumentImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNamedArgument()
	 * @generated
	 */
	int NAMED_ARGUMENT = 30;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__PARAMETER = ExpressionsPackage.ARGUMENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__VALUE = ExpressionsPackage.ARGUMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__REFERENCE = ExpressionsPackage.ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT_FEATURE_COUNT = ExpressionsPackage.ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.SimpleArgumentImpl <em>Simple Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.SimpleArgumentImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSimpleArgument()
	 * @generated
	 */
	int SIMPLE_ARGUMENT = 31;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ARGUMENT__PARAMETER = ExpressionsPackage.ARGUMENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ARGUMENT__VALUE = ExpressionsPackage.ARGUMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Simple Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ARGUMENT_FEATURE_COUNT = ExpressionsPackage.ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.MappingTypeSpecifierImpl <em>Mapping Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.MappingTypeSpecifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getMappingTypeSpecifier()
	 * @generated
	 */
	int MAPPING_TYPE_SPECIFIER = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_SPECIFIER__TYPE = TypesPackage.TYPE_SPECIFIER__TYPE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_SPECIFIER__TYPE_ARGUMENTS = TypesPackage.TYPE_SPECIFIER__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_SPECIFIER__KEY = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_SPECIFIER__VALUE = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_SPECIFIER_FEATURE_COUNT = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ArrayTypeSpecifierImpl <em>Array Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ArrayTypeSpecifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getArrayTypeSpecifier()
	 * @generated
	 */
	int ARRAY_TYPE_SPECIFIER = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFIER__TYPE = TypesPackage.TYPE_SPECIFIER__TYPE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFIER__TYPE_ARGUMENTS = TypesPackage.TYPE_SPECIFIER__TYPE_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFIER__INDEX = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFIER_FEATURE_COUNT = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.TypeSpecifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTypeSpecifier()
	 * @generated
	 */
	int TYPE_SPECIFIER = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER__TYPE = TypesPackage.TYPE_SPECIFIER__TYPE;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER__TYPE_ARGUMENTS = TypesPackage.TYPE_SPECIFIER__TYPE_ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER_FEATURE_COUNT = TypesPackage.TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.SourceUnitImpl <em>Source Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.SourceUnitImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSourceUnit()
	 * @generated
	 */
	int SOURCE_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__NAME = TypesPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__ID = TypesPackage.PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__ANNOTATIONS = TypesPackage.PACKAGE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__DOMAIN_ID = TypesPackage.PACKAGE__DOMAIN_ID;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__MEMBER = TypesPackage.PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__IMPORT = TypesPackage.PACKAGE__IMPORT;

	/**
	 * The feature id for the '<em><b>Pragma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__PRAGMA = TypesPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT__IMPORTS = TypesPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_UNIT_FEATURE_COUNT = TypesPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.PragmaSolidityDirectiveImpl <em>Pragma Solidity Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.PragmaSolidityDirectiveImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaSolidityDirective()
	 * @generated
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE__NAME = PRAGMA_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE__ID = PRAGMA_DIRECTIVE__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE__ANNOTATIONS = PRAGMA_DIRECTIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE__VERSION = PRAGMA_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pragma Solidity Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_SOLIDITY_DIRECTIVE_FEATURE_COUNT = PRAGMA_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.PragmaExperimentalDirectiveImpl <em>Pragma Experimental Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.PragmaExperimentalDirectiveImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaExperimentalDirective()
	 * @generated
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE__NAME = PRAGMA_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE__ID = PRAGMA_DIRECTIVE__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE__ANNOTATIONS = PRAGMA_DIRECTIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE__VALUE = PRAGMA_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pragma Experimental Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_EXPERIMENTAL_DIRECTIVE_FEATURE_COUNT = PRAGMA_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ImportDirectiveImpl <em>Import Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ImportDirectiveImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getImportDirective()
	 * @generated
	 */
	int IMPORT_DIRECTIVE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__NAME = TypesPackage.PACKAGE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__ID = TypesPackage.PACKAGE_MEMBER__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__ANNOTATIONS = TypesPackage.PACKAGE_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__IMPORTED_NAMESPACE = TypesPackage.PACKAGE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE__ALIAS = TypesPackage.PACKAGE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DIRECTIVE_FEATURE_COUNT = TypesPackage.PACKAGE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ContractDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContractDefinition()
	 * @generated
	 */
	int CONTRACT_DEFINITION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__NAME = TypesPackage.COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ID = TypesPackage.COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ANNOTATIONS = TypesPackage.COMPLEX_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__CONSTRAINT = TypesPackage.COMPLEX_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ABSTRACT = TypesPackage.COMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__VISIBLE = TypesPackage.COMPLEX_TYPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__SUPER_TYPES = TypesPackage.COMPLEX_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__TYPE_PARAMETERS = TypesPackage.COMPLEX_TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__FEATURES = TypesPackage.COMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__TYPE = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION__ARGUMENT_LIST = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contract Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEFINITION_FEATURE_COUNT = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.UsingForDeclarationImpl <em>Using For Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.UsingForDeclarationImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUsingForDeclaration()
	 * @generated
	 */
	int USING_FOR_DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__TYPE = TypesPackage.DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__TYPE_SPECIFIER = TypesPackage.DECLARATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__NAME = TypesPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__ID = TypesPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__ANNOTATIONS = TypesPackage.DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION__CONTRACT = TypesPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Using For Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_FOR_DECLARATION_FEATURE_COUNT = TypesPackage.DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.TypeDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE = TypesPackage.DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE_SPECIFIER = TypesPackage.DECLARATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = TypesPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ID = TypesPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ANNOTATIONS = TypesPackage.DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DEFINITION = TypesPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = TypesPackage.DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.StructDefinitionImpl <em>Struct Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.StructDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStructDefinition()
	 * @generated
	 */
	int STRUCT_DEFINITION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__NAME = TypesPackage.COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__ID = TypesPackage.COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__ANNOTATIONS = TypesPackage.COMPLEX_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__CONSTRAINT = TypesPackage.COMPLEX_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__ABSTRACT = TypesPackage.COMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__VISIBLE = TypesPackage.COMPLEX_TYPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__SUPER_TYPES = TypesPackage.COMPLEX_TYPE__SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__TYPE_PARAMETERS = TypesPackage.COMPLEX_TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__FEATURES = TypesPackage.COMPLEX_TYPE__FEATURES;

	/**
	 * The number of structural features of the '<em>Struct Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_FEATURE_COUNT = TypesPackage.COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ModifierDefinitionImpl <em>Modifier Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ModifierDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifierDefinition()
	 * @generated
	 */
	int MODIFIER_DEFINITION = 43;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__TYPE = TypesPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__TYPE_SPECIFIER = TypesPackage.OPERATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__NAME = TypesPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__ID = TypesPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__ANNOTATIONS = TypesPackage.OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__TYPE_PARAMETERS = TypesPackage.OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__PARAMETERS = TypesPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__VARIADIC = TypesPackage.OPERATION__VARIADIC;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION__BLOCK = TypesPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modifier Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_DEFINITION_FEATURE_COUNT = TypesPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ConstructorDefinitionImpl <em>Constructor Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ConstructorDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getConstructorDefinition()
	 * @generated
	 */
	int CONSTRUCTOR_DEFINITION = 44;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__TYPE = TypesPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__TYPE_SPECIFIER = TypesPackage.OPERATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__NAME = TypesPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__ID = TypesPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__ANNOTATIONS = TypesPackage.OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__TYPE_PARAMETERS = TypesPackage.OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__PARAMETERS = TypesPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__VARIADIC = TypesPackage.OPERATION__VARIADIC;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__MODIFIER = TypesPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION__BLOCK = TypesPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DEFINITION_FEATURE_COUNT = TypesPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.EventDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 45;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__TYPE = TypesPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__TYPE_SPECIFIER = TypesPackage.OPERATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__NAME = TypesPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__ID = TypesPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__ANNOTATIONS = TypesPackage.OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__TYPE_PARAMETERS = TypesPackage.OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__PARAMETERS = TypesPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__VARIADIC = TypesPackage.OPERATION__VARIADIC;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = TypesPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.FunctionDefinitionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TYPE = TypesPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TYPE_SPECIFIER = TypesPackage.OPERATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__NAME = TypesPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ID = TypesPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ANNOTATIONS = TypesPackage.OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TYPE_PARAMETERS = TypesPackage.OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PARAMETERS = TypesPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Variadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__VARIADIC = TypesPackage.OPERATION__VARIADIC;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__MODIFIER = TypesPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RETURN_PARAMETERS = TypesPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BLOCK = TypesPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = TypesPackage.OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ParameterImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TypesPackage.PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_SPECIFIER = TypesPackage.PARAMETER__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TypesPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_OPERATION = TypesPackage.PARAMETER__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAR_ARGS = TypesPackage.PARAMETER__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = TypesPackage.PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = TypesPackage.PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STORAGE = TypesPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TypesPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.IndexParameterImpl <em>Index Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.IndexParameterImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIndexParameter()
	 * @generated
	 */
	int INDEX_PARAMETER = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__TYPE = TypesPackage.PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__TYPE_SPECIFIER = TypesPackage.PARAMETER__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__NAME = TypesPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__OWNING_OPERATION = TypesPackage.PARAMETER__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__VAR_ARGS = TypesPackage.PARAMETER__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__OPTIONAL = TypesPackage.PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__ANNOTATIONS = TypesPackage.PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER__INDEXED = TypesPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PARAMETER_FEATURE_COUNT = TypesPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.IdentifierImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 49;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE = TypesPackage.DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE_SPECIFIER = TypesPackage.DECLARATION__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = TypesPackage.DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = TypesPackage.DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ANNOTATIONS = TypesPackage.DECLARATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = TypesPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.ExponentialExpressionImpl <em>Exponential Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.ExponentialExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getExponentialExpression()
	 * @generated
	 */
	int EXPONENTIAL_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_EXPRESSION__LEFT_OPERAND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_EXPRESSION__RIGHT_OPERAND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exponential Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.NumericalUnaryExpressionImpl <em>Numerical Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.NumericalUnaryExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNumericalUnaryExpression()
	 * @generated
	 */
	int NUMERICAL_UNARY_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_UNARY_EXPRESSION__OPERATOR = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_UNARY_EXPRESSION__OPERAND = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numerical Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_UNARY_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.NewInstanceExpressionImpl <em>New Instance Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.NewInstanceExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNewInstanceExpression()
	 * @generated
	 */
	int NEW_INSTANCE_EXPRESSION = 52;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__ARGUMENTS = ExpressionsPackage.FEATURE_CALL__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__OWNER = ExpressionsPackage.FEATURE_CALL__OWNER;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__FEATURE = ExpressionsPackage.FEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__OPERATION_CALL = ExpressionsPackage.FEATURE_CALL__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Array Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__ARRAY_SELECTOR = ExpressionsPackage.FEATURE_CALL__ARRAY_SELECTOR;

	/**
	 * The feature id for the '<em><b>Array Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__ARRAY_ACCESS = ExpressionsPackage.FEATURE_CALL__ARRAY_ACCESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION__TYPE = ExpressionsPackage.FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Instance Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.EmitExpressionImpl <em>Emit Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.EmitExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getEmitExpression()
	 * @generated
	 */
	int EMIT_EXPRESSION = 53;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__ARGUMENTS = ExpressionsPackage.FEATURE_CALL__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__OWNER = ExpressionsPackage.FEATURE_CALL__OWNER;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__FEATURE = ExpressionsPackage.FEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__OPERATION_CALL = ExpressionsPackage.FEATURE_CALL__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Array Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__ARRAY_SELECTOR = ExpressionsPackage.FEATURE_CALL__ARRAY_SELECTOR;

	/**
	 * The feature id for the '<em><b>Array Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__ARRAY_ACCESS = ExpressionsPackage.FEATURE_CALL__ARRAY_ACCESS;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION__EVENT = ExpressionsPackage.FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emit Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.TupleExpressionImpl <em>Tuple Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.TupleExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTupleExpression()
	 * @generated
	 */
	int TUPLE_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPRESSION__EXPRESSIONS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.impl.PrimitiveValueExpressionImpl <em>Primitive Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.impl.PrimitiveValueExpressionImpl
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPrimitiveValueExpression()
	 * @generated
	 */
	int PRIMITIVE_VALUE_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_EXPRESSION__VALUE = ExpressionsPackage.PRIMITIVE_VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Primitive Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.PRIMITIVE_VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.ContractType <em>Contract Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.ContractType
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContractType()
	 * @generated
	 */
	int CONTRACT_TYPE = 56;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.StorageLocation <em>Storage Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.StorageLocation
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStorageLocation()
	 * @generated
	 */
	int STORAGE_LOCATION = 57;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.Visibility
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 58;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.Unit
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 59;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.FunctionModifier <em>Function Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.FunctionModifier
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionModifier()
	 * @generated
	 */
	int FUNCTION_MODIFIER = 60;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.AssemblyKind <em>Assembly Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.AssemblyKind
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyKind()
	 * @generated
	 */
	int ASSEMBLY_KIND = 61;

	/**
	 * The meta object id for the '{@link com.yakindu.solidity.solidity.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.yakindu.solidity.solidity.UnaryOperator
	 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 62;


	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.SolidityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.yakindu.solidity.solidity.SolidityModel
	 * @generated
	 */
	EClass getSolidityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.SolidityModel#getSourceunit <em>Sourceunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourceunit</em>'.
	 * @see com.yakindu.solidity.solidity.SolidityModel#getSourceunit()
	 * @see #getSolidityModel()
	 * @generated
	 */
	EReference getSolidityModel_Sourceunit();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.PragmaDirective <em>Pragma Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma Directive</em>'.
	 * @see com.yakindu.solidity.solidity.PragmaDirective
	 * @generated
	 */
	EClass getPragmaDirective();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.SuperTypeArgumentList <em>Super Type Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Type Argument List</em>'.
	 * @see com.yakindu.solidity.solidity.SuperTypeArgumentList
	 * @generated
	 */
	EClass getSuperTypeArgumentList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.SuperTypeArgumentList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.yakindu.solidity.solidity.SuperTypeArgumentList#getArguments()
	 * @see #getSuperTypeArgumentList()
	 * @generated
	 */
	EReference getSuperTypeArgumentList_Arguments();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see com.yakindu.solidity.solidity.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see com.yakindu.solidity.solidity.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see com.yakindu.solidity.solidity.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.BuildInModifier <em>Build In Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build In Modifier</em>'.
	 * @see com.yakindu.solidity.solidity.BuildInModifier
	 * @generated
	 */
	EClass getBuildInModifier();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.BuildInModifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.yakindu.solidity.solidity.BuildInModifier#getType()
	 * @see #getBuildInModifier()
	 * @generated
	 */
	EAttribute getBuildInModifier_Type();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ModifierInvocation <em>Modifier Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier Invocation</em>'.
	 * @see com.yakindu.solidity.solidity.ModifierInvocation
	 * @generated
	 */
	EClass getModifierInvocation();

	/**
	 * Returns the meta object for the reference '{@link com.yakindu.solidity.solidity.ModifierInvocation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.yakindu.solidity.solidity.ModifierInvocation#getReference()
	 * @see #getModifierInvocation()
	 * @generated
	 */
	EReference getModifierInvocation_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.ModifierInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.yakindu.solidity.solidity.ModifierInvocation#getArguments()
	 * @see #getModifierInvocation()
	 * @generated
	 */
	EReference getModifierInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see com.yakindu.solidity.solidity.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.SimpleStatement <em>Simple Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Statement</em>'.
	 * @see com.yakindu.solidity.solidity.SimpleStatement
	 * @generated
	 */
	EClass getSimpleStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.PlaceholderStatement <em>Placeholder Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Statement</em>'.
	 * @see com.yakindu.solidity.solidity.PlaceholderStatement
	 * @generated
	 */
	EClass getPlaceholderStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.yakindu.solidity.solidity.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Statement</em>'.
	 * @see com.yakindu.solidity.solidity.DeleteStatement
	 * @generated
	 */
	EClass getDeleteStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.DeleteStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.yakindu.solidity.solidity.DeleteStatement#getExpression()
	 * @see #getDeleteStatement()
	 * @generated
	 */
	EReference getDeleteStatement_Expression();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see com.yakindu.solidity.solidity.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.yakindu.solidity.solidity.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.InlineAssemblyStatement <em>Inline Assembly Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Assembly Statement</em>'.
	 * @see com.yakindu.solidity.solidity.InlineAssemblyStatement
	 * @generated
	 */
	EClass getInlineAssemblyStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.yakindu.solidity.solidity.InlineAssemblyStatement#getKind()
	 * @see #getInlineAssemblyStatement()
	 * @generated
	 */
	EAttribute getInlineAssemblyStatement_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.InlineAssemblyStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see com.yakindu.solidity.solidity.InlineAssemblyStatement#getBlock()
	 * @see #getInlineAssemblyStatement()
	 * @generated
	 */
	EReference getInlineAssemblyStatement_Block();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.VariableDefinition <em>Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Definition</em>'.
	 * @see com.yakindu.solidity.solidity.VariableDefinition
	 * @generated
	 */
	EClass getVariableDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.VariableDefinition#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.yakindu.solidity.solidity.VariableDefinition#getVisibility()
	 * @see #getVariableDefinition()
	 * @generated
	 */
	EAttribute getVariableDefinition_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.VariableDefinition#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see com.yakindu.solidity.solidity.VariableDefinition#getInitialValue()
	 * @see #getVariableDefinition()
	 * @generated
	 */
	EReference getVariableDefinition_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.VariableDefinition#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see com.yakindu.solidity.solidity.VariableDefinition#getStorage()
	 * @see #getVariableDefinition()
	 * @generated
	 */
	EAttribute getVariableDefinition_Storage();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.VariableDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see com.yakindu.solidity.solidity.VariableDefinition#getIdentifier()
	 * @see #getVariableDefinition()
	 * @generated
	 */
	EReference getVariableDefinition_Identifier();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.IdentifierList <em>Identifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier List</em>'.
	 * @see com.yakindu.solidity.solidity.IdentifierList
	 * @generated
	 */
	EClass getIdentifierList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.IdentifierList#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see com.yakindu.solidity.solidity.IdentifierList#getIdentifier()
	 * @see #getIdentifierList()
	 * @generated
	 */
	EReference getIdentifierList_Identifier();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see com.yakindu.solidity.solidity.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.yakindu.solidity.solidity.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.IfStatement#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.yakindu.solidity.solidity.IfStatement#getThen()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.IfStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.yakindu.solidity.solidity.IfStatement#getElse()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Else();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see com.yakindu.solidity.solidity.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.yakindu.solidity.solidity.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see com.yakindu.solidity.solidity.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ForStatement#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see com.yakindu.solidity.solidity.ForStatement#getInitialization()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Initialization();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ForStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.yakindu.solidity.solidity.ForStatement#getCondition()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ForStatement#getAfterthought <em>Afterthought</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Afterthought</em>'.
	 * @see com.yakindu.solidity.solidity.ForStatement#getAfterthought()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Afterthought();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ForStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see com.yakindu.solidity.solidity.ForStatement#getStatement()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Statement();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.InlineAssemblyBlock <em>Inline Assembly Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Assembly Block</em>'.
	 * @see com.yakindu.solidity.solidity.InlineAssemblyBlock
	 * @generated
	 */
	EClass getInlineAssemblyBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.InlineAssemblyBlock#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.yakindu.solidity.solidity.InlineAssemblyBlock#getItems()
	 * @see #getInlineAssemblyBlock()
	 * @generated
	 */
	EReference getInlineAssemblyBlock_Items();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.AssemblyLocalBinding <em>Assembly Local Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Local Binding</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyLocalBinding
	 * @generated
	 */
	EClass getAssemblyLocalBinding();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.AssemblyLocalBinding#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyLocalBinding#getLabel()
	 * @see #getAssemblyLocalBinding()
	 * @generated
	 */
	EAttribute getAssemblyLocalBinding_Label();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.AssemblyLocalBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyLocalBinding#getExpression()
	 * @see #getAssemblyLocalBinding()
	 * @generated
	 */
	EReference getAssemblyLocalBinding_Expression();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.AssemblyAssignment <em>Assembly Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Assignment</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyAssignment
	 * @generated
	 */
	EClass getAssemblyAssignment();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.AssemblyAssignment#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Operand</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyAssignment#getLeftOperand()
	 * @see #getAssemblyAssignment()
	 * @generated
	 */
	EAttribute getAssemblyAssignment_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.AssemblyAssignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyAssignment#getExpression()
	 * @see #getAssemblyAssignment()
	 * @generated
	 */
	EReference getAssemblyAssignment_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.AssemblyAssignment#getRightOpernd <em>Right Opernd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Opernd</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyAssignment#getRightOpernd()
	 * @see #getAssemblyAssignment()
	 * @generated
	 */
	EAttribute getAssemblyAssignment_RightOpernd();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.AssemblyLabel <em>Assembly Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Label</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyLabel
	 * @generated
	 */
	EClass getAssemblyLabel();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.AssemblyLabel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyLabel#getLabel()
	 * @see #getAssemblyLabel()
	 * @generated
	 */
	EAttribute getAssemblyLabel_Label();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression <em>Functional Assembly Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Assembly Expression</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionalAssemblyExpression
	 * @generated
	 */
	EClass getFunctionalAssemblyExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getLabel()
	 * @see #getFunctionalAssemblyExpression()
	 * @generated
	 */
	EAttribute getFunctionalAssemblyExpression_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getParameters()
	 * @see #getFunctionalAssemblyExpression()
	 * @generated
	 */
	EReference getFunctionalAssemblyExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.IDLiteral <em>ID Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Literal</em>'.
	 * @see com.yakindu.solidity.solidity.IDLiteral
	 * @generated
	 */
	EClass getIDLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.IDLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.yakindu.solidity.solidity.IDLiteral#getValue()
	 * @see #getIDLiteral()
	 * @generated
	 */
	EAttribute getIDLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.DecimalNumberLiteral <em>Decimal Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Number Literal</em>'.
	 * @see com.yakindu.solidity.solidity.DecimalNumberLiteral
	 * @generated
	 */
	EClass getDecimalNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.yakindu.solidity.solidity.DecimalNumberLiteral#getValue()
	 * @see #getDecimalNumberLiteral()
	 * @generated
	 */
	EAttribute getDecimalNumberLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.yakindu.solidity.solidity.DecimalNumberLiteral#getUnit()
	 * @see #getDecimalNumberLiteral()
	 * @generated
	 */
	EAttribute getDecimalNumberLiteral_Unit();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.AddressLiteral <em>Address Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Literal</em>'.
	 * @see com.yakindu.solidity.solidity.AddressLiteral
	 * @generated
	 */
	EClass getAddressLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.AddressLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.yakindu.solidity.solidity.AddressLiteral#getValue()
	 * @see #getAddressLiteral()
	 * @generated
	 */
	EAttribute getAddressLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.NamedArgument <em>Named Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Argument</em>'.
	 * @see com.yakindu.solidity.solidity.NamedArgument
	 * @generated
	 */
	EClass getNamedArgument();

	/**
	 * Returns the meta object for the reference '{@link com.yakindu.solidity.solidity.NamedArgument#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.yakindu.solidity.solidity.NamedArgument#getReference()
	 * @see #getNamedArgument()
	 * @generated
	 */
	EReference getNamedArgument_Reference();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.SimpleArgument <em>Simple Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Argument</em>'.
	 * @see com.yakindu.solidity.solidity.SimpleArgument
	 * @generated
	 */
	EClass getSimpleArgument();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.MappingTypeSpecifier <em>Mapping Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Type Specifier</em>'.
	 * @see com.yakindu.solidity.solidity.MappingTypeSpecifier
	 * @generated
	 */
	EClass getMappingTypeSpecifier();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see com.yakindu.solidity.solidity.MappingTypeSpecifier#getKey()
	 * @see #getMappingTypeSpecifier()
	 * @generated
	 */
	EReference getMappingTypeSpecifier_Key();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.MappingTypeSpecifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.yakindu.solidity.solidity.MappingTypeSpecifier#getValue()
	 * @see #getMappingTypeSpecifier()
	 * @generated
	 */
	EReference getMappingTypeSpecifier_Value();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ArrayTypeSpecifier <em>Array Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Specifier</em>'.
	 * @see com.yakindu.solidity.solidity.ArrayTypeSpecifier
	 * @generated
	 */
	EClass getArrayTypeSpecifier();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.ArrayTypeSpecifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see com.yakindu.solidity.solidity.ArrayTypeSpecifier#getIndex()
	 * @see #getArrayTypeSpecifier()
	 * @generated
	 */
	EReference getArrayTypeSpecifier_Index();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.TypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specifier</em>'.
	 * @see com.yakindu.solidity.solidity.TypeSpecifier
	 * @generated
	 */
	EClass getTypeSpecifier();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.SourceUnit <em>Source Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Unit</em>'.
	 * @see com.yakindu.solidity.solidity.SourceUnit
	 * @generated
	 */
	EClass getSourceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.SourceUnit#getPragma <em>Pragma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pragma</em>'.
	 * @see com.yakindu.solidity.solidity.SourceUnit#getPragma()
	 * @see #getSourceUnit()
	 * @generated
	 */
	EReference getSourceUnit_Pragma();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.SourceUnit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.yakindu.solidity.solidity.SourceUnit#getImports()
	 * @see #getSourceUnit()
	 * @generated
	 */
	EReference getSourceUnit_Imports();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.PragmaSolidityDirective <em>Pragma Solidity Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma Solidity Directive</em>'.
	 * @see com.yakindu.solidity.solidity.PragmaSolidityDirective
	 * @generated
	 */
	EClass getPragmaSolidityDirective();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.PragmaSolidityDirective#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.yakindu.solidity.solidity.PragmaSolidityDirective#getVersion()
	 * @see #getPragmaSolidityDirective()
	 * @generated
	 */
	EAttribute getPragmaSolidityDirective_Version();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.PragmaExperimentalDirective <em>Pragma Experimental Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma Experimental Directive</em>'.
	 * @see com.yakindu.solidity.solidity.PragmaExperimentalDirective
	 * @generated
	 */
	EClass getPragmaExperimentalDirective();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.PragmaExperimentalDirective#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.yakindu.solidity.solidity.PragmaExperimentalDirective#getValue()
	 * @see #getPragmaExperimentalDirective()
	 * @generated
	 */
	EAttribute getPragmaExperimentalDirective_Value();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ImportDirective <em>Import Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Directive</em>'.
	 * @see com.yakindu.solidity.solidity.ImportDirective
	 * @generated
	 */
	EClass getImportDirective();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.ImportDirective#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see com.yakindu.solidity.solidity.ImportDirective#getImportedNamespace()
	 * @see #getImportDirective()
	 * @generated
	 */
	EAttribute getImportDirective_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.ImportDirective#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see com.yakindu.solidity.solidity.ImportDirective#getAlias()
	 * @see #getImportDirective()
	 * @generated
	 */
	EAttribute getImportDirective_Alias();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ContractDefinition <em>Contract Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Definition</em>'.
	 * @see com.yakindu.solidity.solidity.ContractDefinition
	 * @generated
	 */
	EClass getContractDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.ContractDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.yakindu.solidity.solidity.ContractDefinition#getType()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EAttribute getContractDefinition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.ContractDefinition#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument List</em>'.
	 * @see com.yakindu.solidity.solidity.ContractDefinition#getArgumentList()
	 * @see #getContractDefinition()
	 * @generated
	 */
	EReference getContractDefinition_ArgumentList();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.UsingForDeclaration <em>Using For Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using For Declaration</em>'.
	 * @see com.yakindu.solidity.solidity.UsingForDeclaration
	 * @generated
	 */
	EClass getUsingForDeclaration();

	/**
	 * Returns the meta object for the reference '{@link com.yakindu.solidity.solidity.UsingForDeclaration#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see com.yakindu.solidity.solidity.UsingForDeclaration#getContract()
	 * @see #getUsingForDeclaration()
	 * @generated
	 */
	EReference getUsingForDeclaration_Contract();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see com.yakindu.solidity.solidity.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.TypeDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see com.yakindu.solidity.solidity.TypeDefinition#getDefinition()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Definition();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.StructDefinition <em>Struct Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Definition</em>'.
	 * @see com.yakindu.solidity.solidity.StructDefinition
	 * @generated
	 */
	EClass getStructDefinition();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ModifierDefinition <em>Modifier Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier Definition</em>'.
	 * @see com.yakindu.solidity.solidity.ModifierDefinition
	 * @generated
	 */
	EClass getModifierDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ModifierDefinition#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see com.yakindu.solidity.solidity.ModifierDefinition#getBlock()
	 * @see #getModifierDefinition()
	 * @generated
	 */
	EReference getModifierDefinition_Block();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ConstructorDefinition <em>Constructor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Definition</em>'.
	 * @see com.yakindu.solidity.solidity.ConstructorDefinition
	 * @generated
	 */
	EClass getConstructorDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.ConstructorDefinition#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier</em>'.
	 * @see com.yakindu.solidity.solidity.ConstructorDefinition#getModifier()
	 * @see #getConstructorDefinition()
	 * @generated
	 */
	EReference getConstructorDefinition_Modifier();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ConstructorDefinition#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see com.yakindu.solidity.solidity.ConstructorDefinition#getBlock()
	 * @see #getConstructorDefinition()
	 * @generated
	 */
	EReference getConstructorDefinition_Block();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see com.yakindu.solidity.solidity.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.FunctionDefinition#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionDefinition#getModifier()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Modifier();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.FunctionDefinition#getReturnParameters <em>Return Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Parameters</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionDefinition#getReturnParameters()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_ReturnParameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.FunctionDefinition#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionDefinition#getBlock()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Block();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.yakindu.solidity.solidity.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.Parameter#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see com.yakindu.solidity.solidity.Parameter#getStorage()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Storage();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.IndexParameter <em>Index Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Parameter</em>'.
	 * @see com.yakindu.solidity.solidity.IndexParameter
	 * @generated
	 */
	EClass getIndexParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.IndexParameter#isIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexed</em>'.
	 * @see com.yakindu.solidity.solidity.IndexParameter#isIndexed()
	 * @see #getIndexParameter()
	 * @generated
	 */
	EAttribute getIndexParameter_Indexed();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see com.yakindu.solidity.solidity.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.ExponentialExpression <em>Exponential Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Expression</em>'.
	 * @see com.yakindu.solidity.solidity.ExponentialExpression
	 * @generated
	 */
	EClass getExponentialExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ExponentialExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see com.yakindu.solidity.solidity.ExponentialExpression#getLeftOperand()
	 * @see #getExponentialExpression()
	 * @generated
	 */
	EReference getExponentialExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.ExponentialExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see com.yakindu.solidity.solidity.ExponentialExpression#getRightOperand()
	 * @see #getExponentialExpression()
	 * @generated
	 */
	EReference getExponentialExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.NumericalUnaryExpression <em>Numerical Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Unary Expression</em>'.
	 * @see com.yakindu.solidity.solidity.NumericalUnaryExpression
	 * @generated
	 */
	EClass getNumericalUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.yakindu.solidity.solidity.NumericalUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.yakindu.solidity.solidity.NumericalUnaryExpression#getOperator()
	 * @see #getNumericalUnaryExpression()
	 * @generated
	 */
	EAttribute getNumericalUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.NumericalUnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.yakindu.solidity.solidity.NumericalUnaryExpression#getOperand()
	 * @see #getNumericalUnaryExpression()
	 * @generated
	 */
	EReference getNumericalUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.NewInstanceExpression <em>New Instance Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Instance Expression</em>'.
	 * @see com.yakindu.solidity.solidity.NewInstanceExpression
	 * @generated
	 */
	EClass getNewInstanceExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.yakindu.solidity.solidity.NewInstanceExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.yakindu.solidity.solidity.NewInstanceExpression#getType()
	 * @see #getNewInstanceExpression()
	 * @generated
	 */
	EReference getNewInstanceExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.EmitExpression <em>Emit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Expression</em>'.
	 * @see com.yakindu.solidity.solidity.EmitExpression
	 * @generated
	 */
	EClass getEmitExpression();

	/**
	 * Returns the meta object for the reference '{@link com.yakindu.solidity.solidity.EmitExpression#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see com.yakindu.solidity.solidity.EmitExpression#getEvent()
	 * @see #getEmitExpression()
	 * @generated
	 */
	EReference getEmitExpression_Event();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.TupleExpression <em>Tuple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Expression</em>'.
	 * @see com.yakindu.solidity.solidity.TupleExpression
	 * @generated
	 */
	EClass getTupleExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.yakindu.solidity.solidity.TupleExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.yakindu.solidity.solidity.TupleExpression#getExpressions()
	 * @see #getTupleExpression()
	 * @generated
	 */
	EReference getTupleExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link com.yakindu.solidity.solidity.PrimitiveValueExpression <em>Primitive Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value Expression</em>'.
	 * @see com.yakindu.solidity.solidity.PrimitiveValueExpression
	 * @generated
	 */
	EClass getPrimitiveValueExpression();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.ContractType <em>Contract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Type</em>'.
	 * @see com.yakindu.solidity.solidity.ContractType
	 * @generated
	 */
	EEnum getContractType();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.StorageLocation <em>Storage Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Location</em>'.
	 * @see com.yakindu.solidity.solidity.StorageLocation
	 * @generated
	 */
	EEnum getStorageLocation();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see com.yakindu.solidity.solidity.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see com.yakindu.solidity.solidity.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.FunctionModifier <em>Function Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Modifier</em>'.
	 * @see com.yakindu.solidity.solidity.FunctionModifier
	 * @generated
	 */
	EEnum getFunctionModifier();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.AssemblyKind <em>Assembly Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assembly Kind</em>'.
	 * @see com.yakindu.solidity.solidity.AssemblyKind
	 * @generated
	 */
	EEnum getAssemblyKind();

	/**
	 * Returns the meta object for enum '{@link com.yakindu.solidity.solidity.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see com.yakindu.solidity.solidity.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolidityFactory getSolidityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.SolidityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.SolidityModelImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSolidityModel()
		 * @generated
		 */
		EClass SOLIDITY_MODEL = eINSTANCE.getSolidityModel();

		/**
		 * The meta object literal for the '<em><b>Sourceunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLIDITY_MODEL__SOURCEUNIT = eINSTANCE.getSolidityModel_Sourceunit();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.PragmaDirectiveImpl <em>Pragma Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.PragmaDirectiveImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaDirective()
		 * @generated
		 */
		EClass PRAGMA_DIRECTIVE = eINSTANCE.getPragmaDirective();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.SuperTypeArgumentListImpl <em>Super Type Argument List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.SuperTypeArgumentListImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSuperTypeArgumentList()
		 * @generated
		 */
		EClass SUPER_TYPE_ARGUMENT_LIST = eINSTANCE.getSuperTypeArgumentList();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_TYPE_ARGUMENT_LIST__ARGUMENTS = eINSTANCE.getSuperTypeArgumentList_Arguments();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.BlockImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ModifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.BuildInModifierImpl <em>Build In Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.BuildInModifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBuildInModifier()
		 * @generated
		 */
		EClass BUILD_IN_MODIFIER = eINSTANCE.getBuildInModifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_IN_MODIFIER__TYPE = eINSTANCE.getBuildInModifier_Type();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ModifierInvocationImpl <em>Modifier Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ModifierInvocationImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifierInvocation()
		 * @generated
		 */
		EClass MODIFIER_INVOCATION = eINSTANCE.getModifierInvocation();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_INVOCATION__REFERENCE = eINSTANCE.getModifierInvocation_Reference();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_INVOCATION__ARGUMENTS = eINSTANCE.getModifierInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.StatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ThrowStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.SimpleStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSimpleStatement()
		 * @generated
		 */
		EClass SIMPLE_STATEMENT = eINSTANCE.getSimpleStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.PlaceholderStatementImpl <em>Placeholder Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.PlaceholderStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPlaceholderStatement()
		 * @generated
		 */
		EClass PLACEHOLDER_STATEMENT = eINSTANCE.getPlaceholderStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ReturnStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.DeleteStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getDeleteStatement()
		 * @generated
		 */
		EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_STATEMENT__EXPRESSION = eINSTANCE.getDeleteStatement_Expression();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ContinueStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.BreakStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ExpressionStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.InlineAssemblyStatementImpl <em>Inline Assembly Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.InlineAssemblyStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getInlineAssemblyStatement()
		 * @generated
		 */
		EClass INLINE_ASSEMBLY_STATEMENT = eINSTANCE.getInlineAssemblyStatement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ASSEMBLY_STATEMENT__KIND = eINSTANCE.getInlineAssemblyStatement_Kind();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ASSEMBLY_STATEMENT__BLOCK = eINSTANCE.getInlineAssemblyStatement_Block();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.VariableDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getVariableDefinition()
		 * @generated
		 */
		EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEFINITION__VISIBILITY = eINSTANCE.getVariableDefinition_Visibility();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEFINITION__INITIAL_VALUE = eINSTANCE.getVariableDefinition_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEFINITION__STORAGE = eINSTANCE.getVariableDefinition_Storage();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEFINITION__IDENTIFIER = eINSTANCE.getVariableDefinition_Identifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.IdentifierListImpl <em>Identifier List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.IdentifierListImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIdentifierList()
		 * @generated
		 */
		EClass IDENTIFIER_LIST = eINSTANCE.getIdentifierList();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_LIST__IDENTIFIER = eINSTANCE.getIdentifierList_Identifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.IfStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN = eINSTANCE.getIfStatement_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE = eINSTANCE.getIfStatement_Else();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.WhileStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BODY = eINSTANCE.getWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ForStatementImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__INITIALIZATION = eINSTANCE.getForStatement_Initialization();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONDITION = eINSTANCE.getForStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Afterthought</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__AFTERTHOUGHT = eINSTANCE.getForStatement_Afterthought();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getForStatement_Statement();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.InlineAssemblyBlockImpl <em>Inline Assembly Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.InlineAssemblyBlockImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getInlineAssemblyBlock()
		 * @generated
		 */
		EClass INLINE_ASSEMBLY_BLOCK = eINSTANCE.getInlineAssemblyBlock();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ASSEMBLY_BLOCK__ITEMS = eINSTANCE.getInlineAssemblyBlock_Items();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.AssemblyLocalBindingImpl <em>Assembly Local Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.AssemblyLocalBindingImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyLocalBinding()
		 * @generated
		 */
		EClass ASSEMBLY_LOCAL_BINDING = eINSTANCE.getAssemblyLocalBinding();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_LOCAL_BINDING__LABEL = eINSTANCE.getAssemblyLocalBinding_Label();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LOCAL_BINDING__EXPRESSION = eINSTANCE.getAssemblyLocalBinding_Expression();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.AssemblyAssignmentImpl <em>Assembly Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.AssemblyAssignmentImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyAssignment()
		 * @generated
		 */
		EClass ASSEMBLY_ASSIGNMENT = eINSTANCE.getAssemblyAssignment();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_ASSIGNMENT__LEFT_OPERAND = eINSTANCE.getAssemblyAssignment_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_ASSIGNMENT__EXPRESSION = eINSTANCE.getAssemblyAssignment_Expression();

		/**
		 * The meta object literal for the '<em><b>Right Opernd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_ASSIGNMENT__RIGHT_OPERND = eINSTANCE.getAssemblyAssignment_RightOpernd();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.AssemblyLabelImpl <em>Assembly Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.AssemblyLabelImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyLabel()
		 * @generated
		 */
		EClass ASSEMBLY_LABEL = eINSTANCE.getAssemblyLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_LABEL__LABEL = eINSTANCE.getAssemblyLabel_Label();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.FunctionalAssemblyExpressionImpl <em>Functional Assembly Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.FunctionalAssemblyExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionalAssemblyExpression()
		 * @generated
		 */
		EClass FUNCTIONAL_ASSEMBLY_EXPRESSION = eINSTANCE.getFunctionalAssemblyExpression();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_ASSEMBLY_EXPRESSION__LABEL = eINSTANCE.getFunctionalAssemblyExpression_Label();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ASSEMBLY_EXPRESSION__PARAMETERS = eINSTANCE.getFunctionalAssemblyExpression_Parameters();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.IDLiteralImpl <em>ID Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.IDLiteralImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIDLiteral()
		 * @generated
		 */
		EClass ID_LITERAL = eINSTANCE.getIDLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_LITERAL__VALUE = eINSTANCE.getIDLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.DecimalNumberLiteralImpl <em>Decimal Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.DecimalNumberLiteralImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getDecimalNumberLiteral()
		 * @generated
		 */
		EClass DECIMAL_NUMBER_LITERAL = eINSTANCE.getDecimalNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_NUMBER_LITERAL__VALUE = eINSTANCE.getDecimalNumberLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_NUMBER_LITERAL__UNIT = eINSTANCE.getDecimalNumberLiteral_Unit();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.AddressLiteralImpl <em>Address Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.AddressLiteralImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAddressLiteral()
		 * @generated
		 */
		EClass ADDRESS_LITERAL = eINSTANCE.getAddressLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_LITERAL__VALUE = eINSTANCE.getAddressLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.NamedArgumentImpl <em>Named Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.NamedArgumentImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNamedArgument()
		 * @generated
		 */
		EClass NAMED_ARGUMENT = eINSTANCE.getNamedArgument();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ARGUMENT__REFERENCE = eINSTANCE.getNamedArgument_Reference();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.SimpleArgumentImpl <em>Simple Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.SimpleArgumentImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSimpleArgument()
		 * @generated
		 */
		EClass SIMPLE_ARGUMENT = eINSTANCE.getSimpleArgument();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.MappingTypeSpecifierImpl <em>Mapping Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.MappingTypeSpecifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getMappingTypeSpecifier()
		 * @generated
		 */
		EClass MAPPING_TYPE_SPECIFIER = eINSTANCE.getMappingTypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TYPE_SPECIFIER__KEY = eINSTANCE.getMappingTypeSpecifier_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TYPE_SPECIFIER__VALUE = eINSTANCE.getMappingTypeSpecifier_Value();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ArrayTypeSpecifierImpl <em>Array Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ArrayTypeSpecifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getArrayTypeSpecifier()
		 * @generated
		 */
		EClass ARRAY_TYPE_SPECIFIER = eINSTANCE.getArrayTypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_SPECIFIER__INDEX = eINSTANCE.getArrayTypeSpecifier_Index();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.TypeSpecifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTypeSpecifier()
		 * @generated
		 */
		EClass TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.SourceUnitImpl <em>Source Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.SourceUnitImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getSourceUnit()
		 * @generated
		 */
		EClass SOURCE_UNIT = eINSTANCE.getSourceUnit();

		/**
		 * The meta object literal for the '<em><b>Pragma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_UNIT__PRAGMA = eINSTANCE.getSourceUnit_Pragma();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_UNIT__IMPORTS = eINSTANCE.getSourceUnit_Imports();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.PragmaSolidityDirectiveImpl <em>Pragma Solidity Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.PragmaSolidityDirectiveImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaSolidityDirective()
		 * @generated
		 */
		EClass PRAGMA_SOLIDITY_DIRECTIVE = eINSTANCE.getPragmaSolidityDirective();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMA_SOLIDITY_DIRECTIVE__VERSION = eINSTANCE.getPragmaSolidityDirective_Version();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.PragmaExperimentalDirectiveImpl <em>Pragma Experimental Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.PragmaExperimentalDirectiveImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPragmaExperimentalDirective()
		 * @generated
		 */
		EClass PRAGMA_EXPERIMENTAL_DIRECTIVE = eINSTANCE.getPragmaExperimentalDirective();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMA_EXPERIMENTAL_DIRECTIVE__VALUE = eINSTANCE.getPragmaExperimentalDirective_Value();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ImportDirectiveImpl <em>Import Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ImportDirectiveImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getImportDirective()
		 * @generated
		 */
		EClass IMPORT_DIRECTIVE = eINSTANCE.getImportDirective();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DIRECTIVE__IMPORTED_NAMESPACE = eINSTANCE.getImportDirective_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DIRECTIVE__ALIAS = eINSTANCE.getImportDirective_Alias();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ContractDefinitionImpl <em>Contract Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ContractDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContractDefinition()
		 * @generated
		 */
		EClass CONTRACT_DEFINITION = eINSTANCE.getContractDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_DEFINITION__TYPE = eINSTANCE.getContractDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_DEFINITION__ARGUMENT_LIST = eINSTANCE.getContractDefinition_ArgumentList();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.UsingForDeclarationImpl <em>Using For Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.UsingForDeclarationImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUsingForDeclaration()
		 * @generated
		 */
		EClass USING_FOR_DECLARATION = eINSTANCE.getUsingForDeclaration();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USING_FOR_DECLARATION__CONTRACT = eINSTANCE.getUsingForDeclaration_Contract();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.TypeDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__DEFINITION = eINSTANCE.getTypeDefinition_Definition();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.StructDefinitionImpl <em>Struct Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.StructDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStructDefinition()
		 * @generated
		 */
		EClass STRUCT_DEFINITION = eINSTANCE.getStructDefinition();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ModifierDefinitionImpl <em>Modifier Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ModifierDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getModifierDefinition()
		 * @generated
		 */
		EClass MODIFIER_DEFINITION = eINSTANCE.getModifierDefinition();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_DEFINITION__BLOCK = eINSTANCE.getModifierDefinition_Block();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ConstructorDefinitionImpl <em>Constructor Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ConstructorDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getConstructorDefinition()
		 * @generated
		 */
		EClass CONSTRUCTOR_DEFINITION = eINSTANCE.getConstructorDefinition();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DEFINITION__MODIFIER = eINSTANCE.getConstructorDefinition_Modifier();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_DEFINITION__BLOCK = eINSTANCE.getConstructorDefinition_Block();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.EventDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.FunctionDefinitionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__MODIFIER = eINSTANCE.getFunctionDefinition_Modifier();

		/**
		 * The meta object literal for the '<em><b>Return Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__RETURN_PARAMETERS = eINSTANCE.getFunctionDefinition_ReturnParameters();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__BLOCK = eINSTANCE.getFunctionDefinition_Block();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ParameterImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STORAGE = eINSTANCE.getParameter_Storage();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.IndexParameterImpl <em>Index Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.IndexParameterImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIndexParameter()
		 * @generated
		 */
		EClass INDEX_PARAMETER = eINSTANCE.getIndexParameter();

		/**
		 * The meta object literal for the '<em><b>Indexed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_PARAMETER__INDEXED = eINSTANCE.getIndexParameter_Indexed();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.IdentifierImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.ExponentialExpressionImpl <em>Exponential Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.ExponentialExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getExponentialExpression()
		 * @generated
		 */
		EClass EXPONENTIAL_EXPRESSION = eINSTANCE.getExponentialExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getExponentialExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getExponentialExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.NumericalUnaryExpressionImpl <em>Numerical Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.NumericalUnaryExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNumericalUnaryExpression()
		 * @generated
		 */
		EClass NUMERICAL_UNARY_EXPRESSION = eINSTANCE.getNumericalUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getNumericalUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERICAL_UNARY_EXPRESSION__OPERAND = eINSTANCE.getNumericalUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.NewInstanceExpressionImpl <em>New Instance Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.NewInstanceExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getNewInstanceExpression()
		 * @generated
		 */
		EClass NEW_INSTANCE_EXPRESSION = eINSTANCE.getNewInstanceExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_INSTANCE_EXPRESSION__TYPE = eINSTANCE.getNewInstanceExpression_Type();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.EmitExpressionImpl <em>Emit Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.EmitExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getEmitExpression()
		 * @generated
		 */
		EClass EMIT_EXPRESSION = eINSTANCE.getEmitExpression();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_EXPRESSION__EVENT = eINSTANCE.getEmitExpression_Event();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.TupleExpressionImpl <em>Tuple Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.TupleExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getTupleExpression()
		 * @generated
		 */
		EClass TUPLE_EXPRESSION = eINSTANCE.getTupleExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_EXPRESSION__EXPRESSIONS = eINSTANCE.getTupleExpression_Expressions();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.impl.PrimitiveValueExpressionImpl <em>Primitive Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.impl.PrimitiveValueExpressionImpl
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getPrimitiveValueExpression()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE_EXPRESSION = eINSTANCE.getPrimitiveValueExpression();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.ContractType <em>Contract Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.ContractType
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getContractType()
		 * @generated
		 */
		EEnum CONTRACT_TYPE = eINSTANCE.getContractType();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.StorageLocation <em>Storage Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.StorageLocation
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getStorageLocation()
		 * @generated
		 */
		EEnum STORAGE_LOCATION = eINSTANCE.getStorageLocation();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.Visibility
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.Unit
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.FunctionModifier <em>Function Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.FunctionModifier
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getFunctionModifier()
		 * @generated
		 */
		EEnum FUNCTION_MODIFIER = eINSTANCE.getFunctionModifier();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.AssemblyKind <em>Assembly Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.AssemblyKind
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getAssemblyKind()
		 * @generated
		 */
		EEnum ASSEMBLY_KIND = eINSTANCE.getAssemblyKind();

		/**
		 * The meta object literal for the '{@link com.yakindu.solidity.solidity.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.yakindu.solidity.solidity.UnaryOperator
		 * @see com.yakindu.solidity.solidity.impl.SolidityPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

	}

} //SolidityPackage
