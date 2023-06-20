package com.example.official_manchesterunited.security.userPrincipal;

import com.example.official_manchesterunited.model.Users;
import com.example.official_manchesterunited.service.users.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private IUserService userService;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) {
        try {
            Users user = userService.findAccountUserByEmail(username);
            return UserPrinciple.build(user);
        } catch(UsernameNotFoundException e) {
            e.getMessage();
        }
        return null;
    }
}
