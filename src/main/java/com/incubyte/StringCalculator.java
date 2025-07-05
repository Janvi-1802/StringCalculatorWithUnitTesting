package com.incubyte;

public class StringCalculator 
{
    public int add(String numbers)
    {
        //To handle empty string 
        if(numbers.isEmpty())
            return 0;

        //To handle comma separated number string 
        String[] parts=numbers.split(",");
        int sum=0;
        for(String part:parts)
        {
            sum+= Integer.parseInt(part.trim());
        }
        return sum;
    }
}