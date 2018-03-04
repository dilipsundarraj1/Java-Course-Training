# Gradle

-   Gradle is a build tool.
-   Gradle is going to build our project and produce an artifact. ie., the jar file in our class

## What is an Artifact ?

-   Artifacts in Java are of three types:
    -   jar file - Java archive files
    -   war file -  Web Archive Files
    -   ear file -  Enterprise Archive Files.
    
### Jar
-  Our focus is that we are going to build a jar artifact for our project.  
-   A jar file will hold a bunch of java .class files.
    

### Gradle Project:
-   Any gradle project that we create will have the following.
    -   src/main/java -> For the source code.
    -   src/main/resources -> Application configuration related information. Eg., Logging configuration
    -   src/test/java -> For the test cases
    -   src/test/resources -> Testing related configuration.

**build.gradle**
    -   This is the important file and this has all the information about how to build the project as an artifact.

```aidl
group 'com.learnjava' // group id that we provided
version '1.0-SNAPSHOT' // version that we provided

apply plugin: 'java' // gradle to use java, gradle can be used to build many kinds of projects like groovy, scala.

sourceCompatibility = 1.8 // source is java 8.

repositories {
    mavenCentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12' 
}


```

**settings.gradle**

-   This file holds the name of the project.   

```aidl
rootProject.name = 'first-gradle-project'
```

#### repositories

#### mavenCentral
     
-   https://mvnrepository.com/
-   This is the link where all the open source projects are build and stored.

#### dependencies

-   Lets take a look at the below example.
-   The below junit-4.12.jar gets added to the gradle project by default.

```
dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
```

-   The above code will add the **junit-4.12** junit jar to the class path.
    -   Check the External Libraries attached to our project.
    -   It has a a group id , name  and version.
    -   What happens here is that this code goes to the maven central and add the junit to our classpath.
    -   This jar file has all the junit related code.
        -   Basically someone builds the functionality and loads it in maven for use by the public.
        -   Open source community is really huge and contributes a lot to it.
    -   **MANIFEST.MF**
            -   This is an important file and it has information about the jar file.
     

**hamcrest-core**
-   This got added to the project.
-   There is a concept called **transitive** dependencies.

### How to find the transitive dependencies ?

```
gradle dependencies --configuration testCompile
```

**Result**

```aidl

testCompile - Dependencies for source set 'test'.
\--- junit:junit:4.12
     \--- org.hamcrest:hamcrest-core:1.3

```
-   Lets discuss more about this when we build the junit.


### Gradle Tasks:

![](https://github.com/dsaish3/Java-Course-Training/blob/master/first-gradle-project/images/gradle-tasks.png)

-   The commonly used gradle tasks:
    -   build
    -   test

### How to build the gradle project ?

-   The goal of using gradle is that we need to build the artifact for the project

```aidl
gradle build
```
**Result:**

```aidl
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:jar UP-TO-DATE
:assemble UP-TO-DATE
:compileTestJava UP-TO-DATE
:processTestResources UP-TO-DATE
:testClasses UP-TO-DATE
:test UP-TO-DATE
:check UP-TO-DATE
:build UP-TO-DATE

BUILD SUCCESSFUL

Total time: 0.698 secs

```

-   **build** task runs many other tasks behind the scenes.

-   Each line in the task runs a separate task.

```aidl
:compileJava UP-TO-DATE - > This is a task which performs the compilation of the source code.
:processResources UP-TO-DATE
:classes UP-TO-DATE
:jar UP-TO-DATE -> This task generates the jar file of the project with the provided name and version in the gradle file.
:assemble UP-TO-DATE
:compileTestJava UP-TO-DATE
:processTestResources UP-TO-DATE
:testClasses UP-TO-DATE
:test UP-TO-DATE -> This runs the test cases of the application.
:check UP-TO-DATE
:build UP-TO-DATE 
```

-   Check the **build/libs** directory.
    -   This has the jar file artifact for the project.
    -   The **jar** task that is part of the build task is responsible for building the artifact.

   
### MANIFEST.MF

-   This file holds complete information of the artifact.

```aidl
Manifest-Version: 1.0
Implementation-Title: first-gradle-project
Implementation-Version: 1.0-SNAPSHOT
Main-Class: com.learnjava.HelloWorld
```


### How to add a Task to the Gradle project ?

-   Here we are overriding the jar task.
-   This will add the Manifest and build the jar file.

```aidl
jar {
    manifest {
        attributes(
                    "Implementation-Title": project.name,
                    "Implementation-Version": version,
                    "Main-Class": 'com.learnjava.HelloWorld',
                    "Created-By" : 'Dilip'
                )
    }
}


```
    
-   **Main-Class** -> This holds the class with the main method. 
-   In our example the **HelloWorld** is the class to be added.
 
### How to run the Jar file ?
 
```aidl
java -jar build/libs/first-gradle-project-1.0-SNAPSHOT.jar 
```

-   This will execute and run the project.


