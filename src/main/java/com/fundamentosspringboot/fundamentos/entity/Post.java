package com.fundamentosspringboot.fundamentos.entity;

import org.apache.catalina.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    @Column(name = "id_post",nullable = false,unique = true)

    private Long id;
    @Column(name = "description",length = 255)
    private String description;
    @ManyToOne
    private User user;

}
