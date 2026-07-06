# Train Consist Management App

A Java-based console application that simulates the formation and management of a railway train consist. The project is designed as a step-by-step learning journey where each use case introduces a new Java concept while solving a practical railway management problem.


# About the Project

Managing a train consist involves attaching, organizing, validating, and searching different types of bogies. This application demonstrates how Java's Collections Framework, Stream API, Searching & Sorting Algorithms, Regular Expressions, and Exception Handling can be applied to build an efficient train management system.

The project contains 20 independent use cases, each focusing on a specific Java feature while contributing to the overall functionality of the application.


# Project Highlights

- Simulates real-world train consist management
- Implements Java Collections Framework
- Demonstrates searching algorithms
- Implements sorting techniques
- Uses Java Stream API for data processing
- Validates train information using Regular Expressions
- Handles runtime and custom exceptions
- Compares programming approaches using performance analysis


# Core Functionalities

## Train Consist Operations

- Initialize train consist
- Add passenger bogies
- Remove bogies
- Preserve train sequence
- Maintain unique bogie identifiers

## Bogie Management

- Store seating capacities
- Group bogies by category
- Filter passenger bogies
- Calculate total seating capacity
- Validate cargo and train information

## Searching & Sorting

- Bubble Sort
- Comparator-based Sorting
- Arrays.sort()
- Linear Search
- Binary Search

## Exception Handling

- Checked Exceptions
- Runtime Exceptions
- Custom Exceptions
- Safe search validation


# Use Case Summary

| Use Case | Implementation |
|----------|----------------|
| UC1 | Train Initialization |
| UC2 | Passenger Bogie Management |
| UC3 | Duplicate Bogie Prevention |
| UC4 | Ordered Train Formation |
| UC5 | Ordered Unique Bogie Storage |
| UC6 | Bogie Capacity Management |
| UC7 | Capacity-based Sorting |
| UC8 | Passenger Filtering |
| UC9 | Bogie Categorization |
| UC10 | Seating Capacity Calculation |
| UC11 | Regex-based Validation |
| UC12 | Safety Compliance Verification |
| UC13 | Loop vs Stream Performance |
| UC14 | Custom Capacity Validation |
| UC15 | Runtime Exception Handling |
| UC16 | Bubble Sort Implementation |
| UC17 | Arrays Utility Sorting |
| UC18 | Linear Search |
| UC19 | Binary Search |
| UC20 | Safe Search with Exception Handling |


# Java Concepts Covered

## Collections Framework

- List
- ArrayList
- LinkedList
- Set
- HashSet
- LinkedHashSet
- Map
- HashMap

## Java Features

- Comparator
- Stream API
- Lambda Expressions
- Collectors
- Pattern & Matcher
- Arrays Utility
- Exception Handling
- Custom Exceptions

## Algorithms

- Bubble Sort
- Linear Search
- Binary Search


# Directory Structure

```text
Train_Consist_Management_App/
│
├── src/
│   └── trainconsistmanagement/
│       └── TrainConsistManagement.java   # Updated for UC1 → UC20
│
├── README.md
├── LICENSE
└── .gitignore
```

# Running the Application

### Clone the Repository

```bash
git clone https://github.com/Pavi512/Train_Consist_Management_App.git
```

### Navigate to the Project

```bash
cd Train_Consist_Management_App
```

### Compile

```bash
javac src/trainconsistmanagement/*.java
```

### Execute

```bash
java trainconsistmanagement.<ClassName>
```

#### Example

```bash
java trainconsistmanagement.TrainConsistManagement
```
