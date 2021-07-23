package com.fundamentosspringboot.fundamentos;

import com.fundamentosspringboot.fundamentos.bean.MyBean;
import com.fundamentosspringboot.fundamentos.bean.MyBeanWithDependeny;
import com.fundamentosspringboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosspringboot.fundamentos.component.Component;
import com.fundamentosspringboot.fundamentos.entity.User;
import com.fundamentosspringboot.fundamentos.pojo.UserPojo;
import com.fundamentosspringboot.fundamentos.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	// log es una clase de la libreria apache tom
	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);
	private Component component;
	private MyBean myBean;
	private MyBeanWithDependeny myBeanWithDependeny;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;
	private UserRepository userRepository;

	public FundamentosApplication(@Qualifier("componentTwo") Component component,MyBean myBean, MyBeanWithDependeny myBeanWithDependeny, MyBeanWithProperties myBeanWithProperties, UserPojo userPojo, UserRepository userRepository) {
		this.component= component;
		this.myBean=myBean;
		this.myBeanWithDependeny=myBeanWithDependeny;
		this.myBeanWithProperties=myBeanWithProperties;
		this.userPojo=userPojo;
		this.userRepository=userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//ejemplosAnteriores();
		saveUsersInDataBase();


	}
	private void saveUsersInDataBase(){
		User user1 = new User("jesus", "chero@gmail.com", LocalDate.of(2021,07,04));
		User user2 = new User("jesus2", "chero2@gmail.com", LocalDate.of(2021,07,04));
		User user3 = new User("jesus3", "chero3@gmail.com", LocalDate.of(2021,07,04));

		List<User> list = Arrays.asList(user1, user2, user3);
		list.stream().forEach(userRepository::save);
	}
	private void ejemplosAnteriores(){
		component.leer();
		myBean.print();
		myBeanWithDependeny.printWithDependeny();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail()+" - "+userPojo.getPassword());
		try{
			//error
			int value= 10/0;
			LOGGER.info("mi valor es: "+value);
		}catch (Exception e){
			LOGGER.error("esto es un error por dividir entre cero"+ e.getMessage());
		}
	}
}
