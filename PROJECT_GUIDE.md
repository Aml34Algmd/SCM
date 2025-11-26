# Project Implementation Guide

This guide will help you complete all tasks for the SCM project.

## Task 1: Project Setup (1 point) ✅

**Status:** Ready for GitHub upload

### Steps to Complete:

1. **Initialize Git repository:**
```bash
git init
git add .
git commit -m "Initial commit: Project setup with FileUtility tool"
```

2. **Create GitHub repository:**
   - Go to GitHub.com
   - Create a new repository (name it something like "scm-fileutility" or "java-utility-tool")
   - **DO NOT** initialize with README, .gitignore, or license (we already have these)

3. **Connect and push to GitHub:**
```bash
git remote add origin <our-github-repo-url>
git branch -M main
git push -u origin main
```

4. **Verify:**
   - Check that README.md is visible on GitHub
   - Verify all files are uploaded correctly

---

## Task 2: Feature Branching (2 points)

You need to create **at least 2 separate branches**, each adding a new feature.

### Feature 1: Word Count Feature

1. **Create and switch to feature branch:**
```bash
git checkout -b feature/word-count
```

2. **Add word counting functionality** to FileUtility.java (you'll need to add this method)

3. **Commit the changes:**
```bash
git add .
git commit -m "Add word counting feature"
```

### Feature 2: File Search Feature

1. **Switch back to main and create another branch:**
```bash
git checkout main
git checkout -b feature/file-search
```

2. **Add file search functionality** to FileUtility.java

3. **Commit the changes:**
```bash
git add .
git commit -m "Add file search feature"
```

**Note:** Keep these branches separate for now. We'll merge them in Task 3.

---

## Task 3: Merging and Conflicts (2 points)

### Step 1: Merge First Branch

1. **Merge feature/word-count into main:**
```bash
git checkout main
git merge feature/word-count
```

2. **Push to GitHub:**
```bash
git push origin main
```

### Step 2: Create Intentional Conflict

1. **Before merging the second branch, modify the same part of the code in main:**
   - Edit FileUtility.java in main branch
   - Change something that will conflict with feature/file-search
   - Commit the change:
```bash
git add .
git commit -m "Update main branch before merge"
git push origin main
```

2. **Now try to merge feature/file-search:**
```bash
git merge feature/file-search
```

3. **You should see a merge conflict!**

4. **Resolve the conflict:**
   - Open FileUtility.java
   - Look for conflict markers: `<<<<<<<`, `=======`, `>>>>>>>`
   - Manually resolve by keeping the code you want
   - Remove the conflict markers

5. **Complete the merge:**
```bash
git add .
git commit -m "Merge feature/file-search with conflict resolution"
```

6. **Take a screenshot** of:
   - The conflict message in terminal
   - The conflict markers in the code
   - The resolved code
   - The successful merge message

7. **Push to GitHub:**
```bash
git push origin main
```

---

## Task 4: Version Tagging (2 points)

### Create Release v1.0

1. **Tag the initial release:**
```bash
git tag -a v1.0 -m "Release v1.0: Initial version with line counting"
git push origin v1.0
```

2. **Update RELEASE_NOTES.md** with v1.0 details

3. **Commit the updated release notes:**
```bash
git add RELEASE_NOTES.md
git commit -m "Add release notes for v1.0"
git push origin main
```

### Create Release v1.1

1. **Make some improvements** (add a small feature or fix)

2. **Commit the changes:**
```bash
git add .
git commit -m "Improvements for v1.1"
git push origin main
```

3. **Tag the new release:**
```bash
git tag -a v1.1 -m "Release v1.1: Added word count and file search features"
git push origin v1.1
```

4. **Update RELEASE_NOTES.md** with v1.1 details

5. **Commit and push:**
```bash
git add RELEASE_NOTES.md
git commit -m "Add release notes for v1.1"
git push origin main
```

### Verify Tags on GitHub

- Go to your GitHub repository
- Click on "Releases" or "Tags"
- Verify both v1.0 and v1.1 are visible

---

## Task 5: Final Report (3 points)

Create a 1-2 page PDF report answering these questions:

### Questions to Answer:

1. **What does your tool do?**
   - Describe the FileUtility tool and its purpose
   - List all features implemented

2. **What features were added?**
   - Feature 1: Word counting
   - Feature 2: File search
   - Any other features you added

3. **How were branches and merging handled?**
   - Explain your branching strategy
   - Describe the merge conflict scenario
   - Include screenshots of the conflict resolution

4. **Evidence of tags/releases**
   - Screenshot of GitHub releases page
   - List of all tags created
   - Link to release notes

5. **What is the purpose of tagging a release in version control?**
   - Explain version tagging concepts
   - Benefits of using tags
   - Best practices

6. **Compare GitHub with another SCM tool like GitLab or Bitbucket**
   - Similarities and differences
   - Pros and cons of each
   - When to use which tool

7. **What part of the SCM process did you find most useful or interesting, and why?**
   - Personal reflection
   - Learning outcomes
   - Real-world applications

---

## Quick Reference Commands

```bash
# Branching
git branch                    # List branches
git checkout -b <branch>     # Create and switch to branch
git checkout <branch>         # Switch to branch

# Merging
git merge <branch>           # Merge branch into current
git status                   # Check merge status

# Tagging
git tag -a v1.0 -m "Message" # Create annotated tag
git tag                      # List all tags
git push origin <tag>        # Push tag to GitHub

# Viewing
git log --oneline --graph    # Visual commit history
git log --all --decorate     # Show all branches and tags
```

---

## Tips for Success

1. **Take screenshots** throughout the process:
   - Branch creation
   - Merge conflicts
   - Conflict resolution
   - Tag creation
   - GitHub releases page

2. **Write meaningful commit messages:**
   - Use clear, descriptive messages
   - Follow conventional commit format if possible

3. **Test your code** after each feature addition

4. **Keep your README updated** as you add features

5. **Document everything** for your final report

---

Good luck with your project! 🚀

