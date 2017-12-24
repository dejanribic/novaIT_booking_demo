package com.novait.booking_demo.Beans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.sql.Timestamp;

@SuppressWarnings("unused")
@Entity
@IdClass(EmployeePK.class)
public class Employee {

    private Long employeeId;
    private Long hotelId;
    private String name;
    private String email;
    private String address;
    private Timestamp creationTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }


    public String toString() {
        return new ToStringBuilder(this).
                append("name", name).
                append("email", email).
                append("address", address).
                toString();
    }

    @Override
    public int hashCode() {
        // You pick a hard-coded, randomly chosen, non-zero, odd number ideally different for each class
        return new HashCodeBuilder(17, 37).
                append(name).
                append(email).
                append(address).
                toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Employee rhs = (Employee) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(name, rhs.name)
                .append(email, rhs.email)
                .append(address, rhs.address)
                .isEquals();
    }
}

