package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Ems implements Serializable {
    private Integer id;
    private String name;
    private Double salary;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Integer userId;

    public Ems() {
    }

    public Ems(Integer id, String name, Double salary, Date birthday, Integer userId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Ems{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
