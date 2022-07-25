public class ThreadOperationTwo{
    Operation operation;

    public ThreadOperationTwo(Operation operation) {
        this.operation = operation;
    }
        Runnable runnable = ()->{
        operation.multiply(100);
        };
}
