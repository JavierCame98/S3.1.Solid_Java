## Refactoring to SOLID Principles
This project demonstrates the refactoring of a machine control system to adhere to SOLID principles, specifically focusing on the Interface Segregation Principle (ISP).

## Key Improvements:
Elimination of "Fat Interfaces": 
The original MachineActions interface was overloaded with unrelated behaviors. This forced classes like AirConditioner to provide empty or "not supported" implementations for methods like wash(), violating the core rules of clean design.

Granular Interface Design: 
The monolithic interface was split into three specialized interfaces: MachineAction (power control), ManageTemperatures (thermal control), and Wash (laundry logic). This ensures that classes only implement the methods they actually use.

Improved Type Safety and Clarity: 
By segregating the interfaces, we prevent developers from accidentally calling heat() on a WashingMachine or wash() on an AirConditioner. The code is now more intuitive and self-documenting.

Adherence to ISP: 
Clients (the classes) are no longer forced to depend on methods they do not use. This reduces coupling and makes the system much easier to extend without breaking existing functionality.