package com.univ.pojo;

public class AdminInfo {
    private String username;
    private String password;
    private String role;  // Always "ADMIN"

    // ---- Getters & Setters ----
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
