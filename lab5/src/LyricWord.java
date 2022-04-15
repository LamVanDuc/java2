import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWord {
    private static final String[] lyric = {"you","say","it" ,"best","when","you","say","nothing","at","all"};

    public static void main(String[] args) {
        List word = new ArrayList<>();

        for (String w : lyric){
            word.add(w);

            for (Object o : word)
                System.out.println(o+" ");

            System.out.println("-----------------------------------------------");

                System.out.println("Contains [you]?: "+word.contains("you"));
                System.out.println("Contains [me]?: "+word.contains("me"));
                System.out.println("Where's [Say]?: "+word.indexOf("say"));
                System.out.println("Where's the last [Say]?: "+word.lastIndexOf("say"));

            Collections.sort(word);
            for (Object o :word){
                System.out.println(o+" ");
            }
        }
    }
}
