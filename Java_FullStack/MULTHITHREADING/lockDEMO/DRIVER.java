package MULTHITHREADING.lockDEMO;

public class DRIVER {
    public static void main(String[] args) throws Exception{
        System.out.println(Thread.getState());
        BankAcc a1 = new BankAcc();
        Runnable t1 = ()->a1.withdrawal("PAPA",500);
        System.out.println(t1.getState());
        Runnable t2 = ()->a1.withdrawal("wife",1000);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
