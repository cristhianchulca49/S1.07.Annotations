# Java Annotations

## Description

In these exercises, you will learn how to:

- Create class hierarchies and implement inheritance in Java.
- Use method overriding with the `@Override` annotation.
- Apply the `@Deprecated` annotation to mark methods as obsolete.
- Suppress compiler warnings using `@SuppressWarnings`.
- Combine static and constant attributes with object-oriented design.
- Practice writing clean and maintainable Java code with proper annotations.

---

## Exercise 1: Worker Hierarchy

Create a hierarchy of objects with three classes: `Worker`, `OnlineWorker`, and `OnSiteWorker`.

### Base Class: Worker
- Attributes: `name`, `surname`, `pricePerHour`.
- Method: `calculateSalary(int hours)` that multiplies the number of hours worked by the price per hour.

### Child Classes
- **Must override** the `calculateSalary` method using `@Override`.

### Main Class: Principal
- Use the `main()` method to demonstrate the functionality of the overridden methods.

### Special Rules

#### OnSiteWorker
- `calculateSalary` receives the number of hours worked per month.
- Salary formula:  
  `hoursWorked × pricePerHour + gasoline`
- `gasoline` is a `static` attribute of this class.

#### OnlineWorker
- `calculateSalary` also receives the number of hours worked per month.
- Salary formula:  
  `hoursWorked × pricePerHour + INTERNET_FEE`
- `INTERNET_FEE` is a constant (`final`) attribute of the `OnlineWorker` class.

---

## Exercise 2: Deprecated Methods and Suppressing Warnings

- Add some **obsolete methods** to the child classes using the `@Deprecated` annotation.
- From an external class, invoke these obsolete methods.
- Suppress compiler warnings using the `@SuppressWarnings("deprecation")` annotation.

This exercise demonstrates how to work with **deprecated methods**, manage compiler warnings, and maintain clean, warning-free code.


## 💻 Technologies Used
- Java 17  
- Maven - Dependency management and build  
- IntelliJ IDEA - Integrated Development Environment  
- Git - Version control  
- JUnit 5 (Jupiter) - Testing framework  

## 📋 Requirements
To run this project you need:

- Java Development Kit (JDK) 17 or higher  
- Maven 3.6+  
- IntelliJ IDEA (Community or Ultimate) or any Java-compatible IDE  
- Git to clone the repository

## 🛠️ Installation
Clone this repository:  
git clone https://github.com/cristhianchulca49/S4.JUnit.git

---
🤝 Contributions are welcome! 
- Please follow these steps to contribute: 
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
