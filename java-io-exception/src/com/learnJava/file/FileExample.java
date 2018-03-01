package com.learnJava.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {


        File file = new File("/Dilip/input/myfile.txt");

        try {
            if(file.createNewFile()) // this creates brand new file in your machine.
                System.out.println("Success!");

            String input="Test data";

            /**
             * Code to write a file
             */
            FileWriter writer = new FileWriter(file);
            writer.write(input);
            writer.close();

            System.out.println("Data Successfully written to the file!");

            FileReader fileReader = new FileReader(file);
            char [] a = new char[input.length()];
            fileReader.read(a);   // reads the content to the file and assigns it to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
            fileReader.close();

            System.out.println("File Exists : " + file.exists());

            File newfile = new File("/Dilip/input/myfile-new.txt");

            file.renameTo(newfile);

            if(newfile.delete()) { // returns a boolean
                System.out.println("Successfully delete the file");

            }


            } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
