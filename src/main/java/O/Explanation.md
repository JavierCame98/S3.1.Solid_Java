## Refactoring to SOLID Principles: Instrument Player
This project demonstrates the refactoring of a conditional-based instrument player into a decoupled architecture following the Open/Closed Principle (OCP) and the Interface Segregation concept.

## Key Improvements:
Abstraction with Interfaces: 
The original InstrumentPlayer class was transformed into an Interface. This defines a clear contract (play()) that any instrument must follow, decoupling the action from the specific implementation.

Responsibility Separation (SRP): 
Each instrument (Guitar, Drums, Piano) is now a dedicated class. This ensures that the logic for "how" an instrument is played resides only within that specific class, rather than in a centralized list of if-else statements.

Polymorphism in Execution: 
The logic was refactored to use a List<InstrumentPlayer>. This allows the system to treat all instruments uniformly. Adding a new instrument (e.g., Violin) no longer requires modifying the core playback logic; you simply create a new class that implements the interface.

Clean and Declarative Code: 
By using Java Collections and Method References (InstrumentPlayer::play), the main execution logic is reduced to a single, readable line. This removes the risk of "Magic Strings" and manual typos causing runtime errors.