package guess_the_number;

public class GussTheNumber extends Thread{

    private int number;
    private String name;
    public GussTheNumber(int number , String name){
        this.number =number;
        this.name=name;
    }



    public void run(){
        boolean check = true;
        int count = 0;
        while(check){
            count++;
           int gussNumber = (int)(Math.random()*100+1);
            if (gussNumber == number){
                System.out.println(name + "  đã đoán trúng số : "+number+ " trong "+ count +" lần đoán .");
                check = false;
            }else {
                System.out.println(name + " đã đoán số : "+ gussNumber);}
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
