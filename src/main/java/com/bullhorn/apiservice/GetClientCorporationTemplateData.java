
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientCorporationTemplateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientCorporationTemplateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientCorporationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientCorporationTemplateData", propOrder = {
    "session",
    "templateId",
    "clientCorporationId",
    "dataId"
})
public class GetClientCorporationTemplateData {

    protected String session;
    protected int templateId;
    protected int clientCorporationId;
    protected int dataId;

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
     * Gets the value of the templateId property.
     * 
     */
    public int getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     */
    public void setTemplateId(int value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the clientCorporationId property.
     * 
     */
    public int getClientCorporationId() {
        return clientCorporationId;
    }

    /**
     * Sets the value of the clientCorporationId property.
     * 
     */
    public void setClientCorporationId(int value) {
        this.clientCorporationId = value;
    }

    /**
     * Gets the value of the dataId property.
     * 
     */
    public int getDataId() {
        return dataId;
    }

    /**
     * Sets the value of the dataId property.
     * 
     */
    public void setDataId(int value) {
        this.dataId = value;
    }

}
