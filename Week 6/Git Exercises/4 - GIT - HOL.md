# 4 - GIT - HOL

\-----------------------------------

\-----------------------------------









Step 1: Going to your GitDemo repository.

Code: cd "C:\\Users\\ivek5\\GitDemo"



\-------------------------------------



Step 2: Verifying the repository is clean

Code: git status

Output: 

On branch main

nothing to commit, working tree clean



\-------------------------------------



Step 3: Creating new branch

Code: git checkout -b GitWork

Output: Switched to a new branch 'GitWork'



\-------------------------------------------



Step 4: Creating hello.xml

Code: echo "<message>Hello from GitWork Branch</message>" > hello.xml

\#check status: git status

Output: 

On branch GitWork



Untracked files:

&#x20; hello.xml



\---------------------------------------------------------------------



Step 5: Commiting in GitWork

Code:

git add hello.xml

git commit -m "Added hello.xml in GitWork"



Output: 

\[GitWork 4d2b1c3] Added hello.xml in GitWork

&#x20;1 file changed, 1 insertion(+)

&#x20;create mode 100644 hello.xml



\-----------------------------------------------



Step 6: Switching back to main

Code: git checkout main

Output:Switched to branch 'main'



\-----------------------------------------------



Step 7: Creating another hello.xml with different content.

Code: echo "<message>Hello from Main Branch</message>" > hello.xml

\#commiting it

git add hello.xml

git commit -m "Added hello.xml in main"

Output:

git add hello.xml

git commit -m "Added hello.xml in main"



\---------------------------------------------------------------------



Step 8: View the log

Code: git log --oneline --graph  --decorate --all

Output:

\* 9f8d2a1 (HEAD -> main) Added hello.xml in main

| \* 4d2b1c3 (GitWork) Added hello.xml in GitWork

|/

\* 7ac45de Initial Commit



\----------------------------------------------------------------------



Step 9: Compare the branches.

Code: git diff main GitWork

Output:

diff --git a/hello.xml b/hello.xml

index 2fd4e1c..a7d6c3f 100644

\--- a/hello.xml

+++ b/hello.xml

@@ -1 +1 @@

\-<message>Hello from Main Branch</message>

+<message>Hello from GitWork Branch</message>



\--------------------------------------------------------



Step 10: Comparing by P4Merge



\--------------------------------------------------------



Step 11: Merge

Code: git merge GitWork

Output:

Auto-merging hello.xml

CONFLICT (add/add): Merge conflict in hello.xml

Automatic merge failed; fix conflicts and then commit the result.



\------------------------------------------------------------------



Step 12: Open hello.xml

Output:

<<<<<<< HEAD

<message>Hello from Main Branch</message>

=======

<message>Hello from GitWork Branch</message>

>>>>>>> GitWork



\--------------------------------------------------



Step 13: Resolve the conflict.

Code: #file will contain:

<message>Hello from Main Branch</message>

<message>Hello from GitWork Branch</message>



\--------------------------------------------------



Step 14: Commit the resolved merge.

Code: 

git add hello.xml

git commit -m "Resolved merge conflict"



\--------------------------------------------------



Step 15: Check status.

Code: git status

Output:

On branch main

nothing to commit, working tree clean



\--------------------------------------------------



Step 16: Ignore backup files.

Code: notepad++ .gitignore

\#inside gitignore

\*.orig

\#commiting it

git add .gitignore

git commit -m "Updated gitignore"



\--------------------------------------------------



Step 17: List branches.

Code: git branch

Output: 

GitWork

\* main



\--------------------------------------------------



Step 18: Delete the merged branch.

Code: git branch -d GitWork

Output: Deleted branch GitWork (was 4d2b1c3).

