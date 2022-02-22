package com.akasyuka.website.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userEmail;
    private String userPassword;
    private String userFirstName;
    private String userLastName;
    private String userCity;
    private String userState;
    private String userZip;
    private Integer userEmailVerified;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date userRegistrationDate;

    private String userVerificationCode;
    private String userIp;
    private String userPhone;
    private String userFax;
    private String userCountry;
    private String userAddress;
    private String userAddress2;

    public User(Long userId, String userEmail, String userPassword, String userFirstName, String userLastName, String userCity, String userState, String userZip, Integer userEmailVerified, Date userRegistrationDate, String userVerificationCode, String userIp, String userPhone, String userFax, String userCountry, String userAddress, String userAddress2) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userCity = userCity;
        this.userState = userState;
        this.userZip = userZip;
        this.userEmailVerified = userEmailVerified;
        this.userRegistrationDate = userRegistrationDate;
        this.userVerificationCode = userVerificationCode;
        this.userIp = userIp;
        this.userPhone = userPhone;
        this.userFax = userFax;
        this.userCountry = userCountry;
        this.userAddress = userAddress;
        this.userAddress2 = userAddress2;
    }

    public User() {
    }
}
