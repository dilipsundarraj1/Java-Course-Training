# String and Arrays

### String :

-   In java, string is basically an object that represents sequence of char values.
-   String is always represented by enclosing it inside the double quotes.

```aidl
public class StringType {

    public static void main(String[] args) {

        String s="Hello World";

        System.out.println(s);
        
        String str = new String("Hello");
        System.out.println(str);
    }
}
```

#### Reference variable:

```aidl
  String s="Hello World"; // s is a reference variable.
```

-   Why is this called reference variable for String not for primitive data types.
-   Because **String** in itself is a class unlike the other data types.
-   Any variable that you create references to a class than it is called Reference variable.


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