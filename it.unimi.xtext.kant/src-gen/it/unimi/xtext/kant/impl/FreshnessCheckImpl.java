/**
 * generated by Xtext 2.29.0
 */
package it.unimi.xtext.kant.impl;

import it.unimi.xtext.kant.FreshnessCheck;
import it.unimi.xtext.kant.KantPackage;
import it.unimi.xtext.kant.KnowledgeRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freshness Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unimi.xtext.kant.impl.FreshnessCheckImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link it.unimi.xtext.kant.impl.FreshnessCheckImpl#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreshnessCheckImpl extends CheckImpl implements FreshnessCheck
{
  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected EList<KnowledgeRef> knowledge;

  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FreshnessCheckImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KantPackage.Literals.FRESHNESS_CHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<KnowledgeRef> getKnowledge()
  {
    if (knowledge == null)
    {
      knowledge = new EObjectContainmentEList<KnowledgeRef>(KnowledgeRef.class, this, KantPackage.FRESHNESS_CHECK__KNOWLEDGE);
    }
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KantPackage.FRESHNESS_CHECK__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KantPackage.FRESHNESS_CHECK__KNOWLEDGE:
        return ((InternalEList<?>)getKnowledge()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KantPackage.FRESHNESS_CHECK__KNOWLEDGE:
        return getKnowledge();
      case KantPackage.FRESHNESS_CHECK__NOT:
        return isNot();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KantPackage.FRESHNESS_CHECK__KNOWLEDGE:
        getKnowledge().clear();
        getKnowledge().addAll((Collection<? extends KnowledgeRef>)newValue);
        return;
      case KantPackage.FRESHNESS_CHECK__NOT:
        setNot((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KantPackage.FRESHNESS_CHECK__KNOWLEDGE:
        getKnowledge().clear();
        return;
      case KantPackage.FRESHNESS_CHECK__NOT:
        setNot(NOT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KantPackage.FRESHNESS_CHECK__KNOWLEDGE:
        return knowledge != null && !knowledge.isEmpty();
      case KantPackage.FRESHNESS_CHECK__NOT:
        return not != NOT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (not: ");
    result.append(not);
    result.append(')');
    return result.toString();
  }

} //FreshnessCheckImpl
