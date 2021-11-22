# StringReplyService

**NOTE:** Below code changes are done in **ReplyController.java** file

Below are the changes along with the explanation:

Step 1: We have declared the following variables:

    short code (initialized to 0)
    
    String rules: This variable makes the first component of our input string
    
    String msg: This variable makes the second component of our input string
    
![image](https://user-images.githubusercontent.com/53274714/142869705-64b1173c-4a77-404b-b301-dc1add61cf8c.png)
    
    
Step 2: We have declared a For loop which will iterate starting from 0 till the length of the rule
    
    We have used if-else block inside our For loop. These blocks will get executed depending upon the value present in 'rule' variable
    
![image](https://user-images.githubusercontent.com/53274714/142870068-381cd92b-b302-4278-818c-eb3faf3e9523.png)


Step 3: Now comes, the actual working part of the code. From now onwards, we will go through all if-else blocks one by one (as per above snippet)

Step 4: When rule ==1, first if-else block gets executed and 'code' is assigned a value of 200 and 'reverse' function gets called.
    
    Below 'reverse' function implements a string buffer which in turn returns a reversed string.

![image](https://user-images.githubusercontent.com/53274714/142870569-426d89b5-a645-41a6-8167-34e53cb6ba66.png)

![image](https://user-images.githubusercontent.com/53274714/142870761-57cf6b77-3d5f-47b3-8839-7eddd974bfbd.png)


Step 5: When rule ==2, second if-else block gets executed and 'code' is again assigned a value of 200, however, this time 'encodeMD5' function gets called.

![image](https://user-images.githubusercontent.com/53274714/142871241-35f5f714-c193-4934-856d-1f3d1bb65150.png)

![image](https://user-images.githubusercontent.com/53274714/142871358-a91ca589-8c33-4c70-857a-e24403de5d6f.png)

    Please note that above encodeMD5 function returns the encoded format in type byte. So, to get the format in hexa-decimal, we have called below function.
    
![image](https://user-images.githubusercontent.com/53274714/142871699-c7b37618-6652-4316-9399-c83fa1e62746.png)

Finally, the entire code looks like below:-
![image](https://user-images.githubusercontent.com/53274714/142905731-790cbf5d-399b-48c5-954a-1f1c71c409a3.png)
![image](https://user-images.githubusercontent.com/53274714/142905784-dce7643d-7efb-48ef-83c3-cc27f798c6aa.png)
![image](https://user-images.githubusercontent.com/53274714/142905828-9ef44d8b-400e-474e-a599-95b4ab69715e.png)

**Sample Outputs**

![image](https://user-images.githubusercontent.com/53274714/142908363-0a7ac99e-0ae2-4170-911a-16097d5d58a7.png)
![image](https://user-images.githubusercontent.com/53274714/142908430-c7c5846a-ec13-415c-a2ba-2caa79b9e8a5.png)

    



    


