package com.incubyte;

public class StringCalculator 
{
    public int add(String numbers)
    {
        //To handle empty string 
        if(numbers.isEmpty())
            return 0;

        //both newline and comma is supported as a separator
        String separator="[,\n]";
        
        String[] NumbersSeparatedByNewLine = numbers.split(separator);
        int sum=0;
        for(String number:NumbersSeparatedByNewLine)
        {
            sum+= Integer.parseInt(number.trim());
        }
        return sum;
       
    }
}