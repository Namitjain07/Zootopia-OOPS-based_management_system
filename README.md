# ZOOtopia - Object-Oriented Zoo Management Application

## Introduction

Welcome to ZOOtopia! This is a comprehensive zoo management application designed with a focus on Object-Oriented Programming (OOP) principles, including interfaces, inheritance, abstract classes, and polymorphism. ZOOtopia allows both administrators and visitors to interact with and manage a virtual zoo, offering a wide range of functionalities and experiences.

## Application Flow

### Admin Functionalities

**1. Enter as Admin:**
- Admins must provide their username and password to access admin privileges.

**2. Manage Attractions/Events:**
- Admins can view, add, modify, or remove attractions in the zoo.
- Each attraction has a unique ID.
- Attractions can include cultural exhibits, safaris, botanical gardens, dinosaur shows, etc.
- Premium members have free access, while basic members need to purchase tickets.

**3. Schedule Events:**
- Admins can set the opening and closing times for attractions.
- Admins can set ticket prices for each attraction.
- The system maintains a count of ticketed visitors for each attraction.

**4. Manage Animals:**
- Admins can add, update, or remove animals in the zoo.
- Animals belong to three categories: Mammals, Amphibians, and Reptiles.
- At least two kinds of animals are required for each category.

**5. Set Discounts:**
- Admins can set discount codes for various visitor categories and attractions.
- Discounts include 10% for minors (<18) and 20% for senior citizens (>60).

**6. Set Special Deals:**
- Admins can create special deals for visitors who buy multiple attractions.
- Deals include 15% off for more than 2 attractions and 30% off for more than 3 attractions.

**7. View Visitor Stats:**
- Admins can access statistics on the number of visitors, revenue, and popular attractions.

**8. View Feedback:**
- Admins can view feedback left by visitors.

### Visitor Functionalities

**1. Register:**
- Visitors can register by providing their personal information.

**2. Log In:**
- Registered visitors can log in using their email and password to access their accounts.

**3. Explore the Zoo:**
- Visitors can browse different attractions and learn about the animals.

**4. Buy Membership:**
- Visitors can purchase memberships based on their chosen experience level (Basic or Premium).

**5. Buy Tickets:**
- Basic users can buy tickets for individual attractions.
- Visitors can buy tickets for as many attractions as they want.

**6. View Discounts:**
- During ticket purchase, visitors can see available discounts and apply eligible discount codes.

**7. Visit Animals:**
- Visitors can choose to visit an animal and interact with it by feeding or learning about it.

**8. Visit Attractions/Events:**
- Visitors can access attractions based on their experience level and the tickets they purchased.

**9. Provide Feedback:**
- Visitors can leave feedback about their zoo experience and suggest improvements.

## Assumptions

1. default admin username= admin
2. default admin password = admin123

## Getting Started

To run ZOOtopia, follow these steps:
Navigate to project directory.Then run the following commands.
1. mvn clean
2. mvn compile
3. mvn package
4. java -jar target/a2-namit.jar


## Object-Oriented Programming (OOP) Principles

In this Java-based ZOOtopia application, Object-Oriented Programming (OOP) principles are prominently utilized to design and structure the code effectively. Here are the key OOP principles and concepts applied in the code:

1. **Classes and Objects:** The code is organized into classes, which serve as blueprints for creating objects. For example, there are classes for `Visitor`, `Attraction`, `Admin`,etc. Objects of these classes are created to represent real-world entities in the application.

2. **Inheritance:** Inheritance is used to establish a hierarchy among classes. For instance, the `Attraction` class can be inherited by various specific attraction types, such as "Jungle Safari" or "Botanical Garden." This allows for the reuse of common attributes and methods while allowing specialization for unique attractions.

3. **Polymorphism:** Polymorphism is achieved through method overriding. For instance, the `Animal` class may have a method called `read()`,`feed()`,etc . which is overridden by specific animal classes like `Mammals`, `Reptiles`, and `Amphibians`. This allows different animals to exhibit unique behaviors while being called using a common interface `Animal Interface`.

4. **Abstraction:** Abstraction is employed to define abstract classes and methods. For instance, the `Animal` class might have an abstract method `read()`, which is implemented differently in its subclasses. This enforces a certain structure for subclasses while allowing them to provide specific implementations.

5. **Encapsulation:** Encapsulation is utilized to hide the internal details of classes and protect data from unauthorized access. Private fields and methods are used to control access to data within the classes. For example, the `Visitor` class may have private attributes like `balance` and `password`.

6. **Composition:** Composition is employed by creating complex objects by combining simpler objects. For example, a `Visitor` object may have references to multiple `Attraction` objects they have visited. This composition allows for creating more complex relationships and functionalities.

7. **Association:** Association is used to define the relationships between objects. For instance, the `zoo` class may have associations with multiple `Animals`,`Mammals`,etc. objects, allowing admins to manage those features.

8. **Interfaces:** Interfaces are implemented to define a contract for classes that need to adhere to specific behaviors. For instance, the `Animal_interface` interface is implemented by various classes to provide zoo-related functionality.

By adhering to these OOP principles, the ZOOtopia application is well-structured, modular, and extensible. It promotes code reusability, maintainability, and a clear separation of concerns, making it easier to develop and manage the application.