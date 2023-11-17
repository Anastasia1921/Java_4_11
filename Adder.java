package ru.myHome.demo;

import org.springframework.stereotype.Component;

@Component("adder")
public class Adder implements Operation {

    public double getResult(double a, double b) {
        return a + b;
    }
}