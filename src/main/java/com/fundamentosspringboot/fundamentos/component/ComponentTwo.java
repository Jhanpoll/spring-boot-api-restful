package com.fundamentosspringboot.fundamentos.component;

@org.springframework.stereotype.Component
public class ComponentTwo implements Component{

    @Override
    public void leer() {
        System.out.println("hola desde mi componente 2");
    }
}
