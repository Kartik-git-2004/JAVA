package MULTHITHREADING;

import java.sql.SQLOutput;

public class THREAD_WAIT_ {
    public static class threadWait extends Thread {
        int total = 0 ;
        public void run(){
            synchronized(this){
                System.out.println("Child Thread cal...");
                for(int i = 0;i<10;i++){
                    total = total+1;
                }
                System.out.println("Child done calculating....");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        threadWait a1 = new threadWait();
        a1.start();

        synchronized (a1){
            System.out.println("Main thread calling wait");
            a1.wait();
            System.out.println("Main Thread Get notified ");
            System.out.println(a1.total);
        }
    }
}
