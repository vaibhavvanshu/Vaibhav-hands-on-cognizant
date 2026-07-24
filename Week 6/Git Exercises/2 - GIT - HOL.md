# 2\. GIT - HOL

\----------------------------------





The objective is:



* Create a .log file.
* Create a log folder.
* Create a .gitignore file.
* Configure .gitignore so Git ignores:

  * all .log files
  * the entire log folder
* Verify using git status





Step 1. Open GitBash and opening the repository.

Code: cd "C:\\Users\\ivek5\\GitDemo"



Step 2. Create a log folder

Code: mkdir log



Step 3. Create a log file inside the folder.

Code: echo "This is a log file" > log\\application.log



Step 4. Creater another .log file in the root.

Code: echo "Sample log" > error.log



Step 5. Creating .gitignore

Code: 

notepad++

.gitignore



Step 6. Adding lines inside .gitignore

Code:

\*.log

log/



Step 7. Check status

Code: git status

Output:

On branch main



Untracked files:

&#x20;   .gitignore



nothing added to commit but untracked files present





