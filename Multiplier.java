package ru.myHome.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("multiplier")
public class Multiplier implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }


}
