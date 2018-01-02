This read has the workspace set up instructions.

## Java Installation in Mac/Windows

### How to check the java version in the machine ?

```
java -version
```

The above command will display the below results.  

```
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
```

### How to check the machine is 32 bit or 64 bit ?

**MAC**
- Run the below command to check the MAC os is a 32 bit or 64 bit ?

```
getconf LONG_BIT
```

https://apple.stackexchange.com/questions/12666/how-to-check-whether-my-intel-based-mac-is-32-bit-or-64-bit


**Windows**

Mycomputer -> Properties  


### How to download/install Java JDK ?

**Mac:**

- Go to the below link and download the appropriate Java JDK.

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

- Install the image file.
- Check the Java version again. This should display the installed version of the Java.

**Windows:**

- Go to the below link and download the JDK based on the 32/64 bit version.

http://www.oracle.com/technetwork/java/javase/downloads/index.html

### How to setup the java path manually ?

**Mac**

- Add the below line in the **.bash_profile** file.

```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
```

**Windows**

https://www.java.com/en/download/help/path.xml

## Intellij Installation in Mac

### Download the intellij in Mac:

**MAC:**

- Go to the below link and download intellij.

https://www.jetbrains.com/idea/download/#section=mac

- Select the **OS** as **MAC**

- Click on the Community version **Download** button.

**Windows:**

- Go to the below link and download intellij.

https://www.jetbrains.com/idea/download/#section=windows

- Select the **OS** as **Windows**

- Click on the Community version **Download** button.
