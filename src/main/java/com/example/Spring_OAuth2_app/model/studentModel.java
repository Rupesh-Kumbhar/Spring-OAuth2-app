package com.example.Spring_OAuth2_app.model;


public class studentModel {

    private String name;
    private Integer marks;
    private String email;

    public studentModel(String name, int marks, String email) {
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "studentModel{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", email='" + email + '\'' +
                '}';
    }
}