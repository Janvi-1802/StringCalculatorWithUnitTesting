package com.incubyte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    //check for testcase input: "" empty string 
                    //   output: 0
    public void shouldReturn0ForEmptyString()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("");
        assertEquals(0,result);
    }

    @Test 
    //check for testcase input :"1" output: 1
                    //   input: "1,2,3" output:6
    public void CommaSeparatedValuesSum()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("1,2,3");
        assertEquals(6,result);
    }


}



