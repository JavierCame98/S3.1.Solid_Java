## Refactoring to SOLID Principles
This project demonstrates the refactoring of a monolithic User class into a decoupled architecture following SOLID principles, specifically the Single Responsibility Principle (SRP).

## Key Improvements:

Data Modeling with Records:
The original User class was replaced by a Java Record. This ensures immutability and removes boilerplate code (getters, setters, toString).

Responsibility Separation:
EmailValidation: Dedicated exclusively to checking data integrity (Email format and Password strength).
EmailConfirmation: Handles the communication logic and notification flow.

Custom Error Handling:
Introduced UserNotConfirmed, a custom Exception that improves error traceability and prevents the application from failing silently with simple console prints.

Decoupling the Main Logic:
The Main class now acts as an orchestrator, keeping the business logic independent of the data structures.