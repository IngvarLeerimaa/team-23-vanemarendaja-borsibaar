# Test Plan — Börsibaar Application

## 1. Introduction

This document describes the **estimated test plan** for the Börsibaar application.
Börsibaar is a full-stack web application that supports **inventory management**, **transaction tracking**, and **dynamic drink price visualization**, similar to a stock market. The application consists of a **Spring Boot backend** and a **Next.js frontend**, with a **PostgreSQL database**.

The purpose of this test plan is to define **what will be tested, how it will be tested, and under which conditions**.

## 2. Testing Objectives

The main objectives of testing Börsibaar are:

- To verify that the core functionality of the application works as intended
- To identify defects early and reduce the risk of failures in production
- To ensure correct interaction between frontend, backend, and database
- To validate authentication and authorization mechanisms
- To confirm that the public drink price view displays correct and updated data

## 3. Test Scope

### 3.1 In Scope

The following areas are included in testing:

- Backend REST APIs (Spring Boot)
- Frontend user interface (Next.js)
- Inventory management features
- Transaction tracking functionality
- Price optimization and price updates
- Public drink price page
- Authentication and authorization (OAuth2, JWT)
- Database interactions (PostgreSQL)
- Integration between frontend, backend, and database

### 3.2 Out of Scope

The following are excluded from testing:

- Performance and stress testing under extreme load
- Security penetration testing beyond basic authorization checks
- Hardware and network infrastructure issues

## 4. Testing Levels

The following testing levels will be applied:

### Unit Testing

- Performed by developers
- Focuses on individual methods and components
- Backend unit tests for services and utilities

### Integration Testing

- Verifies database integration and API communication

### System Testing

- End-to-end testing of the complete application

### Acceptance Testing (Optional)

- Performed from a user perspective
- Ensures the system meets basic business requirements

## 5. Test Approach

- Testing will primarily be **manual black-box testing**
- Risk-based approach will be used, focusing first on critical features
- Regression testing will be performed after bug fixes
- Exploratory testing will be used to discover unexpected issues
- Automated tests may be used in CI/CD pipelines for pr, dev and master branches

## 6. Test Environment

### Backend

- Spring Boot 3.5.5 (or later)
- Java 21
- PostgreSQL database with Liquibase migrations
- Docker-based development environment

### Frontend

- Next.js 16 with TypeScript (or later)
- Tailwind CSS
- Shadcn UI components
- Tested on modern browsers (Chrome)

### Database

- PostgreSQL 17 (or later)
- Test data created using mock or seed data

## 7. Entry and Exit Criteria

### Entry Criteria

Testing can begin when:

- Application is successfully deployed in a test environment
- Backend and frontend services are running
- Database migrations have been applied
- Basic functionality is implemented

### Exit Criteria

Testing can be completed when:

- All planned test cases have been executed
- No critical or blocking defects remain open
- Major defects are documented and reported
- Test summary report is completed

## 8. Roles and Responsibilities

| Role            | Responsibility                            |
|-----------------|-------------------------------------------|
| All team members | Planning, coordination, reporting        |
| All team members | Test case design and execution           |
| Developer       | Bug fixing and technical support          |
| Mentor          | Requirement clarification and acceptance  |

## 9. Risks and Assumptions

### Risks

- Incomplete or changing requirements
- Limited testing time before deadline
- Instability of development environment
- Dependency on OAuth2 authentication services

### Assumptions

- Requirements are sufficiently defined
- Team members have basic knowledge of the application
- Test data can be created freely

## 10. Test Deliverables

The following deliverables will be produced during testing:

- Test Plan document
- Test cases
- Defect reports
- Test summary report

## 11. Approval

This test plan is reviewed and approved by the project team and mentor before test execution begins.