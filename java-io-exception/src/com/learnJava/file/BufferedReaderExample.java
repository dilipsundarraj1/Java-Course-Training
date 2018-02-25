package com.learnJava.file;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        FileReader fr= null;
        BufferedReader br=null;
        try {
            fr = new FileReader("/Dilip/input/testout.txt");
            br=new BufferedReader(fr);
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

        }
        }
}
