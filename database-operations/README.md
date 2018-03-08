### Install Postgres Database

-   Follow the below video to install postgres in your local machine.


https://youtu.be/MIBF76FsZt8


### Gradle dependecies:

```
    compile group: 'commons-pool', name: 'commons-pool', version: '1.6'
    compile group: 'org.apache.commons', name: 'commons-dbcp2', version: '2.2.0'
    compile group: 'commons-logging', name: 'commons-logging', version: '1.2'
    compile group: 'org.postgresql', name: 'postgresql', version: '9.4.1212'
```

### Student Table

```aidl
CREATE TABLE STUDENTS (
    STUDENT_NO NUMERIC,
    STUDENT_NAME TEXT,
    GRADE TEXT,
    CRTE_TS TIMESTAMPTZ NULL default current_timestamp
);
```


