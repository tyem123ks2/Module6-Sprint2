package com.example.official_manchesterunited.service.users;

import com.example.official_manchesterunited.dto.users.UsersDTO;
import com.example.official_manchesterunited.model.Users;

public interface IUserService {
    Users findUserByNameAccount(String name);
    Boolean existByNameAccount(String name);
    Users saveAccountUser(Users user);
    Users findAccountUserByEmail(String email);
    int sendEmail(String email);
    void updatePassword(UsersDTO usersDTO, int id);
    void sendPassword(String email, int password);

    Users findById(int id);
}
