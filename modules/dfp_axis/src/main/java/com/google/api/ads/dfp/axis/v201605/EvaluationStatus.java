/**
 * EvaluationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public class EvaluationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EvaluationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final java.lang.String _IN_PROGRESS = "IN_PROGRESS";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _SKIPPED = "SKIPPED";
    public static final java.lang.String _INACTIVE_BUT_TRIGGERED = "INACTIVE_BUT_TRIGGERED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final EvaluationStatus CANCELED = new EvaluationStatus(_CANCELED);
    public static final EvaluationStatus COMPLETED = new EvaluationStatus(_COMPLETED);
    public static final EvaluationStatus FAILED = new EvaluationStatus(_FAILED);
    public static final EvaluationStatus IN_PROGRESS = new EvaluationStatus(_IN_PROGRESS);
    public static final EvaluationStatus INACTIVE = new EvaluationStatus(_INACTIVE);
    public static final EvaluationStatus SKIPPED = new EvaluationStatus(_SKIPPED);
    public static final EvaluationStatus INACTIVE_BUT_TRIGGERED = new EvaluationStatus(_INACTIVE_BUT_TRIGGERED);
    public static final EvaluationStatus UNKNOWN = new EvaluationStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static EvaluationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EvaluationStatus enumeration = (EvaluationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EvaluationStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EvaluationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "EvaluationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
