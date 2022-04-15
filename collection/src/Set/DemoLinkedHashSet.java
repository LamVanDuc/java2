package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

//implement set interface ;
// chi chua 1 phan tu duy nhat(ko co phan tu trung lap);
// cho phep cac phan tu null
//dam bao thu tu chen

public class DemoLinkedHashSet {
    public static void demo(){
        LinkedHashSet<String> linkedHashSet  = new LinkedHashSet<>();
       // Set<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("Anh");

        linkedHashSet.add("Hung");
        linkedHashSet.add("Van");
        linkedHashSet.add("Trinh");
        linkedHashSet.add("Huong");
        linkedHashSet.add("Duc");

        System.out.println("List character in actors: ");
        System.out.println(linkedHashSet);

        linkedHashSet.add("Hung");
        linkedHashSet.add("Nam");


        System.out.println("Size of LinkedHashSet: "+linkedHashSet.size());
        System.out.println("original LinkedHashSet : "+linkedHashSet);

        System.out.println("after removing Linh from the  LinkedHashSet  : "+linkedHashSet.remove("Trinh"));
        System.out.println("after removing Linh not in the  LinkedHashSet: "+linkedHashSet.remove("Tuyet"));

        System.out.println("Contains Hung from the LinkedHashSet : "+linkedHashSet.contains("Hung"));

        Iterator<String> i = linkedHashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        //for each

        System.out.println("------------------- for each -------------------");

        for (String  e : linkedHashSet){
            System.out.println(e+ " , ");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
