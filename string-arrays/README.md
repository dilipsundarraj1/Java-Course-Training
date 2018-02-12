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

### String Equality:

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

#### using equals()


-  String has a method called **equals** to perform the equality check.

-   This compares the actual content inside the string reference.

```aidl
String str = new String("Hello");

String str1 = new String("Hello");
    
System.out.println(str.equals(str1));

```

### String is Immutable:

-   This means that once the string object is created then it can never be modified.

```aidl
public class StirngImmutable {

    public static void main(String[] args) {

        String s="Hello"; // This creates a object in the String pool.
                System.out.println(s+"Hi");
                System.out.println(s.substring(2,4)); // Even though we perform the substring this does not change the actual String.
                System.out.println(s); // this will string print "Hello", String is mutable and it does not change the actual String.
                
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

### Exploring String methods:

-    In this section we will discuss about some popular methods.

**Equals**

-   This is used to compare two Strings.

```aidl
        String str = "Dilip";
        String str1 = "Dilip";
        System.out.println(str.equals(str1));
```

**Concat**

-   This method is used to concat two strings.
-   You can also use a **+** symbol.

**Approach 1:**
```aidl
 String str = "Dilip";

   System.out.println(str.concat(" Dilip")); // output as "Dilip Dilip"
```

**Approach 2:**

```aidl
 String str = "Dilip";

   System.out.println(str+ " Dilip")); // output as "Dilip Dilip" with a space between the names.
```

**charAt**

-   This method is used to select a character in a String.
-   Each and every element in a String is a character and the character index starts from 0.

```aidl
String str = "Dilip";
System.out.println(str.charAt(0)); // prints "D" in the console.
System.out.println(str.charAt(2)); // prints "l" in the console.
```

**length()**

-   This method is used to get the total length of the String.

```aidl
String str = "Dilip";
System.out.println(str.length()); // prints "5" in the console.
```

**contains**

-   Contains method is used to check whether the character is present or not.

```aidl
String str = "Dilip";

System.out.println(str.contains("D")); // true, since D is part of the String itself else this will return false.
```

**isEmpty**

-   This method returns if the string is empty.

```aidl
String str = "Dilip";
System.out.println(str.isEmpty()); // this returns false because str stores the name "Dilip". If the str is empty then this will return false.
```

**replace**

-   This replaces the character with a new value that we are passing.

-   The below call replaces the 'i' with 'o'.

```aidl
        String str = "Dilip";
        System.out.println(str.replace('i','o')); // this returns "Dolop"
```

**substring**

-   This method is is used to get a part of the String from the actual String. 
-   This substring method takes in two arguments, start index and end index.

```aidl
String str = "Dilip";
System.out.println(str.substring(2,4)); // this returns "li"
```

**indexOf**
-   This method is used to fetch the character in that index.

```aidl
String str = "Dilip";
System.out.println(str.indexOf(0)); // this will print "D".
```
**trim**

-   trim method is used to remove the white spaces.

```aidl
        String str1 = "hello ";
        System.out.println(str1.trim()); // prints "hello" , this is used to remove the white spaces in the String.

```

**startswith**

-   This evaluates to a boolean expression to find out whether the character starts with the string that is passed to it or not.

```aidl
        System.out.println(str1.startsWith("he")); // prints true

        System.out.println(str1.startsWith("el")); // prints false
```

**endswith**

-   This again evaluates to a boolean expression to find out whether the character is presents or not.

```aidl
 System.out.println(str1.endsWith("lo")); // prints true

 System.out.println(str1.endsWith("el")); // prints false

```



### String is immutable.
 
 -  Once a string is created it can never be changed.
 
 
 ```aidl
public class StirngImmutable {

    public static void main(String[] args) {

        String s="Hello"; // This creates a object in the String pool.

        System.out.println(s.substring(2,4)); // Even though we perform the substring this does not change the actual String.

        s= "Hello1"; // Even though most of the characters are the same , it still creates a branch new object and does not touch the other object.
    }
}
```

### Method Chaining

-   This is a concept of calling multiple methods of a string in a single line.


```aidl
String str1 = "hello ";
System.out.println(str1.trim().replace("l","o")); // prints heooo, calling two methods in a single line trim and replace.
```

### String Equality:

**Approach1 using (==)**

### StringBuilder:

-   Using StringBuilder you can create mutable Strings.
-   What does this mean ?
    -   You can modify the actual String.

**Example StringBuilder:**

```aidl
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hi");
        str.append(" Hello");

        System.out.println(str.toString()); // prints "Hi Hello"
    }
}


```

#### StringBuilder methods

**deleteCharAt**

-   This method is not part of the String class. 
-   This is used to remove a character at a particular index.

```aidl
        StringBuffer str = new StringBuffer();
        str.append("Hi");
        str.append(" Hello");


        System.out.println(str.toString()); // prints "Hi Hello"

        str.deleteCharAt(1); // Remo

        System.out.println(str.toString()); // prints "H Hello"
```

**insert**

-   This method is used to insert a character in to a particular position.

```aidl

        StringBuffer str = new StringBuffer();
        str.append("Hi");
        str.append(" Hello");


        System.out.println(str.toString()); // prints "Hi Hello"

        str.deleteCharAt(1); // Remove the character at the first index. Index always starts from 0 and ends with length-1.

        str.insert(1,'i');// Adds the character i at the index 1.

        System.out.println(str.toString()); // prints "Hi Hello"

```

**reverse**

-   This method is used to reverse the string.

```aidl
        StringBuffer str = new StringBuffer();
        str.append("Hi");
        str.append(" Hello");
        System.out.println(str.toString()); // prints "Hi Hello"

        System.out.println(str.reverse()); // prints olleH iH

        System.out.println(str.toString());// olleH iH
```

**replace** 

-   This method is used to replace the characters with a new String.
 
```
    StringBuffer str = new StringBuffer();
    str.append("Hi");
    str.append(" Hello");
    System.out.println(str.replace(2,4, "how"));// prints "Hihowello", replaces the characters between  2 and 3
```

### StringBuffer

#### Example StringBuffer:

```aidl

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("Hi");
        str.append(" Hello");

        System.out.println(str.toString()); // prints "Hi Hello"
    }
}


```

-   All the methods that are availble in the StringBuilder is applicable for StringBuffer.


-   The only difference between StringBuilder and StringBuffer is given below:
    -   StringBuffer is thread safe
    -   StringBuilder is not thread safe.
    -   Threads are advances concepts which are not part of this course. So dont worry about it.
    

### String vs StringBuffer vs StringBuilder

-   Click the below link to compare all the three.

http://javahungry.blogspot.com/2013/06/difference-between-string-stringbuilder.html



## Arrays

-   An array is simple but powerful way to group and organize data.
-   An array is a list of values. Each value is stores at a numbered position in the array.
-   An array will have two things.
    -   index (position for each element)
    -   value (actual value that the array holds  for the index value.)
-   The number for each position is called an **index** or **subscript**.


### How to Declare/intialize an array ?

-   In Java , Arrays are objects. To create an array, you must create a reference to the array.

```aidl
 int[] height = new int[5];//intiliazes an empty array, all the values will be zero.
 
 int -> type
 height -> reference variable
 int[5] -> We are asking Java to create an array to store 5 elements. It cannot be changed.
 
 
 String[] strArray = new String[5]; // Initialized an array of five elements and all the elements will be null.

```

-   An array will store the element of same type.
    -   In the above example height  cannot store double or float.
-   A value stored in an array is called **array element.** 
-   The type of values an array stores is called **element type**.

### How to get the total length of an array?

-  **length** method will give your the total length of the array.

-   This **length** is different from the **length** in String.


### Index of the array:

-   Index of the array starts with '0' and ends with 'height.length -1'.
 
```aidl
 int[] height = new int[5];//intiliazes an empty array, all the values will be zero.

```
-   The index of the array are 0,1,2,3,4.

### How to fill an array ?

-   We used the assignment operator **=** in order to populate the value in to the array. 

```aidl
 public class ArrayExample {
 
     public static void main(String[] args) {
 
         int[] numArray = new int[5]; // Initialized an array of five elements, and all the elements will be 0.
 
         String[] strArray = new String[5]; // Initialized an array of five elements and all the elements will be null.
 
         numArray[0]=1; //Filling/assigns a value at index 0
         numArray[1]=3;//Filling/assigns a value at index 1
         numArray[2]=8;//Filling/assigns a value at index 2
         numArray[3]=23;//Filling/assigns a value at index 3
         numArray[4]=99;//Filling/assigns a value at index 4
 
 
     }
 }

 
```

![](https://github.com/dsaish3/Java-Course-Training/blob/master/images/java-arrays-1.png)


### How to access a value from the array ?

-   In order to access a value from the array then we need to have the below syntax.

**Syntax**

```aidl
arrayName[index-value]
```

```aidl
System.out.println(numArray[0]);

```
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


### How to iterate an array ?

-   This method is used to iterate each and every array and prints it in the console.

-   This is called a simplified a for loop and this it iterates until all the elements are read from the array.

-   If you have an array of 5 elements then for loop will iterate for 5 times.

```aidl

public class ArrayExample {

    public static void main(String[] args) {

        int[] numArray = new int[5]; // Initialized an array of five elements, and all the elements will be 0.

        numArray[0]=1; //Filling/assigns a value at index 0
        numArray[1]=3;//Filling/assigns a value at index 1
        numArray[2]=8;//Filling/assigns a value at index 2
        numArray[3]=23;//Filling/assigns a value at index 3
        numArray[4]=99;//Filling/assigns a value at index 4

        for(int i : numArray) // This code takes the value from each index and assigns the value to the 'i' variable.
                    System.out.println(i);
    }
   
```

### MultiDimenstional Arrays



