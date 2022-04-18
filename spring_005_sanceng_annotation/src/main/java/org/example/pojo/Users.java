package org.example.pojo;

public class Users {
    private int uid;
    private int uage;
    private String uname;

    public Users() {
    }

    public Users(int uid, int uage, String uname) {
        this.uid = uid;
        this.uage = uage;
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uage=" + uage +
                ", uname='" + uname + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
