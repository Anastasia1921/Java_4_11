package ru.myHome.demo;

import org.springframework.stereotype.Component;

@Component("substractor")
public class Subtractor implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}