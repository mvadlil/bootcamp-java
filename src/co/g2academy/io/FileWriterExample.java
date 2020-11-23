package co.g2academy.io;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Halooo Guysss!");
            fw.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

}
