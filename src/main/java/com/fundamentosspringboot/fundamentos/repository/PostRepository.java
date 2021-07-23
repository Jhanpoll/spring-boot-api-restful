package com.fundamentosspringboot.fundamentos.repository;

import com.fundamentosspringboot.fundamentos.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
