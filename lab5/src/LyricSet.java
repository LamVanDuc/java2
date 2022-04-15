import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        Set words = new TreeSet();
        //Set words = new HashSet();
       // Set words = new LinkedHashSet();

        for (String w : lyric) {
            words.add(w);

            for (Object o : words)
                System.out.println(o + " ");


            System.out.println("----------------------");

            System.out.println("Contains [you]: " + words.contains("you"));
            System.out.println("Contains [me]: " + words.contains("me"));


        }
    }
}