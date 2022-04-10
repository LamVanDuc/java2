package guess_the_number;

import java.util.Scanner;

public class Client{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vui lòng nhập số cần đoán: ");
        int number = input.nextInt();

        Thread player1 = new GussTheNumber(number ,"Player1");
        Thread player2 = new GussTheNumber(number ,"Player2");

        player1.start();
        player2.start();
    }
}
