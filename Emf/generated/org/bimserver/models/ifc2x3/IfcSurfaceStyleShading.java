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
 * A representation of the model object '<em><b>Ifc Surface Style Shading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceStyleShading()
 * @model
 * @generated
 */
public interface IfcSurfaceStyleShading extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Surface Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Colour</em>' reference.
	 * @see #isSetSurfaceColour()
	 * @see #unsetSurfaceColour()
	 * @see #setSurfaceColour(IfcColourRgb)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceStyleShading_SurfaceColour()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcColourRgb getSurfaceColour();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Colour</em>' reference.
	 * @see #isSetSurfaceColour()
	 * @see #unsetSurfaceColour()
	 * @see #getSurfaceColour()
	 * @generated
	 */
	void setSurfaceColour(IfcColourRgb value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSurfaceColour()
	 * @see #getSurfaceColour()
	 * @see #setSurfaceColour(IfcColourRgb)
	 * @generated
	 */
	void unsetSurfaceColour();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Surface Colour</em>' reference is set.
	 * @see #unsetSurfaceColour()
	 * @see #getSurfaceColour()
	 * @see #setSurfaceColour(IfcColourRgb)
	 * @generated
	 */
	boolean isSetSurfaceColour();

} // IfcSurfaceStyleShading
