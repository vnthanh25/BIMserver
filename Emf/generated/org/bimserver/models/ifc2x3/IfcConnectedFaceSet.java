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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connected Face Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConnectedFaceSet()
 * @model
 * @generated
 */
public interface IfcConnectedFaceSet extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Cfs Faces</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcFace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfs Faces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfs Faces</em>' reference list.
	 * @see #isSetCfsFaces()
	 * @see #unsetCfsFaces()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConnectedFaceSet_CfsFaces()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcFace> getCfsFaces();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCfsFaces()
	 * @see #getCfsFaces()
	 * @generated
	 */
	void unsetCfsFaces();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cfs Faces</em>' reference list is set.
	 * @see #unsetCfsFaces()
	 * @see #getCfsFaces()
	 * @generated
	 */
	boolean isSetCfsFaces();

} // IfcConnectedFaceSet
