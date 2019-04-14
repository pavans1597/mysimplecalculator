package com.sample.calculator.rest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculationResponse {

    private double first;
    private double second;
    private double result;
}
