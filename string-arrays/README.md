# String and Arrays

### String :

-   In java, string is basically an object that represents sequence of char values.
-   String is always represented by enclosing it inside the double quotes.

```aidl
public class StringType {

    public static void main(String[] args) {

        String s="Hello World"; // creates a String Object. s is a reference variable.

        System.out.println(s);
        
        String str = new String("Hello"); // creates a String Object. str is a reference variable.
        System.out.println(str);
    }
}
```

### Difference between the approaches:

#### Creating String using Assignment(=) Operator.

-   In the below code it displays the result as true.

```aidl

        String s="Hello World";

        String s1="Hello World";


        System.out.println(s==s1); //true

```

#### Creating String using new Operator.

-   The below code displays the result as false.

```aidl
 String str = new String("Hello");

        String str1 = new String("Hello");

        System.out.println(str==str1);

```


Whats the difference ?  

-   In Java , there is a concept String pool which is part of the heap specific for String. 

-   If you are creating the assignment operator, before it creates the object it checks whether any string with the same characters is available in a String pool.

-   If it finds an object then it assignes the reference variable to that object.


### String is Immutable:

-   This means that once the string object is created then it can never be modified.

```aidl
public class StirngImmutable {

    public static void main(String[] args) {

        String s="Hello"; // This creates a object in the String pool.

        s= "Hello1"; // Even though most of the characters are the same , it still creates a branch new object and does not touch the other object.
    }
}
```

#### How to reassign a value to a reference variable.


**Approach 1**

```
        String s="Hello World";
        String s2 = s;
```

**Approach 2**

```
        String s="Hello World";
        s = "Hello World1";
```

## Arrays

-   An array is simple but powerful way to group and organize data.
-   An array is a list of values. Each value is stores at a numbered position in the array.
-   The number for each position is called an **index** or **subscript**.


### How to Declare an array ?

-   In Java , Arrays are objects. To create an array, you must create a reference to the array.

```aidl
 int[] height = new int[5];
 
 int -> type
 height -> reference variable
 int[5] -> We are asking Java to create an array to store 5 elements. It cannot be changed.
 
```

-   An array will store the element of same type.
    -   In the above example height  cannot store double or float.
-   A value stores in an array is called **array element.** 
-   The type of values an array stores is called **element type**.

### Difference between an int and int array:

```aidl
int a=10; //assigns the variable 'a' with value 10 

int[] numArray = new int[5]; //intiliazes an empty array, all the values will be zero. 

numArray[0]=1 //Filling/assigns a value at index 0
numArray[1]=3//Filling/assigns a value at index 1
numArray[2]=8//Filling/assigns a value at index 2
numArray[3]=23//Filling/assigns a value at index 3
numArray[4]=99//Filling/assigns a value at index 4
```

-   Index of the array aways starts with zero
-   The last index of the array is always length-1

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java-arrays-1.png)


### How to get the total length of an array?

-  **length** method will give your the total length of the array.

-   This **length** is different from the **length** in String.
