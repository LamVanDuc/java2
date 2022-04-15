package doifyourself;
import java.util.*;

public class Controller {

//    Add Students

    LinkedList<Student> student = new LinkedList<>();


    public void addStudent(){
        System.out.println("--------------Add Student--------------");
        try {
            System.out.print("\nEnter the Roll : ");
            int roll = (new Scanner(System.in)).nextInt();
                System.out.print("\nEnter the Name : ");
                String name = (new Scanner(System.in)).next();
                System.out.print("\nEnter the Age : ");
                int age = (new Scanner(System.in)).nextInt();
                System.out.print("\nEnter the Mark : ");
                float mark = (new Scanner(System.in)).nextFloat();
                if (mark <=100 && mark >=0) {
                    student.push(new Student(roll, name, age, mark));
                    System.out.println("Add Student success");
                }else {
                    System.out.println("The lowest point is 0 the highest is 100");
                    addStudent();
                }

            }catch (Exception ex){
            ex.printStackTrace();
        }


        }
    //    Update a Student
    public void updateStudent(){
        System.out.println("--------------Update Student--------------");
        System.out.println("Student Roll needs updating : ");
        String name = (new Scanner(System.in)).nextLine();
        for (Student std : student){
            if (name.equals(std.getName())){
                System.out.print("\nEnter the Name : ");
                String nameUpdate = (new Scanner(System.in)).next();
                System.out.print("\nEnter the Age : ");
                int ageUpdate = (new Scanner(System.in)).nextInt();
                System.out.print("\nEnter the mark : ");

                float mark = (new Scanner(System.in)).nextFloat();
                if (mark <=100 && mark >=0) {
                    std.setName(nameUpdate);
                    std.setAge(ageUpdate);
                    std.setMark(mark);
                    System.out.println("Update Student success");
                }else {
                    System.out.println("The lowest point is 0 the highest is 100");
                    addStudent();
                }
            }else{
                System.out.println("Not found student roll :" + name);
            }
        }

    }

    //    Delete a Student
    public void deleteStudent(){

        boolean count =false;
        System.out.println("Enter the name delete student: ");
        String name = (new Scanner(System.in)).nextLine();
        for (Student std : student){

            if (std.getName().equals(name)){
                count = true;
                System.out.println("delete success : " + student.remove(std));
                break;
            }
        }
        if (count == false){
            System.out.println("Not found \""+name+"\" in the list");
            deleteStudent();
        }
    }
//    Search Students

    public void searchStudent(){
        boolean checkSearch = false;
        System.out.println("Enter the name search student: ");
        String name = (new Scanner(System.in)).nextLine();
        int[] count ={0};
            System.out.printf("%-10s %-20s %-5s %-5s","Roll" , "Name" ,"Age" ,"Mark\n");
            student.forEach(std -> {

                if (std.getName().equals(name)){
                    count[0] = 1;
                    System.out.printf("%-10d %-20s %-5d %-5f\n",std.getRoll() ,std.getName() , std.getAge() , std.getMark());
                }
            });

            if(count[0] ==0) {
                System.out.println("Not found \""+name+"\" in the list");
                searchStudent();
            }
        }

//    Display All Students
    public void displayAllStudent(){
        student.forEach(std ->{
            System.out.println(std.toString());});
    }
//    Save to File
    public void saveToFile(){

    }
//    Load from File

    public void loadFormFile(){

    }
//            Exit








    public static void main(String[] args) {
        Controller controller  = new Controller();


        while (true){
            System.out.println("1. add student. ");
            System.out.println("2. Update student by name. ");
            System.out.println("3. Delete student by name. ");
            System.out.println("4. search student by name. ");
            System.out.println("5. Display All student.");
            System.out.println("6. Save to file.");
            System.out.println("7. Load from file.");
            System.out.println("8. Exit.");
            System.out.println("choice: ");
            int i = new Scanner(System.in).nextInt();
            switch (i){
                case 1:controller.addStudent();

                        break;
                case 2:controller.updateStudent();
                break;
                case 3:controller.deleteStudent();
                        break;
                case 4:controller.searchStudent();
                    break;
                case 5:controller.displayAllStudent();
                    break;
                case 6:
                    controller.saveToFile();
                    break;
                case 7:
                    controller.loadFormFile();
                    break;
                default: System.exit(1);

            }
        }

    }
}
