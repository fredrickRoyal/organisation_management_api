package com.urrms.organisation_management_api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrganisationCategory extends ParentEntity{
    private String code;
    private String name;
    private String description;

    private String sortingNumber;

    private boolean trackMou;
    private boolean trackPto; // permit to operate
    private boolean trackRegistration;

    private boolean accessReport;
}
