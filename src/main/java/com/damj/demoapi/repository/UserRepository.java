package com.damj.demoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damj.demoapi.model.users;



public interface UserRepository extends JpaRepository<users, Long> {

}