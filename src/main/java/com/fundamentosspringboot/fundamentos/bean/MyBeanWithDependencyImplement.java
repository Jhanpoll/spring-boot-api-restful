package com.fundamentosspringboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependencyImplement implements  MyBeanWithDependeny{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependeny() {
        LOGGER.info("hemos ingresado al metodo printWithDependency");
        int numero =1;
        LOGGER.debug("el numero enviado como parametro a la dependencia operacion es: "+numero);
        System.out.println(myOperation.suma(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");

    }
}
