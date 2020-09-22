package com.ambition.demo.demo7optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/16:34
 * @Description:}
 *  Optional:
 *      用于避免空指针异常，是一个容器，可以存储任意对象
 */
public class Demo {
    public static void main(String[] args) {
    }

    @Test
    public void test1(){
        Optional<Object> empty = Optional.empty();
        Optional<String> s = Optional.of(new String());
        Optional<Object> o = Optional.ofNullable(null);
    }

    //获取用户所在城市
    public String getCity(User user){
        if (user != null){
            Address address = user.getAddress();
            if (address != null){
                return address.getCity();
            }
        }
        return null;
    }

    public String getCity2(User user){
        return Optional.ofNullable(user).map(User::getAddress).map(Address::getCity).orElse("无城市信息");
    }

    @Test
    public void test2(){
        String city = getCity2(null);
        System.out.println(city);
    }
}

//用户类
class User{
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public User() {
    }
}

//地址类
class  Address{
    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }
}
