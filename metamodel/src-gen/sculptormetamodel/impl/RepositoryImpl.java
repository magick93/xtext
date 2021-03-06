/**
 */
package sculptormetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptormetamodel.DomainObject;
import sculptormetamodel.Repository;
import sculptormetamodel.RepositoryOperation;
import sculptormetamodel.SculptormetamodelPackage;
import sculptormetamodel.Subscribe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link sculptormetamodel.impl.RepositoryImpl#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryOperation> operations;

	/**
	 * The cached value of the '{@link #getRepositoryDependencies() <em>Repository Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositoryDependencies;

	/**
	 * The cached value of the '{@link #getOtherDependencies() <em>Other Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDependencies;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected Subscribe subscribe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapClass() {
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapClass(boolean newGapClass) {
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.REPOSITORY__GAP_CLASS, oldGapClass, gapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getAggregateRoot() {
		if (eContainerFeatureID() != SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT) return null;
		return (DomainObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetAggregateRoot() {
		if (eContainerFeatureID() != SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateRoot(DomainObject newAggregateRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregateRoot, SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(DomainObject newAggregateRoot) {
		if (newAggregateRoot != eInternalContainer() || (eContainerFeatureID() != SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT && newAggregateRoot != null)) {
			if (EcoreUtil.isAncestor(this, newAggregateRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregateRoot != null)
				msgs = ((InternalEObject)newAggregateRoot).eInverseAdd(this, SculptormetamodelPackage.DOMAIN_OBJECT__REPOSITORY, DomainObject.class, msgs);
			msgs = basicSetAggregateRoot(newAggregateRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT, newAggregateRoot, newAggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RepositoryOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<RepositoryOperation>(RepositoryOperation.class, this, SculptormetamodelPackage.REPOSITORY__OPERATIONS, SculptormetamodelPackage.REPOSITORY_OPERATION__REPOSITORY);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositoryDependencies() {
		if (repositoryDependencies == null) {
			repositoryDependencies = new EObjectResolvingEList<Repository>(Repository.class, this, SculptormetamodelPackage.REPOSITORY__REPOSITORY_DEPENDENCIES);
		}
		return repositoryDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDependencies() {
		if (otherDependencies == null) {
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, SculptormetamodelPackage.REPOSITORY__OTHER_DEPENDENCIES);
		}
		return otherDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe getSubscribe() {
		if (subscribe != null && subscribe.eIsProxy()) {
			InternalEObject oldSubscribe = (InternalEObject)subscribe;
			subscribe = (Subscribe)eResolveProxy(oldSubscribe);
			if (subscribe != oldSubscribe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SculptormetamodelPackage.REPOSITORY__SUBSCRIBE, oldSubscribe, subscribe));
			}
		}
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe basicGetSubscribe() {
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribe(Subscribe newSubscribe) {
		Subscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.REPOSITORY__SUBSCRIBE, oldSubscribe, subscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAggregateRoot((DomainObject)otherEnd, msgs);
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				return basicSetAggregateRoot(null, msgs);
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				return eInternalContainer().eInverseRemove(this, SculptormetamodelPackage.DOMAIN_OBJECT__REPOSITORY, DomainObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptormetamodelPackage.REPOSITORY__GAP_CLASS:
				return isGapClass();
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				if (resolve) return getAggregateRoot();
				return basicGetAggregateRoot();
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				return getOperations();
			case SculptormetamodelPackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				return getRepositoryDependencies();
			case SculptormetamodelPackage.REPOSITORY__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case SculptormetamodelPackage.REPOSITORY__SUBSCRIBE:
				if (resolve) return getSubscribe();
				return basicGetSubscribe();
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
			case SculptormetamodelPackage.REPOSITORY__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)newValue);
				return;
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends RepositoryOperation>)newValue);
				return;
			case SculptormetamodelPackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				getRepositoryDependencies().addAll((Collection<? extends Repository>)newValue);
				return;
			case SculptormetamodelPackage.REPOSITORY__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case SculptormetamodelPackage.REPOSITORY__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
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
			case SculptormetamodelPackage.REPOSITORY__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)null);
				return;
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
				return;
			case SculptormetamodelPackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				return;
			case SculptormetamodelPackage.REPOSITORY__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case SculptormetamodelPackage.REPOSITORY__SUBSCRIBE:
				setSubscribe((Subscribe)null);
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
			case SculptormetamodelPackage.REPOSITORY__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case SculptormetamodelPackage.REPOSITORY__AGGREGATE_ROOT:
				return basicGetAggregateRoot() != null;
			case SculptormetamodelPackage.REPOSITORY__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case SculptormetamodelPackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				return repositoryDependencies != null && !repositoryDependencies.isEmpty();
			case SculptormetamodelPackage.REPOSITORY__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case SculptormetamodelPackage.REPOSITORY__SUBSCRIBE:
				return subscribe != null;
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
		result.append(" (gapClass: ");
		result.append(gapClass);
		result.append(", otherDependencies: ");
		result.append(otherDependencies);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
