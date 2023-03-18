import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int firstNumber = rnd.nextInt(10);
        int secondNumber= rnd.nextInt(10);      //Create numbers between 0 and 10.
        int answer = firstNumber + secondNumber;

        int inputAns = 0;
        do{
            System.out.println("What is " + firstNumber + " + " + secondNumber + "?");
            inputAns = input.nextInt();

            if(inputAns != answer){
                System.out.println("Wrong answer. Try again.");
            }

        }while (inputAns != answer);        //If answer doesn't right, keep asking.

        System.out.println("You got it!");
    }
}
