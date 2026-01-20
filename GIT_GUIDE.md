# Git Command Line Guide

Quick reference for the homework assignment.

---

## Initial Situation (Our Repo)

Before this homework, `main` was ahead of `develop` because some docs and pipeline changes were pushed directly to `main`. To sync them I did:

```bash
# Switch to develop
git checkout develop

# Merge main into develop to bring it up to date
git merge main

# Push the updated develop
git push origin develop
```

There were no prior commits on `develop`, so this was a clean fast-forward merge.

---

## Initial Setup

```bash
# Clone the repository
git clone https://github.com/IngvarLeerimaa/vanemarendaja-borsibaar.git

# Navigate into the repo
cd vanemarendaja-borsibaar

# Check current status
git status
```

---

## Creating a Branch

```bash
# Make sure you're on develop first
git checkout develop

# Pull latest changes
git pull (origin develop)

# Create and switch to new branch
git checkout -b <type/branchname)
```

---

## Making Commits

```bash
# Check what files changed
git status

# Add specific file
git add TEAM.md

# Add multiple files
git add TEAM.md HANDIN.md

# Add all changes
git add .

# Commit with message
git commit -m "Add TEAM.md with team information and workflow"

# Make more commits as you work
git add .
git commit -m "Add HANDIN.md submission template"
```

---

## Pushing to GitHub

```bash
# First push (sets upstream)
git push -u origin docs/git-homework

# Subsequent pushes
git push
```

---

## Switching Branches

```bash
# List all branches
git branch -a

# Switch to existing branch
git checkout develop

# Switch to main
git checkout main
```

---

## Pulling Updates

```bash
# Pull latest from current branch
git pull

# Pull specific branch
git pull origin develop
```

---

## Resolving Merge Conflicts

```bash
# Update your branch with latest develop
git checkout docs/git-homework
git pull origin develop

# If conflicts occur, Git will mark them in files like:
# <<<<<<< HEAD
# your changes
# =======
# their changes
# >>>>>>> develop

# After manually fixing conflicts:
git add .
git commit -m "Resolve merge conflict in FILENAME"
git push
```

---

## Useful Commands

```bash
# View commit history
git log --oneline

# See what changed in a file
git diff FILENAME

# Undo changes to a file (before staging)
git checkout -- FILENAME

# Unstage a file
git reset HEAD FILENAME

# Check remote URL
git remote -v
```

---

## Your Workflow for This Homework

```bash
# 1. Start fresh from develop
git checkout develop
git pull origin develop

# 2. Create your branch
git checkout -b docs/git-homework

# 3. Copy TEAM.md and HANDIN.md into repo folder

# 4. Stage and commit
git add TEAM.md HANDIN.md
git commit -m "docs: add TEAM.md and HANDIN.md for git homework"

# 5. Push branch
git push -u origin docs/git-homework

# 6. Go to GitHub and create Pull Request
```

---

## Commit Message Examples

```
docs: add TEAM.md with team information
docs: add HANDIN.md submission template
docs: update merge strategies section
fix: resolve merge conflict in TEAM.md
chore: update repository links in HANDIN.md
```