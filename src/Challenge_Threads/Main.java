package Challenge_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        OddThreads o1 = new OddThreads();
        Thread e1 = new Thread(new EvenThread());


        o1.start();
        e1.start();

        o1.join();
        e1.join();


    }
}
