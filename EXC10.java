public class Main {
    public static void main(String[] args) {

        double result = 0;

        for (long i = 1; i < 1000000000; i++) {
            result += Math.pow(-1,i+1) / (2*i - 1);
            System.out.println(4 * result);
        }

    }
}
