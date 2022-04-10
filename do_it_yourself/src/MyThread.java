import java.nio.file.FileStore;

public class MyThread{
    public static void main(String[] args) throws InterruptedException{



//        try {
//
//
//        for (int i = 0 ; i<=10;i++ ){
//            if (i%2 ==0 ){
//                System.out.println(i);
//                Thread.sleep(1500);
//            }
//        }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        FirstThread thread = new FirstThread();

        Thread first = new Thread(thread);
        Thread second = new Thread(thread);
        Thread third = new Thread(thread);

        first.setName("First");
        second.setName("Second");
        third.setName("Third");

        first.start();
        second.start();
        third.start();


//        FirstThread firstThread = new FirstThread();
//        FirstThread firstThread2 = new FirstThread();
//        SecondThread secondThread = new SecondThread();
//        ThirdThread thirdThread = new ThirdThread("Third",5);



//            firstThread.start();
//            secondThread.start();
//            thirdThread.start();

    }
}




