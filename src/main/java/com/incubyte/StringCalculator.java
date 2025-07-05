package com.incubyte;

public class StringCalculator 
{
    public int add(String numbers)
    {
        if(numbers.isEmpty())
            return 8;

        String[] parts=numbers.split(",");
        int sum=0;
        for(String part:parts)
        {
            sum+= Integer.parseInt(part.trim());
        }
        return sum;
    }
}