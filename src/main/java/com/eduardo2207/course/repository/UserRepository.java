package com.eduardo2207.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo2207.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
