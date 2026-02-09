## Refactoring to SOLID Principles
This project demonstrates the refactoring of a data persistence layer to comply with the Dependency Inversion Principle (DIP).

## Key Improvements:
Abstraction Over Implementation: 
The high-level module (ServicePerson) no longer depends on a low-level module (MySQL). Instead, both now depend on a common abstraction: the Save interface. This removes the hard dependency on a specific database engine.

Decoupling with Dependency Injection: 
The ServicePerson class no longer instantiates its own dependencies (new MySQL()). Instead, it receives an implementation of Save through its constructor. This allows for much greater flexibility and cleaner code.

Enhanced Testability: 
By injecting an interface, we can now easily swap the real MySQL implementation for a "Mock" or "Fake" repository during testing. This ensures that unit tests for business logic do not require a live database connection.

Adherence to DIP: 
High-level policy (ServicePerson) is now protected from changes in low-level details (Database implementation). If the database technology changes, the service logic remains untouched.