public class Main {
    public static void main(String[] args) {

        double result = 0;

        for (int i = 1; i < 1000000000; i++) {
            System.out.println(1 + result);
            result += 1 / (Factorial(i));
        }

    }

    public static double Factorial(int a){
        double result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }

        return result;
    }
}
