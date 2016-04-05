//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgen.manifest.schema.v1_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Presentation-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Presentation-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackMetadata" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}TrackMetadata-type"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LanguagePair" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}PresentationLanguagePair-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Chapters" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}ChapterList-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PresentationID" use="required" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}PresentationID-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation-type", propOrder = {
    "trackMetadata",
    "languagePair",
    "chapters"
})
public class PresentationType {

    @XmlElement(name = "TrackMetadata", required = true)
    protected List<PresentationType.TrackMetadata> trackMetadata;
    @XmlElement(name = "LanguagePair")
    protected List<PresentationLanguagePairType> languagePair;
    @XmlElement(name = "Chapters")
    protected ChapterListType chapters;
    @XmlAttribute(name = "PresentationID", required = true)
    protected String presentationID;

    /**
     * Gets the value of the trackMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationType.TrackMetadata }
     * 
     * 
     */
    public List<PresentationType.TrackMetadata> getTrackMetadata() {
        if (trackMetadata == null) {
            trackMetadata = new ArrayList<PresentationType.TrackMetadata>();
        }
        return this.trackMetadata;
    }

    /**
     * Gets the value of the languagePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languagePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguagePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationLanguagePairType }
     * 
     * 
     */
    public List<PresentationLanguagePairType> getLanguagePair() {
        if (languagePair == null) {
            languagePair = new ArrayList<PresentationLanguagePairType>();
        }
        return this.languagePair;
    }

    /**
     * Gets the value of the chapters property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterListType }
     *     
     */
    public ChapterListType getChapters() {
        return chapters;
    }

    /**
     * Sets the value of the chapters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterListType }
     *     
     */
    public void setChapters(ChapterListType value) {
        this.chapters = value;
    }

    /**
     * Gets the value of the presentationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationID() {
        return presentationID;
    }

    /**
     * Sets the value of the presentationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationID(String value) {
        this.presentationID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.movielabs.com/schema/manifest/v1.4/manifest}TrackMetadata-type"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TrackMetadata
        extends TrackMetadataType
    {


    }

}