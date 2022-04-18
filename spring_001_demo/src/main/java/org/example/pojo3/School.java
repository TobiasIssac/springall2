package org.example.pojo3;

public class School {
    private String name;
    private String address;
    //使用带参构造注入方法


    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
