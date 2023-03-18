import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int int1 = input.nextInt();
        System.out.print("Enter second integer : ");
        int int2 = input.nextInt();
        int gcd = 1;

        for (int i = 1; i<= int1 && i <= int2; i++) {       //Check if each number is divisible by both
            if(int1 % i == 0 && int2 % i == 0){
                gcd = i;
            }
        }

        System.out.println("The greatest common divisor for " + int1 +" and " + int2 + " is " + gcd);

    }
}
