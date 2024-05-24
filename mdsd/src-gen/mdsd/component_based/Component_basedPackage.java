/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mdsd.component_based.Component_basedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Component_basedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component_based";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/component_based";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component_based";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Component_basedPackage eINSTANCE = mdsd.component_based.impl.Component_basedPackageImpl.init();

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ERepositoryImpl <em>ERepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ERepositoryImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERepository()
	 * @generated
	 */
	int EREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>ERepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ERepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ESignatureImpl <em>ESignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ESignatureImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESignature()
	 * @generated
	 */
	int ESIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE__CORRESPONDS_TO = 3;

	/**
	 * The number of structural features of the '<em>ESignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ESignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EComponentImpl <em>EComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EComponentImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEComponent()
	 * @generated
	 */
	int ECOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provides Interface To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__PROVIDES_INTERFACE_TO = 1;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__BEHAVIOUR_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Uses Interface From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__USES_INTERFACE_FROM = 3;

	/**
	 * The feature id for the '<em><b>Provides Directly</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__PROVIDES_DIRECTLY = 4;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__PROVIDES = 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__REQUIRES = 6;

	/**
	 * The number of structural features of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Provides Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EInterfaceImpl <em>EInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EInterfaceImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEInterface()
	 * @generated
	 */
	int EINTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Results In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__RESULTS_IN = 2;

	/**
	 * The feature id for the '<em><b>Provided By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__PROVIDED_BY_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Provided By System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__PROVIDED_BY_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Required By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__REQUIRED_BY_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Required By System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE__REQUIRED_BY_SYSTEM = 6;

	/**
	 * The number of structural features of the '<em>EInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Interface Required By Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE___INTERFACE_REQUIRED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Interface Provided By Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE___INTERFACE_PROVIDED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>EInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERFACE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EParameterImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EServiceImpl <em>EService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EServiceImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEService()
	 * @generated
	 */
	int ESERVICE = 5;

	/**
	 * The number of structural features of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAssemblyContextImpl <em>EAssembly Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAssemblyContextImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyContext()
	 * @generated
	 */
	int EASSEMBLY_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Allocated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__ALLOCATED = 2;

	/**
	 * The feature id for the '<em><b>Encapsulated By Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Encapsulated By System</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT__INSTANTIATES = 5;

	/**
	 * The number of structural features of the '<em>EAssembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Encapsulation Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT___ENCAPSULATION_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Connector Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT___CONNECTOR_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Provides Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT___PROVIDES_ROLE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Requires Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT___REQUIRES_ROLE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>EAssembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONTEXT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ECompositeComponentImpl <em>EComposite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ECompositeComponentImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getECompositeComponent()
	 * @generated
	 */
	int ECOMPOSITE_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__NAME = ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provides Interface To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__PROVIDES_INTERFACE_TO = ECOMPONENT__PROVIDES_INTERFACE_TO;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__BEHAVIOUR_DESCRIPTION = ECOMPONENT__BEHAVIOUR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uses Interface From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__USES_INTERFACE_FROM = ECOMPONENT__USES_INTERFACE_FROM;

	/**
	 * The feature id for the '<em><b>Provides Directly</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__PROVIDES_DIRECTLY = ECOMPONENT__PROVIDES_DIRECTLY;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__PROVIDES = ECOMPONENT__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__REQUIRES = ECOMPONENT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Encapsulates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT__ENCAPSULATES = ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EComposite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT_FEATURE_COUNT = ECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Provides Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>EComposite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITE_COMPONENT_OPERATION_COUNT = ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ESystemImpl <em>ESystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ESystemImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESystem()
	 * @generated
	 */
	int ESYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM__PROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM__REQUIRES = 1;

	/**
	 * The feature id for the '<em><b>Encapsulates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM__ENCAPSULATES = 2;

	/**
	 * The number of structural features of the '<em>ESystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ESystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAssemblyConnectorImpl <em>EAssembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAssemblyConnectorImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyConnector()
	 * @generated
	 */
	int EASSEMBLY_CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONNECTOR__LINK_TO = 0;

	/**
	 * The feature id for the '<em><b>Link From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONNECTOR__LINK_FROM = 1;

	/**
	 * The number of structural features of the '<em>EAssembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EAssembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EContainerImpl <em>EContainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EContainerImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEContainer()
	 * @generated
	 */
	int ECONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTAINER__CONNECTED_TO = 1;

	/**
	 * The number of structural features of the '<em>EContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EContainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ELinkImpl <em>ELink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ELinkImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getELink()
	 * @generated
	 */
	int ELINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK__CONNECTS = 1;

	/**
	 * The number of structural features of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ELink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAllocationContextImpl <em>EAllocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAllocationContextImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAllocationContext()
	 * @generated
	 */
	int EALLOCATION_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_CONTEXT__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Specifies For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_CONTEXT__SPECIFIES_FOR = 1;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_CONTEXT__SPECIFIES = 2;

	/**
	 * The number of structural features of the '<em>EAllocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EAllocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EDelegationConnectorImpl <em>EDelegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EDelegationConnectorImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEDelegationConnector()
	 * @generated
	 */
	int EDELEGATION_CONNECTOR = 15;

	/**
	 * The number of structural features of the '<em>EDelegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDELEGATION_CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EDelegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDELEGATION_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ERequiredDelegationConnectorImpl <em>ERequired Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ERequiredDelegationConnectorImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERequiredDelegationConnector()
	 * @generated
	 */
	int EREQUIRED_DELEGATION_CONNECTOR = 13;

	/**
	 * The feature id for the '<em><b>Link From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM = EDELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_DELEGATION_CONNECTOR__LINK_TO = EDELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERequired Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_DELEGATION_CONNECTOR_FEATURE_COUNT = EDELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Required Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_DELEGATION_CONNECTOR___REQUIRED_CONSTRAINT__DIAGNOSTICCHAIN_MAP = EDELEGATION_CONNECTOR_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>ERequired Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_DELEGATION_CONNECTOR_OPERATION_COUNT = EDELEGATION_CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EProvidedDelegationConnectorImpl <em>EProvided Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EProvidedDelegationConnectorImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEProvidedDelegationConnector()
	 * @generated
	 */
	int EPROVIDED_DELEGATION_CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Link From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM = EDELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_DELEGATION_CONNECTOR__LINK_TO = EDELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EProvided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_DELEGATION_CONNECTOR_FEATURE_COUNT = EDELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Provided Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_DELEGATION_CONNECTOR___PROVIDED_CONSTRAINT__DIAGNOSTICCHAIN_MAP = EDELEGATION_CONNECTOR_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>EProvided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_DELEGATION_CONNECTOR_OPERATION_COUNT = EDELEGATION_CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ERoleImpl <em>ERole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ERoleImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERole()
	 * @generated
	 */
	int EROLE = 16;

	/**
	 * The feature id for the '<em><b>Role Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EROLE__ROLE_OF = 0;

	/**
	 * The number of structural features of the '<em>ERole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ERole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ERequiredRoleImpl <em>ERequired Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ERequiredRoleImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERequiredRole()
	 * @generated
	 */
	int EREQUIRED_ROLE = 17;

	/**
	 * The feature id for the '<em><b>Role Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_ROLE__ROLE_OF = EROLE__ROLE_OF;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_ROLE__LINKED_TO = EROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ERequired Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_ROLE_FEATURE_COUNT = EROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ERequired Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREQUIRED_ROLE_OPERATION_COUNT = EROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EProvidedRoleImpl <em>EProvided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EProvidedRoleImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEProvidedRole()
	 * @generated
	 */
	int EPROVIDED_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Role Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_ROLE__ROLE_OF = EROLE__ROLE_OF;

	/**
	 * The feature id for the '<em><b>Linked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_ROLE__LINKED_FROM = EROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EProvided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_ROLE_FEATURE_COUNT = EROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EProvided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROVIDED_ROLE_OPERATION_COUNT = EROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.EViewType <em>EView Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.EViewType
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEViewType()
	 * @generated
	 */
	int EVIEW_TYPE = 32;

	/**
	 * The number of structural features of the '<em>EView Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EView Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EEnvironmentViewTypeImpl <em>EEnvironment View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EEnvironmentViewTypeImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEEnvironmentViewType()
	 * @generated
	 */
	int EENVIRONMENT_VIEW_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Shows Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS = EVIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shows Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS = EVIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEnvironment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENVIRONMENT_VIEW_TYPE_FEATURE_COUNT = EVIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EEnvironment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENVIRONMENT_VIEW_TYPE_OPERATION_COUNT = EVIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAllocationViewTypeImpl <em>EAllocation View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAllocationViewTypeImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAllocationViewType()
	 * @generated
	 */
	int EALLOCATION_VIEW_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_VIEW_TYPE__INCLUDES = EVIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAllocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_VIEW_TYPE_FEATURE_COUNT = EVIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Show Component Allocations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_VIEW_TYPE___SHOW_COMPONENT_ALLOCATIONS = EVIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAllocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EALLOCATION_VIEW_TYPE_OPERATION_COUNT = EVIEW_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAssemblyViewTypeImpl <em>EAssembly View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAssemblyViewTypeImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyViewType()
	 * @generated
	 */
	int EASSEMBLY_VIEW_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Main Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS = EVIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shows Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS = EVIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EAssembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_TYPE_FEATURE_COUNT = EVIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Show Component Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_TYPE___SHOW_COMPONENT_CONNECTIONS = EVIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAssembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_TYPE_OPERATION_COUNT = EVIEW_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ERepositoryViewTypeImpl <em>ERepository View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ERepositoryViewTypeImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERepositoryViewType()
	 * @generated
	 */
	int EREPOSITORY_VIEW_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Shows Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS = EVIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shows Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES = EVIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERepository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_VIEW_TYPE_FEATURE_COUNT = EVIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ERepository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREPOSITORY_VIEW_TYPE_OPERATION_COUNT = EVIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.EViewPoint <em>EView Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.EViewPoint
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEViewPoint()
	 * @generated
	 */
	int EVIEW_POINT = 23;

	/**
	 * The number of structural features of the '<em>EView Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EView Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ESystemIndependentViewPointImpl <em>ESystem Independent View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ESystemIndependentViewPointImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESystemIndependentViewPoint()
	 * @generated
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT = 24;

	/**
	 * The feature id for the '<em><b>Repository View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ESystem Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ESystem Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EAssemblyViewPointImpl <em>EAssembly View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EAssemblyViewPointImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyViewPoint()
	 * @generated
	 */
	int EASSEMBLY_VIEW_POINT = 25;

	/**
	 * The feature id for the '<em><b>Assembly View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAssembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAssembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EDeploymentViewPointImpl <em>EDeployment View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EDeploymentViewPointImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEDeploymentViewPoint()
	 * @generated
	 */
	int EDEPLOYMENT_VIEW_POINT = 26;

	/**
	 * The feature id for the '<em><b>Environment View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EDeployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EDeployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EBehaviourDescriptionImpl <em>EBehaviour Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EBehaviourDescriptionImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEBehaviourDescription()
	 * @generated
	 */
	int EBEHAVIOUR_DESCRIPTION = 27;

	/**
	 * The feature id for the '<em><b>Internal Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION__LOOP = 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION__BRANCH = 2;

	/**
	 * The feature id for the '<em><b>External Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL = 3;

	/**
	 * The number of structural features of the '<em>EBehaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EBehaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEHAVIOUR_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EInternalActionImpl <em>EInternal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EInternalActionImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEInternalAction()
	 * @generated
	 */
	int EINTERNAL_ACTION = 28;

	/**
	 * The number of structural features of the '<em>EInternal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERNAL_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EInternal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERNAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EExternalCallImpl <em>EExternal Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EExternalCallImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEExternalCall()
	 * @generated
	 */
	int EEXTERNAL_CALL = 29;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXTERNAL_CALL__TO = 0;

	/**
	 * The number of structural features of the '<em>EExternal Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXTERNAL_CALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EExternal Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXTERNAL_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.EBranchImpl <em>EBranch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.EBranchImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEBranch()
	 * @generated
	 */
	int EBRANCH = 30;

	/**
	 * The number of structural features of the '<em>EBranch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBRANCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EBranch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.impl.ELoopImpl <em>ELoop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.impl.ELoopImpl
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getELoop()
	 * @generated
	 */
	int ELOOP = 31;

	/**
	 * The number of structural features of the '<em>ELoop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELOOP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ELoop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.PossibleReturnTypes <em>Possible Return Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.PossibleReturnTypes
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getPossibleReturnTypes()
	 * @generated
	 */
	int POSSIBLE_RETURN_TYPES = 33;

	/**
	 * The meta object id for the '{@link mdsd.component_based.PossibleParameterTypes <em>Possible Parameter Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.PossibleParameterTypes
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getPossibleParameterTypes()
	 * @generated
	 */
	int POSSIBLE_PARAMETER_TYPES = 34;

	/**
	 * The meta object id for the '<em>EVoid</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Void
	 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEVoid()
	 * @generated
	 */
	int EVOID = 35;

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ERepository <em>ERepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERepository</em>'.
	 * @see mdsd.component_based.ERepository
	 * @generated
	 */
	EClass getERepository();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.ERepository#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see mdsd.component_based.ERepository#getComponent()
	 * @see #getERepository()
	 * @generated
	 */
	EReference getERepository_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.ERepository#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see mdsd.component_based.ERepository#getInterface()
	 * @see #getERepository()
	 * @generated
	 */
	EReference getERepository_Interface();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ESignature <em>ESignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESignature</em>'.
	 * @see mdsd.component_based.ESignature
	 * @generated
	 */
	EClass getESignature();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.ESignature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.ESignature#getName()
	 * @see #getESignature()
	 * @generated
	 */
	EAttribute getESignature_Name();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.ESignature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see mdsd.component_based.ESignature#getReturnType()
	 * @see #getESignature()
	 * @generated
	 */
	EAttribute getESignature_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.ESignature#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see mdsd.component_based.ESignature#getParameter()
	 * @see #getESignature()
	 * @generated
	 */
	EReference getESignature_Parameter();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ESignature#getCorrespondsTo <em>Corresponds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Corresponds To</em>'.
	 * @see mdsd.component_based.ESignature#getCorrespondsTo()
	 * @see #getESignature()
	 * @generated
	 */
	EReference getESignature_CorrespondsTo();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComponent</em>'.
	 * @see mdsd.component_based.EComponent
	 * @generated
	 */
	EClass getEComponent();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.EComponent#getName()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Name();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EComponent#getProvidesInterfaceTo <em>Provides Interface To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Interface To</em>'.
	 * @see mdsd.component_based.EComponent#getProvidesInterfaceTo()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_ProvidesInterfaceTo();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.EComponent#getBehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour Description</em>'.
	 * @see mdsd.component_based.EComponent#getBehaviourDescription()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_BehaviourDescription();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EComponent#getUsesInterfaceFrom <em>Uses Interface From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Interface From</em>'.
	 * @see mdsd.component_based.EComponent#getUsesInterfaceFrom()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_UsesInterfaceFrom();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EComponent#getProvidesDirectly <em>Provides Directly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Directly</em>'.
	 * @see mdsd.component_based.EComponent#getProvidesDirectly()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_ProvidesDirectly();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EComponent#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see mdsd.component_based.EComponent#getProvides()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_Provides();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EComponent#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see mdsd.component_based.EComponent#getRequires()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_Requires();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EComponent#providesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provides Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Constraint</em>' operation.
	 * @see mdsd.component_based.EComponent#providesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEComponent__ProvidesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EInterface <em>EInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInterface</em>'.
	 * @see mdsd.component_based.EInterface
	 * @generated
	 */
	EClass getEInterface();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.EInterface#getName()
	 * @see #getEInterface()
	 * @generated
	 */
	EAttribute getEInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EInterface#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature</em>'.
	 * @see mdsd.component_based.EInterface#getSignature()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_Signature();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EInterface#getResultsIn <em>Results In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results In</em>'.
	 * @see mdsd.component_based.EInterface#getResultsIn()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_ResultsIn();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EInterface#getProvidedByComponent <em>Provided By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By Component</em>'.
	 * @see mdsd.component_based.EInterface#getProvidedByComponent()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_ProvidedByComponent();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EInterface#getProvidedBySystem <em>Provided By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By System</em>'.
	 * @see mdsd.component_based.EInterface#getProvidedBySystem()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_ProvidedBySystem();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EInterface#getRequiredByComponent <em>Required By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By Component</em>'.
	 * @see mdsd.component_based.EInterface#getRequiredByComponent()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_RequiredByComponent();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EInterface#getRequiredBySystem <em>Required By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By System</em>'.
	 * @see mdsd.component_based.EInterface#getRequiredBySystem()
	 * @see #getEInterface()
	 * @generated
	 */
	EReference getEInterface_RequiredBySystem();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EInterface#interfaceRequiredByConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Interface Required By Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interface Required By Constraint</em>' operation.
	 * @see mdsd.component_based.EInterface#interfaceRequiredByConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEInterface__InterfaceRequiredByConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EInterface#interfaceProvidedByConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Interface Provided By Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interface Provided By Constraint</em>' operation.
	 * @see mdsd.component_based.EInterface#interfaceProvidedByConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEInterface__InterfaceProvidedByConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see mdsd.component_based.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.EParameter#getName()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mdsd.component_based.EParameter#getType()
	 * @see #getEParameter()
	 * @generated
	 */
	EAttribute getEParameter_Type();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EService <em>EService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EService</em>'.
	 * @see mdsd.component_based.EService
	 * @generated
	 */
	EClass getEService();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAssemblyContext <em>EAssembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAssembly Context</em>'.
	 * @see mdsd.component_based.EAssemblyContext
	 * @generated
	 */
	EClass getEAssemblyContext();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EAssemblyContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getName()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EAttribute getEAssemblyContext_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EAssemblyContext#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getRoles()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EReference getEAssemblyContext_Roles();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EAssemblyContext#getAllocated <em>Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getAllocated()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EReference getEAssemblyContext_Allocated();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAssemblyContext#getEncapsulatedByComponent <em>Encapsulated By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated By Component</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getEncapsulatedByComponent()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EReference getEAssemblyContext_EncapsulatedByComponent();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAssemblyContext#getEncapsulatedBySystem <em>Encapsulated By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated By System</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getEncapsulatedBySystem()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EReference getEAssemblyContext_EncapsulatedBySystem();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAssemblyContext#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates</em>'.
	 * @see mdsd.component_based.EAssemblyContext#getInstantiates()
	 * @see #getEAssemblyContext()
	 * @generated
	 */
	EReference getEAssemblyContext_Instantiates();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAssemblyContext#encapsulationConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encapsulation Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encapsulation Constraint</em>' operation.
	 * @see mdsd.component_based.EAssemblyContext#encapsulationConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEAssemblyContext__EncapsulationConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAssemblyContext#connectorConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Connector Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connector Constraint</em>' operation.
	 * @see mdsd.component_based.EAssemblyContext#connectorConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEAssemblyContext__ConnectorConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAssemblyContext#providesRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provides Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provides Role</em>' operation.
	 * @see mdsd.component_based.EAssemblyContext#providesRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEAssemblyContext__ProvidesRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAssemblyContext#requiresRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Requires Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requires Role</em>' operation.
	 * @see mdsd.component_based.EAssemblyContext#requiresRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEAssemblyContext__RequiresRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ECompositeComponent <em>EComposite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComposite Component</em>'.
	 * @see mdsd.component_based.ECompositeComponent
	 * @generated
	 */
	EClass getECompositeComponent();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ECompositeComponent#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates</em>'.
	 * @see mdsd.component_based.ECompositeComponent#getEncapsulates()
	 * @see #getECompositeComponent()
	 * @generated
	 */
	EReference getECompositeComponent_Encapsulates();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ESystem <em>ESystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESystem</em>'.
	 * @see mdsd.component_based.ESystem
	 * @generated
	 */
	EClass getESystem();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ESystem#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see mdsd.component_based.ESystem#getProvides()
	 * @see #getESystem()
	 * @generated
	 */
	EReference getESystem_Provides();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ESystem#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see mdsd.component_based.ESystem#getRequires()
	 * @see #getESystem()
	 * @generated
	 */
	EReference getESystem_Requires();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ESystem#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates</em>'.
	 * @see mdsd.component_based.ESystem#getEncapsulates()
	 * @see #getESystem()
	 * @generated
	 */
	EReference getESystem_Encapsulates();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAssemblyConnector <em>EAssembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAssembly Connector</em>'.
	 * @see mdsd.component_based.EAssemblyConnector
	 * @generated
	 */
	EClass getEAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EAssemblyConnector#getLinkFrom <em>Link From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link From</em>'.
	 * @see mdsd.component_based.EAssemblyConnector#getLinkFrom()
	 * @see #getEAssemblyConnector()
	 * @generated
	 */
	EReference getEAssemblyConnector_LinkFrom();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EAssemblyConnector#getLinkTo <em>Link To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To</em>'.
	 * @see mdsd.component_based.EAssemblyConnector#getLinkTo()
	 * @see #getEAssemblyConnector()
	 * @generated
	 */
	EReference getEAssemblyConnector_LinkTo();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EContainer <em>EContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EContainer</em>'.
	 * @see mdsd.component_based.EContainer
	 * @generated
	 */
	EClass getEContainer();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.EContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.EContainer#getName()
	 * @see #getEContainer()
	 * @generated
	 */
	EAttribute getEContainer_Name();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EContainer#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see mdsd.component_based.EContainer#getConnectedTo()
	 * @see #getEContainer()
	 * @generated
	 */
	EReference getEContainer_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELink</em>'.
	 * @see mdsd.component_based.ELink
	 * @generated
	 */
	EClass getELink();

	/**
	 * Returns the meta object for the attribute '{@link mdsd.component_based.ELink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdsd.component_based.ELink#getName()
	 * @see #getELink()
	 * @generated
	 */
	EAttribute getELink_Name();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ELink#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connects</em>'.
	 * @see mdsd.component_based.ELink#getConnects()
	 * @see #getELink()
	 * @generated
	 */
	EReference getELink_Connects();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAllocationContext <em>EAllocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAllocation Context</em>'.
	 * @see mdsd.component_based.EAllocationContext
	 * @generated
	 */
	EClass getEAllocationContext();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAllocationContext#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see mdsd.component_based.EAllocationContext#getControls()
	 * @see #getEAllocationContext()
	 * @generated
	 */
	EReference getEAllocationContext_Controls();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAllocationContext#getSpecifiesFor <em>Specifies For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifies For</em>'.
	 * @see mdsd.component_based.EAllocationContext#getSpecifiesFor()
	 * @see #getEAllocationContext()
	 * @generated
	 */
	EReference getEAllocationContext_SpecifiesFor();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EAllocationContext#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specifies</em>'.
	 * @see mdsd.component_based.EAllocationContext#getSpecifies()
	 * @see #getEAllocationContext()
	 * @generated
	 */
	EReference getEAllocationContext_Specifies();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ERequiredDelegationConnector <em>ERequired Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERequired Delegation Connector</em>'.
	 * @see mdsd.component_based.ERequiredDelegationConnector
	 * @generated
	 */
	EClass getERequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.ERequiredDelegationConnector#getLinkFrom <em>Link From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link From</em>'.
	 * @see mdsd.component_based.ERequiredDelegationConnector#getLinkFrom()
	 * @see #getERequiredDelegationConnector()
	 * @generated
	 */
	EReference getERequiredDelegationConnector_LinkFrom();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.ERequiredDelegationConnector#getLinkTo <em>Link To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To</em>'.
	 * @see mdsd.component_based.ERequiredDelegationConnector#getLinkTo()
	 * @see #getERequiredDelegationConnector()
	 * @generated
	 */
	EReference getERequiredDelegationConnector_LinkTo();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.ERequiredDelegationConnector#requiredConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Required Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Required Constraint</em>' operation.
	 * @see mdsd.component_based.ERequiredDelegationConnector#requiredConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getERequiredDelegationConnector__RequiredConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EProvidedDelegationConnector <em>EProvided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProvided Delegation Connector</em>'.
	 * @see mdsd.component_based.EProvidedDelegationConnector
	 * @generated
	 */
	EClass getEProvidedDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EProvidedDelegationConnector#getLinkFrom <em>Link From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link From</em>'.
	 * @see mdsd.component_based.EProvidedDelegationConnector#getLinkFrom()
	 * @see #getEProvidedDelegationConnector()
	 * @generated
	 */
	EReference getEProvidedDelegationConnector_LinkFrom();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EProvidedDelegationConnector#getLinkTo <em>Link To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To</em>'.
	 * @see mdsd.component_based.EProvidedDelegationConnector#getLinkTo()
	 * @see #getEProvidedDelegationConnector()
	 * @generated
	 */
	EReference getEProvidedDelegationConnector_LinkTo();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EProvidedDelegationConnector#providedConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provided Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provided Constraint</em>' operation.
	 * @see mdsd.component_based.EProvidedDelegationConnector#providedConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEProvidedDelegationConnector__ProvidedConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EDelegationConnector <em>EDelegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDelegation Connector</em>'.
	 * @see mdsd.component_based.EDelegationConnector
	 * @generated
	 */
	EClass getEDelegationConnector();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ERole <em>ERole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERole</em>'.
	 * @see mdsd.component_based.ERole
	 * @generated
	 */
	EClass getERole();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.ERole#getRoleOf <em>Role Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Of</em>'.
	 * @see mdsd.component_based.ERole#getRoleOf()
	 * @see #getERole()
	 * @generated
	 */
	EReference getERole_RoleOf();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ERequiredRole <em>ERequired Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERequired Role</em>'.
	 * @see mdsd.component_based.ERequiredRole
	 * @generated
	 */
	EClass getERequiredRole();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.ERequiredRole#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see mdsd.component_based.ERequiredRole#getLinkedTo()
	 * @see #getERequiredRole()
	 * @generated
	 */
	EReference getERequiredRole_LinkedTo();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EProvidedRole <em>EProvided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProvided Role</em>'.
	 * @see mdsd.component_based.EProvidedRole
	 * @generated
	 */
	EClass getEProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EProvidedRole#getLinkedFrom <em>Linked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked From</em>'.
	 * @see mdsd.component_based.EProvidedRole#getLinkedFrom()
	 * @see #getEProvidedRole()
	 * @generated
	 */
	EReference getEProvidedRole_LinkedFrom();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EEnvironmentViewType <em>EEnvironment View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnvironment View Type</em>'.
	 * @see mdsd.component_based.EEnvironmentViewType
	 * @generated
	 */
	EClass getEEnvironmentViewType();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EEnvironmentViewType#getShowsContainers <em>Shows Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shows Containers</em>'.
	 * @see mdsd.component_based.EEnvironmentViewType#getShowsContainers()
	 * @see #getEEnvironmentViewType()
	 * @generated
	 */
	EReference getEEnvironmentViewType_ShowsContainers();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EEnvironmentViewType#getShowsLinks <em>Shows Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shows Links</em>'.
	 * @see mdsd.component_based.EEnvironmentViewType#getShowsLinks()
	 * @see #getEEnvironmentViewType()
	 * @generated
	 */
	EReference getEEnvironmentViewType_ShowsLinks();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAllocationViewType <em>EAllocation View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAllocation View Type</em>'.
	 * @see mdsd.component_based.EAllocationViewType
	 * @generated
	 */
	EClass getEAllocationViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EAllocationViewType#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see mdsd.component_based.EAllocationViewType#getIncludes()
	 * @see #getEAllocationViewType()
	 * @generated
	 */
	EReference getEAllocationViewType_Includes();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAllocationViewType#showComponentAllocations() <em>Show Component Allocations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Component Allocations</em>' operation.
	 * @see mdsd.component_based.EAllocationViewType#showComponentAllocations()
	 * @generated
	 */
	EOperation getEAllocationViewType__ShowComponentAllocations();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAssemblyViewType <em>EAssembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAssembly View Type</em>'.
	 * @see mdsd.component_based.EAssemblyViewType
	 * @generated
	 */
	EClass getEAssemblyViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EAssemblyViewType#getMainArtifacts <em>Main Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Main Artifacts</em>'.
	 * @see mdsd.component_based.EAssemblyViewType#getMainArtifacts()
	 * @see #getEAssemblyViewType()
	 * @generated
	 */
	EReference getEAssemblyViewType_MainArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.EAssemblyViewType#getShowsComponents <em>Shows Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shows Components</em>'.
	 * @see mdsd.component_based.EAssemblyViewType#getShowsComponents()
	 * @see #getEAssemblyViewType()
	 * @generated
	 */
	EReference getEAssemblyViewType_ShowsComponents();

	/**
	 * Returns the meta object for the '{@link mdsd.component_based.EAssemblyViewType#showComponentConnections() <em>Show Component Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Component Connections</em>' operation.
	 * @see mdsd.component_based.EAssemblyViewType#showComponentConnections()
	 * @generated
	 */
	EOperation getEAssemblyViewType__ShowComponentConnections();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ERepositoryViewType <em>ERepository View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERepository View Type</em>'.
	 * @see mdsd.component_based.ERepositoryViewType
	 * @generated
	 */
	EClass getERepositoryViewType();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ERepositoryViewType#getShowsComponents <em>Shows Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shows Components</em>'.
	 * @see mdsd.component_based.ERepositoryViewType#getShowsComponents()
	 * @see #getERepositoryViewType()
	 * @generated
	 */
	EReference getERepositoryViewType_ShowsComponents();

	/**
	 * Returns the meta object for the reference list '{@link mdsd.component_based.ERepositoryViewType#getShowsInterfaces <em>Shows Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shows Interfaces</em>'.
	 * @see mdsd.component_based.ERepositoryViewType#getShowsInterfaces()
	 * @see #getERepositoryViewType()
	 * @generated
	 */
	EReference getERepositoryViewType_ShowsInterfaces();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EViewPoint <em>EView Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EView Point</em>'.
	 * @see mdsd.component_based.EViewPoint
	 * @generated
	 */
	EClass getEViewPoint();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ESystemIndependentViewPoint <em>ESystem Independent View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESystem Independent View Point</em>'.
	 * @see mdsd.component_based.ESystemIndependentViewPoint
	 * @generated
	 */
	EClass getESystemIndependentViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.ESystemIndependentViewPoint#getRepositoryViewType <em>Repository View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository View Type</em>'.
	 * @see mdsd.component_based.ESystemIndependentViewPoint#getRepositoryViewType()
	 * @see #getESystemIndependentViewPoint()
	 * @generated
	 */
	EReference getESystemIndependentViewPoint_RepositoryViewType();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EAssemblyViewPoint <em>EAssembly View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAssembly View Point</em>'.
	 * @see mdsd.component_based.EAssemblyViewPoint
	 * @generated
	 */
	EClass getEAssemblyViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.EAssemblyViewPoint#getAssemblyViewType <em>Assembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly View Type</em>'.
	 * @see mdsd.component_based.EAssemblyViewPoint#getAssemblyViewType()
	 * @see #getEAssemblyViewPoint()
	 * @generated
	 */
	EReference getEAssemblyViewPoint_AssemblyViewType();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EDeploymentViewPoint <em>EDeployment View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDeployment View Point</em>'.
	 * @see mdsd.component_based.EDeploymentViewPoint
	 * @generated
	 */
	EClass getEDeploymentViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.EDeploymentViewPoint#getEnvironmentViewType <em>Environment View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment View Type</em>'.
	 * @see mdsd.component_based.EDeploymentViewPoint#getEnvironmentViewType()
	 * @see #getEDeploymentViewPoint()
	 * @generated
	 */
	EReference getEDeploymentViewPoint_EnvironmentViewType();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.EDeploymentViewPoint#getAllocationViewType <em>Allocation View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation View Type</em>'.
	 * @see mdsd.component_based.EDeploymentViewPoint#getAllocationViewType()
	 * @see #getEDeploymentViewPoint()
	 * @generated
	 */
	EReference getEDeploymentViewPoint_AllocationViewType();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EBehaviourDescription <em>EBehaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBehaviour Description</em>'.
	 * @see mdsd.component_based.EBehaviourDescription
	 * @generated
	 */
	EClass getEBehaviourDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EBehaviourDescription#getInternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Action</em>'.
	 * @see mdsd.component_based.EBehaviourDescription#getInternalAction()
	 * @see #getEBehaviourDescription()
	 * @generated
	 */
	EReference getEBehaviourDescription_InternalAction();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EBehaviourDescription#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop</em>'.
	 * @see mdsd.component_based.EBehaviourDescription#getLoop()
	 * @see #getEBehaviourDescription()
	 * @generated
	 */
	EReference getEBehaviourDescription_Loop();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EBehaviourDescription#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see mdsd.component_based.EBehaviourDescription#getBranch()
	 * @see #getEBehaviourDescription()
	 * @generated
	 */
	EReference getEBehaviourDescription_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link mdsd.component_based.EBehaviourDescription#getExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Call</em>'.
	 * @see mdsd.component_based.EBehaviourDescription#getExternalCall()
	 * @see #getEBehaviourDescription()
	 * @generated
	 */
	EReference getEBehaviourDescription_ExternalCall();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EInternalAction <em>EInternal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInternal Action</em>'.
	 * @see mdsd.component_based.EInternalAction
	 * @generated
	 */
	EClass getEInternalAction();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EExternalCall <em>EExternal Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExternal Call</em>'.
	 * @see mdsd.component_based.EExternalCall
	 * @generated
	 */
	EClass getEExternalCall();

	/**
	 * Returns the meta object for the reference '{@link mdsd.component_based.EExternalCall#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see mdsd.component_based.EExternalCall#getTo()
	 * @see #getEExternalCall()
	 * @generated
	 */
	EReference getEExternalCall_To();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EBranch <em>EBranch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBranch</em>'.
	 * @see mdsd.component_based.EBranch
	 * @generated
	 */
	EClass getEBranch();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ELoop <em>ELoop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELoop</em>'.
	 * @see mdsd.component_based.ELoop
	 * @generated
	 */
	EClass getELoop();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.EViewType <em>EView Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EView Type</em>'.
	 * @see mdsd.component_based.EViewType
	 * @generated
	 */
	EClass getEViewType();

	/**
	 * Returns the meta object for enum '{@link mdsd.component_based.PossibleReturnTypes <em>Possible Return Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Possible Return Types</em>'.
	 * @see mdsd.component_based.PossibleReturnTypes
	 * @generated
	 */
	EEnum getPossibleReturnTypes();

	/**
	 * Returns the meta object for enum '{@link mdsd.component_based.PossibleParameterTypes <em>Possible Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Possible Parameter Types</em>'.
	 * @see mdsd.component_based.PossibleParameterTypes
	 * @generated
	 */
	EEnum getPossibleParameterTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.Void <em>EVoid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EVoid</em>'.
	 * @see java.lang.Void
	 * @model instanceClass="java.lang.Void"
	 * @generated
	 */
	EDataType getEVoid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Component_basedFactory getComponent_basedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ERepositoryImpl <em>ERepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ERepositoryImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERepository()
		 * @generated
		 */
		EClass EREPOSITORY = eINSTANCE.getERepository();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREPOSITORY__COMPONENT = eINSTANCE.getERepository_Component();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREPOSITORY__INTERFACE = eINSTANCE.getERepository_Interface();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ESignatureImpl <em>ESignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ESignatureImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESignature()
		 * @generated
		 */
		EClass ESIGNATURE = eINSTANCE.getESignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESIGNATURE__NAME = eINSTANCE.getESignature_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESIGNATURE__RETURN_TYPE = eINSTANCE.getESignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESIGNATURE__PARAMETER = eINSTANCE.getESignature_Parameter();

		/**
		 * The meta object literal for the '<em><b>Corresponds To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESIGNATURE__CORRESPONDS_TO = eINSTANCE.getESignature_CorrespondsTo();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EComponentImpl <em>EComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EComponentImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEComponent()
		 * @generated
		 */
		EClass ECOMPONENT = eINSTANCE.getEComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__NAME = eINSTANCE.getEComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Provides Interface To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__PROVIDES_INTERFACE_TO = eINSTANCE.getEComponent_ProvidesInterfaceTo();

		/**
		 * The meta object literal for the '<em><b>Behaviour Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__BEHAVIOUR_DESCRIPTION = eINSTANCE.getEComponent_BehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Uses Interface From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__USES_INTERFACE_FROM = eINSTANCE.getEComponent_UsesInterfaceFrom();

		/**
		 * The meta object literal for the '<em><b>Provides Directly</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__PROVIDES_DIRECTLY = eINSTANCE.getEComponent_ProvidesDirectly();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__PROVIDES = eINSTANCE.getEComponent_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__REQUIRES = eINSTANCE.getEComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Provides Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEComponent__ProvidesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EInterfaceImpl <em>EInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EInterfaceImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEInterface()
		 * @generated
		 */
		EClass EINTERFACE = eINSTANCE.getEInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTERFACE__NAME = eINSTANCE.getEInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__SIGNATURE = eINSTANCE.getEInterface_Signature();

		/**
		 * The meta object literal for the '<em><b>Results In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__RESULTS_IN = eINSTANCE.getEInterface_ResultsIn();

		/**
		 * The meta object literal for the '<em><b>Provided By Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__PROVIDED_BY_COMPONENT = eINSTANCE.getEInterface_ProvidedByComponent();

		/**
		 * The meta object literal for the '<em><b>Provided By System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__PROVIDED_BY_SYSTEM = eINSTANCE.getEInterface_ProvidedBySystem();

		/**
		 * The meta object literal for the '<em><b>Required By Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__REQUIRED_BY_COMPONENT = eINSTANCE.getEInterface_RequiredByComponent();

		/**
		 * The meta object literal for the '<em><b>Required By System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERFACE__REQUIRED_BY_SYSTEM = eINSTANCE.getEInterface_RequiredBySystem();

		/**
		 * The meta object literal for the '<em><b>Interface Required By Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EINTERFACE___INTERFACE_REQUIRED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEInterface__InterfaceRequiredByConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Interface Provided By Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EINTERFACE___INTERFACE_PROVIDED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEInterface__InterfaceProvidedByConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EParameterImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEParameter()
		 * @generated
		 */
		EClass EPARAMETER = eINSTANCE.getEParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__NAME = eINSTANCE.getEParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPARAMETER__TYPE = eINSTANCE.getEParameter_Type();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EServiceImpl <em>EService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EServiceImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEService()
		 * @generated
		 */
		EClass ESERVICE = eINSTANCE.getEService();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAssemblyContextImpl <em>EAssembly Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAssemblyContextImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyContext()
		 * @generated
		 */
		EClass EASSEMBLY_CONTEXT = eINSTANCE.getEAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASSEMBLY_CONTEXT__NAME = eINSTANCE.getEAssemblyContext_Name();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONTEXT__ROLES = eINSTANCE.getEAssemblyContext_Roles();

		/**
		 * The meta object literal for the '<em><b>Allocated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONTEXT__ALLOCATED = eINSTANCE.getEAssemblyContext_Allocated();

		/**
		 * The meta object literal for the '<em><b>Encapsulated By Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT = eINSTANCE
				.getEAssemblyContext_EncapsulatedByComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulated By System</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM = eINSTANCE.getEAssemblyContext_EncapsulatedBySystem();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONTEXT__INSTANTIATES = eINSTANCE.getEAssemblyContext_Instantiates();

		/**
		 * The meta object literal for the '<em><b>Encapsulation Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EASSEMBLY_CONTEXT___ENCAPSULATION_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEAssemblyContext__EncapsulationConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Connector Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EASSEMBLY_CONTEXT___CONNECTOR_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEAssemblyContext__ConnectorConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Provides Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EASSEMBLY_CONTEXT___PROVIDES_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEAssemblyContext__ProvidesRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Requires Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EASSEMBLY_CONTEXT___REQUIRES_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEAssemblyContext__RequiresRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ECompositeComponentImpl <em>EComposite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ECompositeComponentImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getECompositeComponent()
		 * @generated
		 */
		EClass ECOMPOSITE_COMPONENT = eINSTANCE.getECompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPOSITE_COMPONENT__ENCAPSULATES = eINSTANCE.getECompositeComponent_Encapsulates();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ESystemImpl <em>ESystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ESystemImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESystem()
		 * @generated
		 */
		EClass ESYSTEM = eINSTANCE.getESystem();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESYSTEM__PROVIDES = eINSTANCE.getESystem_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESYSTEM__REQUIRES = eINSTANCE.getESystem_Requires();

		/**
		 * The meta object literal for the '<em><b>Encapsulates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESYSTEM__ENCAPSULATES = eINSTANCE.getESystem_Encapsulates();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAssemblyConnectorImpl <em>EAssembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAssemblyConnectorImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyConnector()
		 * @generated
		 */
		EClass EASSEMBLY_CONNECTOR = eINSTANCE.getEAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Link From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONNECTOR__LINK_FROM = eINSTANCE.getEAssemblyConnector_LinkFrom();

		/**
		 * The meta object literal for the '<em><b>Link To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_CONNECTOR__LINK_TO = eINSTANCE.getEAssemblyConnector_LinkTo();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EContainerImpl <em>EContainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EContainerImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEContainer()
		 * @generated
		 */
		EClass ECONTAINER = eINSTANCE.getEContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTAINER__NAME = eINSTANCE.getEContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTAINER__CONNECTED_TO = eINSTANCE.getEContainer_ConnectedTo();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ELinkImpl <em>ELink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ELinkImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getELink()
		 * @generated
		 */
		EClass ELINK = eINSTANCE.getELink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELINK__NAME = eINSTANCE.getELink_Name();

		/**
		 * The meta object literal for the '<em><b>Connects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELINK__CONNECTS = eINSTANCE.getELink_Connects();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAllocationContextImpl <em>EAllocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAllocationContextImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAllocationContext()
		 * @generated
		 */
		EClass EALLOCATION_CONTEXT = eINSTANCE.getEAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EALLOCATION_CONTEXT__CONTROLS = eINSTANCE.getEAllocationContext_Controls();

		/**
		 * The meta object literal for the '<em><b>Specifies For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EALLOCATION_CONTEXT__SPECIFIES_FOR = eINSTANCE.getEAllocationContext_SpecifiesFor();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EALLOCATION_CONTEXT__SPECIFIES = eINSTANCE.getEAllocationContext_Specifies();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ERequiredDelegationConnectorImpl <em>ERequired Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ERequiredDelegationConnectorImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERequiredDelegationConnector()
		 * @generated
		 */
		EClass EREQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getERequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Link From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM = eINSTANCE.getERequiredDelegationConnector_LinkFrom();

		/**
		 * The meta object literal for the '<em><b>Link To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREQUIRED_DELEGATION_CONNECTOR__LINK_TO = eINSTANCE.getERequiredDelegationConnector_LinkTo();

		/**
		 * The meta object literal for the '<em><b>Required Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EREQUIRED_DELEGATION_CONNECTOR___REQUIRED_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getERequiredDelegationConnector__RequiredConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EProvidedDelegationConnectorImpl <em>EProvided Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EProvidedDelegationConnectorImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEProvidedDelegationConnector()
		 * @generated
		 */
		EClass EPROVIDED_DELEGATION_CONNECTOR = eINSTANCE.getEProvidedDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Link From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM = eINSTANCE.getEProvidedDelegationConnector_LinkFrom();

		/**
		 * The meta object literal for the '<em><b>Link To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROVIDED_DELEGATION_CONNECTOR__LINK_TO = eINSTANCE.getEProvidedDelegationConnector_LinkTo();

		/**
		 * The meta object literal for the '<em><b>Provided Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPROVIDED_DELEGATION_CONNECTOR___PROVIDED_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEProvidedDelegationConnector__ProvidedConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EDelegationConnectorImpl <em>EDelegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EDelegationConnectorImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEDelegationConnector()
		 * @generated
		 */
		EClass EDELEGATION_CONNECTOR = eINSTANCE.getEDelegationConnector();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ERoleImpl <em>ERole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ERoleImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERole()
		 * @generated
		 */
		EClass EROLE = eINSTANCE.getERole();

		/**
		 * The meta object literal for the '<em><b>Role Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EROLE__ROLE_OF = eINSTANCE.getERole_RoleOf();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ERequiredRoleImpl <em>ERequired Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ERequiredRoleImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERequiredRole()
		 * @generated
		 */
		EClass EREQUIRED_ROLE = eINSTANCE.getERequiredRole();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREQUIRED_ROLE__LINKED_TO = eINSTANCE.getERequiredRole_LinkedTo();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EProvidedRoleImpl <em>EProvided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EProvidedRoleImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEProvidedRole()
		 * @generated
		 */
		EClass EPROVIDED_ROLE = eINSTANCE.getEProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Linked From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROVIDED_ROLE__LINKED_FROM = eINSTANCE.getEProvidedRole_LinkedFrom();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EEnvironmentViewTypeImpl <em>EEnvironment View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EEnvironmentViewTypeImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEEnvironmentViewType()
		 * @generated
		 */
		EClass EENVIRONMENT_VIEW_TYPE = eINSTANCE.getEEnvironmentViewType();

		/**
		 * The meta object literal for the '<em><b>Shows Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS = eINSTANCE.getEEnvironmentViewType_ShowsContainers();

		/**
		 * The meta object literal for the '<em><b>Shows Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS = eINSTANCE.getEEnvironmentViewType_ShowsLinks();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAllocationViewTypeImpl <em>EAllocation View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAllocationViewTypeImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAllocationViewType()
		 * @generated
		 */
		EClass EALLOCATION_VIEW_TYPE = eINSTANCE.getEAllocationViewType();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EALLOCATION_VIEW_TYPE__INCLUDES = eINSTANCE.getEAllocationViewType_Includes();

		/**
		 * The meta object literal for the '<em><b>Show Component Allocations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EALLOCATION_VIEW_TYPE___SHOW_COMPONENT_ALLOCATIONS = eINSTANCE
				.getEAllocationViewType__ShowComponentAllocations();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAssemblyViewTypeImpl <em>EAssembly View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAssemblyViewTypeImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyViewType()
		 * @generated
		 */
		EClass EASSEMBLY_VIEW_TYPE = eINSTANCE.getEAssemblyViewType();

		/**
		 * The meta object literal for the '<em><b>Main Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS = eINSTANCE.getEAssemblyViewType_MainArtifacts();

		/**
		 * The meta object literal for the '<em><b>Shows Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS = eINSTANCE.getEAssemblyViewType_ShowsComponents();

		/**
		 * The meta object literal for the '<em><b>Show Component Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EASSEMBLY_VIEW_TYPE___SHOW_COMPONENT_CONNECTIONS = eINSTANCE
				.getEAssemblyViewType__ShowComponentConnections();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ERepositoryViewTypeImpl <em>ERepository View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ERepositoryViewTypeImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getERepositoryViewType()
		 * @generated
		 */
		EClass EREPOSITORY_VIEW_TYPE = eINSTANCE.getERepositoryViewType();

		/**
		 * The meta object literal for the '<em><b>Shows Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS = eINSTANCE.getERepositoryViewType_ShowsComponents();

		/**
		 * The meta object literal for the '<em><b>Shows Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES = eINSTANCE.getERepositoryViewType_ShowsInterfaces();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.EViewPoint <em>EView Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.EViewPoint
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEViewPoint()
		 * @generated
		 */
		EClass EVIEW_POINT = eINSTANCE.getEViewPoint();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ESystemIndependentViewPointImpl <em>ESystem Independent View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ESystemIndependentViewPointImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getESystemIndependentViewPoint()
		 * @generated
		 */
		EClass ESYSTEM_INDEPENDENT_VIEW_POINT = eINSTANCE.getESystemIndependentViewPoint();

		/**
		 * The meta object literal for the '<em><b>Repository View Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE = eINSTANCE
				.getESystemIndependentViewPoint_RepositoryViewType();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EAssemblyViewPointImpl <em>EAssembly View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EAssemblyViewPointImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEAssemblyViewPoint()
		 * @generated
		 */
		EClass EASSEMBLY_VIEW_POINT = eINSTANCE.getEAssemblyViewPoint();

		/**
		 * The meta object literal for the '<em><b>Assembly View Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE = eINSTANCE.getEAssemblyViewPoint_AssemblyViewType();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EDeploymentViewPointImpl <em>EDeployment View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EDeploymentViewPointImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEDeploymentViewPoint()
		 * @generated
		 */
		EClass EDEPLOYMENT_VIEW_POINT = eINSTANCE.getEDeploymentViewPoint();

		/**
		 * The meta object literal for the '<em><b>Environment View Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE = eINSTANCE
				.getEDeploymentViewPoint_EnvironmentViewType();

		/**
		 * The meta object literal for the '<em><b>Allocation View Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE = eINSTANCE
				.getEDeploymentViewPoint_AllocationViewType();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EBehaviourDescriptionImpl <em>EBehaviour Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EBehaviourDescriptionImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEBehaviourDescription()
		 * @generated
		 */
		EClass EBEHAVIOUR_DESCRIPTION = eINSTANCE.getEBehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION = eINSTANCE.getEBehaviourDescription_InternalAction();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBEHAVIOUR_DESCRIPTION__LOOP = eINSTANCE.getEBehaviourDescription_Loop();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBEHAVIOUR_DESCRIPTION__BRANCH = eINSTANCE.getEBehaviourDescription_Branch();

		/**
		 * The meta object literal for the '<em><b>External Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL = eINSTANCE.getEBehaviourDescription_ExternalCall();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EInternalActionImpl <em>EInternal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EInternalActionImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEInternalAction()
		 * @generated
		 */
		EClass EINTERNAL_ACTION = eINSTANCE.getEInternalAction();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EExternalCallImpl <em>EExternal Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EExternalCallImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEExternalCall()
		 * @generated
		 */
		EClass EEXTERNAL_CALL = eINSTANCE.getEExternalCall();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXTERNAL_CALL__TO = eINSTANCE.getEExternalCall_To();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.EBranchImpl <em>EBranch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.EBranchImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEBranch()
		 * @generated
		 */
		EClass EBRANCH = eINSTANCE.getEBranch();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.impl.ELoopImpl <em>ELoop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.impl.ELoopImpl
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getELoop()
		 * @generated
		 */
		EClass ELOOP = eINSTANCE.getELoop();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.EViewType <em>EView Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.EViewType
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEViewType()
		 * @generated
		 */
		EClass EVIEW_TYPE = eINSTANCE.getEViewType();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.PossibleReturnTypes <em>Possible Return Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.PossibleReturnTypes
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getPossibleReturnTypes()
		 * @generated
		 */
		EEnum POSSIBLE_RETURN_TYPES = eINSTANCE.getPossibleReturnTypes();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.PossibleParameterTypes <em>Possible Parameter Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.PossibleParameterTypes
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getPossibleParameterTypes()
		 * @generated
		 */
		EEnum POSSIBLE_PARAMETER_TYPES = eINSTANCE.getPossibleParameterTypes();

		/**
		 * The meta object literal for the '<em>EVoid</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Void
		 * @see mdsd.component_based.impl.Component_basedPackageImpl#getEVoid()
		 * @generated
		 */
		EDataType EVOID = eINSTANCE.getEVoid();

	}

} //Component_basedPackage
