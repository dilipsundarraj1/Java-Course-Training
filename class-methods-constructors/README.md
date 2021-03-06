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

### Client/Driver Class

-  A class is refered as a client class when we try to access a some other class from the current class.
 
- In the below example we have created a **PersonClient** class that accesses the **Person** class.

**Person**
```aidl
public class Person {

    String gender;
    String name;
    int age;

    public Person(){

    }

    public Person(String gend,String na){
        this.gender = gend;
       this.name = na;

    }


    public void changeName(String nam){
        this.name = nam;
    }

    public String getName(){

        return this.name;
    }

    public static void main(String[] args) {

        Person person1 = new Person("male", "Scooby");

        System.out.println(person1.gender);

        System.out.println(person1.name);

        Person person2=null;

        System.out.println(person2);

        Person person3 = new Person();
        person3.name="ddd";
        person3.gender="female;";

    }


}

```
**PersonHelper**
```aidl
public class PersonHelper {

    public void setAge(Person person){

        person.age = 10;
    }
}
```
**PersonClient**
```aidl
public class PersonClient {

    public static void main(String[] args) {

        Person person = new Person("male","Scooby"); // assignment happens here itself\
        System.out.println(person);
        System.out.println(person.getName());
        person.changeName("Dilip");
        System.out.println(person.getName());

        PersonHelper personHelper = new PersonHelper();


        System.out.println(person.age);
        personHelper.setAge(person);
        System.out.println(person.age+","+person.getName()+","+person.gender);
        System.out.println(person);
    }
}
```

## Access/Non-Access Modifiers:

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java5.png)


### Access Modifiers

- There are four access modifiers in here.
    -   private
    -   public
    -   protected
    -   default
    

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java4.png)

-   From the name it is clear that access modifiers are mainly used to define and control the access of the classes, members and methods.
-   In Java it is not allowed to use access modifiers inside the method.

**Example**

```aidl
public String getName(){
        
        public int i=0; // not allowed. You are not allowed to use access-modifiers inside a method. 
        
    }
```

#### private

   -   If a method or variable is marked as private (has the private access modifier assigned to it), then only code inside the same class can access the variable, or call the method.
   -   A class never be marked private.
   -   No other class can access this method from outside the Person Class

**private variable**

-   **private** keyword will be part of the declaration. 
 
```aidl
private String gender;
```
**private method**    

-   **private** keyword will be part of the declaration.

```aidl
private String getName(){

        return this.name;
    }
```


**Example**

**Person**

```aidl
public class PersonPrivate {

    private String gender;
    String name;

    public PersonPrivate(){

    }

    public PersonPrivate(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    private String getName(){

        return this.name;
    }

    public static void main(String[] args) {

        PersonPrivate dilip = new PersonPrivate();
        dilip.gender="Male";
        dilip.name="dilip";
        System.out.println(dilip.getName()); // Calling a private method from the same class is allowed.

    }
}

```

**PersonClient**

```aidl
public class PersonClient {

        public static void main(String[] args) {

            PersonPrivate person = new PersonPrivate("male", "Scooby");
            System.out.println(person.getName()); // This will give compilation issue because getName method is marked private.
    }
}

```
 

**default:**
    -   Any class or class member declaration without any Visibility Modifiers is the default.
    -   This class will be accessible only to other classes which are in the same package.

```aidl
class PersonDefault {

    String gender;
    public String name;

    protected String getName(){

        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

}
```

**PersonDefaultClient** in **com.learnJava.accessmodifiers.protectedd**

-   This **PersonDefault** is accessible only to the classes in the same package. 
-   In the below example, we are trying to access the **PersonDefault** class from a different class and this will give compilation issue.

```aidl
package com.learnJava.accessmodifiers.protectedd;

/**
 * Created by z001qgd on 1/17/18.
 */
public class PersonDefaultClient {

    public static void main(String[] args) {

        PersonDefault personDefault = new PersonDefault(); // Not accessible, compilation issue
    }
}

```

#### Protected:

-   This is used only for variable and methods.
-   This behaves the same as default, with the addition that subclasses can access protected methods and member variables (fields) of the superclass
    
**Example**

**PersonProtected** in **com.learnJava.accessmodifiers.protectedd** package.

```aidl
package com.learnJava.accessmodifiers.protectedd;

/**
 * Created by z001qgd on 1/16/18.
 */
public class PersonProtected {

    protected String gender;
    public String name;

    protected String getName(){

        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

}

```

**PersonalProtecedClient** in **package com.learnJava.accessmodifiers.privatee;**

-   In this example the client class is in a different package and the actual class is in a different package.

```aidl
package com.learnJava.accessmodifiers.privatee;

import com.learnJava.accessmodifiers.protectedd.PersonProtected;

public class PersonalProtecedClient {

    public static void main(String[] args) {

        PersonProtected personProtected = new PersonProtected();
        personProtected.name;// Not accessible,compilation issue
        personProtected.getGender();
        personProtected.getName();// Not accessible,compilation issue
    }
}

```

**public**

-   There are no restrictions to this access-modifier. 
-   You can access a class, method, variable from any where in the class.

### Non-Access Modifiers:

-   For now we are going to discuss about the following. Rest of the other non access modifiers are not widely used in everyday work.
-   Lets focus on the below.
    -   static
    -   final
    
### The Static Modifier

-   static is a reserverd keyword that you use it to name a variable varibale or method with static.
-   **static** can be used with method or variables.
    -   static variable
    -   static method
-   A static method or variable should always be accessed using the className not using the object/instance reference variable.
-   A **Constructor** cannot have a **static** keyword.
    -   This will give compilation issue.

```aidl
public class Train {

    private int trainNumber; // instance variable
   
   
    public static Train(){ // this is not allowed. Compilation issue
        
    }
```

    
**static variable:**
-   A variable that has a static keyword is called **static** variable or **class** variable.
 
 **Syntax to invoke a static Variable:**
 
```aidl
ClassName.variableName;

```
 
```aidl
public class Train {

    private int trainNumber; // instance variable
    private static int count=0; // static variable

    public Train(int name) {
        this.trainNumber = name;
    }
    
    public static void main(String[] args) {

        Train train1 = new Train(10);
        train1.count = 1; // Wrong
        Train.count =1; // Right


        Train train2 = new Train(11);
        train2.count = 2; // Wrong
        Train.count =2; // Right
    }
}

```

**static methods:**

-   A static method will have the static keyword as part of the method declaration.
-   A static method cannot reference to a instance vaiable.

 **Syntax to invoke a static method:**
 
```aidl
Classname.staticMethod;

```

**Example:**
```aidl
public static int changeTrainInstanceCount(){ //static method

        return count++;
    }

```

```aidl
public class Train {

    private int trainNumber; // instance variable
    private static int count=0; // static variable

    public Train(int name) {
        this.trainNumber = name;
    }
    
    public static int changeTrainInstanceCount(){ //static method

        return count++;
    }

    public static void main(String[] args) {

        Train train1 = new Train(10);
        Train.count =1; // Right


        Train train2 = new Train(11);
        Train.count =2; // Right
    }
}

```

-   A compiler will issue if a static method try to access a non-static/instance variable.

```aidl

 public static int changeTrainInstanceCount(){ //static method
        trainNumber = 3;//compilation issue
        return count++;
    }

```

#### Constants:

-   Constants are mainly declared using the final modifier.
-   You will have **final** and **static** keyword together.
 
```aidl
    public static  final String type ="TRAIN";
```
    