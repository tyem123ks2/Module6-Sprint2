package com.example.official_manchesterunited.dto.users;


import com.example.official_manchesterunited.model.Role;

import java.util.Set;

public class UsersDTO {
    private int id;
    private String nameAccount;
    private String passwordAccount;
    private Set<Role> roles;

    public UsersDTO() {
    }

    public UsersDTO(int id, String nameAccount, String passwordAccount, Set<Role> roles) {
        this.id = id;
        this.nameAccount = nameAccount;
        this.passwordAccount = passwordAccount;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getPasswordAccount() {
        return passwordAccount;
    }

    public void setPasswordAccount(String passwordAccount) {
        this.passwordAccount = passwordAccount;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
