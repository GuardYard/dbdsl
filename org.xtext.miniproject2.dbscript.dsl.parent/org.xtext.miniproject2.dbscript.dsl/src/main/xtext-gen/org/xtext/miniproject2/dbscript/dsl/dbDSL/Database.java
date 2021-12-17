/**
 * generated by Xtext 2.23.0
 */
package org.xtext.miniproject2.dbscript.dsl.dbDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Database#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Database#getTables <em>Tables</em>}</li>
 *   <li>{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Database#getInserts <em>Inserts</em>}</li>
 * </ul>
 *
 * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getDatabase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Database#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Table}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getDatabase_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

  /**
   * Returns the value of the '<em><b>Inserts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Insert}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inserts</em>' containment reference list.
   * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getDatabase_Inserts()
   * @model containment="true"
   * @generated
   */
  EList<Insert> getInserts();

} // Database
