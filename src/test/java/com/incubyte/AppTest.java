package com.incubyte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


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
    //For leading white space Input: "          "
                        //    Output: 0
    public void LeadingWhiteSpace()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("        ");
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

    @Test 
    //checking for too many numbers 
    public void TooManyNumbersSum()
    {
         StringCalculator calculator=new StringCalculator();
        int result=calculator.add("1,2,3,4,5,6,7,8,9,12,34,56,78,23,67890,3421,566,32,1111,777,444");
        assertEquals(74489,result);
    }

    @Test
    //Support \n as a separtor
    public void NewLineSeparatedNumberSum()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("1\n2,3");
        assertEquals(6,result);
    }

    @Test
    //support multiple delimeters 
    public void MultipleDelimeters()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("//;,\n1;2,3");
        assertEquals(6,result);
    }

    @Test
    //handle negative number by providing exception message
    public void HandleNegativeNumber()
    {
        StringCalculator calculator=new StringCalculator();
       Exception exception = assertThrows(IllegalArgumentException.class, ()->{
        calculator.add("-1,-2,-3,4");
       });

       assertTrue(exception.getMessage().contains("Negative numbers not allowed -1,-2,-3"));
    }

    @Test
    // to test how many times add is called
    public void HowManyTimesAddCalled()
    {
        StringCalculator calculator=new StringCalculator();
        calculator.add("1,2,3");
        calculator.add("1\n2");
        calculator.add("//;,*\n1;2*3");
        int result=calculator.GetCalledCount();
        assertEquals(3,result);
    }


}



