package com.example.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Printer {
    public Printer() {
        System.out.println("Printer object is created");
    }

    public void printMessage(){
        System.out.println("Printing document");
    }
}