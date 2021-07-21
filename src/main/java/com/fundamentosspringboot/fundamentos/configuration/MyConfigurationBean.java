package com.fundamentosspringboot.fundamentos.configuration;

import com.fundamentosspringboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){

        return new MyBeanTwoImplement(); // es la clase donde esta implementada Mybean
    }
    @Bean
    public MyOperation beanOperationOperation(){

        return new MyOperationImplement(); // es la clase donde esta implementada Mybean
    }
    @Bean
    public MyBeanWithDependeny beanOperationOperationWithDependency(MyOperation myOperation){

        return new MyBeanWithDependencyImplement(myOperation); // es la clase donde esta implementada Mybean
    }

}
