**DOWNLOADING VS CODE:**
------------------------



**STEP 1**: I used the link given in the write up to get on VS code. Here you will see the blue download button, I will go ahead and click this here. 

![Image](STEP1.png)

**STEP 2**: Then you are going to click whichever device you have and download from there. I had a mac so I chose mac and from there my system downloaded it. 

![Image](STEP2.png)

**STEP 3**: In the lower left of the screen you will see it downloading give it a couple of minutes and then click on it. 

![Image](STEP4.png)

**STEP 4**: From here VSCODE will open. You have now downloaded VS code on to your system. You will be able to open through launchpad if you have a mac. **HAPPY CODING**

![Image](STEP5.png)


**REMOTELY CONNECTING:**
------------------------

**STEP 1**: In VS Code, look in the lower left corner and click the icons below; from there you will see a heading Terminal. Click that and the terminal will open

![Image](STEPFIRST.png)

**STEP 2**: Now we are going to use ssh in the terminal. In order to do so put the following code in the terminal and hit return on keyboard. Replace the zz with your personal username. NOTE- you do not need to use the $ in front as that is just to show it is a command. 

`$ ssh cs15lsp23zz@ieng6.ucsd.edu`

**STEP 3**: Once you have run that command you should get the following below:

`ssh cs15lsp23zz@ieng6.ucsd.edu
The authenticity of host 'ieng6.ucsd.edu (128.54.70.227)' can't be established.
RSA key fingerprint is SHA256:ksruYwhnYH+sySHnHAtLUHngrPEyZTDl/1x99wUQcec.
Are you sure you want to continue connecting (yes/no/[fingerprint])?`

 If you have the following type yes and hit return. If you are not seeing this, please raise your hand and get a tutor.
 
 **STEP 4**: It will ask for you to input your password, when typing it wont show that your typing but know that is gathering what you are writing.
 
 `Password:`
 
 **STEP 5**: Now that you've inputted the passowrd you should see the following below after running the command:
 
 `# Now on remote server
Last login: Sun Jan  2 14:03:05 2022 from 107-217-10-235.lightspeed.sndgca.sbcglobal.net
quota: No filesystem specified.
Hello cs15lsp23zz, you are currently logged into ieng6-203.ucsd.edu

You are using 0% CPU on this system

Cluster Status 
Hostname     Time    #Users  Load  Averages  
ieng6-201   23:25:01   0  0.08,  0.17,  0.11
ieng6-202   23:25:01   1  0.09,  0.15,  0.11
ieng6-203   23:25:01   1  0.08,  0.15,  0.11

Sun Jan 02, 2022 11:28pm - Prepping cs15lsp23`

If you see this **CONGRATS** you have connected to a remote server. If you do not see this, please raise your hand and wait for a tutor to arrive..

**TRYING SOME COMMANDS:**
------------------------

**STEP 1**: Here we are going to run some commands in the terminal. Here is a list of commands we may go over and you can try on your own:

`-cd ~`

-cd
-ls -lat
-ls -a
-ls <directory> where <directory> is /home/linux/ieng6/cs15lsp23/cs15lsp23abc, where the abc is one of the other group members’ username
-cp /home/linux/ieng6/cs15lsp23/public/hello.txt ~/
-cat /home/linux/ieng6/cs15lsp23/public/hello.txt`

