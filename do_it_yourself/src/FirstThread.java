public class FirstThread extends Thread{


    private String nameRun;
    private int number;


    public FirstThread(String nameRun, int number) {
        this.nameRun = nameRun;
        this.number = number;

    }

    @Override
    public void run(){
        int count = number;
        for (int i = 0 ; i < number; i++){
            System.out.println(nameRun + " : "+ count--);
            try{
                Thread.sleep(1000);}catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(nameRun + "  exiting.");
        }


    }
