public class Operation {
    //lock method
    //deadlock
    //Atomic -- useful in collections
    synchronized void multiply(int number){
        try{
            for (int i = 0; i<20; i++){
                System.out.println("Current value after "+Thread.
                        currentThread().getName()+" "+number*i );
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
