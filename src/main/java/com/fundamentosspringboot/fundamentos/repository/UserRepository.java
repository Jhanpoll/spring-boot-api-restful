package com.fundamentosspringboot.fundamentos.repository;

import com.fundamentosspringboot.fundamentos.entity.User;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u WHERE u.email=?1")
    Optional<User> findByUserEmail(String email);


}
