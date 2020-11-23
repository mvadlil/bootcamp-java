package co.g2academy.io;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("D:\\testout.txt");
            int reader;
            while( ( reader = fr.read() ) != -1 )
                System.out.print( (char)reader );
            fr.close();
        } catch ( Exception e ) {
            System.out.println(e);
        }
    }
}
