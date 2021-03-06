package Exercise1;

import javax.print.Doc;
import java.util.PriorityQueue;

public class AppointDoctor {
    public AppointDoctor(){}

    public static void main(String[] args) {
        PriorityQueue<Doctor> pq = new PriorityQueue<Doctor>();

        Doctor Cardiologist = new Doctor("Casuality",1);
        Doctor Gynecologist = new Doctor("Surgery",2);
        Doctor Paediatric = new Doctor("Routine Check-up",3);

        //Adding Doctor object to the Queue
        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediatric);


        //remove the element from the Queue as per their priorities
        while(!pq.isEmpty()){
            //Displaying the header information
            System.out.println("\nAppointing doctors based on their priorities:");
            System.out.println("***************************************************");

            //removing the Doctors as per their priorities
            Doctor doctor = ((Doctor) pq.remove());


            //Invoking the toString() method
            System.out.println(doctor.toString());
        }
    }
}
