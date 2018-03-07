### Install Postgres Database

-   Follow the below video to install postgres in your local machine.


https://youtu.be/MIBF76FsZt8



### Student Table

```aidl
CREATE TABLE STUDENTS (
    STUDENT_NO NUMERIC,
    STUDENT_NAME TEXT,
    GRADE TEXT,
    CRTE_TS TIMESTAMPTZ NULL default current_timestamp
);
```


