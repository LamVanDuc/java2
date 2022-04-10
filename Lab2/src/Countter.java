public class Countter {

    public void count(){
        int value = 0;
        while (value < 10){
            System.out.println("Count: " + (++value));
            Pause(300);
        }

    }

    public void countDown(){
        int value = 10;

        while (value >=0){
            System.out.println("count down : " + (value--));
            Pause(200);
        }

    }

    private void Pause(long time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
