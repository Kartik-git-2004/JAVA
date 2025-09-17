package MULTHITHREADING.EXECUTORSERVICE;

import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(8);

        String StudentList[] = {
                "Aarav", "Isha", "Rohan", "Priya", "Kabir", "Ananya",
                "Vihaan", "Meera", "Arjun", "Sanya", "Aditya", "Kavya",
                "Rahul", "Neha", "Dev", "Simran", "Aryan", "Pooja"
        };

        for(String student : StudentList){
            Certificatesender task = new Certificatesender(student);
            service.submit(task);
        }
        service.shutdown();
    }

}
