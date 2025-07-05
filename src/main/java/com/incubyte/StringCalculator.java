package com.incubyte;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator 
{
    //if we want to count for the add method for all instances then this should be static
    //but here i am assuming that i want to count per instance how many times add called, so i used non-static variable
     int count=0;
    
    public int GetCalledCount()
    {
        return this.count;
    }
    public int add(String numbers)
    {
        this.count++;
        //For removing leading white space  
        numbers=numbers.trim();

        //To handle empty string
        if(numbers.isEmpty())
            return 0;

       String substring ="\n";
       int IndexOfSubstring=numbers.indexOf(substring);
       //for the normal case where numbers are separated by comma and \n. 
       String delimiters="[,\n]";

     //  support deferent delimiters-> we know that delimiters are between // and \n if it have multiple delimeters
       if (numbers.startsWith("//"))
        {
            String delimiterStr = numbers.substring(2, IndexOfSubstring);
            
            if (delimiterStr.startsWith("[") && delimiterStr.endsWith("]"))
            {
                   Matcher matcher=Pattern.compile("\\[(.*?)]").matcher(delimiterStr);
                   List<String>delimitersList=new ArrayList<>();
                   while(matcher.find())
                   {
                    delimitersList.add(Pattern.quote(matcher.group(1)));
                   }
              
                  delimiters=String.join("|",delimitersList);
            }
            else 
            {
                delimiters='['+delimiterStr+']';
             }
         numbers = numbers.substring(IndexOfSubstring + 1);

        }
    

        String[] Numbers= numbers.split(delimiters);
      
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
                //ignore number which are greater than 1000
                if(num<1000)
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
