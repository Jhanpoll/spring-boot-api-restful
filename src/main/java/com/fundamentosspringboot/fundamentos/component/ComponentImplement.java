package com.fundamentosspringboot.fundamentos.component;

@org.springframework.stereotype.Component
public class ComponentImplement implements Component{

    @Override
    public void leer() {
        System.out.println("hola desde mi componenente1");
    }
}
