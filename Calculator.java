package ru.myHome.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

//    @Autowired
//    @Qualifier("adder")
    Operation operation;

    @Autowired
    public Calculator(@Qualifier("multiplier")Operation operation) {
       // System.out.println("calculator is create");
        this.operation = operation;
    }
    public void calc(double a, double b) {
        System.out.println(operation.getResult(a, b));
    }
}