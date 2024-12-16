# Model-Driven-Architecture

# Gas Pump System

A Java-based implementation of a gas pump system using multiple design patterns including Abstract Factory, State Pattern, and Strategy Pattern.

## Project Structure

- **AbstractFactory**: Factory implementation for different gas pump configurations
    - CF_1: Concrete factory for GasPump-1
    - CF_2: Concrete factory for GasPump-2
- **Client**: Contains GasPump_1 and GasPump_2 implementations
- **DataStore**: Data storage and management components
    - DS_1: Data store for GasPump-1
    - DS_2: Data store for GasPump-2
- **StatePattern**: State management using MDA_EFSM (Model-Driven Architecture Extended Finite State Machine)
- **StrategyPattern**: Operation strategies implementation (OP class)
- **Main.java**: Entry point of the application

## Features

- Support for two gas pump types (GasPump-1 and GasPump-2)
- Credit and cash payment options
- Multiple fuel types (Regular, Premium, Diesel) for GasPump-2
- Receipt generation functionality
- Interactive menu-driven interface

## GasPump-1 Operations

1. Activate(int)
2. Start()
3. PayCredit()
4. Reject()
5. Cancel()
6. Approved()
7. PayCash(int)
8. StartPump()
9. Pump()
10. StopPump()

## GasPump-2 Operations

1. Activate(float, float, float)
2. PayCash(int)
3. Cancel()
4. Premium()
5. Regular()
6. StartPump()
7. Stop()
8. Receipt()
9. NoReceipt()
10. Diesel()
11. PumpGallon()
12. Start()

## Design Patterns Used

- **Abstract Factory Pattern**: For creating families of related objects (CF_1 and CF_2)
- **State Pattern**: For managing pump states using MDA_EFSM
- **Strategy Pattern**: For implementing different operations (OP class)

## Getting Started

1. Clone the repository
2. Compile the Java files
3. Run Main.java
4. Follow the interactive menu to select gas pump type and operations

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## Usage

```bash
javac Main.java
java Main
```

Follow the on-screen prompts to:
1. Select gas pump type (1 or 2)
2. Choose operations from the menu
3. Input required parameters when prompted

## Detailed Class Descriptions

### Main

The entry point of the application. It provides a menu-driven interface for selecting the gas pump type and executing operations.

### GasPump_1 and GasPump_2

Client classes that implement specific gas pump behaviors. They interact with the MDA_EFSM, DataStore, and ConcreteFactory classes.

### DS_1 and DS_2

DataStore implementations for storing and managing data specific to each gas pump type.

### CF_1 and CF_2

Concrete factories that create objects specific to each gas pump type, implementing the Abstract Factory pattern.

### MDA_EFSM

Implements the State pattern to manage the different states of the gas pump and their transitions.

### OP

Implements the Strategy pattern, providing different operation strategies that can be used by the gas pumps.

