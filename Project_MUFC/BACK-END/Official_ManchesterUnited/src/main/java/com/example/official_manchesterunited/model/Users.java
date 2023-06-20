package com.example.official_manchesterunited.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name_account"})
})
public class Users {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_account", columnDefinition = "varchar(255)")
    private String nameAccount;
    @Column(name = "password_account", columnDefinition = "varchar(255)")
    private String passwordAccount;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<Role> roles = new HashSet<>();

    public Users() {
    }

    public Users(int id, String nameAccount, String passwordAccount, Set<Role> roles) {
        this.id = id;
        this.nameAccount = nameAccount;
        this.passwordAccount = passwordAccount;
        this.roles = roles;
    }

    public Users(String username, String encode) {
        this.nameAccount = username;
        this.passwordAccount = encode;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameAccount='" + nameAccount + '\'' +
                ", passwordAccount='" + passwordAccount + '\'' +
                ", roles=" + roles +
                '}';
    }
}
