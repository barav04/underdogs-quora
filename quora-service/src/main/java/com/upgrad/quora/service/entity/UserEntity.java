package com.upgrad.quora.service.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "USERS", schema = "public")
@NamedQueries({
        @NamedQuery(name = "userByEmail", query = "select u from UserEntity u where u.email = :email")
})
public class UserEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "UUID")
    @Size(max = 200)
    private String uuid;

    @Column(name = "first_name")
    @NotNull
    @Size(max = 30)
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    @Size(max = 30)
    private String lastName;

    @Column(name = "user_name")
    @NotNull
    @Size(max = 30)
    private String userName;

    @Column(name = "email")
    @NotNull
    @Size(max = 50)
    private String email;

    @Column(name = "password")
    @NotNull
    @Size(max = 255)
    private String password;


    @Column(name = "country")
    @NotNull
    @Size(max = 30)
    private String country;

    @Column(name = "about_me")
    @Size(max = 50)
    private String aboutMe;

    @Column(name = "dob")
    @NotNull
    @Size(max = 30)
    private String dob;

    @Column(name = "contact_number")
    @NotNull
    @Size(max = 30)
    private String contactNumber;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "SALT")
    @NotNull
    @Size(max = 200)
    private String salt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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



    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUserNameName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object obj) {
        return new EqualsBuilder().append(this, obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this).hashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}