package co.g2academy.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String args[]) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println( "Enter your name" );
        String name = br.readLine();
        String umur = br.readLine();
        System.out.println( "Welcome " + name );
        System.out.println("umur saya " + umur);
    }


}
