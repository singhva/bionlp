//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.30 at 11:20:27 AM EST 
//


package com.bionlp.ctgov;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redacted_record_status_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="redacted_record_status_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Withheld"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "redacted_record_status_enum")
@XmlEnum
public enum RedactedRecordStatusEnum {

    @XmlEnumValue("Withheld")
    WITHHELD("Withheld");
    private final String value;

    RedactedRecordStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedactedRecordStatusEnum fromValue(String v) {
        for (RedactedRecordStatusEnum c: RedactedRecordStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}