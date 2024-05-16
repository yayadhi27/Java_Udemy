package Challenge_Threads;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        for(int i =0 ; i < 10; i+=2){
            System.out.println("Even Thread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Even Thread is interrupted");
                break;
            }
        }
    }
}
