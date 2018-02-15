## LocalDate

-   LocalDate is a library which is part of the Java itself.
-   This library gives you access to the Calendar Date.

**Example**

```aidl
public class LocalDateExample {

    public static void main(String[] args) {

        System.out.println(LocalDate.now()); // prints the current date
    }
}
```

### Create a LocalDate of certain date.

- In Web Applications such as online booking, when you select certain dates then in those cases we will use LocalDate libraries.  

```aidl
public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate someDate =   LocalDate.of(1990, Month.JANUARY,01);

        System.out.println(someDate); // prints 1990-01-01
    }
}
```

### Exploring Methods of LocalDate:

-   In the below examples I have explored some of the methods in the 

```aidl
public class LocalDateExample {

    public static void main(String[] args) {

        System.out.println(LocalDate.now()); // prints the current date

        LocalDate someDate =   LocalDate.of(2018, Month.MARCH,31);

        System.out.println(someDate); // prints 1990-01-01

        System.out.println(someDate.getMonth()); // prints MARCH

        System.out.println(someDate.getDayOfMonth()); // prints 31 as the day is set as 1.

        System.out.println(someDate.getDayOfWeek()); // prints SATURDAY

        System.out.println(someDate.getDayOfYear()); // prints 90

        
    }
}
```

### Comparing Dates

- There are two popular methods available to perform this operation. One is 

```aidl
public class ComparingDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2018-01-01");

        LocalDate date2 = LocalDate.parse("2019-01-01");

        System.out.println(date1.isAfter(date2)); // prints false date1 is before date2

        System.out.println(date1.isBefore(date2)); // prints true date1 is before date2
    }
}
```

### Modifying the LocalDate:

-   There are some handy methods available to manipulate the date.

```aidl
public class ModifyingDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2018-01-01");

        System.out.println(date1.plusMonths(2)); // prints 2018-03-01

        System.out.println(date1.minusDays(2)); // prints 2017-12-30

        System.out.println(date1.plusYears(2)); // prints 2020-01-01

        System.out.println(date1.plusWeeks(2)); // prints 2018-01-15

        System.out.println(date1.atTime(11,00)); // prints  2018-01-01T11:00 , adds the hour and time to the value.


    }
}
```

## LocalTime

-   LocalTime is a library is part of the Java itself.

```aidl
public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime currentTime =  LocalTime.now();

        System.out.println( " currentTime " + currentTime); // localtime
    }
}

```

### Create a LocalTime of certain time.

**Approach 1:**
-   Using the **of** method of Localtime we can set the time to a particular time.

```aidl
  LocalTime newTime = LocalTime.of(22, 19);

        System.out.println("newTime : " + newTime);
```

**Approach 2:**

-   Using the **parse** method of LocalTime we can pass a String and get the time we pass.

```aidl
        LocalTime newTime1 = LocalTime.parse("15:08:58");

        System.out.println("newTime1 : " + newTime1);// prints 15:08:58

        LocalTime newTime2 = LocalTime.parse("15:08:99"); //java.time.format.DateTimeParseException: Text '15:08:99' could not be parsed: Invalid value for SecondOfMinute (valid values 0 - 59): 99
```

### Exploring Methods of LocalTime:

```aidl
        System.out.println(newTime1.getHour()); // prints 15
        System.out.println(newTime1.getMinute()); // prints 8
        System.out.println(newTime1.getSecond()); // prints 58
```

### Modifying the LocalTime

-   Lets explore some of the methods to change the value of the time using the **plus** and **minus** methods.

```aidl
public class ModifyingTimes {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(19,45,31);

        System.out.println("localTime : " + localTime);

        System.out.println(localTime.minusMinutes(2)); // prints 19:43:31

        System.out.println(localTime.plusHours(2)); // prints 21:43:31

        System.out.println(localTime.plusSeconds(10)); // prints 21:43:41

    }
}
```

### Comparing LocalTime

```aidl
public class ComparingTimes {

    public static void main(String[] args) {

        LocalTime  localTime = LocalTime.of(22,33,41);

        LocalTime  localTime1 = LocalTime.of(11,45,12);

        System.out.println(localTime.isAfter(localTime1)); // prints true

        System.out.println(localTime1.isAfter(localTime)); // prints false
    }

}

```

## Converting from one type to another

-   Combining both date and time will provide a new object named DateTime.

```aidl
public class ConvertTypes {

    public static void main(String[] args) {


        LocalTime time = LocalTime.of(22, 11, 0);
        LocalDate date = LocalDate.of(2018,02,11);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime); // prints 2018-02-11T22:11 , it combines both date and time.

    }
}
```

### LocalDateTime

-   LocalDateTime is a library which is part of the Java Library itself.

**Example**

**Approach 1**
```aidl
public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime dateTimeNow = LocalDateTime.now();

        System.out.println("current date time of the machine is : " + dateTimeNow); // prints the machines current date and time . Eg.,2018-02-15T14:50:15.678
    }
}
```

**Approach 2:**

-   Create a LocalDateTime instance using the **parse** method.

```aidl
LocalDateTime dateTimeNow1 = LocalDateTime.parse("2018-11-09T11:00:45");

System.out.println(dateTimeNow);
```

### Period

-   This is another library that is part of the time libraries in Java. But it is hardly used, so we are not going to cover it.
-   If interested , please check it in the book.


## DateTimeFormatter

-   This is a library which is part of the Java itself to change the date to a particular format. 

### Converting the LocalDateTime to a String

```aidl
 public static void dateTimeToString(){
        //Get current date time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now); // prints 2018-02-15T15:05:01.100

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);// prints 2018-02-15 15:05:01

        LocalDate localDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //prints  2018/02/15

        System.out.println("formatter1 Date is : " + localDate.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MMM/dd"); //prints  2018/02/15

        System.out.println("formatter2 Date is : " + localDate.format(formatter2));// Prints 2018/Feb/15

    }
```

### Converting the String to a Date

```aidl
 public static void stringToLocalDateTime(){

        String now = "2018-12-09 11:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);

        System.out.println("Before : " + now);

        System.out.println("After : " + formatDateTime);

        System.out.println("After : " + formatDateTime);

    }
```