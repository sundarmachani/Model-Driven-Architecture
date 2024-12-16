# Model-Driven-Architecture

# Gas Pump System

A Java-based implementation of a gas pump system using multiple design patterns including Abstract Factory, State Pattern, and Strategy Pattern.

## Project Structure

- **AbstractFactory**: Factory implementation for different gas pump configurations
- **Client**: Contains GasPump_1 and GasPump_2 implementations
- **DataStore**: Data storage and management components
- **StatePattern**: State management using MDA_EFSM
- **StrategyPattern**: Operation strategies implementation
- **Main.java**: Entry point of the application

## Features

- Support for two gas pump types (GasPump-1 and GasPump-2)
- Credit and cash payment options
- Multiple fuel types (Regular, Premium, Diesel)
- Receipt generation functionality
- Interactive menu-driven interface

## GasPump-1 Operations
- Activate
- Start
- PayCredit
- Reject
- Cancel
- Approved
- PayCash
- StartPump
- Pump
- StopPump

## GasPump-2 Operations
- Activate
- PayCash
- Cancel
- Premium/Regular/Diesel selection
- StartPump
- Stop
- Receipt/NoReceipt options
- PumpGallon
- Start

## Design Patterns Used
- **Abstract Factory Pattern**: For creating families of related objects
- **State Pattern**: For managing pump states
- **Strategy Pattern**: For implementing different operations

## Getting Started

1. Clone the repository
2. Compile the Java files
3. Run Main.java
4. Follow the interactive menu to select gas pump type and operations

## Requirements
- Java Runtime Environment
- Java Development Kit

## Usage
```java
    java Main
```
Follow the on-screen prompts to:
1. Select gas pump type (1 or 2)
2. Choose operations from the menu
3. Input required parameters when prompted
