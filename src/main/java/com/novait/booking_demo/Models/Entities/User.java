package com.novait.booking_demo.Models.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@SuppressWarnings("unused")
@Entity
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Timestamp creationTime;

    public User() {}


    public User(Long id, String name, String email, String password, Timestamp creationTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.creationTime = creationTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(nullable = false)
    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public boolean fieldCheck() {
        return (this.name != null && this.password != null && this.email != null);
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
