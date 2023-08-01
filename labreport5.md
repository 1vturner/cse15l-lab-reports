## Student Post

**What enviorment are you using?**
I am currently on my macbook, using VSCODE, bash, and java files given

**Detail the symptoynm you are seeing. Be specific; include both what you are seeing and what you are supposed to be seeing. Screenshots are ok and so are copy and paste from terminal**
My input for the plaindrome `Level` is a palindrome however instead of my output being true it is giving fasle. My screenshot- [error image] and the bash code [error2 image]

**Detail the failure-inducing input and contect. Place the commands you have run and test cases.**
The input is marked as `Level`. The code is supposed to make a variable for counting the left character which starts and 0 and the rightmost charcater which is the end or str.length()-1, it will use a while loop in order to loop for the code. Left < Right which the loop is checking the characters at the left and right index are not equal. If it does not equate ot will return false, of it is not false it will keep counting until it is false. 



**JAVA FILE**
![Image](ana1.png)

**BASH FILE**
![Image](ana2.png)

**TA RESPONDED WITH:**
The code is correct, however make sure to check the first iteration of your while loop. Also make sure the code knows the difference between `L `and `I`! You got this :)

**Quick Fix:**
Becasue this was case sensitive I needed to make sure I changed the input of paramter to all lowercase. The string of course was changed on line 9, I insereted a line of code which changed the input parameter. From there I ran `bash run.sh`


**Reflection**
Something I found  helpful that I use quite often is vim. Going through that and being able to edit code without having to leave the terminal has been very optimal for me in this class as well as CSE12. It is also easy to edit then run and see the errors and go back and know what I edited and being able to do it firsthand.

