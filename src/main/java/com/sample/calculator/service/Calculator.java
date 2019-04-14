package com.sample.calculator.service;

/**
 * An Interface for a calculator
 * includes basic math operations
 */
public interface Calculator {

    /**
     * Returns the sum of the arguments
     * @param first the first value
     * @param second the second value
     * @return the result
     */
    double addition(double first, double second);

    /**
     * Returns the difference of the arguments
     * @param first the first value
     * @param second the second value
     * @return the result
     */
    double subtraction(double first, double second);


    /**
     * Returns the product of the arguments
     * @param first the first value
     * @param second the second value
     * @return the result
     */
    double multiplication(double first, double second);


    /**
     * Return the quotient of the arguments
     * @param first the first value
     * @param second the second value
     * @return the result
     */
    double division(double first, double second);
}
