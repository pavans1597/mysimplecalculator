package com.sample.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService implements Calculator {

    @Override
    public double addition(double first, double second) {
        return first + second;
    }

    @Override
    public double subtraction(double first, double second) {
        return first - second ;
    }

    @Override
    public double multiplication(double first, double second) {
        return first * second;
    }

    @Override
    public double division(double first, double second) {

        if(second == 0d)
            throw new IllegalArgumentException("Divisor can't be zero");

        return first / second;
    }
}
