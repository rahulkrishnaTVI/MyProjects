package com.cma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cma.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
