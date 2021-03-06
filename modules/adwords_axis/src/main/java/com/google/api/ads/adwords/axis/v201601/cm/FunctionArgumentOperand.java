/**
 * FunctionArgumentOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * An operand that can be used in a function expression.
 */
public abstract class FunctionArgumentOperand  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of FunctionArgumentOperand.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String functionArgumentOperandType;

    public FunctionArgumentOperand() {
    }

    public FunctionArgumentOperand(
           java.lang.String functionArgumentOperandType) {
           this.functionArgumentOperandType = functionArgumentOperandType;
    }


    /**
     * Gets the functionArgumentOperandType value for this FunctionArgumentOperand.
     * 
     * @return functionArgumentOperandType   * Indicates that this instance is a subtype of FunctionArgumentOperand.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getFunctionArgumentOperandType() {
        return functionArgumentOperandType;
    }


    /**
     * Sets the functionArgumentOperandType value for this FunctionArgumentOperand.
     * 
     * @param functionArgumentOperandType   * Indicates that this instance is a subtype of FunctionArgumentOperand.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setFunctionArgumentOperandType(java.lang.String functionArgumentOperandType) {
        this.functionArgumentOperandType = functionArgumentOperandType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FunctionArgumentOperand)) return false;
        FunctionArgumentOperand other = (FunctionArgumentOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.functionArgumentOperandType==null && other.getFunctionArgumentOperandType()==null) || 
             (this.functionArgumentOperandType!=null &&
              this.functionArgumentOperandType.equals(other.getFunctionArgumentOperandType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFunctionArgumentOperandType() != null) {
            _hashCode += getFunctionArgumentOperandType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FunctionArgumentOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionArgumentOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionArgumentOperandType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionArgumentOperand.Type"));
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
