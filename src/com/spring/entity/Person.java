package com.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class Person {
    private String name;
    private Integer age;
    private Dag dag = new Dag();
    private List<String> addr;
    private Set<String> love;
    private Map<String,String> adds;
    private Properties properties;


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<String> getLove() {
        return love;
    }

    public void setLove(Set<String> love) {
        this.love = love;
    }

    public List<String> getAddr() {
        return addr;
    }

    public void setAddr(List<String> addr) {
        this.addr = addr;
    }

    public Map<String, String> getAdds() {
        return adds;
    }

    public void setAdds(Map<String, String> adds) {
        this.adds = adds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dag getDag() {
        return dag;
    }

    public void setDag(Dag dag) {
        this.dag = dag;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dag=" + dag +
                '}';
    }
}
