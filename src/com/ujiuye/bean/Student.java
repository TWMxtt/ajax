package com.ujiuye.bean;

public class Student {
    private int sid;
    private String sname;
    private String sex;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(int sid, String sname, String sex, String phone, String email) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
