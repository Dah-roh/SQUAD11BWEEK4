import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Operation {
    //lock method
    //deadlock
    //Atomic -- useful in collections
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    synchronized void multiply(int number){
        try {
//            for (int i = 0; i<20; i++){
//                System.out.println("Current value after "+Thread.
//                        currentThread().getName()+" "+number*i );
//                Thread.sleep(1000);
//            }
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    {
                        System.out.println("Current value after "+Thread.currentThread().getName());
                    }
                }
                                                             };
        0,1, TimeUnit.SECONDS);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
