/**
 * FeedAttributeReferenceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public class FeedAttributeReferenceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedAttributeReferenceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_REFERENCE_DELETED_FEED = "CANNOT_REFERENCE_DELETED_FEED";
    public static final java.lang.String _INVALID_FEED_NAME = "INVALID_FEED_NAME";
    public static final java.lang.String _INVALID_FEED_ATTRIBUTE_NAME = "INVALID_FEED_ATTRIBUTE_NAME";
    public static final FeedAttributeReferenceErrorReason CANNOT_REFERENCE_DELETED_FEED = new FeedAttributeReferenceErrorReason(_CANNOT_REFERENCE_DELETED_FEED);
    public static final FeedAttributeReferenceErrorReason INVALID_FEED_NAME = new FeedAttributeReferenceErrorReason(_INVALID_FEED_NAME);
    public static final FeedAttributeReferenceErrorReason INVALID_FEED_ATTRIBUTE_NAME = new FeedAttributeReferenceErrorReason(_INVALID_FEED_ATTRIBUTE_NAME);
    public java.lang.String getValue() { return _value_;}
    public static FeedAttributeReferenceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedAttributeReferenceErrorReason enumeration = (FeedAttributeReferenceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedAttributeReferenceErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedAttributeReferenceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedAttributeReferenceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
