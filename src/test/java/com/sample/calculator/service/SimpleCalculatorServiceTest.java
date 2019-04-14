package com.sample.calculator.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleCalculatorServiceTest {

    @Autowired
    private SimpleCalculatorService service;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldAddArguments() {
        double result = service.addition(10d, 5d);

        assertThat(result).isEqualTo(15d);
    }

    @Test
    public void shouldSubtractArguments() {

        double result = service.subtraction(10d, 5d);

        assertThat(result).isEqualTo(5d);
    }

    @Test
    public void shouldMultiplyArguments() {
        double result = service.multiplication(10d, 5d);

        assertThat(result).isEqualTo(50d);

    }

    @Test
    public void shouldDivideArguments() {
        double result = service.division(10d, 5d);

        assertThat(result).isEqualTo(2d);
    }

    @Test
    public void shouldThrowExceptionByZero() {
        this.expectedException.expect(IllegalArgumentException.class);
        this.expectedException.expectMessage("Divisor can't be zero");

        this.service.division(10d, 0d);
    }


}
