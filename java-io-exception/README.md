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

        String s = null;

        System.out.println(s.length()); // exception happens and disrupts the flow of the program and none of the below this does not get executed.

        System.out.println("Length is calculated");
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



### FileOutputStream

- Java FileOutputStream is an output stream used for writing data to a file.

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

- Java FileInputStream is an input stream used for read the data to a file.


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


