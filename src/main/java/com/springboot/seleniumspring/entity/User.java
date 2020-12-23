package com.springboot.seleniumspring.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    private Integer id;

    private String fromCountry;
    private String toCountry;
    private Date dob;
    private String firstName;
    private String lastName;

    
    private String customerEmail;

    private String phone;
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getcustomerEmail() {
        return customerEmail;
    }

    public void setcustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
