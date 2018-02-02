# Variable Scopes and Encapsulation

## Variable

- A variable in java is something which is declared to store a data type value.
   
```aidl
int i =10; ->  i is a variale which stores the value 10.
```

### Variable Scopes

-   A variable has four different scopes
    -   Local variables
    -   Method Parameters
    -   Instance Variables
    -   Class Variables.
    
#### Local Variables

-   Local Variables are variables which are decalred inside a method.
-   The scope of this variable is just visible to this method and this variable is not accessible to any where in the class.

**Example 1**

-   Declaring a variable inside a method.
```aidl
public class Addition {

    public int addition(int a , int b){

        int sum =0; // local variable, scope of this variable is just visiable to this method.
        sum = a+b;
        return sum;

    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        int total = addition.addition(2,3);
        System.out.println("Total is : " + total);

    }
}

```

**Example 2**

-   Declaring a variable inside the if conditional statement.

```aidl
public class CompareNumbers {

    public int getGreaterNumberofTwo( int a , int b){

        if(a > b) {

            int greaterNumber = a; // Local Variable , declared inside a for loop.
            return greaterNumber;
        }else{
            return  -1;
        }
    }

    public static void main(String[] args) {

        CompareNumbers compareNumbers = new CompareNumbers();
        System.out.println(compareNumbers.getGreaterNumberofTwo(4,2));
        System.out.println(compareNumbers.getGreaterNumberofTwo(5,6));

    }
}
```

#### Method Parameters

-   The variables that are declared in the method signature is called Method Parameters.
-   Scope of this variable is just visible to this method.
-   You cannot access the method variables outside this method.

**Example:**

```aidl
public class Addition {

    public int addition(int a , int b){ // method parameters and this is just visible to this method

        int sum =0; 
        sum = a+b;
        return sum;

    }
    
    public int addingThreenumbers(int x , int y, int z){ // method parameters and this is just visible to this method
    
        // a + b // You cannot access a and b variable of the addition method in here.
    
            return x+y+z;
        }

    public static void main(String[] args) {

        Addition addition = new Addition();
        int total = addition.addition(2,3);
        System.out.println("Total is : " + total);

    }
}

```

#### Instance Variables

-   A variable that is assigned to an instance of a class is called instance variable.

```aidl
public class Car {

    String owner;
    String model;
    int year;

    public Car(String owner, String model, int year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        Car camry = new Car("xyz","camry",2005); // camry is a instance variable.

    }
}
```

#### Class Variable

- A class variable is something which is shared across all objects that we create out of the class.


```aidl
public class Train {

    String trainName;
    int trainNumber;
    static int count;

    public Train(String trainName, int trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    public static void main(String[] args) {

        Train train1 = new Train("xyz", 123);
        Train.count =1; // Always access the class variable using the class name.
        Train train2 = new Train("xyz", 456);
        Train.count =2; // Always access the class variable using the class name.

        System.out.println(train1.count); // This will print 2 because this is a class level variable, not an instance level.
        System.out.println(train2.count); // This will print 2 because this is a class level variable, not an instance level.


    }


}

```

#### Variables with Same Name

-   There are some scenarios where the usage of same variable name is allowed.
-   This is not recommended because this will cause unwanted confusion.


```aidl
public class Employee {

    String firstName;
    String lastName;
    int salary;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void changeLastName(){

        String firstName = "123"; // Same firstName variable can be declared with the same name.
        this.firstName = firstName+this.firstName;

    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("xyz","abc", 12000);
        employee1.changeLastName();
        System.out.println(employee1.firstName);
        Employee employee2 = new Employee("abc","xyz", 12000);
        employee2.changeLastName();
        System.out.println(employee2.firstName);


    }
}

```

## Object's Life Cycle:

-   An object is created when a **new** keyword is used in the program.

```aidl
public class Student {

    String name;
    String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public static void main(String[] args) {

        Student student = new Student("Sam", "XYZ"); // Object is created.
    }
}

```

-   We should always access the student object using the reference variable.

```aidl
 Student student = new Student("Sam", "XYZ"); // student is the reference variable

```

### Garbage collection:

-   This is part of the JVM itself. 
-   When an object is created in the memory it will be alive until it is used in the execution of the program.


```aidl
public class Car {

    String owner;
    String model;
    int year;

    public Car() {
    }

    public Car(String owner, String model, int year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public void createCarObject(){

        Car camry = new Car("xyz","Camry", 2009); // this object will be garbage collected after the execution of this method.
    }

    public static void main(String[] args) {

        new Car().createCarObject();

    }
}
```
 
 -  In this example the camry Car object will be garbage collected after the execution of the program.
 
 -  There are methods that are available to request the Java to perform garbage collecton.
 
 ```aidl
System.gc();

or

Runtime.getRuntime().gc();
```

-   But there is no guarantee that this will start the GC process. But it just starts the execution.


### Overloaded Method

- An overloaded method is a method with the same name but with different parameters/arguments. 

-   In the below example we have the same method **multiply** which is accepting different arguments or no arguments.
 
```aidl
public class Multiplication {


    public int multiply(int i, int i1) {

        return i*i1;
    }

    public int multiply(int i, int i1,int i2) { // Same Method name with three integers , THis is called method overloading

        return i*i1*i2;
    }

    public String multiply(){ // Same Method with no arguments , THis is called method overloading

        return "Hello";
    }


    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();

        int result = multiplication.multiply(1,2);

        System.out.println("Multiplciation of two numbers : "+result); // result is 2

       result =  multiplication.multiply(1,2,3);

        System.out.println("Multiplciation of three numbers : "+result);  // result is 6

        System.out.println("Text from Multiply  : " + multiplication.multiply()); // prints the String "Hello"

    }


}
```

### Encapsulation

-   Encapsulation in Java means, hiding the members/methods to the outside world. 
-   The only way we can hide the members/methods is by marking them with **private** access modifier.
-   Providing the access to the members through methods.


**Example Without Encapsulation**

```aidl
public class PersonWithoutEncapsulation {

    public String firstName; // public accessmodifier
    public String lastName;// public accessmodifier
    public int age;// public accessmodifier

    @Override
    public String toString() {
        return "PersonWithoutEncapsulation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
```
**PersonClient**

```
public class PersonClient {

    public static void main(String[] args) {

        PersonWithoutEncapsulation person1 = new PersonWithoutEncapsulation();
        person1.age=-10; // This allows a negative value for a age which is not correct.
        person1.firstName="xyz";
        person1.lastName="abc";

        System.out.println(person1); // PersonWithoutEncapsulation{firstName='xyz', lastName='abc', age=-10}
    }
}
```
**Example With Encapsulation**

```
public class PersonWithEncapsulation {

    private String firstName;  // private access modifier
    private String lastName;// private access modifier
    private int age;// private access modifier

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * You can write the logic to handle it. We have control over the values that are being sent from the client.
     * @param age
     */
    public void setAge(int age) {
        if(age < 0){
            age =10;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonWithEncapsulation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

```
**PersonClient**

```aidl
public class PersonClient {

    public static void main(String[] args) {

        PersonWithEncapsulation person2 = new PersonWithEncapsulation();

        //person2.age=-10; //Not accessible, so that we can set the value as -10 for a age which is not a valid scenario.

        person2.setAge(-10);
        person2.setFirstName("xyz");
        person2.setFirstName("abc");

        System.out.println(person2);


    }
}

```


#### Why encapsulation ?

-   With encapsulation, we can control the input that is being passed from the client.
-   We can validate the users input before being passed assigned to an object.