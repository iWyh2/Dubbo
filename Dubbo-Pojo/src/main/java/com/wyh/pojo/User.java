package com.wyh.pojo;

import java.io.Serializable;

public class User implements Serializable {//序列化时为了在两台机器之间传输，dubbo已经封装了对应的序列化和反序列化
    private int id;
    private String username;

    public User() {
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
