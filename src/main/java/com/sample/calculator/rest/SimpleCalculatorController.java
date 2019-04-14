package com.sample.calculator.rest;

import com.sample.calculator.service.Calculator;
import com.sample.calculator.service.SimpleCalculatorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {

    private Calculator calculator;

    @Autowired
    public SimpleCalculatorController(SimpleCalculatorService calculator) {
        this.calculator = calculator;
    }


    @GetMapping("/add/{num1}/{num2}")
    @ApiOperation(value = "Returns the sum of the arguments")
    public ResponseEntity<CalculationResponse> add(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result = calculator.addition(first, second);

        CalculationResponse calculation = build(first, second, result);

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/sub/{num1}/{num2}")
    @ApiOperation(value = "Returns the difference of the arguments")
    public ResponseEntity<CalculationResponse> sub(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result = calculator.subtraction(first, second);

        CalculationResponse calculation = build(first, second, result);

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/div/{num1}/{num2}")
    @ApiOperation(value = "Returns the quotient of the arguments")
    public ResponseEntity<CalculationResponse> div(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result = calculator.division(first, second);

        CalculationResponse calculation = build(first, second, result);

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/multiply/{num1}/{num2}")
    @ApiOperation(value = "Returns the product of the arguments")
    public ResponseEntity<CalculationResponse> multiply(@PathVariable("num1") double first,
                                                        @PathVariable("num2") double second) {

        final double result = calculator.multiplication(first, second);

        CalculationResponse calculation = build(first, second, result);

        return ResponseEntity.ok(calculation);
    }

    public CalculationResponse build(double first, double second, double result) {
        return CalculationResponse.builder()
                .first(first)
                .second(second)
                .result(result)
                .build();
    }
}

