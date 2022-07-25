public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        ThreadOperationOne threadOperationOne = new ThreadOperationOne(operation);
        threadOperationOne.start();
        ThreadOperationTwo threadOperationTwo = new ThreadOperationTwo(operation);

        Thread operationTwo = new Thread(threadOperationTwo.runnable);
        operationTwo.start();
    }
}
