package com.example.official_manchesterunited.service.role;

import com.example.official_manchesterunited.model.Role;
import com.example.official_manchesterunited.repository.role.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findByNameRole(name);
    }
}
