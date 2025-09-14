package MULTHITHREADING.lockDEMO;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcc  {
    public int bal = 1000;
    private final ReentrantLock l = new ReentrantLock();

    public void withdrawal(String ThreadName ,int amt ){

        System.out.println(ThreadName +" Is  trying to withdrwan  "+amt);
        if(l.tryLock()){
            System.out.println(ThreadName +"  acquired Lock ");
            try{
                if(bal>amt){
                    Thread.sleep(2000);
                    bal = amt-bal;
                    System.out.println(ThreadName+"Sucessfully withdrawn "+amt);
                }else{
                    System.out.println("Insufficient Amount");
                }

            } catch(Exception e){
                System.out.println(e);
            }finally{
                l.unlock();

            }
        }

    }

}
