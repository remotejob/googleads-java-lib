/**
 * DynamicSearchAdsSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * Setting for controlling Dynamic Search Ads (DSA). Contains the
 * domain name and the language
 *             used by the DSA system to automatically generate landing
 * pages and keywords for a campaign.
 */
public class DynamicSearchAdsSetting  extends com.google.api.ads.adwords.axis.v201607.cm.Setting  implements java.io.Serializable {
    /* The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     To disable the setting set the domainName field
     * to "-" (a single dash character).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String domainName;

    /* A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String languageCode;

    public DynamicSearchAdsSetting() {
    }

    public DynamicSearchAdsSetting(
           java.lang.String settingType,
           java.lang.String domainName,
           java.lang.String languageCode) {
        super(
            settingType);
        this.domainName = domainName;
        this.languageCode = languageCode;
    }


    /**
     * Gets the domainName value for this DynamicSearchAdsSetting.
     * 
     * @return domainName   * The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     To disable the setting set the domainName field
     * to "-" (a single dash character).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this DynamicSearchAdsSetting.
     * 
     * @param domainName   * The Internet domain name that this setting represents. E.g.
     * "google.com" or "www.google.com".
     *                     To disable the setting set the domainName field
     * to "-" (a single dash character).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the languageCode value for this DynamicSearchAdsSetting.
     * 
     * @return languageCode   * A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this DynamicSearchAdsSetting.
     * 
     * @param languageCode   * A language code that indicates what language the contents of
     * the domain is in. E.g. "en"
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAdsSetting)) return false;
        DynamicSearchAdsSetting other = (DynamicSearchAdsSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicSearchAdsSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "DynamicSearchAdsSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
