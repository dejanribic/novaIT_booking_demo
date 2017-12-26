package com.novait.booking_demo.Models.Entities;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT_INFO")
public class ContactInfo {

    private String name;
    private String email;
    private String address;
    private long contactInfoId;

    public ContactInfo() {
    }

    public ContactInfo(String street, String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Id
    @GeneratedValue
    public long getContactInfoId() {
        return contactInfoId;
    }

    public void setContactInfoId(long contactInfoId) {
        this.contactInfoId = contactInfoId;
    }

    @Column(name = "CONTACT_INFO_NAME", nullable = false, length=50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "CONTACT_INFO_EMAIL", nullable = false, length=50)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "CONTACT_INFO_ADDRESS", nullable = false, length=10)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}