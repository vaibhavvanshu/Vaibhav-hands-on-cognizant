# 3 - GIT - HOL

\---------------------------------







Step 1. Check your current branch.

Code: 

cd "C:\\Users\\ivek5\\GitDemo"

git branch





Step 2. Create a new branch.

Code: git branch GitNewBranch





Step 3. List all branches.

Code: git branch -a

Output:

\* main

&#x20; GitNewBranch

&#x20; remotes/origin/main





Step 4. Switch to the new branch.

Code: git checkout GitNewBranch

Output: Switched to branch 'GitNewBranch'





Step 5. Create a file.

Code: 

echo "This file was created in GitNewBranch" > branch.txt

ls

Output: 

branch.txt

welcome.txt





Step 6. Check status.

Code: git status

Output: 

Untracked files:

&#x20;   branch.txt





Step 7. Add and commit

Code:

git add branch.txt

git commit -m "Added branch.txt in GitNewBranch"





Step 8. Check status again.

Code: git status

Output: Nothing to commit, working tree clean





Step 9. Switch back to main.

Code: git checkout main

Output: Switched to branch 'main'





Step 10. Compare branches.

Code: git diff main GitNewBranch

Output: 

diff --git a/branch.txt b/branch.txt

new file mode 100644

index 0000000..4c5f9a1

\--- /dev/null

+++ b/branch.txt

@@ -0,0 +1 @@

+This file was created in GitNewBranch





Step 11. Compared the branches visually using P4Merge.



Step 12. Merge the branch.

Code: git branch

Output: \* main



Code: git merge GitNewBranch

Output: 

Updating 8f3a2c1..c7d9e4b

Fast-forward

&#x20;branch.txt | 1 +

&#x20;1 file changed, 1 insertion(+)

&#x20;create mode 100644 branch.txt





Step 13. View the commit history.

Code: git log --oneline --graph --decorate

Output: 

\* abc1234 (HEAD -> main) Added branch.txt in GitNewBranch

\* def5678 Added gitignore

\* ghi9012 Initial Commit





Step 14. Delete the branch.

Code: git branch -d GitNewBranch

Output: Deleted branch GitNewBranch





Step 15. Verify.

Code: git branch

Output: \* main



\#check status

Code: git status

Output:

On branch main

nothing to commit, working tree clean



