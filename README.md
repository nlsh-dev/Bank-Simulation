# Bank Account Simulation

## Task 5

A Java-based Bank Account Simulation developed using Object-Oriented Programming concepts.

## Features

* Deposit money
* Withdraw money
* Check account balance
* Display account details
* Maintain transaction history
* Minimum balance validation
* Menu-driven console interface

## OOP Concepts Used

### 1. Class

The project contains classes such as `Account` and `SavingsAccount`.

### 2. Encapsulation

Account information and balance are protected using access modifiers such as `private` and `protected`.

### 3. Inheritance

`SavingsAccount` inherits from the `Account` class using:

```java
extends Account
```

### 4. Method Overriding

The `withdraw()` method is overridden in `SavingsAccount` to implement minimum balance validation.

### 5. Constructor

Constructors are used to initialize account information and the initial balance.

### 6. Polymorphism

The project demonstrates the concept of runtime polymorphism through method overriding.

## Technologies Used

* Java
* VS Code
* Terminal
* Git
* GitHub

## How to Run

Compile the program:

```bash
javac src/*.java
```

Run the program:

```bash
java -cp src Main
```

## Example Operations

The user can:

1. Deposit money
2. Withdraw money
3. Check balance
4. View account details
5. View transaction history
6. Exit the application

## Learning Outcome

This project demonstrates how Java OOP concepts can be applied to simulate a real-world banking scenario.
