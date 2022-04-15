package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoTreeSet {

    // implement Sorted Set

    public static void demo(){

       // SortedSet<String> sortedSet = new TreeSet<>();
        TreeSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("S") ;
        sortedSet.add("C") ;
        sortedSet.add("D") ;
        sortedSet.add("B") ;
        sortedSet.add("E") ;
        sortedSet.add("A") ;
        sortedSet.add("A") ;






        System.out.println("get first :" + sortedSet.first());
        System.out.println("get last : " + sortedSet.last());
        System.out.println(sortedSet);
        System.out.println("------------------------------------------");

        // get First and remove first
        System.out.println("Poll first: "+sortedSet.pollFirst());
        System.out.println(sortedSet);


        // get last and remove last
        System.out.println("Poll Last : "+sortedSet.pollLast());
        System.out.println(sortedSet);



    }

    public static void main(String[] args) {
        demo();
    }
}
