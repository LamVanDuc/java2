public class FirstThread implements Runnable{



    public void Thread(String name){
        int count = 5;
        for (int i = 0 ; i < 5; i++){
            System.out.println(name + " : "+ count--);
            try{
                Thread.sleep(300);}catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + "  exiting.");
    }
    @Override
    public void run(){
        Thread(Thread.currentThread().getName());
    }


}
