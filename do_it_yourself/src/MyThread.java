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

        FirstThread firstThread = new FirstThread("First",5);
        SecondThread secondThread = new SecondThread("Second",5);
        ThirdThread thirdThread = new ThirdThread("Third",5);



        firstThread.start();
        secondThread.start();
        thirdThread.start();


    }
}




