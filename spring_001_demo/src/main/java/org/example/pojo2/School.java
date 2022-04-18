package org.example.pojo2;

public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("学校的无参构造方法被执行了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
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
