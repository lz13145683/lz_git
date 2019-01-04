package com.itheima.domain;

public class User {
    private Integer id;
    private String name;
    private String ahe;

    public String getAhe() {
        return ahe;
    }

    public void setAhe(String ahe) {
        this.ahe = ahe;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ahe='" + ahe + '\'' +
                '}';
    }
}
