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

**repositories**

**mavenCentral**
     
-   https://mvnrepository.com/
-   This is the link where all the open source projects are build and stored.

**dependencies**

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

```
gradle dependencies --configuration testCompile
```
-   Lets discuss more about this when we build the junit.   

### Gradle Tasks:

-   Gradle is loaded with some predefined tasks such as
    -   build
    -   test
    
#### How to build the gradle project ?

-   The goal of using gradle is that we need to build the artifact for the project

```aidl
gradle build
```

-   Check the **build/libs** directory.
    -   This has the jar file artifact for the project.


### How to add a Task to the Gradle project ?

```aidl

```
    



