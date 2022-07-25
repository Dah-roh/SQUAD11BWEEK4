public class ThreadOperationOne extends Thread{
    Operation operation;

    public ThreadOperationOne(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void run() {
        operation.multiply(100);
    }
}
