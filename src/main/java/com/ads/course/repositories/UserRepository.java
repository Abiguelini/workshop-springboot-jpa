package com.ads.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ads.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
