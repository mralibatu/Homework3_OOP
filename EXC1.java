import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int number = rnd.nextInt(1000 - 99) + 99;      //To generate number between 100 - 999

        System.out.println("Number : " + number);
        System.out.println("Enter your guess: ");
        int guess = input.nextInt();
        int result = CheckSimilarity(guess,number);
        switch (result){
            case 0:
                System.out.println("There are no matches, you lost!");
                break;
            case 1:
                System.out.println("1 match but unfortunately no award");
                break;
            case 2:
                System.out.println("You won 1,000 TL !!!!");
                break;
            case 3:
                System.out.println("All digits match!! \nYou won 3,000TL!!!");
                break;
            case 4:
                System.out.println("!!EXACTLY MATCHES!!\n!!You won 10,000TL!!");
                break;

        }
    }

    public static int CheckSimilarity(int guess, int number){
        if(guess == number){
            return 4;
        }
        char[] guessArr = Integer.toString(guess).toCharArray();
        char[] numberArr = Integer.toString(number).toCharArray();    //To use numbers like an array

        int similarity = 0;
        for (int i = 0; i < guessArr.length; i++) {
            for (int j = 0; j < numberArr.length; j++) {
                if(guessArr[i] == numberArr[j]){
                    similarity++;
                    //System.out.println("Guess : " + guessArr[i] + " Number : "+numberArr[j]);     If you want to check which numbers are selected
                    guessArr[i] = '-';
                    numberArr[j] = '+';     //To delete used numbers 'cause it can count two times
                }
            }
        }
        return similarity;
    }
}
