package com.ambition.javabean;

public class User {
    private String userName;
    private Integer passWord;
    private String gender;
    private Integer age;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord=" + passWord +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    public User() {
    }

    public User(String userName, Integer passWord, String gender, Integer age, String address) {
        this.userName = userName;
        this.passWord = passWord;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
}
