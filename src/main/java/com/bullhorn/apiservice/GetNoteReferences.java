
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNoteReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNoteReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNoteReferences", propOrder = {
    "session",
    "noteId"
})
public class GetNoteReferences {

    protected String session;
    protected int noteId;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Gets the value of the noteId property.
     * 
     */
    public int getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     */
    public void setNoteId(int value) {
        this.noteId = value;
    }

}
