package com.spring.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class Dag {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dag{" +
                "name='" + name + '\'' +
                '}';
    }
}
