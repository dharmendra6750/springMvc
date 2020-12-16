package com.fiberhome.model;

/**
 * User
 */
public class User {
    private String s;
    /**
     * userId
     */
    private int userId;
    /**
     * userName
     */
    private String userName;
    /**
     * emailId
     */
    private String emailId;
    /**
     * country
     */
    private String country;

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
