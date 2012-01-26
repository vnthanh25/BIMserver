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
 * A representation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelVoidsElement()
 * @model
 * @generated
 */
public interface IfcRelVoidsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcElement#getHasOpenings <em>Has Openings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' reference.
	 * @see #isSetRelatingBuildingElement()
	 * @see #unsetRelatingBuildingElement()
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelVoidsElement_RelatingBuildingElement()
	 * @see org.bimserver.models.ifc2x3.IfcElement#getHasOpenings
	 * @model opposite="HasOpenings" unsettable="true"
	 * @generated
	 */
	IfcElement getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' reference.
	 * @see #isSetRelatingBuildingElement()
	 * @see #unsetRelatingBuildingElement()
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(IfcElement value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatingBuildingElement()
	 * @see #getRelatingBuildingElement()
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @generated
	 */
	void unsetRelatingBuildingElement();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relating Building Element</em>' reference is set.
	 * @see #unsetRelatingBuildingElement()
	 * @see #getRelatingBuildingElement()
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @generated
	 */
	boolean isSetRelatingBuildingElement();

	/**
	 * Returns the value of the '<em><b>Related Opening Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Opening Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Opening Element</em>' reference.
	 * @see #isSetRelatedOpeningElement()
	 * @see #unsetRelatedOpeningElement()
	 * @see #setRelatedOpeningElement(IfcFeatureElementSubtraction)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelVoidsElement_RelatedOpeningElement()
	 * @see org.bimserver.models.ifc2x3.IfcFeatureElementSubtraction#getVoidsElements
	 * @model opposite="VoidsElements" unsettable="true"
	 * @generated
	 */
	IfcFeatureElementSubtraction getRelatedOpeningElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Opening Element</em>' reference.
	 * @see #isSetRelatedOpeningElement()
	 * @see #unsetRelatedOpeningElement()
	 * @see #getRelatedOpeningElement()
	 * @generated
	 */
	void setRelatedOpeningElement(IfcFeatureElementSubtraction value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedOpeningElement()
	 * @see #getRelatedOpeningElement()
	 * @see #setRelatedOpeningElement(IfcFeatureElementSubtraction)
	 * @generated
	 */
	void unsetRelatedOpeningElement();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Opening Element</em>' reference is set.
	 * @see #unsetRelatedOpeningElement()
	 * @see #getRelatedOpeningElement()
	 * @see #setRelatedOpeningElement(IfcFeatureElementSubtraction)
	 * @generated
	 */
	boolean isSetRelatedOpeningElement();

} // IfcRelVoidsElement
