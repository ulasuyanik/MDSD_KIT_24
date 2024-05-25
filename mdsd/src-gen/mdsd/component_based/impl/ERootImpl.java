/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAllocationContext;
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EBehaviourDescription;
import mdsd.component_based.EBranch;
import mdsd.component_based.EComponent;
import mdsd.component_based.ECompositeComponent;
import mdsd.component_based.EContainer;
import mdsd.component_based.EDelegationConnector;
import mdsd.component_based.EExternalCall;
import mdsd.component_based.EInterface;
import mdsd.component_based.EInternalAction;
import mdsd.component_based.ELink;
import mdsd.component_based.ELoop;
import mdsd.component_based.EParameter;
import mdsd.component_based.ERepository;
import mdsd.component_based.ERole;
import mdsd.component_based.ERoot;
import mdsd.component_based.EService;
import mdsd.component_based.ESignature;
import mdsd.component_based.ESystem;
import mdsd.component_based.EViewPoint;
import mdsd.component_based.EViewType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERoot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEviewpoint <em>Eviewpoint</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEviewtype <em>Eviewtype</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEparameter <em>Eparameter</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEsignature <em>Esignature</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEdelegationconnector <em>Edelegationconnector</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getErole <em>Erole</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getElink <em>Elink</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEcontainer <em>Econtainer</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEassemblyconnector <em>Eassemblyconnector</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEassemblycontext <em>Eassemblycontext</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEcomponent <em>Ecomponent</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEservice <em>Eservice</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEinterface <em>Einterface</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEsystem <em>Esystem</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getErepository <em>Erepository</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEbehaviourdescription <em>Ebehaviourdescription</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEexternalcall <em>Eexternalcall</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEinternalaction <em>Einternalaction</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEbranch <em>Ebranch</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEloop <em>Eloop</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEcompositecomponent <em>Ecompositecomponent</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERootImpl#getEallocationcontext <em>Eallocationcontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERootImpl extends MinimalEObjectImpl.Container implements ERoot {
	/**
	 * The cached value of the '{@link #getEviewpoint() <em>Eviewpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEviewpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<EViewPoint> eviewpoint;

	/**
	 * The cached value of the '{@link #getEviewtype() <em>Eviewtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEviewtype()
	 * @generated
	 * @ordered
	 */
	protected EList<EViewType> eviewtype;

	/**
	 * The cached value of the '{@link #getEparameter() <em>Eparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> eparameter;

	/**
	 * The cached value of the '{@link #getEsignature() <em>Esignature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsignature()
	 * @generated
	 * @ordered
	 */
	protected EList<ESignature> esignature;

	/**
	 * The cached value of the '{@link #getEdelegationconnector() <em>Edelegationconnector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdelegationconnector()
	 * @generated
	 * @ordered
	 */
	protected EList<EDelegationConnector> edelegationconnector;

	/**
	 * The cached value of the '{@link #getErole() <em>Erole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErole()
	 * @generated
	 * @ordered
	 */
	protected EList<ERole> erole;

	/**
	 * The cached value of the '{@link #getElink() <em>Elink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElink()
	 * @generated
	 * @ordered
	 */
	protected EList<ELink> elink;

	/**
	 * The cached value of the '{@link #getEcontainer() <em>Econtainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<EContainer> econtainer;

	/**
	 * The cached value of the '{@link #getEassemblyconnector() <em>Eassemblyconnector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEassemblyconnector()
	 * @generated
	 * @ordered
	 */
	protected EList<EAssemblyConnector> eassemblyconnector;

	/**
	 * The cached value of the '{@link #getEassemblycontext() <em>Eassemblycontext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEassemblycontext()
	 * @generated
	 * @ordered
	 */
	protected EList<EAssemblyContext> eassemblycontext;

	/**
	 * The cached value of the '{@link #getEcomponent() <em>Ecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> ecomponent;

	/**
	 * The cached value of the '{@link #getEservice() <em>Eservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEservice()
	 * @generated
	 * @ordered
	 */
	protected EList<EService> eservice;

	/**
	 * The cached value of the '{@link #getEinterface() <em>Einterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<EInterface> einterface;

	/**
	 * The cached value of the '{@link #getEsystem() <em>Esystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESystem> esystem;

	/**
	 * The cached value of the '{@link #getErepository() <em>Erepository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErepository()
	 * @generated
	 * @ordered
	 */
	protected EList<ERepository> erepository;

	/**
	 * The cached value of the '{@link #getEbehaviourdescription() <em>Ebehaviourdescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEbehaviourdescription()
	 * @generated
	 * @ordered
	 */
	protected EList<EBehaviourDescription> ebehaviourdescription;

	/**
	 * The cached value of the '{@link #getEexternalcall() <em>Eexternalcall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEexternalcall()
	 * @generated
	 * @ordered
	 */
	protected EList<EExternalCall> eexternalcall;

	/**
	 * The cached value of the '{@link #getEinternalaction() <em>Einternalaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinternalaction()
	 * @generated
	 * @ordered
	 */
	protected EList<EInternalAction> einternalaction;

	/**
	 * The cached value of the '{@link #getEbranch() <em>Ebranch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEbranch()
	 * @generated
	 * @ordered
	 */
	protected EList<EBranch> ebranch;

	/**
	 * The cached value of the '{@link #getEloop() <em>Eloop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEloop()
	 * @generated
	 * @ordered
	 */
	protected EList<ELoop> eloop;

	/**
	 * The cached value of the '{@link #getEcompositecomponent() <em>Ecompositecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcompositecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ECompositeComponent> ecompositecomponent;

	/**
	 * The cached value of the '{@link #getEallocationcontext() <em>Eallocationcontext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEallocationcontext()
	 * @generated
	 * @ordered
	 */
	protected EList<EAllocationContext> eallocationcontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EViewPoint> getEviewpoint() {
		if (eviewpoint == null) {
			eviewpoint = new EObjectContainmentEList<EViewPoint>(EViewPoint.class, this,
					Component_basedPackage.EROOT__EVIEWPOINT);
		}
		return eviewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EViewType> getEviewtype() {
		if (eviewtype == null) {
			eviewtype = new EObjectContainmentEList<EViewType>(EViewType.class, this,
					Component_basedPackage.EROOT__EVIEWTYPE);
		}
		return eviewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getEparameter() {
		if (eparameter == null) {
			eparameter = new EObjectContainmentEList<EParameter>(EParameter.class, this,
					Component_basedPackage.EROOT__EPARAMETER);
		}
		return eparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESignature> getEsignature() {
		if (esignature == null) {
			esignature = new EObjectContainmentEList<ESignature>(ESignature.class, this,
					Component_basedPackage.EROOT__ESIGNATURE);
		}
		return esignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EDelegationConnector> getEdelegationconnector() {
		if (edelegationconnector == null) {
			edelegationconnector = new EObjectContainmentEList<EDelegationConnector>(EDelegationConnector.class, this,
					Component_basedPackage.EROOT__EDELEGATIONCONNECTOR);
		}
		return edelegationconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ERole> getErole() {
		if (erole == null) {
			erole = new EObjectContainmentEList<ERole>(ERole.class, this, Component_basedPackage.EROOT__EROLE);
		}
		return erole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ELink> getElink() {
		if (elink == null) {
			elink = new EObjectContainmentEList<ELink>(ELink.class, this, Component_basedPackage.EROOT__ELINK);
		}
		return elink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EContainer> getEcontainer() {
		if (econtainer == null) {
			econtainer = new EObjectContainmentEList<EContainer>(EContainer.class, this,
					Component_basedPackage.EROOT__ECONTAINER);
		}
		return econtainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAssemblyConnector> getEassemblyconnector() {
		if (eassemblyconnector == null) {
			eassemblyconnector = new EObjectContainmentEList<EAssemblyConnector>(EAssemblyConnector.class, this,
					Component_basedPackage.EROOT__EASSEMBLYCONNECTOR);
		}
		return eassemblyconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAssemblyContext> getEassemblycontext() {
		if (eassemblycontext == null) {
			eassemblycontext = new EObjectContainmentEList<EAssemblyContext>(EAssemblyContext.class, this,
					Component_basedPackage.EROOT__EASSEMBLYCONTEXT);
		}
		return eassemblycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getEcomponent() {
		if (ecomponent == null) {
			ecomponent = new EObjectContainmentEList<EComponent>(EComponent.class, this,
					Component_basedPackage.EROOT__ECOMPONENT);
		}
		return ecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EService> getEservice() {
		if (eservice == null) {
			eservice = new EObjectContainmentEList<EService>(EService.class, this,
					Component_basedPackage.EROOT__ESERVICE);
		}
		return eservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInterface> getEinterface() {
		if (einterface == null) {
			einterface = new EObjectContainmentEList<EInterface>(EInterface.class, this,
					Component_basedPackage.EROOT__EINTERFACE);
		}
		return einterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESystem> getEsystem() {
		if (esystem == null) {
			esystem = new EObjectContainmentEList<ESystem>(ESystem.class, this, Component_basedPackage.EROOT__ESYSTEM);
		}
		return esystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ERepository> getErepository() {
		if (erepository == null) {
			erepository = new EObjectContainmentEList<ERepository>(ERepository.class, this,
					Component_basedPackage.EROOT__EREPOSITORY);
		}
		return erepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EBehaviourDescription> getEbehaviourdescription() {
		if (ebehaviourdescription == null) {
			ebehaviourdescription = new EObjectContainmentEList<EBehaviourDescription>(EBehaviourDescription.class,
					this, Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION);
		}
		return ebehaviourdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EExternalCall> getEexternalcall() {
		if (eexternalcall == null) {
			eexternalcall = new EObjectContainmentEList<EExternalCall>(EExternalCall.class, this,
					Component_basedPackage.EROOT__EEXTERNALCALL);
		}
		return eexternalcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInternalAction> getEinternalaction() {
		if (einternalaction == null) {
			einternalaction = new EObjectContainmentEList<EInternalAction>(EInternalAction.class, this,
					Component_basedPackage.EROOT__EINTERNALACTION);
		}
		return einternalaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EBranch> getEbranch() {
		if (ebranch == null) {
			ebranch = new EObjectContainmentEList<EBranch>(EBranch.class, this, Component_basedPackage.EROOT__EBRANCH);
		}
		return ebranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ELoop> getEloop() {
		if (eloop == null) {
			eloop = new EObjectContainmentEList<ELoop>(ELoop.class, this, Component_basedPackage.EROOT__ELOOP);
		}
		return eloop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ECompositeComponent> getEcompositecomponent() {
		if (ecompositecomponent == null) {
			ecompositecomponent = new EObjectContainmentEList<ECompositeComponent>(ECompositeComponent.class, this,
					Component_basedPackage.EROOT__ECOMPOSITECOMPONENT);
		}
		return ecompositecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAllocationContext> getEallocationcontext() {
		if (eallocationcontext == null) {
			eallocationcontext = new EObjectContainmentEList<EAllocationContext>(EAllocationContext.class, this,
					Component_basedPackage.EROOT__EALLOCATIONCONTEXT);
		}
		return eallocationcontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EROOT__EVIEWPOINT:
			return ((InternalEList<?>) getEviewpoint()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EVIEWTYPE:
			return ((InternalEList<?>) getEviewtype()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EPARAMETER:
			return ((InternalEList<?>) getEparameter()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ESIGNATURE:
			return ((InternalEList<?>) getEsignature()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
			return ((InternalEList<?>) getEdelegationconnector()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EROLE:
			return ((InternalEList<?>) getErole()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ELINK:
			return ((InternalEList<?>) getElink()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ECONTAINER:
			return ((InternalEList<?>) getEcontainer()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
			return ((InternalEList<?>) getEassemblyconnector()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
			return ((InternalEList<?>) getEassemblycontext()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ECOMPONENT:
			return ((InternalEList<?>) getEcomponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ESERVICE:
			return ((InternalEList<?>) getEservice()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EINTERFACE:
			return ((InternalEList<?>) getEinterface()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ESYSTEM:
			return ((InternalEList<?>) getEsystem()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EREPOSITORY:
			return ((InternalEList<?>) getErepository()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
			return ((InternalEList<?>) getEbehaviourdescription()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EEXTERNALCALL:
			return ((InternalEList<?>) getEexternalcall()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EINTERNALACTION:
			return ((InternalEList<?>) getEinternalaction()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EBRANCH:
			return ((InternalEList<?>) getEbranch()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ELOOP:
			return ((InternalEList<?>) getEloop()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
			return ((InternalEList<?>) getEcompositecomponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			return ((InternalEList<?>) getEallocationcontext()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.EROOT__EVIEWPOINT:
			return getEviewpoint();
		case Component_basedPackage.EROOT__EVIEWTYPE:
			return getEviewtype();
		case Component_basedPackage.EROOT__EPARAMETER:
			return getEparameter();
		case Component_basedPackage.EROOT__ESIGNATURE:
			return getEsignature();
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
			return getEdelegationconnector();
		case Component_basedPackage.EROOT__EROLE:
			return getErole();
		case Component_basedPackage.EROOT__ELINK:
			return getElink();
		case Component_basedPackage.EROOT__ECONTAINER:
			return getEcontainer();
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
			return getEassemblyconnector();
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
			return getEassemblycontext();
		case Component_basedPackage.EROOT__ECOMPONENT:
			return getEcomponent();
		case Component_basedPackage.EROOT__ESERVICE:
			return getEservice();
		case Component_basedPackage.EROOT__EINTERFACE:
			return getEinterface();
		case Component_basedPackage.EROOT__ESYSTEM:
			return getEsystem();
		case Component_basedPackage.EROOT__EREPOSITORY:
			return getErepository();
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
			return getEbehaviourdescription();
		case Component_basedPackage.EROOT__EEXTERNALCALL:
			return getEexternalcall();
		case Component_basedPackage.EROOT__EINTERNALACTION:
			return getEinternalaction();
		case Component_basedPackage.EROOT__EBRANCH:
			return getEbranch();
		case Component_basedPackage.EROOT__ELOOP:
			return getEloop();
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
			return getEcompositecomponent();
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			return getEallocationcontext();
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
		case Component_basedPackage.EROOT__EVIEWPOINT:
			getEviewpoint().clear();
			getEviewpoint().addAll((Collection<? extends EViewPoint>) newValue);
			return;
		case Component_basedPackage.EROOT__EVIEWTYPE:
			getEviewtype().clear();
			getEviewtype().addAll((Collection<? extends EViewType>) newValue);
			return;
		case Component_basedPackage.EROOT__EPARAMETER:
			getEparameter().clear();
			getEparameter().addAll((Collection<? extends EParameter>) newValue);
			return;
		case Component_basedPackage.EROOT__ESIGNATURE:
			getEsignature().clear();
			getEsignature().addAll((Collection<? extends ESignature>) newValue);
			return;
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
			getEdelegationconnector().clear();
			getEdelegationconnector().addAll((Collection<? extends EDelegationConnector>) newValue);
			return;
		case Component_basedPackage.EROOT__EROLE:
			getErole().clear();
			getErole().addAll((Collection<? extends ERole>) newValue);
			return;
		case Component_basedPackage.EROOT__ELINK:
			getElink().clear();
			getElink().addAll((Collection<? extends ELink>) newValue);
			return;
		case Component_basedPackage.EROOT__ECONTAINER:
			getEcontainer().clear();
			getEcontainer().addAll((Collection<? extends EContainer>) newValue);
			return;
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
			getEassemblyconnector().clear();
			getEassemblyconnector().addAll((Collection<? extends EAssemblyConnector>) newValue);
			return;
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
			getEassemblycontext().clear();
			getEassemblycontext().addAll((Collection<? extends EAssemblyContext>) newValue);
			return;
		case Component_basedPackage.EROOT__ECOMPONENT:
			getEcomponent().clear();
			getEcomponent().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.EROOT__ESERVICE:
			getEservice().clear();
			getEservice().addAll((Collection<? extends EService>) newValue);
			return;
		case Component_basedPackage.EROOT__EINTERFACE:
			getEinterface().clear();
			getEinterface().addAll((Collection<? extends EInterface>) newValue);
			return;
		case Component_basedPackage.EROOT__ESYSTEM:
			getEsystem().clear();
			getEsystem().addAll((Collection<? extends ESystem>) newValue);
			return;
		case Component_basedPackage.EROOT__EREPOSITORY:
			getErepository().clear();
			getErepository().addAll((Collection<? extends ERepository>) newValue);
			return;
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
			getEbehaviourdescription().clear();
			getEbehaviourdescription().addAll((Collection<? extends EBehaviourDescription>) newValue);
			return;
		case Component_basedPackage.EROOT__EEXTERNALCALL:
			getEexternalcall().clear();
			getEexternalcall().addAll((Collection<? extends EExternalCall>) newValue);
			return;
		case Component_basedPackage.EROOT__EINTERNALACTION:
			getEinternalaction().clear();
			getEinternalaction().addAll((Collection<? extends EInternalAction>) newValue);
			return;
		case Component_basedPackage.EROOT__EBRANCH:
			getEbranch().clear();
			getEbranch().addAll((Collection<? extends EBranch>) newValue);
			return;
		case Component_basedPackage.EROOT__ELOOP:
			getEloop().clear();
			getEloop().addAll((Collection<? extends ELoop>) newValue);
			return;
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
			getEcompositecomponent().clear();
			getEcompositecomponent().addAll((Collection<? extends ECompositeComponent>) newValue);
			return;
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			getEallocationcontext().clear();
			getEallocationcontext().addAll((Collection<? extends EAllocationContext>) newValue);
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
		case Component_basedPackage.EROOT__EVIEWPOINT:
			getEviewpoint().clear();
			return;
		case Component_basedPackage.EROOT__EVIEWTYPE:
			getEviewtype().clear();
			return;
		case Component_basedPackage.EROOT__EPARAMETER:
			getEparameter().clear();
			return;
		case Component_basedPackage.EROOT__ESIGNATURE:
			getEsignature().clear();
			return;
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
			getEdelegationconnector().clear();
			return;
		case Component_basedPackage.EROOT__EROLE:
			getErole().clear();
			return;
		case Component_basedPackage.EROOT__ELINK:
			getElink().clear();
			return;
		case Component_basedPackage.EROOT__ECONTAINER:
			getEcontainer().clear();
			return;
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
			getEassemblyconnector().clear();
			return;
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
			getEassemblycontext().clear();
			return;
		case Component_basedPackage.EROOT__ECOMPONENT:
			getEcomponent().clear();
			return;
		case Component_basedPackage.EROOT__ESERVICE:
			getEservice().clear();
			return;
		case Component_basedPackage.EROOT__EINTERFACE:
			getEinterface().clear();
			return;
		case Component_basedPackage.EROOT__ESYSTEM:
			getEsystem().clear();
			return;
		case Component_basedPackage.EROOT__EREPOSITORY:
			getErepository().clear();
			return;
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
			getEbehaviourdescription().clear();
			return;
		case Component_basedPackage.EROOT__EEXTERNALCALL:
			getEexternalcall().clear();
			return;
		case Component_basedPackage.EROOT__EINTERNALACTION:
			getEinternalaction().clear();
			return;
		case Component_basedPackage.EROOT__EBRANCH:
			getEbranch().clear();
			return;
		case Component_basedPackage.EROOT__ELOOP:
			getEloop().clear();
			return;
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
			getEcompositecomponent().clear();
			return;
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			getEallocationcontext().clear();
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
		case Component_basedPackage.EROOT__EVIEWPOINT:
			return eviewpoint != null && !eviewpoint.isEmpty();
		case Component_basedPackage.EROOT__EVIEWTYPE:
			return eviewtype != null && !eviewtype.isEmpty();
		case Component_basedPackage.EROOT__EPARAMETER:
			return eparameter != null && !eparameter.isEmpty();
		case Component_basedPackage.EROOT__ESIGNATURE:
			return esignature != null && !esignature.isEmpty();
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
			return edelegationconnector != null && !edelegationconnector.isEmpty();
		case Component_basedPackage.EROOT__EROLE:
			return erole != null && !erole.isEmpty();
		case Component_basedPackage.EROOT__ELINK:
			return elink != null && !elink.isEmpty();
		case Component_basedPackage.EROOT__ECONTAINER:
			return econtainer != null && !econtainer.isEmpty();
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
			return eassemblyconnector != null && !eassemblyconnector.isEmpty();
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
			return eassemblycontext != null && !eassemblycontext.isEmpty();
		case Component_basedPackage.EROOT__ECOMPONENT:
			return ecomponent != null && !ecomponent.isEmpty();
		case Component_basedPackage.EROOT__ESERVICE:
			return eservice != null && !eservice.isEmpty();
		case Component_basedPackage.EROOT__EINTERFACE:
			return einterface != null && !einterface.isEmpty();
		case Component_basedPackage.EROOT__ESYSTEM:
			return esystem != null && !esystem.isEmpty();
		case Component_basedPackage.EROOT__EREPOSITORY:
			return erepository != null && !erepository.isEmpty();
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
			return ebehaviourdescription != null && !ebehaviourdescription.isEmpty();
		case Component_basedPackage.EROOT__EEXTERNALCALL:
			return eexternalcall != null && !eexternalcall.isEmpty();
		case Component_basedPackage.EROOT__EINTERNALACTION:
			return einternalaction != null && !einternalaction.isEmpty();
		case Component_basedPackage.EROOT__EBRANCH:
			return ebranch != null && !ebranch.isEmpty();
		case Component_basedPackage.EROOT__ELOOP:
			return eloop != null && !eloop.isEmpty();
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
			return ecompositecomponent != null && !ecompositecomponent.isEmpty();
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			return eallocationcontext != null && !eallocationcontext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERootImpl
