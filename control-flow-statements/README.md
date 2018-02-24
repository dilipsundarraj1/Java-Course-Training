# control-flow-statements

### If-else

-   **If** statement is used to execute a block if the expression in the if block evaluates to true.
 
 
**Approach 1**

```aidl
public class IfExample {

    public static void main(String[] args) {

        int i =9 ;
       if(i>0){ //the result of the expression is a boolean. If the boolean returns true it executes the if loop
            System.out.println("inside the if loop"); // prints if loop
        }

        if(i>10){
            System.out.println("inside the if loop");
        }else{
            System.out.println("inside else loop"); // prints else loop

        }
        
        String name= "ABC";
        
        if(name.equals("ABC")){
              System.out.println("inside if loop"); // prints, inside if loop
           }
        
        if(name.equals("ABC")){
              System.out.println("inside if loop"); // prints, inside if loop
          }
          
        

    }
}
```
**Approach 2 (ArrayList)**

```aidl
 /**
         * ArrayList
         */

        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Lion");

        if(animalList.contains("Cat")){
            System.out.println("inside the if loop"); // prints , inside the if loop
        }
```

**Approach 3 (User Defined Object)**

```aidl
        /**
         * User Defined Object
         */

        Car car1 = new Car("camry", "abc", 2015);

        if(car1.getYear()==2015 && car1.getModel().equals("camry")){
            System.out.println("Inside the if loop");
        }

```

### If-else-if

```aidl
package com.learnJava.If;

public class IfElseIfExample {

    public static void main(String[] args) {

        int i =5;

        if(i<0){
            System.out.println("inside if loop");
        }else if(i==5){
            System.out.println("inside first else if loop"); // executes this statement first.
        }else if(i>0){
            System.out.println("inside second else if loop");
        }else{
            System.out.println("inside else loop");
        }

    }
}

```

### Ternary

-   The ternary operator includes the below.

```aidl
?:
```

**Example**

```aidl
package com.learnJava.If;

public class TernaryExample {

    public static void main(String[] args) {

    int i =5;

    System.out.println(i>0?"greater than 0":"less than zero"); // prints, greater than 0

        i =-5;
    System.out.println(i>0?"greater than 0":"less than zero");// prints, less than zero

    }
}

```

### Switch

-   Switch statement is used to check the multiple conditions in a cleaner approach.

**syntax**

```aidl
switch(<input>){

    case <type>:
        break;
    case <type>:
        break;
    default:
        break;
}
```
**Example**

```aidl
public class SwitchExample {

    public static void main(String[] args) {

        String name="ghi";

        switch (name){ // takes in the condition
            case "abc": //this should be of type String/.
                System.out.println("inside abc ");
                break;
            case "def":
                System.out.println("inside ghi ");
                break;
            case "ghi":
                System.out.println("inside ghi ");
                //missing break
            case "jkl":
                System.out.println("inside jkl ");
                //missing break
            default:
                System.out.println("inside default ");
                break;


        }

    }
}

```

**Result**

```aidl
inside ghi 
inside jkl 
inside default 
```

### Switch vs if

-   If and Switch performs the same as the if-else.
 
-   Code looks cleaner with the swith statement compared to the if then else. 

```aidl
public class SwitchvsIfExample {

    public static void main(String[] args) {

        String day = "SUN";
        if (day.equals("MON") || day.equals("TUE")||
                day.equals("WED") || day.equals("THU"))
            System.out.println("Time to work");
        else if (day.equals("FRI"))
            System.out.println("Nearing weekend");
        else if (day.equals("SAT") || day.equals("SUN"))
            System.out.println("Weekend!");
        else
            System.out.println("Invalid day?");

        
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU": System.out.println("Time to work");
                break;
            case "FRI": System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN": System.out.println("Weekend!");
                break;
            default: System.out.println("Invalid day?");
        }

    }
}
```

-   **null** is not allowed in the **case** statement.

### for

-   A for loop is used to execute a statement a fixed number of times.
-   The for loop has a combination of three values
    -   intialization block
    -   termination block
    -   update clause
 
**Syntax**

```aidl
for(<intialization block>;<termination block>;update clause){
}

```

**Forward Loop**
-   The below program will iterate the loop for 5 times.


```aidl
public class ForLoopExample {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.println("Value of i : " + i);
        }
    }
}

```

**Result**

```aidl
Value of i : 0
Value of i : 1
Value of i : 2
Value of i : 3
Value of i : 4
```

**BackWard Loop**

public class ForLoopExample {

    public static void main(String[] args) {

        /**
         * BackWard for loop
         */

        for(int i=5;i>0;i--){
            System.out.println("Value of i : " + i);
        }
    }
}


**Result**

```aidl
Value of i : 5
Value of i : 4
Value of i : 3
Value of i : 2
Value of i : 1
```

**Infinite For Loop**

```aidl
  for(int i=5;;i--){ //no termaination statement results in infinite loop
            System.out.println("Value of i : " + i);
    }
```

**Nested For Loop**

-   Nesting multiple for loops inside a for loop.

**Example**

```aidl
package com.learnJava.For;

public class NestedForLoopExample {

    public static void main(String[] args) {

        for(int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println("Value of i : " + i);
                System.out.println("Value of j : " + j);
            }
        }
    }
}

```


**Result**

```aidl
Value of i : 0
Value of j : 0
Value of i : 0
Value of j : 1
Value of i : 0
Value of j : 2
Value of i : 1
Value of j : 0
Value of i : 1
Value of j : 1
Value of i : 1
Value of j : 2
Value of i : 2
Value of j : 0
Value of i : 2
Value of j : 1
Value of i : 2
Value of j : 2
```

### Regular for loop vs enhanced for loop

```aidl
package com.learnJava.For;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        /**
         * regular for loop
         */

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }

        /**
         * with enhanced for loop
         */
       for(String name : nameList)
       {
           System.out.println(name);
       }
    }
}

```

-   Enhanced for loop cannot be used to manipulate the data in the array list
 
**Modify the arrayList**
 
 -  Modify the data using the regualat for loop. 
 
 ```aidl
    List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        /**
         * regular for loop
         */

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
            nameList.set(i, "adam1");
        }
```

**Nested Enhanced For Loop**

```aidl
 List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        List<String> animalList = new ArrayList<>();
        animalList.add("dog");
        animalList.add("cat");
        animalList.add("rat");

        for(String name : nameList)
            for(String animal : animalList){
                System.out.println(animal);
                System.out.println(name);
            }

```

**Result**
```aidl
dog
adam
cat
adam
rat
adam
dog
joe
cat
joe
rat
joe
dog
ben
cat
ben
rat
ben
dog
jack
cat
jack
rat
jack
```

## while-loop

-   This is used to execute a piece of code as long as the condition evaluated to true.

```aidl
package com.learnJava.While;

public class WhileLoopExample {

    public static void main(String[] args) {

        int count=1;

        while(count<=3){
            System.out.println("Inside while");
            count+=1;
        }
    }
}

```

**Result**
-   while loop will be executed three times.

```aidl
Inside while
Inside while
Inside while
```

## do-while

-   This **do-while** loop will execute the statements once atleast and then evaluates the condition.

```aidl
 int num=5;

        do{
            System.out.println("Inside the do loop");
        }while(num>5);
    }
```

-   Even though the condition fails it is going to execute the statement inside the do loop first and then checks the condition.


## Comparing for loop and while loop:

-  For loop is used to execute the statements when you know the number of times the statements needs to be executed.
-   While, do -while can be used when you are not sure of the number of times and your while loop should break after some condition.

## break

-   The break statement is used to break any loop while, do , for , switch at any point of time.

```aidl
package com.learnJava.Break;

import java.util.ArrayList;
import java.util.List;

public class BreakExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("adam");
        nameList.add("joe");
        nameList.add("ben");
        nameList.add("jack");

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
            break; // this will break out of the for loop after the first iteration eventhough it is suppose to run for 4 times.
        }
    }
}

```
**result**

```aidl
adam
```

## continue

-   **continue** is used to skip the execution of the statements below the continue statment but it wont break out of the for loop.
 
 ```aidl
package com.learnJava.Continue;

public class ContinueExample {

    public static void main(String[] args) {

        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        for (String name : programmers) {
            if (name.equals("Shreya"))
                continue;
            System.out.println(name);  // Shreya wont get printed but  we have  continue on top of the System.out.println.
        }

    }
}

```