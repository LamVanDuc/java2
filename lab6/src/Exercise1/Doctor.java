package Exercise1;

import javax.print.Doc;

public class Doctor {
    private String name =" ";
    private int task = 0;
    public Doctor(String name,int task){
        this.name = name;
        this.task= task;
    }

    public Doctor(){}
    public int compareTo(Object obj){
        Doctor doc= (Doctor) obj;
        int a = 0;
        int b= 0;

        a = this.task;
        b = this.task;

        if (a<b){
            return -1;
        }
        if (a>b){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "\nThe Doctor is appointed for = " +name+ "\nThe prority for the appointment is = " +task;
    }

}
