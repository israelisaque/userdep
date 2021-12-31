package com.devjava.userdep.userdep.repositories;

import com.devjava.userdep.userdep.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
