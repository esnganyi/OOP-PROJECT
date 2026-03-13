# HOWTO.md

## Travel Agency Management System – Enhancement

### Overview
This document explains the enhancements made to the Travel Agency Management System project. The original project demonstrated Object-Oriented Programming concepts such as encapsulation, inheritance, abstraction, and polymorphism.

The updated version improves the system by allowing users to enter data dynamically and by implementing exception handling to ensure the program runs safely and handles errors gracefully.

# Project Description

The Travel Agency Management System is a Java console application designed to manage travel-related information such as destinations, transport options, itineraries, and accommodation.

The system uses Object-Oriented Programming principles to structure the application into multiple classes that represent real-world travel components.

Key features include:

- Creating and displaying travel destinations
- Selecting transport options (Bus or Flight)
- Viewing itinerary details
- Selecting accommodation options
- Calculating travel costs

The project is organized using multiple packages to maintain clear separation of responsibilities.

# Enhancement Implemented

## 1. User Input Handling

The program now allows users to enter travel details dynamically using the `Scanner` class. This makes the system interactive instead of relying on hardcoded values.

The user is prompted to enter:

- Destination name
- Country
- Transport type
- Transport price
- Itinerary name
- Number of days
- Itinerary price
- Hotel name
- Accommodation price

## 2. Exception Handling

To improve program robustness, exception handling has been implemented using `try`, `catch`, and `finally` blocks.

### Try Block
The `try` block contains the main program logic where user input is collected and objects are created.

### Catch Block
The `catch` block handles potential runtime errors such as invalid user input.

For example, if a user enters text instead of a number when a numeric value is expected, the program catches the error and displays a user-friendly message.

### Finally Block
The `finally` block ensures that the `Scanner` resource is closed properly regardless of whether an exception occurs.

# Exceptions Implemented

The project handles the following runtime errors:

### InputMismatchException
Occurs when a user enters an incorrect data type (for example, entering text instead of a number).

Handled using a general `Exception` catch block to prevent the program from crashing.

### General Exception Handling
The program ensures that any unexpected errors are caught and handled gracefully, allowing the program to terminate safely.

---

# Program Improvements

The enhancements ensure that:

- Invalid user input does not crash the program
- The program displays clear error messages
- System resources are properly released
- The application behaves predictably even when errors occur

---

# Example Program Execution

```
=== Travel Agency Management System ===

Enter destination name: Paris
Enter country: France

Choose transport type:
1. Bus
2. Flight

Enter choice: 1
Enter bus price: 4500

Enter itinerary name: Paris Tour
Enter number of days: 5
Enter itinerary price: 20000

Enter hotel name: Grand Palace
Enter price per night: 8000
```

The program then displays all entered travel details.

---

# Conclusion

The updated Travel Agency Management System now supports dynamic user input and error handling. These improvements enhance the usability, reliability, and stability of the application while reinforcing important Java programming concepts such as exception handling and runtime error management.
