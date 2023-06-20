package com.example.official_manchesterunited.repository.role;

import com.example.official_manchesterunited.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    Role findByNameRole(String name);
}
