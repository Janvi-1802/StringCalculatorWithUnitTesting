# StringCalculatorWithUnitTesting

1): Setup TDD environment , by adding JUNIT 5 dependencies using mvn. 

 Created a class StringCalculator that has method add. 

 Created a AppTest.java class to contain all the testcases. 

  testcases 
  
  Step 1 : Create a simple string calculator with given method signature and checks for following input testcase. 
  
  Testcase: 1 -> empty string  - Input: ""  Output: 0

  ![Screenshot 2025-07-05 110251](https://github.com/user-attachments/assets/8c91af8a-e375-470a-b2c0-35ab8f97662e)
  
   ![image](https://github.com/user-attachments/assets/3f9a6fb0-75a3-4db7-905f-4c5165fc555f)

  Testcase: 2 -> comma separated numbers given as a string 
  
  Input: "1,2,3" Output : 6 (as int)
  ![image](https://github.com/user-attachments/assets/6ec8c877-747a-4d6f-928f-9d47a660be65)

![image](https://github.com/user-attachments/assets/b661cad6-ab13-463e-9b6e-102d8a402303)

Step 2: Allow the add method to handle any amount of numbers.

Testcase : 1 ->  input: "1,2,3,4,5,6,7,8,9,12,34,56,78,23,67890,3421,566,32,1111,777,444"
Ouput: 74489

{needed because, sometimes it is possible that code is prefectly working for small inputs but failes for large input}
![image](https://github.com/user-attachments/assets/2405c7b0-745e-476b-b183-d4f670ab3fe3)

![image](https://github.com/user-attachments/assets/8dff73db-a119-48da-ae30-06138a7b4f5d)

Step 3: Allow the add method to handle new lines between numbers.

Testcase: 1-> Input: "" Output:0 

Testcase: 2-> Input: "1,2,3" Output:6
  
Testcase: 3-> Input: "1,2,3,4,5,6,7,8,9,12,34,56,78,23,67890,3421,566,32,1111,777,444"  Ouput: 74489
          
Testcase: 4->Input: "1\n2,3" Output: 6

   ![image](https://github.com/user-attachments/assets/86206a5d-ce64-44d5-acbb-38c428fcaa34)
   
   ![image](https://github.com/user-attachments/assets/36a62161-610f-4e75-bd31-ce960f453244)

Step 4: Support different delimiters:

Testcase : Input: "//;,\n1;2,3"    Output:6 

![image](https://github.com/user-attachments/assets/c240a0aa-0efb-4110-8507-557ea0571aba)

![image](https://github.com/user-attachments/assets/36db037f-c837-4b67-b173-37fc21615159)

Step 5: Calling add with a negative number will throw an exception. 

Input: "-1,-2,-3,4"   Output:Negative numbers not allowed -1,-2,-2
![image](https://github.com/user-attachments/assets/fb855554-1c40-4a75-9bff-db477ec6bb24)


![image](https://github.com/user-attachments/assets/44fdaa21-864f-4e36-bd83-25a0f6b5a922)

Extra.....

Step 6 : using TDD ,add a method to stringCalculator called public int getCalledCount() that retuns how many times Add() was invoked.

![image](https://github.com/user-attachments/assets/6c69bace-b551-46d2-887c-08401e6fcb00)

![image](https://github.com/user-attachments/assets/ee343b0d-e6bf-49dc-8dcb-3d42099ee7fa)

Step 7: Number bigger than 1000 should be ignored.

![image](https://github.com/user-attachments/assets/a3de7bbe-04b2-4d74-b263-6a2efa5a04e0)

![image](https://github.com/user-attachments/assets/e92e5d55-d76b-4f83-a855-4d001405a47b)

Step 8: delimiters can be of any length.

![image](https://github.com/user-attachments/assets/2e53a333-46f6-4f1c-9ce4-fdbe24845a3c)

![image](https://github.com/user-attachments/assets/d65347b8-6ff9-4bcc-9831-1491379080c8)

Step 9: Allow multiple delimiters 

![image](https://github.com/user-attachments/assets/7b48969e-4ba1-4221-aaa1-948d008e8e2e)


![image](https://github.com/user-attachments/assets/4a82612e-9325-4db4-8c45-da5282baf88d)

Step 10: Multiple delimiter of length greater than 1

![image](https://github.com/user-attachments/assets/74b6fa87-a1ed-422b-8809-f6e3ffb98d2b)

![image](https://github.com/user-attachments/assets/65fbc0e0-1ed1-4501-a999-2dc5820ce517)


core logic of StringCalculator 

![image](https://github.com/user-attachments/assets/ca51f2e9-74e8-45d6-966a-cb702b2f9abb)


Extra Observations 

1. Removing extra leading whitespaces
   
   ![image](https://github.com/user-attachments/assets/b6c00242-8aca-4985-b9e0-68ec1de97640)

   ![image](https://github.com/user-attachments/assets/b253c20e-9273-463f-ae5d-ad72bf2c22b5)



          



      
