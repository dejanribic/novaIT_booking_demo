package com.novait.booking_demo.Models.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@SuppressWarnings("unused")
@Entity
@IdClass(EmployeePK.class)
@Table(name = "EMPLOYEE")
public class Employee {

    private Long employeeId;
    private Long hotelId;
    private Timestamp creationTime;
    private ContactInfo employeeInfo;

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

       public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public ContactInfo getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(ContactInfo employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

