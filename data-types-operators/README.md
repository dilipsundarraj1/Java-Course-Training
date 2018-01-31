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
        
        float f =10.63984798274f; //prints this 10.639848 -> This cuts of some of the number after the decima
        double d =10.3234234234d; //prints this 10.3234234234 -> More Precise


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
        
![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java7.png)

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
    
### Operators

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java6.png)

#### Assignment Operators

-   From the name we can say that this is used for assigning values.
-   Lets go through the assignment variable one by one.


```aidl
= -> This is straight forward way of assigning a value to a variable.
```
**Example :**
```aidl

int a=2;
float f = 1.2f;
char c ='c';

```
```aidl
+= -> Add and Assign
-= -> Substract and Assign
*= -> Multiply and Assign
/= -> Divide and Assign
```

**Examples**

```aidl
        int b=10;
        b+=12; // equivalent to b =b+12
        System.out.println(b); //22

        int c=10;
        c-=12; // equivalent to c =c-12
        System.out.println(c); //-2

        int e = 10;
        e*=12; // equivalent to e =e*12
        System.out.println(e);//120

        int g = 10;
        g/=5; // equivalent to g =g/5
        System.out.println(g);//2
```

#### Arithmetic Operators

-   These operators are mainly used to performing arithmetic operations.

```aidl
+ -> Addition
- -> Subtraction
* -> Multiplication
/ -> Division
% -> Modulus, this returns the remainder from the division
++ -> Increment
-- -> Decrement
```

##### Increment:

-   This performs the addition of 1 to the current value.

**PreIncrement:**

```aidl
int a = 5;
System.out.println(++a); // Pre Increment , This prints 6 in the output.

```
-   This will first increment the value and prints it.

**PostIncrement**

```aidl
int a = 5;
System.out.println(a++); // Pre Increment , This prints 5 in the output.
```


##### Decrement:

-   This performs the subtraction of 1 from the current value.


#### Relational Operators


-   These are mainly used to compare two values of same type.

```
> -> greater than.
>= -> greater than or equal to 
< -> Lesser than
<= -> Lesser than or equal to
== -> Equal to
!= -> Not equal to
```

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java7.png)

```aidl
 int a =5;
        int b =2;
        int c =5;

        if(a>b){
            System.out.println("a is greater than b");
        }


        if(a>=c){
            System.out.println("a is equal to c");
        }

        if(b<a){
            System.out.println("b is lesser than a");
        }

        if(b<=a){
            System.out.println("b is lesser than a");
        }



        if(a==c){
            System.out.println("a is equal to c");
        }

        if(a!=b){
            System.out.println("a is not equal to b");
        }

    }
```

### Logical Operators

-   Logical Operators are used to evaluate one or more expressions.
-   There are three logical operators:
    -   AND ->  &&
    -   OR  ->  ||
    -   NOT ->  !
    
![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java8.png)

```aidl
public class LogicalOperators {


    public static void main(String[] args) {

        int a =2;
        int b = 1;
        int c=3;

        if(a>b && c>b){
            System.out.println("Condition is true");
        }

        if(a>b || c<b){
            System.out.println("Condition is true");
        }

        if(!(a<b)){
            System.out.println("Condition is true");
        }


    }
}
```


### Order of Precedence

-   The below link has more information about it.

https://introcs.cs.princeton.edu/java/11precedence/

```aidl
public class OrderPrecedence {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = ++x * y-- + 1; // Result is 61.

        System.out.println(z);

        System.out.println(1+2*4*3); //25 * -> takes preference and then addition

        System.out.println((2+3)*5); //25 () -> Paranthesis take precendence and then multiplication.
    }
}
```

### Wrapper Classes

**Hierarchy**

![](https://github.com/dsaish3/Java-Course-Training/blob/master/data-types-operators/images/WrapperClass.png )

#### How to create an object of Wrapper Classes ?

```aidl

            int x =2; // Assigning a value to a int variable. Only one approach
    
            Integer ii=2; // assigning the value
    
            Integer i2=new Integer(2); // Using the new operator
    
            Integer i3=new Integer("2"); // using the String value
    
            Integer i4=Integer.valueOf("6"); //Using the valueOf method.
```

#### Advantages of wrapper classes over regular Primitive types?

-   Wrapper object has methods which we can use it in order to convert it to different types.

```aidl
        System.out.println(i4.floatValue()); // Integer to a float value

        System.out.println(i4.doubleValue()); // Integer to a double value

        System.out.println(i4.byteValue()); // Integer to a byte value

        System.out.println(i4.longValue()); // Integer to a long value

        System.out.println(i4.shortValue()); // Integer to a short value
```

#### How to compare two wrapper objects ?

-   There are three approaches to compare two objects to be equal.
    -   using the **==** operator
    -   using the **equals** method.
    -   using the **compareTo** method.
    
**==**

-   You have to be really careful when using this operator. This just compares whether the two objects refer to the same object or not.

-   This wont be equal because this just compares the memory address not the actual value each object holds.

```aidl
        Integer i1 = new Integer(500);

        Integer i2 = new Integer(500);

        System.out.println(i1==i2); // This wont be equal because this just compares the memory address not the actual value each object holds
```

**equals**

-   This approach actually compares the values of the two objects.

```aidl
Integer i1 = new Integer(500);

Integer i2 = new Integer(500);

System.out.println(i1.equals(i2)); // 
```

**compareTo**

-`This is again used to compare integers but it returns a number based on a result.


```aidl
        /**
         * equals
         */
        System.out.println(i2.compareTo(i1)); // returns 0 because i2 and i1 are equal.

        /**
         * i2 > i3
         */
        System.out.println(i2.compareTo(i3)); // returns 1 because i2 is greater than i3.

        /**
         * i3 < i2
         */
        System.out.println(i3.compareTo(i2)); // returns -1 because i3 is lesser than i3.

```

### Boolean, Character

**Boolean**

-   Boolean wrapper class is used to represent the boolean type and this is not part of the member family.
```aidl
        Boolean b = false;
        System.out.println(b);
        Boolean b1 = new Boolean(false);
        System.out.println(b1);
        Boolean b2 = new Boolean("true");
        System.out.println(b2);
        Boolean b3 = new Boolean("x");
        System.out.println(b3);
```


**Comparing Boolean**

-   We can use the **compareTo** method to compare the values.

```aidl
        Boolean b = false;
        System.out.println(b);
        Boolean b1 = new Boolean(false);
        System.out.println(b1);
        Boolean b2 = new Boolean("true");
        System.out.println(b2);
        Boolean b3 = new Boolean("x");
        System.out.println(b3);
        
        System.out.println(b.compareTo(b1)); // returns 0 , both are equal
        System.out.println(b3.compareTo(b2));// returns -1 , false.equals(true)
        System.out.println(b2.compareTo(b3));// returns 1 , true.equals(false)
```



**Character**

-   Character class is a wrapper class to represent a Character.

```aidl
        Character c = new Character('C');
        System.out.println(c);

        Character c1 = 'D';
        System.out.println(c1);

        Character c2 = Character.valueOf('B');
        System.out.println(c2);
```

**Comparing Characters:**

-   There are three approaches to compare two objects to be equal.
    -   using the **==** operator
    -   using the **equals** method.
    -   using the **compareTo** method.
    
**==**

-   You have to be really careful when using this operator. This just compares whether the two objects refer to the same object or not.

-   This wont be equal because this just compares the memory address not the actual value each object holds.

```aidl
        Character c = new Character('C');

        Character c1 = 'D';


        Character c2 = Character.valueOf('D');

        System.out.println(c1 == c2); // false
```
**equals**

-   This approach actually compares the values of the two objects.

```aidl
Character c1 = 'D';


        Character c2 = Character.valueOf('D');
System.out.println(c1.equals(c2)); // true
```

**compareTo**

-   The below link has the table which has the ascii value for each character
https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

```aidl
        Character c = new Character('C');

        Character c1 = 'D';

        Character c2 = Character.valueOf('D');

        /**
         * c=67
         * c1=68
         * c2=68
         */
        System.out.println(c1.compareTo(c)); // 1 , 68 > 67
        System.out.println(c.compareTo(c1)); //-1 , 67<68
        System.out.println(c1.compareTo(c2)); // 0, 68=68

```
