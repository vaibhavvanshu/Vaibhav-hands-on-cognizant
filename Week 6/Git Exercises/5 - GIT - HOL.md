# 5 - GIT - HOL

===================================





Step 1: Open Git Bash and go to your repository.

Code: cd "C:\\Users\\ivek5\\GitDemo"



\--------------------------------------------------



Step 2: Verify the repository is clean.

Code: git status

Output: 

On branch main

Your branch is up to date with 'origin/main'.



nothing to commit, working tree clean



\--------------------------------------------------



Step 3: List all branches.

Code: git branch -a

Output:

\* main

&#x20; GitWork

&#x20; remotes/origin/main



\--------------------------------------------------



Step 4: Pull the latest changes.

Code: git pull origin main

Output:

From https://github.com/yourusername/GitDemo

&#x20;\* branch            main     -> FETCH\_HEAD

Already up to date.



\---------------------------------------------------



Step 5: Push your local changes.

Code: git push origin main

Output: 

Enumerating objects: 6, done.

Counting objects: 100% (6/6), done.

Delta compression using up to 8 threads

Compressing objects: 100% (3/3), done.

Writing objects: 100% (4/4), 450 bytes | 450.00 KiB/s, done.

Total 4 (delta 1), reused 0 (delta 0)

To https://github.com/vaibhavvanshu/GitDemo.git

&#x20;  3f1a2bc..9d4e5f6  main -> main



\--------------------------------------------------------------



