import java.util.ArrayList;

public class ApplicationLambda
{
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Duc",20));
        personArrayList.add(new Person("Nam",22));
        personArrayList.add(new Person("Dung",19));
        personArrayList.add(new Person("Quy",24));
        personArrayList.add(new Person("Hung",34));
        personArrayList.add(new Person("Van",29));
        personArrayList.add(new Person("Anh",15));

        show(personArrayList);


        personArrayList.sort((Person p1 , Person p2) ->{
            return p1.getAge() - p2.getAge();
        });
        System.out.println("--------------------------------------");
        show(personArrayList);

    }
    public static void show(ArrayList<Person> personArrayList){
        personArrayList.forEach(person -> {
            System.out.printf(" %-5s %d \n",person.getName(),person.getAge());
        });
    }
}
