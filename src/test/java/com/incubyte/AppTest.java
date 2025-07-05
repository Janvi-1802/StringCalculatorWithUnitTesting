package com.incubyte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void shouldReturn0ForEmptyString()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("");
        assertEquals(0,result);
    }
}
