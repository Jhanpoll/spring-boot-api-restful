package com.fundamentosspringboot.fundamentos;

import com.fundamentosspringboot.fundamentos.bean.MyBean;
import com.fundamentosspringboot.fundamentos.bean.MyBeanWithDependeny;
import com.fundamentosspringboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosspringboot.fundamentos.component.Component;
import com.fundamentosspringboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private Component component;
	private MyBean myBean;
	private MyBeanWithDependeny myBeanWithDependeny;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;

	public FundamentosApplication(@Qualifier("componentTwo") Component component,MyBean myBean, MyBeanWithDependeny myBeanWithDependeny, MyBeanWithProperties myBeanWithProperties, UserPojo userPojo) {
		this.component= component;
		this.myBean=myBean;
		this.myBeanWithDependeny=myBeanWithDependeny;
		this.myBeanWithProperties=myBeanWithProperties;
		this.userPojo=userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		component.leer();
		myBean.print();
		myBeanWithDependeny.printWithDependeny();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail()+" - "+userPojo.getPassword());
	}
}
