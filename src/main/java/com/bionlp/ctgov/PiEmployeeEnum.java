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
 * <p>Java class for pi_employee_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pi_employee_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All Principal Investigators ARE employed by the organization sponsoring the study."/>
 *     &lt;enumeration value="Principal Investigators are NOT employed by the organization sponsoring the study."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pi_employee_enum")
@XmlEnum
public enum PiEmployeeEnum {

    @XmlEnumValue("All Principal Investigators ARE employed by the organization sponsoring the study.")
    ALL_PRINCIPAL_INVESTIGATORS_ARE_EMPLOYED_BY_THE_ORGANIZATION_SPONSORING_THE_STUDY("All Principal Investigators ARE employed by the organization sponsoring the study."),
    @XmlEnumValue("Principal Investigators are NOT employed by the organization sponsoring the study.")
    PRINCIPAL_INVESTIGATORS_ARE_NOT_EMPLOYED_BY_THE_ORGANIZATION_SPONSORING_THE_STUDY("Principal Investigators are NOT employed by the organization sponsoring the study.");
    private final String value;

    PiEmployeeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PiEmployeeEnum fromValue(String v) {
        for (PiEmployeeEnum c: PiEmployeeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
