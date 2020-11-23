package co.g2academy.thread;

public class Multi extends Thread {

    // segala macam thread yang akan di running di taro disini
    public void run() {
        System.out.println("Thread is running..");
    }

    public static void main(String[] args) {

        Multi t1 = new Multi();
        t1.start();

    }
}
