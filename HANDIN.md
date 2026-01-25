# [Homework Submission by Team 23](https://github.com/IngvarLeerimaa/team-23-vanemarendaja-borsibaar)

---

## [Pull Requests History](https://github.com/IngvarLeerimaa/team-23-vanemarendaja-borsibaar/pulls?q=is%3Apr+is%3Aclosed)

| PR # | Title | Author | Merge Strategy | Status |
| ---- | ----- | ------ | -------------- | ------ |
| #3 | Feature/inventory typing | @olgatenison | Squash Merge | ✅ Merged |
| #4 | Docs/Add git-homework | @IngvarLeerimaa | Squash Merge | ✅ Merged |
| #5 | Feature/refactoring homework mahdiyeh sepehrar | @sepehrar | Regular Merge | ✅ Merged |
| #6 | Add error handling to BarStationController | @IngvarLeerimaa | Regular Merge | ✅ Merged |

---

## Merge Conflicts

### Conflict 1: BarStationController.java

**What caused the conflict**

PR #5 and PR #6 both modified `BarStationController.java`. PR #5 added a `getAdminUser()` helper method to centralize admin validation, while PR #6 added try-catch error handling and applied Spotless code formatting to the same methods.

**Files affected**
- `backend/src/main/java/com/borsibaar/controller/BarStationController.java`

**How it was resolved**

Combined both changes: kept the `getAdminUser()` helper method from PR #5 and integrated the try-catch error handling from PR #6. Applied consistent Spotless formatting to the final result.

Resolution commit: `borsibaar-1-hommwork-resolved merge conflict with ingvar`

Resolved by: @sepehrar

---

### Conflict 2: Documentation files

**What caused the conflict**

PR #3 (Feature/inventory typing) conflicted with concurrent documentation updates in HANDIN.md and TEAM.md.

**Files affected**
- `HANDIN.md`
- `TEAM.md`

**How it was resolved**

- **HANDIN.md:** Kept both changes (merged content from both branches)
- **TEAM.md:** Kept the incoming version

Resolved by: @olgatenison

---

## Team Member Contributions

### Ingvar Leerimaa (@IngvarLeerimaa)

- Repository setup and configuration
- Initial project structure
- PR #4: Added homework documentation templates (TEAM.md, HANDIN.md)
- PR #6: Added try-catch error handling, Spotless formatting, team logo, refactored application.properties to application.yml
- Created intentional git conflict with teammates
- Configured branch protection rules
- Planing and implementation

### Andrii Lytvyn (@andrewlytvyn)

- Code review participation
- Branch `who-is-teamlead-feature` (test/learning branch)
- Planing and implementation

### Bohdan Podziubanchuk (@Danbog32)
- Absent due to travel

### Olga Tenison (@olgatenison)
- **Branch:** `feature/inventory-typing`
- **Pull request:** #3 (Feature/inventory typing)
- Planing and implementation

- Fixed TypeScript errors in the inventory page (`inventory/page.tsx`).
- Moved inventory DTO types into `types.ts`.
- Checked which `transactionType` values the backend actually returns and updated the frontend types/UI  
  (removed unused `SALE`, show negative `ADJUSTMENT` as red).
- Normalized numeric fields because the API can return numbers as strings.
- Resolved merge conflicts: in HANDIN.md I kept both changes, and in TEAM.md I kept the incoming version

#### Why

- To remove TypeScript errors and make the inventory page easier to maintain.
- To handle inconsistent number/string API responses safely.
- To keep the frontend aligned with the backend domain model (no invented enums).

### Mahdiyeh Sepehrar (@sepehrar)

- **Branch:** `feature/refactoring-homwork-mahdiyeh-sepehrar`
- **Pull request:** #5
- Planing and implementation

#### What was changed
- Refactored `BarStationController.java`
- Added `getAdminUser()` helper method to centralize admin authorization logic
- Simplified controller methods by removing duplicated security checks
- Resolved merge conflict with PR #6

---

## Submission Checklist

- [x] All pull requests linked above
- [x] At least two different merge strategies demonstrated (Squash + Regular)
- [x] Conflict resolution documented
- [x] Each team member contribution listed
- [x] TEAM.md updated with merge strategy explanations
- [x] All feature branches merged and deleted
- [x] Commit history is clean and readable