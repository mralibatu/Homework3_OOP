import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary digits: ");
        int binary = input.nextInt();
        int decimal = BinaryToDecimal(binary);

        System.out.println("The decimal values is " + decimal);
        
    }
    
    public static int BinaryToDecimal(int binary){
        char[] binaryArr = Integer.toString(binary).toCharArray();          //Let's convert Integer to CharArr
        int decimal = 0;
        for (int i = 0; i < binaryArr.length; i++) {
            decimal += Character.getNumericValue(binaryArr[i]) * Math.pow(2,binaryArr.length - 1 - i);      //Using the formula d0×2^0 + d1×2^1 + d2×2^2 + ...
        }
        return decimal;
    }
}
