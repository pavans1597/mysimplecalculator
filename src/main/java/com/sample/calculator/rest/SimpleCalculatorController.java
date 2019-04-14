package com.sample.calculator.rest;

import com.sample.calculator.service.Calculator;
import com.sample.calculator.service.SimplerCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {

    private Calculator calculator;

    @Autowired
    public SimpleCalculatorController(SimplerCalculatorService calculator) {
        this.calculator = calculator;
    }



    @GetMapping("/add/{num1}/{num2}")
    public ResponseEntity<CalculationResponse> add(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result = calculator.addition(first, second);

        CalculationResponse calculation = CalculationResponse.builder()
                .first(first)
                .second(second)
                .result(result)
                .build();

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/sub/{num1}/{num2}")
    public ResponseEntity<CalculationResponse> sub(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result  = calculator.subtraction(first, second);

        CalculationResponse calculation = CalculationResponse.builder()
                .first(first)
                .second(second)
                .result(result)
                .build();

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/div/{num1}/{num2}")
    public ResponseEntity<CalculationResponse> div(@PathVariable("num1") double first,
                                                   @PathVariable("num2") double second) {

        final double result  = calculator.division(first, second);

        CalculationResponse calculation = CalculationResponse.builder()
                .first(first)
                .second(second)
                .result(result)
                .build();

        return ResponseEntity.ok(calculation);
    }


    @GetMapping("/multiply/{num1}/{num2}")
    public ResponseEntity<CalculationResponse> multiply(@PathVariable("num1") double first,
                                                        @PathVariable("num2") double second) {

        final double result = calculator.multiplication(first, second);

        CalculationResponse calculation = CalculationResponse.builder()
                .first(first)
                .second(second)
                .result(result)
                .build();

        return ResponseEntity.ok(calculation);
    }
}

