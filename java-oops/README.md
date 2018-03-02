# Java-OOP (Object Oriented Programming): 

## OOP
-   oops stands for object oriented programming.
-   Its otherwise called as **OOPS**
 
## OOPS Concepts:
-   Inheritance
-   Polymorphism
-   Encapsulation - We discussed about this already.
-   Abstraction
-   Association


### Inheritance:

-   Inheritance is one of the concept of OOP.

-   Inheritance in general means inheriting something from other (eg., inheriting family's assets, inheriting families qualities)

-   In Java, inheritance is the mechanism  which one class allows the other class to inherit the members and behaviors.

-   A class can extend the behavior of another class using the **extends** keyword.


#### Inheriting  the members

**Vehicle**

```aidl
package com.learnJava.inheritance;

public class Vehicle {

    private int wheels;
    private String type;
    private String owner;
    private int year;
    private String color;

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}

```

**Car**

-   Inheritance is achieved by **extends** keyword.

-   Car in this example is a child or derived class and the Vehicle is the parent or base class.


```aidl
package com.learnJava.inheritance;

public class Car extends Vehicle {

    private int noOfSeats;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;


    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfSeats=" + noOfSeats +
                ", model='" + model + '\'' +
                '}';
    }

    @Override  // Method Overriding
    public void drive(){

        System.out.println("Inside " + model+" drive method");
    }
}

```

**MotorBike**

-   Inheritance is achieved by **extends** keyword.

-   Motorbike is a child which is derived from the Vehicel class.

```aidl
package com.learnJava.inheritance;

public class MotorBike extends Vehicle {

    private String model;

    public MotorBike(){

    }
    public MotorBike(String model) {
        this.model = model;
    }


    @Override
    public void drive(){

        System.out.println("Inside " + model+" drive method");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "model='" + model + '\'' +
                '}';
    }
}

```

**VehicleClient**

```aidl
package com.learnJava.inheritance;

public class VehicleClient {

    public static void main(String[] args) {

        Car car = new Car();
        car.setNoOfSeats(4);
        car.setOwner("ABC");
        car.setWheels(4);
        car.setYear(2017);
        car.setColor("black");
        car.setModel("camry");

        car.drive();

        MotorBike motorBike= new MotorBike();
        motorBike.setModel("HarleyDavidson");
        motorBike.setOwner("XYZ");
        motorBike.setWheels(2);
        motorBike.setYear(2018);
        motorBike.setColor("Red");

        motorBike.drive();

    }


}


```

#### Valid Inheritance:

-   The child/derived class can inherit the members with the following access modifiers. 
    -   default
    -   protected
    -   public
-   The child class cannot inherit the members with the following access modifiers.
    -   private
    -   inherit the constructors
    
#### Inheriting Methods and Overriding Methods:

-   You can also inherit the methods like the way we did for the members.

**Vehicle**


```aidl
public void drive(){
        System.out.println("Inside the vehicle drive method");
    }
```

**Car**

-   This is called **method overriding**.
-   Car class will have access to the drive method in the Vehicle class.
-   We can override and implement a new behavior.If we don't override the method then it will stil execute the drive method in the Vehicle class.

```aidl
 @Override
    public void drive(){

    System.out.println("Inside Car drive method");
    }
```

**MotorBike**

-   **MotorBike** class will have access to the drive method in the Vehicle class.
-   We can override and implement a new behavior.If we don't override the method then it will stil execute the drive method in the Vehicle class.

```aidl
    @Override
     public void drive(){
 
         System.out.println("Inside Electric drive method");
     }
```

#### Do's

-   You can override the behavior to implement a new behavior.

#### Dont's

-   You are not allowed to change the access modifier to a restricted one.
    -   changing the access modifier from public to private is not allowed.
-   Changing the return type is not allowed.
    -   In the example the base class return type is void. You cannot have the child class to return any value.This will give compilation issues.
     
### Inheritance Chaining.

-   Java does not support Multiple Inheritance.
    -   Meaning you cannot have multiple classes aftet the extends keyword.
-   Inheritance chaining is allowed. A derived class will be inheriting a base class and as well as the derived class also act as the base class to other class.
 
**ElectricCar**

-   The Electriccar base class is Car which is a derived class for Vehicle class.

-   This is called Inheritance chaining.

```aidl
package com.learnJava.inheritance;

public class ElectricCar extends Car{


    private int chargeLevel;

    public ElectricCar() {
    }

    public ElectricCar(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "chargeLevel=" + chargeLevel +
                '}';
    }
}

```

**VehicleClient**


```aidl
public class VehicleClient {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar(300);

        electricCar.setNoOfSeats(2);
        electricCar.setOwner("XYZ");
        electricCar.setWheels(3);
        electricCar.setYear(2017);
        electricCar.setColor("yellow");
        electricCar.setModel("tesla");


    }


}
```

### Polymorphism

-   Polymorphism is one of the concept of OOP

-   It is the ability of an object to take on many forms.

#### Example
-   In school a person will behave as student
-   In bus a person will behave as a passanger
-   In Shopping mall the same person will behave as customer.
-   In Office the same person will behave as an employee

#### Interface

-   The interface in java is a mechanism to achieve abstraction. 
-   There can be only abstract methods decalrations in the java interface not method body. 
    -   This means the interface tells you what to do but doesnt tell you how to do.
-   It is used to achieve abstraction and polymorphism Java.
-   All the methods in interface is **abstract** by default.


#### Dont's:

-   You cannot create an instance of an interface using **new** keyword.
   

    
**Car**

```aidl
package com.learnJava.polymorphism;

/**
 * Created by z001qgd on 3/1/18.
 */
public interface Car {
    void speed(int speed); // This has a abstract keyword by default.
}
```

**Camry**

-   This Car
```aidl
package com.learnJava.polymorphism;

public class Camry implements Car {
   
    @Override
    public void speed(int speed) {
        System.out.println("Inside Camrys speed : " + speed);
    }
}

```

**Accord**

```aidl
package com.learnJava.polymorphism;

public class Accord implements  Car{
    @Override
    public void speed(int speed) {
        System.out.println("Inside Accords speed : " + speed);
    }
}

```

#### Why Interface ?

-   It is used to achieve abstraction.
-   Interface is mainly used to make the class behave as a contract.
-   Any class that uses the interface should use the contract.

#### Example:

-   Define a Car.
    -   A Car should have a engine, steering wheel, 4 wheels , speedometer, brakes, acceleration and etc.,
    -   We can create an interface named **Car** and define all the methods in it.
        -   Lets say we are going to build a CAMRY car then this Camry Car class should implement the Car interface.
        -   In this scenario the Camry car class will be mandated to implement all the interfaces.
        

### Runtime-Polymorphism:

**PolymorphismDemo**

-   The car instance which speed method it needs to call during run time. 
-   This is called run time polymorphism.
-   The method invocation is resolved at run time.
-   Don't confuse this one with overriding.

```aidl
package com.learnJava.polymorphism;
x
public class PolymorphismDemo {

    public static void main(String[] args) {


        Car car;
        car = new Camry();

        car.speed(200);
        car = new Accord();
        car.speed(300);
    }
}

```


### CompileTime-Polymorphism:

-   Method overloading performs compile time polymorphism.
-   Even though we dont see this with our naked eye, the method resolving happens at compile time.

```aidl
public class Camry implements Car {
    public void passengers(String passenger1){

        System.out.println("Passenger is : " + passenger1);
    }

    public void passengers(String passenger1,String passenger2){

        System.out.println("Passengers are : " + passenger1 + " and "+ passenger2);
    }

    @Override
    public void speed(int speed) {
        System.out.println("Inside Camrys speed : " + speed);
    }
}
```


### Is-A-RelationShip:

-   Java Interface also represents IS-A relationship.

```aidl
        Car car;
        car = new Camry(); // Camry is a Car

        car.speed(200);
        car = new Accord(); // Accord is a Car
```

### Abstraction

-   Abstraction can also be achieved by using abstract clases.
-   We will use the **abstract** keyword for that.
-   It is allowed to have constructor, variables and method body.
-   The implementation classes will use the extends keyword in the case of abstract classes.
    
**Employee**

```aidl
package com.learnJava.abstractt;

public abstract class Employee {

    private String name;
    private  static final int HOURS = 2080;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculateSalaty(int hourlyPay){
        return 2080 * hourlyPay;
    }
}

```
**SoftWareEngineer**

```aidl
package com.learnJava.abstractt;

public class SoftWareEngineer extends  Employee {

    public SoftWareEngineer(String name) {
        super(name);
    }

    @Override
    public String hello(){
        return "SoftWare Engineer Hello";
    }


}

```

**Manager**

```aidl
package com.learnJava.abstractt;

public class Manager extends  Employee{

    public Manager(String name) {
        super(name);
    }

```
**SoftwareEngineerDemo**
```aidl
package com.learnJava.abstractt;

public class SoftwareEngineerDemo {
    public static void main(String[] args) {

        SoftWareEngineer softWareEngineer = new SoftWareEngineer("ABC");
        System.out.println(softWareEngineer.getName());

        System.out.println(softWareEngineer.calculateSalaty(50));

        Manager manager = new Manager("XYZ");

        System.out.println(softWareEngineer.calculateSalaty(65));
    }
}


```

### Abstraction vs Interfaces:

-   Use abstraction when you have common logic that will be used by all the classes.

-  The below link has good comparision.
https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/

### Association/Aggregation/Composition

#### Association

-   Association is relation between two separate classes which establishes through their Objects

-   Aggregation and Composition are the two forms of association.

### Aggregation:

-   It is a unidirectional association.
-   It represents Has-A relationship.



**Student:**

```aidl
package com.learnJava.aggregation;

public class Student {

    private String name;
    private String grade;
    private Address schoolAddress;
    private Address homeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", schoolAddress=" + schoolAddress +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
```

**Address**

```aidl
package com.learnJava.aggregation;

public class Address {

    private String addressline;
    private String city;
    private String state;
    private String zip;

    public Address(String addressline, String city, String state, String zip) {
        this.addressline = addressline;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressline='" + addressline + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}

```
-   In aggregation both objects can live independently.

### Compoition

-   This is a restricted form of Association where two objects are highly dependent on each other.

**Book**

```aidl
package com.learnJava.composition;

public class Book {

    public String title;
    public String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

```

**Library**

```aidl
package com.learnJava.composition;

import java.util.List;

public class Library {

    // reference to refer to list of books.
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  List<Book> books;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

```

**CompositionDemo**

```aidl
package com.learnJava.composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("ABC");
        book.setTitle("Learn Java");


        Library library = new Library();
        library.setName("ABC");

        List<Book> books = new ArrayList<>();
        books.add(book);


        library.setBooks(books);

        System.out.println("Book is : " + book);

        System.out.println("Library is : " + library);

    }
}

```

-   In the above example , we have the Libaray which is going to have all the books.

-   If the Library is destroyed then the books wont have any value. It cannot stay on its own.
 