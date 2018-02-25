package com.learnJava.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
