package com.incubyte;

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
        int sum=0;
        for(String number:Numbers)
        {
            sum+= Integer.parseInt(number.trim());
        }
        return sum;
       
       
     
    }
}