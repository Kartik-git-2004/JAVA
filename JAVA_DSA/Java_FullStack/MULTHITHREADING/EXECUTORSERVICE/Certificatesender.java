package MULTHITHREADING.EXECUTORSERVICE;

public class Certificatesender implements Runnable {
    private final String stdName;
    public Certificatesender(String name){
        this.stdName=name;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("certificate sent to "+Thread.currentThread()+"name :"+stdName);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
