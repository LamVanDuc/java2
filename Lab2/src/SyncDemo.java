public class SyncDemo {
    public static void main(String[] args) {
        final Countter countter = new Countter();

        Runnable count1 = new Runnable() {
            @Override
            public void run() {
                countter.count();
            }
        };

        Runnable count2 = new Runnable() {
            @Override
            public void run() {
                countter.countDown();
            }
        };




        new Thread(count1).start();
        new Thread(count2).start();

        System.out.println("------------------------------");

//        synchronized (countter){
//            countter.count();
//
//        }
//        synchronized (countter){
//            countter.countDown();
//        }
    }
}
