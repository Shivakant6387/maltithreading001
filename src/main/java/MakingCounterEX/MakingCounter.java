package MakingCounterEX;

public class MakingCounter implements Runnable{
    private int counter;
    public void run(){
        for (int i=1;i<=20000;i++){
            increment();
        }
    }
    private synchronized void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
