package com.example.official_manchesterunited.service.users;

import com.example.official_manchesterunited.dto.users.UsersDTO;
import com.example.official_manchesterunited.model.Users;
import com.example.official_manchesterunited.repository.users.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

//    @Autowired
//    private JavaMailSender javaMailSender;

    @Override
    public Users findUserByNameAccount(String name) {
        Users users = userRepository.findUsersByNameAccount(name);
        return users;
    }

    @Override
    public Boolean existByNameAccount(String name) {
        Users users = userRepository.findUsersByNameAccount(name);
        if (users != null) {
            return true;
        }
        return false;
    }

    @Override
    public Users saveAccountUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users findAccountUserByEmail(String email) {
        return userRepository.findUsersByEmail(email);
    }

    @Override
    public int sendEmail(String email) {
        return 0;
    }

    @Override
    public void sendPassword(String email, int password) {

    }

    @Override
    public void updatePassword(UsersDTO usersDTO, int id) {

    }

    @Override
    public Users findById(int id) {
        return userRepository.findUsersById(id);
    }
}
