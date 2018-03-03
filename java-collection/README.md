## Java Collection:

The most common ones are below.

-   ArrayList (We discussed about this already)
    - https://github.com/dsaish3/Java-Course-Training/tree/master/string-arrays#arraylist
-   HashMap
-   Set

### Map

-   This is a type of collection which is used to hold the key value pairs of a collection.

-   A HashMap implements the **Map** Interface.

-   **HashMap** implements the Map interface.

**Example**

```aidl
package com.learnJava.map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> names=new HashMap<Integer,String>();
        names.put(100,"Adam");
        names.put(101,"Steve");
        names.put(102,"Amy");

        System.out.println(names);

        
    }
}
```

#### Exploring HashMap Methods

**get**

-   This methods returns you the value for the key that is passed

```aidl
        HashMap<Integer,String> names=new HashMap<Integer,String>();
        names.put(100,"Adam");
        names.put(101,"Steve");
        names.put(102,"Amy");


        System.out.println(names.get(100)); // Pass 

```


**put**

-   This method is used to add a key to the hashmap.

```aidl
        names.put(99, "ABC");
        System.out.println(names);

```

**remove**

-   This method is used to remove a key from the collection which is a hashmap.

```aidl
        names.remove(102); // removes the key in the hash which is 102
        System.out.println(names);
```

**containsKey**

-   This method is used to check whether the Hashmap has the key available or not.
-   It returns true if it is available otherwise false.

```aidl
       System.out.println("Is available : " + names.containsKey(100)); // returns true if the value exists.
```

**containsValue**

-   This method is used to check whether the Hashmap has the value available or not.

-   It returns true if it is available otherwise false.

```aidl
System.out.println("Is Value available : " + names.containsValue("Adam"));
```

**values**

-   This method is used to get access to all the values of the HashMap.

```aidl
System.out.println("Values of the HashMap : " + names.values());
```

**keySet**

-   This method is used to get the keyset of the hashMap

```aidl
System.out.println("Key of the HashMap : " + names.keySet());
```

**clear**
-   This method is used to clear the hashmap.
-   Hashmap will be empty after this.

```aidl
    names.clear(); //this clears the whole hashmap
    System.out.println(names);
```

#### How to iterate a HashMap ?

-   Get the keyset and iterate the keyset and get the values of the key.

**Approach 1:**
```aidl
 public static void iterateHashMap(Map<Integer,String> names){

        Set<Integer> keySet = names.keySet();

        for(Integer key : keySet){
            System.out.println("Values of the HashMap are :" + names.get(key));
        }

    }
```
**Approach 2:**

```aidl
    public static void iterateHashMap_2(Map<Integer,String> names){

        for (Map.Entry<Integer,String> entry : names.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());


    }

```

**Approach 3:**

```aidl
    public static void iterateHashMap_3(Map<Integer,String> names){

        Iterator<Map.Entry<Integer, String>> itr = names.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }



    }
```

## Set

-   Set is a type of collection that can used when you do not need the collection to have duplicate values.

-   HashSet is a collection that Implements the Set interface.
   
```aidl

        Set<String> set = new HashSet<String>();

        set.add("ABC");
        set.add("DEF");
        set.add("GHI");
        set.add("ABC"); // It checks whether a duplicate is avaialble. If its available then it overrides that values.
        System.out.println(set);

```

### Exploring Set Methods

**add**

-   This method is used to add the element in to the set.

```aidl

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("ABC");
        set.add("DEF");
        set.add("GHI");
        set.add("ABC");

        System.out.println(set);

```

**Contains**

-   This method is return a boolean if the set has the element.

```aidl
        Set<String> set = new HashSet<String>();

        set.add("ABC");
        set.add("DEF");
        set.add("GHI");
        set.add("ABC");

        System.out.println(set);

        set.contains("ABC"); // returns true if the element is available in the set otherwise false.
```

**remove**

-   This method is used to remove an element from the set.

```aidl
    set.remove("ABC");

    System.out.println(set);
```


**addAll**

-   This method is used to add a set to the existing set.


```aidl

 Set<String> set = new HashSet<String>();

        set.add("ABC");
        set.add("DEF");
        set.add("GHI");

Set<String> set1 = new HashSet<String>();
        set1.add("JKL");
        set1.add("MNO");

        set.addAll(set1); // this  add all the elements of  set1 to the set.

        System.out.println(set);
```

**isEmpty**

-   This method is used to check the set is emptry.
-   If the set is empty then it will return true otherwise false.

```aidl
System.out.println(set.isEmpty()); // false because the set is not empty.
```


**clear**

-   This method is used to clear the elements from the set.

```aidl
set.clear();
```

### How to iterate a Set ?

**Approach 1**
```aidl
  public static void iterateSet(Set<String> set){

        for(String s : set){
            System.out.println(s);
        }

    }

```

**Approach 2**

```aidl
 public static void iterateSet_2(Set<String> set){

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
```

