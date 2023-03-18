public class Main {
    public static void main(String[] args) {

        System.out.println("Perfect numbers are : ");
        for (int i = 1; i <= 10000; i++) {
            if(isPerfect(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isPerfect(int number){

        int temp = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                temp += i;
            }
        }

        return temp == number;
    }
}
