# [Homework Submission by Team 23](https://github.com/IngvarLeerimaa/vanemarendaja-borsibaar)

---

## Pull Requests

| PR # | Title | Author | Merge Strategy | Status |
| ---- | ----- | ------ | -------------- | ------ |
|      |       |        |                |        |
|      |       |        |                |        |
|      |       |        |                |        |

---

## Merge Conflict

### What caused the conflict

`<to_be_added>`

### Files affected

`<to_be_added>`

### How it was resolved

`<to_be_added>`

---

## Team Member Contributions

### Ingvar Leerimaa (@IngvarLeerimaa)

- Repository setup and configuration
- Initial mock up files

- Created git conflict with Mahdiyeh Sepehrar / Olga Tenison
- `<to_be_added>`

### Andrii Lytvyn (@andrewlytvyn)

- `<to_be_added>`

### Bohdan Podziubanchuk (@Danbog32)

- `<to_be_added>`

### Olga Tenison (@olgatenison)

- **Branch:** `feature/inventory-typing`
- **Pull request:** #3 (Feature/inventory typing)

#### What I changed

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
- refactored BarStationController

---

## Submission Checklist

- [ ] All pull requests linked above
- [ ] At least two different merge strategies demonstrated
- [ ] Conflict resolution documented
- [ ] Each team member contribution listed
- [ ] TEAM.md updated with merge strategy explanations
- [ ] All feature branches merged and deleted
- [ ] Commit history is clean and readable
