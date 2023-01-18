package com.gunsoo.gunscafe.repository;

import com.gunsoo.gunscafe.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query(value = "SELECT * FROM users WHERE users.users_id = ?", nativeQuery = true)
    Users findByUserId(String usersId);
}
