package com.newtouch.myspringboot.dao.pojo;

public class UserVO {
    private int id;
    private String userName;
    private String passwords;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPasswords() {
        return passwords;
    }
    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
