Travel Agency Management System
 Overview

The Travel Agency Management System is a Java-based console application designed to demonstrate the practical use of Object-Oriented Programming (OOP) principles.
The system allows users to manage travel-related information such as destinations, transport options, itineraries, and accommodation while showcasing clean OOP design and structure.

This project focuses on code organization, abstraction, inheritance, encapsulation, and polymorphism, rather than graphical interfaces.

 Project Objectives

The main objectives of this project are to:

Apply core Object-Oriented Programming concepts in Java

Demonstrate proper class design and relationships

Use abstract classes and interfaces effectively

Practice constructor usage, method overriding, and encapsulation

Produce a clean, modular, and maintainable Java project

 OOP Concepts Implemented

Encapsulation
All class attributes are private and accessed through getters and setters.

Inheritance
Concrete classes such as BusTransport and FlightTransport inherit from the abstract Transport class.

Abstraction
Implemented using:

Abstract classes (Transport)

Interfaces (Accommodation)

Polymorphism
Method overriding is used to provide specific implementations for transport pricing and display behavior.

Constructor Usage
All classes use parameterized constructors to initialize objects.

Use of this and super
Applied in constructors and overridden methods to reference current and parent class members.

System Features

Add and display travel destinations

Choose a mode of transport (Bus or Flight)

View transport pricing

Select travel itineraries

Choose accommodation options

Display travel details and calculated costs

 Project Structure

```
OOP-PROJECT/
├── README.md
└── src/
    ├── accommodation/
    │   ├── Accommodation.java
    │   └── HotelAccommodation.java
    ├── destination/
    │   └── Destination.java
    ├── itinerary/
    │   └── Itinerary.java
    ├── main/
    │   └── Main.java
    └── transport/
        ├── BusTransport.java
        ├── FlightTransport.java
        └── Transport.java
```

 Class Summary
Destination (Concrete Class)

Stores destination name and country

Displays destination information

Transport (Abstract Class)

Base class for all transport types

Defines common attributes and abstract methods

BusTransport (Concrete Class)

Inherits from Transport

Implements bus-specific pricing logic

FlightTransport (Concrete Class)

Inherits from Transport

Implements flight-specific pricing logic

Itinerary (Concrete Class)

Represents trip duration and itinerary cost

Accommodation (Interface)

Defines accommodation-related behavior

HotelAccommodation (Concrete Class)

Implements the Accommodation interface

Calculates hotel accommodation cost

Main (Driver Class)

Entry point of the application

Creates objects

Demonstrates inheritance and polymorphism

Calls methods and prints output to the console

▶ How to Run the Project

Ensure you have Java JDK installed.

Open the project in any Java IDE (IntelliJ IDEA, Eclipse, NetBeans).

Compile the project.

Run the Main.java file.

View the output in the console.

🔧 Technologies Used

Java

Object-Oriented Programming (OOP)

Console-based execution


 Author
Developed By I Esther to practice OOP concepts