# Class, Methods, Constructors

## Class :

-   In Java Everything starts with the class.

**Structure of a Java Class:**   
-   A class will have a package name and this must be the first line in the class definition.
    -   A class that is part of the default package will not have the package line as part of the class. This is not the recommended approach.
-   **class** keyword should be there for any java class
-   Followed by thar we need to provide a class name. This could be any name.
    -   Best practices are class Name should always start with a **UpperCase** Letter.

**Syntax:**
```aidl
package <package name>
public class <className> {

 }
```

**Example:**

**With package:**

```aidl
package com.learnJava;
public class Sample{


}
```

**Without package:**

```aidl
public class Sample{

}
```

### How to execute a Java class File ?

-   The class should have a main method in order to make the class eligible for execution.
-   Following are the requirements of the main method.
    -   Method should be marked **public**.
    -   Method should be have the **static** keyword.
    -   Method should be have the **void** keyword.
    -   Method should have the string array as an input.


```aidl
public class Sample{

    public static void main(String[] args) {
        // write your code here
       }

}
```

### How to print the data in console ?

-   The below call will print the data in to the console.

```aidl
  System.out.println("Hello World");
```

-   The **dot** operator is th way you call the methods and members of a call.


### Object/Instance in Java:
- Java is an object oriented language.
- Syntax to create an object/Instance.

 ```aidl
<class-name> <varialename> = new <classname>();
```

```aidl
public class Student {

    int age;
    String name;
    String school;

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.age=12;
        student1.name="abc";
        student1.school="XYZ";

        Student student2 = new Student();
        student2.age=12;
        student2.name="def";
        student2.school="ABC";


    }
}

```

### Relationship between Objects and class


**Analogy 1:**
-   A class is equivalent to Student.
-   Objects are those that are created out of the Student class.
 
 ![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java1.png)

```aidl
public class Student {

    int age;
    String name;
    String school;

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.age=12;
        student1.name="abc";
        student1.school="XYZ";

        Student student2 = new Student();
        student2.age=12;
        student2.name="def";
        student2.school="ABC";


    }
}
```

**Analogy 2:**
-   A class is equivalent to Car.
-   Objects are that different types of cars that you can build out of the Car class.

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java2.png)

```aidl
public class Car {

    private String model;
    private int year;

    public static void main(String[] args) {

        Car camry = new Car();
        camry.model = "Camry";
        camry.year=2007;


        Car accord = new Car();
        accord.model = "Accord";
        accord.year=2007;

        Car civic = new Car();
        civic.model = "Civic";
        civic.year=2007;



    }
}
```


**Analogy 3:**
-   A class is like a blue print of a house.
-   Objects are the actual houses that are built using the blue print.
![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java3.png)

```aidl
public class House {

    private int houseNumber;
    private String houseAddress;

    public static void main(String[] args) {

        House house1 = new House();
        house1.houseNumber = 123;
        house1.houseAddress = "address line, eagan, mn - 55122";


        House house2 = new House();
        house2.houseNumber = 456;
        house2.houseAddress = "address line, eagan, mn - 55122";

        House house3 = new House();
        house3.houseNumber = 789;
        house3.houseAddress = "address line, eagan, mn - 55122";

    }
}
```

### Members/Properties of the class:

-   In the below class the members or properties are:

    -   nose
    -   hands
    -   legs
    -   eyes

```aidl
public class Human {

    String nose;
    String hands;
    String legs;
    String eyes;


}
```

### Methods/Function of a class:

-   The behaviors that you can do with the class are expresses as  methods.

**Example:**
-   In the above example :
    -   You can breath with your nose.
    -   You can hear with your ears
    -   You can see with your eyes.



#### Anatomy of a Method:

-   Any method in Java will have the following.
    -   Access Modifier
    -   Return type or void
    -   Method name
    -   Parameters/Parameter List
    -   Method Body


##### Method Declaration:

-   A Method declation defines the code that needs to be executed when its invoked.

**Syntax:**

```aidl
<visibility modifier> <return-type> methodName(parameters...){

    Method Body
}

```

 **Example**

 **Method without Parameters:**

 ```aidl
 public void breath(){
        System.out.println("Human is breathing with his nose");
    }


    public void see(){
        System.out.println("Human is breathing with his eyes");
    }
```

**Method with Parameters:**

-   If the method is going have multiple parameters then it should be comma seperated.

```aidl
public void punch(int minutes){
        System.out.println("Punch for "+ minutes + " minutes.");
    }

public void walk(int minutes, int distance){
        System.out.println("Walk "+ distance + " miles " +"for "+ minutes + " minutes.");
    }

```


##### Method Invocation:

-   Use the **dot** operator.
-   Use the **reference variable+dot** operator.

 ```aidl
public static void main(String[] args) {

        Human dilip = new Human();// dilip -> Reference variable
        dilip.breath(); // method invocation
        dilip.see();// method invocation
        dilip.punch(5); // method invocation with one paramter
        dilip.walk(5, 3);// method invocation with multiple paramters


}
```

##### Method with return Type

**Syntax**

```
<access-modifier> <returntype> methodName(){

  return  <returntype>;
}
```

**Returning an int**
```
public int addTwoNumbers() {

        return 1+2;

    }
```    

**Returning a String**
```
public String operation(){

        return "ADD";
    }
```

##### Method Invocation

```
public class Add {

    public int addTwoNumbers() {

        return 1+2;
    }

    public String operation(){

        return "ADD";
    }

    public static void main(String[] args) {

        Add add = new Add();

        int sum = add.addTwoNumbers(); // Method invocation
        System.out.println(sum); // printing a value
        String operation = add.operation(); // Method invocation
        System.out.println(operation); // printing a value

    }
}
```

### Constructor:

-   A constructor in Java which will be invoked during the instanct/object creation.

-   A constructor will have the name similar to the class name.

-   Constructor is mainly used when there is a need to create an object with default values.

**Example:**

**Default Constructor:**

```aidl
public class Person {

    public Person(){ // Default constructor

    }
}
```

**Constructor With Parameters:**

```aidl
public class Person {

    public Person(){

    }

    public Person(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }
        public static void main(String[] args) {
            Person scooby = new Person("male", "Scooby");
        }
    }
```
