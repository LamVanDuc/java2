package Excercise4;
class Pair<T>{
    public Pair(){
        first = null ; second = null;
    }
    public Pair(T first , T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    private T first;
    private T second;
}
class ArrayAlg{
    /*
     Gets the minimum and maximum of an array of strings.
     @param a an array of strings
     @return a pair with the min and max value, or null if a is
     null or empty
     */

    public static Pair<String> mimax(String[] a){
        if (a ==null || a.length ==0)return null;
        String min = a[0];
        String max = a[0];
        for (int i =0 ; i<a.length ; i++){
            if (min.compareTo(a[i]) > 0){
                min=a[i];
            }
            if (min.compareTo(a[i]) < 0){
                max=a[i];
            }
        }
        return new Pair<String>(min,max);
    }

}


public class PairTest1 {
    public static void main(String[] args) {
        String[] words ={"Mary" ,"had" ,"a" , "little" ,"lamb"};

        Pair<String> mm = ArrayAlg.mimax(words);
        System.out.println("min = " +mm.getFirst());
        System.out.println("max = " +mm.getSecond());
    }
}
