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
        //as we have the feature that number which are greater than 1000 are ignored. that's why sum is 2067.
        assertEquals(2067,result);
    }

    @Test
    //Support \n as a separator
    public void NewLineSeparatedNumberSum()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("1\n2,3");
        assertEquals(6,result);
    }

    @Test
    //support multiple delimiters 
    public void MultipleDelimiters()
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

    @Test 
    //Number greater than 1000 should be ignored
    public void GreaterThan1000ShouldBeIgnored()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("1,2,3,5678,23,11,225677");
        assertEquals(40,result);
    }

    @Test
    //delimiters can be of any length
    public void delimitersCanBeOfAnyLength()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("//[***]\n1***2***3");
        assertEquals(6,result);
    }

    @Test
    //multiple delimiters
    public void CheckMultipleDelimitersSum()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("//[*][%]\n1*2%3");
        assertEquals(6,result);
    }
    
    @Test
    //multiple delimiter of length greater than 1
    public void MultipleDelimiterWithLengthGreaterThanOne()
    {
        StringCalculator calculator=new StringCalculator();
        int result=calculator.add("//[**][%%]\n1**2%%3");
        assertEquals(6,result);
    }
}



