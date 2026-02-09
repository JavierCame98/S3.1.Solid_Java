## Refactoring to SOLID Principles
This project demonstrates the refactoring of a character combat system to adhere to SOLID principles, specifically focusing on the Liskov Substitution Principle (LSP) and the Dependency Inversion Principle (DIP).

## Key Improvements:
From Inheritance to Composition: 
The original design used inheritance to handle damage logic, which led to Ghost throwing unexpected exceptions. The refactored version uses the Strategy Pattern, delegating damage behavior to a Damage interface.

Adherence to LSP: 
By removing the UnsupportedOperationException from the Ghost class and using a specific NoReceivesDamage strategy, Ghost is now a true substitute for Character. The program can interact with any character type without fearing a crash.

Dependency Injection: 
Characters no longer define how they receive damage internally. Instead, the specific Damage behavior is injected via the constructor. This decouples the "Character" concept from the "Damage Logic."

Runtime Flexibility: 
The inclusion of setDamage(Damage damage) allows characters to change their physical properties during gameplay (e.g., a warrior becoming invincible), fulfilling the Open/Closed Principle.