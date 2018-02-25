package com.learnJava.file;

import java.io.FileInputStream;

public class FileInputStreamExample {

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


}
