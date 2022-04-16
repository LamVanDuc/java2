package Exercise3;

public class Word {
    private String value;
    private int position;
    public Word(String v , int p){
        value = v;
        position=p;
    }
    public int getPosition(){
        return position;
    }
    public String getValue(){
        return value;
    }
}
