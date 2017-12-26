package com.novait.booking_demo.Models.Entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class Hotel {

    private Long id;

    private String name;
    private String address;
    private String phone;

    public Hotel() {
    }

    public Hotel(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return new ToStringBuilder(this).
                append("name", name).
                append("phone", phone).
                append("address", address).
                toString();
    }

    @Override
    public int hashCode() {
        // You pick a hard-coded, randomly chosen, non-zero, odd number ideally different for each class
        return new HashCodeBuilder(17, 37).
                append(name).
                append(phone).
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
        Hotel rhs = (Hotel) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(name, rhs.name)
                .append(phone, rhs.phone)
                .append(address, rhs.address)
                .isEquals();
    }
}
