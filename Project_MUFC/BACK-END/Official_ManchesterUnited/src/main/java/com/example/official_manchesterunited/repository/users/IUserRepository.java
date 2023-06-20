package com.example.official_manchesterunited.repository.users;

import com.example.official_manchesterunited.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    @Query(value = "select * from users where name_account like :name", nativeQuery = true)
    Users findUsersByNameAccount(@Param("name") String nameAccount);

    @Query(value = "select * from users where name_account like: email", nativeQuery = true)
    Users findUsersByEmail(@Param("email") String email);

    @Modifying
    @Transactional
    @Query(value = "update users set name_account = :name_account. password_account = :password_account where id = :id", nativeQuery = true)
    void updateAccount (
            @Param("name_account") String nameAccount
            , @Param("password_account") String passwordAccount
            , @Param("id") Integer id);

    boolean existsByNameAccount(String username);

    @Query(value = "update users set password_account = :password_account WHERE id = :id", nativeQuery = true)
    void savePassword(
            @Param("password_account") String passwordAccount,
            @Param("id") Integer id);

    @Transactional
    @Query(value = "select * from users where id = :id", nativeQuery = true)
    Users findUsersById(@Param("id") Integer id);
}
