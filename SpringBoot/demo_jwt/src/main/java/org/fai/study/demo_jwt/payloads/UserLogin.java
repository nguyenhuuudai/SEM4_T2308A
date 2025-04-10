package org.fai.study.demo_jwt.payloads;

public class UserLogin {
    public String username;
    public String password;

    public UserLogin(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public UserLogin() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
