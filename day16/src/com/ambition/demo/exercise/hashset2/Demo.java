package com.ambition.demo.exercise.hashset2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/14:40
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User("tom","1234"));
        set.add(new User("tom1","1234"));
        set.add(new User("tom2","1234"));
        set.add(new User("tom3","1234"));
        set.add(new User("tom","1234"));

        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
class User{
    private String name;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
