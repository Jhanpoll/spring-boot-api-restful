package com.fundamentosspringboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements  MyBeanWithDependeny{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependeny() {
        int numero =1;
        System.out.println(myOperation.suma(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");

    }
}
