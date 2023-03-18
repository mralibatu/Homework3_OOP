import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int magicNumber = rnd.nextInt(100);   //Create the magic number between 0 and 100.
        int inputAns = 0;

        System.out.println("Guess a magic number between 0 and 100!");

        do{
            System.out.print("Enter your guess: ");
            inputAns = input.nextInt();
            if(inputAns == magicNumber){
                break;
            }
            int compare = Integer.compare(inputAns,magicNumber);
            if(compare > 0){
                System.out.println("Your guess is too high");
            }else{
                System.out.println("Your guess is too low");
            }
        }while (true);

        System.out.println("Yes!! The number is " + magicNumber);
    }
}
