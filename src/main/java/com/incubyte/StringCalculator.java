package com.incubyte;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator 
{
    public int add(String numbers)
    {
        //For removing leading white space  
        numbers=numbers.trim();

        //To handle empty string
        if(numbers.isEmpty())
            return 0;

       String substring ="\n";
       int IndexOfSubstring=numbers.indexOf(substring);
       //for the normal case where numbers are separated by comma and \n. 
       String delimeters="[,\n]";

       //support deferent delimeters-> we know that delimeters are between // and \n if it have multiple delimeters
       if(numbers.charAt(0)=='/' && numbers.charAt(1)=='/')
       {
            delimeters='['+numbers.substring(2,IndexOfSubstring)+']';
            
            //extract the numbers from the input string. 
            numbers=numbers.substring(IndexOfSubstring+1,numbers.length());
        }
        String[] Numbers= numbers.split(delimeters);
        
        List <Integer> negativeNumber= new ArrayList<>();
        int sum=0;
        for(String number:Numbers)
        {
            int num=Integer.parseInt(number.trim());
            if(num<0)
            {
                negativeNumber.add(num);
            }
            else 
            {
                sum+= num;
            }
        }
        if(! negativeNumber.isEmpty())
        {
            //we have negative numbers 
            throw new IllegalArgumentException("Negative numbers not allowed "+negativeNumber.stream().map(String::valueOf).collect(Collectors.joining(",")));
        }
        return sum;
       
       
     
    }
}