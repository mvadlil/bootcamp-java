package co.g2academy.io;

import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\contoh.txt");

            int i;
            while ( ( i = fin.read() ) != -1 ) {
                System.out.print((char)i);
            }
            fin.close();
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
