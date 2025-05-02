package com.urrms.organisation_management_api.entity;

public enum Status {
    ACTIVE("Active"),
    IN_ACTIVE("In_active");

    final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
