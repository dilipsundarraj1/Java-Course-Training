# Java -IO (input/output)

## Scanner Class 

-   This class is used to interact with the user via the input from the keyboard.

### How to create an instance of scanner ?

```aidl
    Scanner scanner = new Scanner(System.in);
```
**Example 1**

```aidl
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int rollno=scanner.nextInt();  // syntax to get a integer
        System.out.println("Entered Number is : " + rollno);

        System.out.println("Enter a name : ");
        String name=scanner.next(); // syntax to get a String
        System.out.println("Entered name is : " + name);

        System.out.println("Enter the price of the TV : ");
        double price=scanner.nextDouble(); // syntax to get a double
        System.out.println("Entered TV price is : " + price);


    }
}

```


**Example 2**

-   Using a for loop to get the user input.

```aidl
public class ScannerIteratorExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> nameList = new ArrayList<>();

        for (int i=0;i<3;i++){
            System.out.println(" Please Enter a name  : ");
            nameList.add(scanner.next());
        }

        System.out.println("Entered names are : " + nameList);
    }
}

```

### Calculator Example


```aidl
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {

        System.out.println("Lets perform the arithmetic operation of two numbers.");
        System.out.println("1 : ADD\n2 : Subtract\n3 : Multiply\n4 : Divide");

        System.out.println(" Please enter an option: ");

        Scanner scanner = new Scanner(System.in);

        int selectedOption = scanner.nextInt();

        List<Integer> userInputs = new ArrayList<Integer>();

        for (int i=1;i<=2;i++){
            System.out.println("Enter number " + i + ":");
            userInputs.add(scanner.nextInt());
        }

        int result=0;

        switch (selectedOption) {
            case 1:
                System.out.println("Performing Addition");
                for(Integer i : userInputs){
                    result+=i;
                }
                break;
            case 2:
                System.out.println("Performing Subraction");
                result = userInputs.get(0) -userInputs.get(1);
                break;
            case 3:
                System.out.println("Performing Multiply");
                    result = userInputs.get(0) *userInputs.get(1);
                break;
            case 4:
                System.out.println("Performing Divide");
                    result=userInputs.get(0) /userInputs.get(1);;
                break;
            default:
                System.out.println("Selected an invalid option");
                break;
        }

        System.out.println("The result is : " + result);


    }
}

```

### Stream

-   A stream is a sequence data.

-   Java by default provides us three streams

    -   System.in
    -   System.out
    -   System.err
    

**Example**

```aidl
public class StreamExample {

    public static void main(String[] args) {
        System.err.println("hello error");
        System.out.println("hello world");


    }
}
```

### Exception:

-   In Java , the Exception is an event that disrupts the normal flow of the program.
-   Exception happens at runtime.

#### What is runtime ?

-   A runtime is the time which is the execution period of the program.

**Example**

```aidl
public class ExceptionExample {

    public static void main(String[] args) {

        int a = 10;
       
        System.out.println(a/0); // exception happens and disrupts the flow of the program and none of the below this does not get executed.
       
        System.out.println("Division is calculated");
    }
}

```

**Example 2 - Arithmetic Exception**

```aidl
public class ExceptionExample {


    public static void performDivision(int i){
    int b=0;
        System.out.println(i/b); // exception happens and disrupts the flow of the program and none of the below this does not get executed.


    }
    public static void main(String[] args) {
        int a = 10;
        performDivision(a);
        System.out.println("Division is calculated");
    }


}

```

#### What is exception handling

-   Exception Handling is a mechanism to handle runtime errors gracefully and proceed with the execution of the program

**syntax 1**

```aidl

try{  
//code that may throw exception  
}catch(Exception ref){}  //catches the exception
```

![](https://github.com/dsaish3/Java-Course-Training/blob/master/java-io-exception/images/exceptionobject.JPG)

**Example :**

```aidl
public class ExceptionHandledExample {

    public static void main(String[] args) {
        int a = 10;

        try{
            System.out.println(a/0);  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (ArithmeticException e){
           e.printStackTrace();
            System.out.println("Exception is : " + e);
        }

        System.out.println("Calculation completed");
    }
}
```

**Example 2**

```
public class ExceptionExample {


    public static void performDivision(int i){
    int b=0;
        System.out.println(i/b); // exception happens and disrupts the flow of the program and none of the below this does not get executed.

    }
    public static void main(String[] args) {
        int a = 10;
        try{
            performDivision(a);  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println("Exception is : " + e);
        }

        System.out.println("Division is calculated");
    }


}
```

**syntax 2**


```aidl

try{  
//code that may throw exception  
} 
finally{ //Executed this block irrespective of any exception in the try block
 
}
```

**Example**

```aidl
public class ExceptionHandledTryCatch {

    public static void main(String[] args) {
        int a = 10;

        try{
            System.out.println(a/0);  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (ArithmeticException e){
           e.printStackTrace();
            System.out.println("Exception is : " + e);
        }

        System.out.println("Calculation completed");
    }
}

```

**syntax 3**

-   This is the best approach for exception handling.

```aidl

try{  
//code that may throw exception  
} catch(Exception e){

}
finally{ //Executed this block irrespective of any exception in the try block
 
}
```


**Example**

```aidl
public class ExceptionTryCatchFinally {

    public static void main(String[] args) {

        int a = 10;

        try{
            System.out.println(a/0);  // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception is : " + e);
        }finally {
            System.out.println("Calculation completed");
        }
    }
}

```

### Exception Hierarchy:


![](https://github.com/dsaish3/Java-Course-Training/blob/master/java-io-exception/images/exception-hierarchy.png)

### File:

-   **File**  class in Java is used to represent a file.


#### How to create a file ?

-   **createNewFile** method to create a new file.

public class FileExample {

    public static void main(String[] args) {


        File file = new File("/Dilip/input/myfile.txt");

        try {
            if(file.createNewFile()) // this creates brand new file in your machine.
                System.out.println("Success!");

  
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

#### How to write a file to a specific location ?

-  We will use a **FileWriter** class to write a file to a specific location.

**Example**

```aidl
public class FileExample {

    public static void main(String[] args) {


        File file = new File("/Dilip/input/myfile.txt");

        try {
            if(file.createNewFile()) // this creates brand new file in your machine.
                System.out.println("Success!");

            String input="Test data";

            /**
             * Code to write a file
             */
            FileWriter writer = new FileWriter(file);
            writer.write(input);
            writer.close();

            System.out.println("Data Successfully written to the file!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
```

#### How to read a file from a specific location ?

-  We will use a **FileReader** class to read a file from a specific location.


```aidl

package com.learnJava.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {


        File file = new File("/Dilip/input/myfile.txt");

        try {
            if(file.createNewFile()) // this creates brand new file in your machine.
                System.out.println("Success!");

            String input="Test data";

            /**
             * Code to write a file
             */
            FileWriter writer = new FileWriter(file); //gets the access to the file
            writer.write(input);
            writer.close();

            System.out.println("Data Successfully written to the file!");

            FileReader fileReader = new FileReader(file); // //gets the access to the file
            char [] a = new char[input.length()];
            fileReader.read(a);   // reads the content to the file and assigns it to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
            fileReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

```

#### How to check a file exists ?

-   We can use the **exists** method to do that.

```aidl
            System.out.println("File Exists : " + file.exists());

```

#### How to rename a file name ?

-   Use the **rename** method in order to rename a file from one to another.


```aidl
File file = new File("/Dilip/input/myfile.txt"); //old file
File newfile = new File("/Dilip/input/myfile-new.txt"); // new file

            file.renameTo(newfile);
```

#### How to delete a file name ?

-   We can use the **delete** method to delete a file.
-   This returns a boolen as **true** if the deletion is successful.


```aidl
File newfile = new File("/Dilip/input/myfile-new.txt");

            if(newfile.delete()) { // returns a boolean
                System.out.println("Successfully delete the file");

            }
```

### FileOutputStream

-   Java FileOutputStream is an output stream used for writing data to a file.
-   This is another approach of writing a file.

```aidl
public class FileOutputStreamExample {

    public static void main(String[] args)  {

        try{

            FileOutputStream fout=new FileOutputStream("/Dilip/input/testout.txt");
            String s="Hello World.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");

        }catch (FileNotFoundException e){
            System.out.println("inside exception block " + e);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("inside exception block " + e);
        }


    }
}

```

### FileInputStream

-   Java FileInputStream is an input stream used for read the data to a file.
-   This is another approach of reading a file.


```aidl
 public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("/Dilip/input/testout.txt");
            int i=0;

            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }

```


### BufferedWriter

-   This is the best approach to write the file.

```aidl

public class BufferedWriterExample {
    private static final String FILENAME = "/Dilip/input/testout.txt";

    public static void main(String[] args) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = "This is the content to write into file\n";

            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}

```

### BufferedReader

-   This is the best approach to read the file.

```aidl
public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        FileReader fr= null;
        BufferedReader br=null;
        try {
            fr = new FileReader("/Dilip/input/testout.txt");
            br=new BufferedReader(fr);
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

        }
        }
}

```


