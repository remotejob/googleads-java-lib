/**
 * ExpressionRuleUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.rm;


/**
 * Visitors of a page. The page visit is defined by one boolean rule
 * expression.
 */
public class ExpressionRuleUserList  extends com.google.api.ads.adwords.axis.v201601.rm.RuleBasedUserList  implements java.io.Serializable {
    /* Boolean rule that defines this user list. The rule consists
     * of a list of
     *                     rule item groups. All the rule item groups are
     * ORed for the evaluation. This
     *                     field is selected by default.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ExpressionListRule".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201601.rm.Rule rule;

    public ExpressionRuleUserList() {
    }

    public ExpressionRuleUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201601.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201601.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201601.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201601.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201601.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201601.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201601.rm.Rule rule) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            userListType);
        this.rule = rule;
    }


    /**
     * Gets the rule value for this ExpressionRuleUserList.
     * 
     * @return rule   * Boolean rule that defines this user list. The rule consists
     * of a list of
     *                     rule item groups. All the rule item groups are
     * ORed for the evaluation. This
     *                     field is selected by default.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ExpressionListRule".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.rm.Rule getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ExpressionRuleUserList.
     * 
     * @param rule   * Boolean rule that defines this user list. The rule consists
     * of a list of
     *                     rule item groups. All the rule item groups are
     * ORed for the evaluation. This
     *                     field is selected by default.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ExpressionListRule".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRule(com.google.api.ads.adwords.axis.v201601.rm.Rule rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpressionRuleUserList)) return false;
        ExpressionRuleUserList other = (ExpressionRuleUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule())));
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
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressionRuleUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "ExpressionRuleUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "Rule"));
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
