package co.g2academy.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\contoh.txt");
            String firstWord = "Hai Input Output!\n";
            fout.write(firstWord.getBytes());
            fout.write("Aku masih newbie nih bro, bantuin ya!".getBytes());
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Final Program");
    }


}
