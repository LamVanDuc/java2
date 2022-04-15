package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {


    public static void demoHashSet(){
        HashSet<String> hashSet = new HashSet<>();
       // add value
        hashSet.add("vietnamese");
        hashSet.add("vietnamese");
        hashSet.add("India");
        hashSet.add("China");
        hashSet.add("Australia");
        hashSet.add("American");
        hashSet.add("South Africa");


        System.out.println(hashSet);

        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("Mexico");

        System.out.println("---------------------------------");

        System.out.println(hashSet);

        System.out.println("---------------------------------");
        System.out.println("List contains India or not: "+ hashSet.contains("India"));
        // hashSet.contains("India");// check data

        System.out.println("---------------------------------");
        //Removing item from HashSet using remove() return true and false ;
        System.out.println("Remove Australia :"+hashSet.remove("Australia"));

        System.out.println("Hash Set after removing Australia: "+hashSet);

        Iterator<String> i = hashSet.iterator();
        // hasNext lap trong danh sach den khi nao het phan tu thi thoi.
        System.out.println("Interating over list: ");
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // for each
        System.out.println("---------------------------------");
        System.out.println("Using for each: ");
        for (String s : hashSet){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        demoHashSet();
    }

}
