package MakingCounterEX;

public class clientTest {
    public static void main(String[] args) {
        MakingCounter   makingCounter=new MakingCounter();
        Thread thread1=new Thread(makingCounter);
        Thread thread2=new Thread(makingCounter);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Counter final value"+makingCounter.getCounter());
    }
}
