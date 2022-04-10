public class SecondThread extends Thread{
    private String nameRun;
    private int number;


    public SecondThread(String nameRun, int number) {
        this.nameRun = nameRun;
        this.number = number;
    }

    @Override
    public void run(){
        int count = number;
        for (int i =0 ; i< number; i++){
            if (count > 1){
                System.out.println(nameRun + " : "+ count--);
            }
            if (count==1){
                System.out.println(nameRun + " : "+ count--);
                System.out.println(nameRun + "  exiting.");
            }
            try{

                Thread.sleep(300);}catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(nameRun + "  exiting.");
    }
}