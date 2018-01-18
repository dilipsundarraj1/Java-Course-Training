 # Data Types:
 
 - Data Types are of two types.
    -   primitive
    -   non-primitive

![](https://github.com/dsaish3/Java-Course-Training/blob/master/data-types/images/data-type-1.JPG)
    
### Primitive Data Type:
-   From the name it suggests these are the simplest data types and they are predefined in Java.
-   Below are the default values of the data types and its size.

```aidl

Type        default     size 

booelan     false       1 bit
byte        0           8 bits
char        \u0000      16 bits
short       0           16 bits
int         0           32 bits
long        0           64 bits
float       0.0         32 bits
double      0.0         64 bits
```
-   The most commonly used ones are:
    -   boolean
    -   char
    -   int
    -   long
    -   float
    -   double

- Below link has more information about it.

http://cs.fit.edu/~ryan/java/language/java-data.html

    
#### How to declare and intialize a variable ?

**Synatx:**

```aidl
<data-type> <variable-name> = <actual-value>;

int i =10;
```

Example:   

```aidl
public class PrimitiveDataTypes {

    public static void main(String[] args) {

        char c= 'c';
        System.out.println(c);

        short s = 9;
        System.out.println(s);

        int i=0;
        System.out.println(i);

        long l = 10l;
        System.out.println(l);

        float f = 10.0f;
        System.out.println(f);

        double d = 90.0;
        System.out.println(d);

        boolean value= true;
        System.out.println(value);


    }
}

```

-   You cannot have two variables with the same name.

#### How to re-assign a variable ?

-   Declare a variable name and re use it by assigning the value.

**Approach 1**
```aidl
        int i=0;
        System.out.println(i);

        i =10;
        System.out.println(i);
```

**Approach 2**

```aidl
        int i=0;
        System.out.println(i);

        int j = 11;

        i=j;
```

### Identifiers:

-   Identifiers are the names of variables, methods, classes, packages and interfaces.

#### Invalid Identifiers:
```
My Variable // Contains a space
9pins // Begins with a digit
a+c // The plus sign is not an alphanumeric character
testing1-2-3 // The hyphen is not an alphanumeric character
O'Reilly // Apostrophe is not an alphanumeric character
OReilly_&_Associates // ampersand is not an alphanumeric character
```



### Non Primitive Data Type:

-   String,Arrays and etc.
-   Classes are also referred to as non primitive data type.

**Example 1**
```aidl

public class NonPrimitiveDatatypes {

    public static void main(String[] args) {
        String name = "Hello";
        System.out.println("name : " +  name);
    }
}
```

**Example 2**

```aidl
public class Car {

    private  String model;
    private  String make;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public static void main(String[] args) {

        Car car = new Car("camry", "Toyota");
    }
}

```

### Primitive Variable vs Reference Variable
 
 ```aidl
int i =0; // i -> is a primitive variable
Car car = new Car("camry", "Toyota"); // car is a reference variable.
```
-   There are two types of memory location in Java.
    -   stack
        -   This memory stores the variables and the primitive data type
    -   heap
        -   This location stores the Objects that gets created.
![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java5.png)

```aidl
Car car = new Car("camry", "Toyota"); // car is a reference variable.
```
-   In this above example the following happens:
    -   The Car object gets created in memory and it has a memory address
    -   the **car** reference variable holds the memory address of the object.
**Example**
    
```aidl
public class Car {

    private  String model;
    private  String make;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public void changeModel(Car car1){
        car1.model = "corolla";
    }

    public static void main(String[] args) {

        Car car = new Car("camry", "Toyota");
        System.out.println(car.model); // prints camry
        car.changeModel(car); // changing the value to corolla
        System.out.println("After the call");
        System.out.println(car.model); // prints corolla
    }
}
```
    
    