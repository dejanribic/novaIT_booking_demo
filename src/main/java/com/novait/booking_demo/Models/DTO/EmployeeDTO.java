package com.novait.booking_demo.Models.DTO;

import java.sql.Timestamp;

public class EmployeeDTO {

    private String employeeName;
    private String employeeEmail;
    private String employeeAddress;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String employeeName, String employeeEmail, String employeeAddress) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}