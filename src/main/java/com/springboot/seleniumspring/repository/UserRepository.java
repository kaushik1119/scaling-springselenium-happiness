package com.springboot.seleniumspring.repository;

import com.springboot.seleniumspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByFromCountry(String country);
    List<User> findByDobBetween(Date from, Date to);
}
