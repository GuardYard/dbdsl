/**
 * generated by Xtext 2.23.0
 */
package org.xtext.miniproject2.dbscript.dsl.dbDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Table#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.miniproject2.dbscript.dsl.dbDSL.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.miniproject2.dbscript.dsl.dbDSL.AbstractType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.xtext.miniproject2.dbscript.dsl.dbDSL.DbDSLPackage#getTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<AbstractType> getColumns();

} // Table
