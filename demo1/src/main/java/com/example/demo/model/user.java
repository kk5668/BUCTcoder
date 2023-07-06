package com.example.demo.model;


public class user {
    private int id;
    private String username;
    private String password;
    private String tell;

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getTell() {
        return tell;
    }
}