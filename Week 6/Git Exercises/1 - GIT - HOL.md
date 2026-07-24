# 1 - GIT - HOL

\-------------------------------------





Step 1: Setup your machine with git configuration



1: Checking git version.

Code with output:

C:\\Users\\ivek5>git version

git version 2.55.0.windows.2





2: To configure user level configuration of user Id and gmail Id.

Code:

git config --global user.name vaibhavvanshu

git config --global user.email "Vaibhav.prakash26092004@gmail.com"





3: To check if configuration is set properly.

Code with output:

C:\\Users\\ivek5>git config --global --list

user.name=vaibhavvanshu

user.email=vaibhav.prakash26092004@gmail.com





Step 2: Integrate notepad++.exe to Git and make it a default editor.



1. Installed Notepad++ as it was not installed.

2. Ran notepad++, Output: Command not found, hence added folder path of Notepad++ to environment variables as a new Path.

3. Now notepad++ opens notepad++ when typed on Git Bash.

4. Creating an alias:

Code: 

notepad \~/.bash\_profile

alias np='notepad++' #on the file opened. saved the file.

source \~/.bash\_profile

np



Output: opens notepad++.



5\. Make notepad++ the default Git editor.

Code:

git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

git config --global -e

Output: Opens notepad++.



6\. Create GitDemo repository

mkdir GitDemo

cd GitDemo

git init



Output: Initialized empty Git repository...



7\. Check hidden files:

Code: ls -la

Output: .git



8\. Create welcome.txt

Code:

echo "Welcome to Git" > welcome.txt

ls

Output:

welcome.txt



\#Viewing the file

cat welcome.txt



Output: Welcome to git



9\. Check Status

Code: git status

Output : 

Untracked files:

welcome.txt



10\. Track the file

git add welcome.txt



11\. Commit

Code:

git commit

"Uploading welcome.txt" #in the text editor



12\. Check status

Code: git status

Output: nothing to commit, working tree clean



13\. Push to GitLab

Code:

git remote add origin https://github.com/vaibhavvanshu/GitDemo.git

git push -u origin main







