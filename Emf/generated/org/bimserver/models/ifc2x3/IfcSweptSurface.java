/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSweptSurface()
 * @model
 * @generated
 */
public interface IfcSweptSurface extends IfcSurface {
	/**
	 * Returns the value of the '<em><b>Swept Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swept Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swept Curve</em>' reference.
	 * @see #isSetSweptCurve()
	 * @see #unsetSweptCurve()
	 * @see #setSweptCurve(IfcProfileDef)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSweptSurface_SweptCurve()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcProfileDef getSweptCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swept Curve</em>' reference.
	 * @see #isSetSweptCurve()
	 * @see #unsetSweptCurve()
	 * @see #getSweptCurve()
	 * @generated
	 */
	void setSweptCurve(IfcProfileDef value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSweptCurve()
	 * @see #getSweptCurve()
	 * @see #setSweptCurve(IfcProfileDef)
	 * @generated
	 */
	void unsetSweptCurve();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Swept Curve</em>' reference is set.
	 * @see #unsetSweptCurve()
	 * @see #getSweptCurve()
	 * @see #setSweptCurve(IfcProfileDef)
	 * @generated
	 */
	boolean isSetSweptCurve();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSweptSurface_Position()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @generated
	 */
	void unsetPosition();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getPosition <em>Position</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' reference is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @generated
	 */
	boolean isSetPosition();

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #setDim(int)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSweptSurface_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSweptSurface#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcSweptSurface
