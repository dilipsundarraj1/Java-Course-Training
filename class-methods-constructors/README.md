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

-   Syntax to create an object/Instance.
 
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
-   A class is like a blue print of a house.
-   Objects are the actual houses that are built using the blue print.

**Analogy 2:**
-   A class is equivalent to Person.
-   Objects are that a person can be male/female, different name, different height etc. .


```aidl
public class Person {

    String gender;
    String name;


    public static void main(String[] args) {

        Person dilip = new Person(); //objec 1
        dilip.gender="Male";
        dilip.name="dilip";

        Person anshu = new Person(); //objec 2

        anshu.gender="Female";
        anshu.name="Anshu";


        Person hema = new Person(); //objec 3
        hema.gender="Female";
        hema.name="Hema";

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
 
 ```aidl
 public void breath(){
        System.out.println("Human is breathing with his nose");
    }


    public void see(){
        System.out.println("Human is breathing with his eyes");
    }
```
 
##### Method Invocation:

-   Use the **dot** operator.
-   Use the **reference variable+dot** operator.

 ```aidl
public static void main(String[] args) {

        Human dilip = new Human();//Reference variable
        dilip.breath(); // method invocation
        dilip.see();// method invocation

}
```
 