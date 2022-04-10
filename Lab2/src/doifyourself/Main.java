package doifyourself;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{



    public static void main(String[] args) {


        List<TaskList> taskLists = new ArrayList<>();

        String task = "1. xây nhà";
        String task2 = "2. Đảo vữa";
        String task3 = "3. khuân gạch";
        String task4 = "4. đào móng";
        taskLists.add(new TaskList(task));
        taskLists.add(new TaskList(task2));
        taskLists.add(new TaskList(task3));
        taskLists.add(new TaskList(task4));


    }
}
