/**
 * generated by Xtext 2.29.0
 */
package it.unimi.xtext.kant.impl;

import it.unimi.xtext.kant.KantPackage;
import it.unimi.xtext.kant.KnowledgeDefSetDesctructuringAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Def Set Desctructuring Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unimi.xtext.kant.impl.KnowledgeDefSetDesctructuringAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unimi.xtext.kant.impl.KnowledgeDefSetDesctructuringAssignmentImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeDefSetDesctructuringAssignmentImpl extends MinimalEObjectImpl.Container implements KnowledgeDefSetDesctructuringAssignment
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnowledgeDefSetDesctructuringAssignmentImpl()
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
    return KantPackage.Literals.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__FROM, oldFrom, from));
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
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__NAME:
        return getName();
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__FROM:
        return getFrom();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__NAME:
        setName((String)newValue);
        return;
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__FROM:
        setFrom((String)newValue);
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
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__FROM:
        setFrom(FROM_EDEFAULT);
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
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KantPackage.KNOWLEDGE_DEF_SET_DESCTRUCTURING_ASSIGNMENT__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", from: ");
    result.append(from);
    result.append(')');
    return result.toString();
  }

} //KnowledgeDefSetDesctructuringAssignmentImpl
