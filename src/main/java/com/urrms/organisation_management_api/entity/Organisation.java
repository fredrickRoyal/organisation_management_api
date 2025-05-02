package com.urrms.organisation_management_api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Organisation extends ParentEntity {

    private OrganisationCategory organisationCategory;

    private String code;
    private String shortName;
    private String organisationName;
    private String physicalAddress;
    private String email;
    private String officeNumber;
    private String postalAddress;
    private String registrationNumber;
    private String organisationSummary;
    private String website;

    private String operationalStatus;

    private String contactPersonName;
    private String contactPersonTelephone;
    private String contactPersonEmail;

    private String supervisorName;
    private String supervisorTelephone;
    private String supervisorEmail;

    private String licenseNo;
    private String licenseIssueDate;
    private String licenseExpiryDate;
    private String UID;

}
