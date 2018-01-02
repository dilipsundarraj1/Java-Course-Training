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
