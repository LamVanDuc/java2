package withdraw_money;

public class WithdrawMoney implements Runnable {
    private int tong;

    public WithdrawMoney(){
        this.tong = 1000;
    }

    public synchronized void ruttien(){
        if (tong > 0){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            tong = tong - 1000;
            System.out.println(tong);

        }else {
            System.out.println("đã hết tiền !");
        }
    }

    @Override
    public void run(){
        ruttien();
    }


    public static void main(String[] args) {
        WithdrawMoney tk = new WithdrawMoney();
      Thread tk1 = new Thread(tk);
       Thread tk2 = new Thread(tk);

        tk1.start();
       tk2.start();



    }
}
