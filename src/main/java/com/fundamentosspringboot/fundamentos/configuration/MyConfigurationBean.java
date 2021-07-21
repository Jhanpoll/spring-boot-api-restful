package com.fundamentosspringboot.fundamentos.configuration;

import com.fundamentosspringboot.fundamentos.bean.MyBean;
import com.fundamentosspringboot.fundamentos.bean.MyBeanImplement;
import com.fundamentosspringboot.fundamentos.bean.MyBeanTwoImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){

        return new MyBeanTwoImplement(); // es la clase donde esta implementada Mybean
    }
}
