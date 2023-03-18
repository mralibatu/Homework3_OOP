import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter tuition amount: ");
        double tuitionAmount = input.nextDouble();
        System.out.print("Enter yearly increase percentage: ");
        double yearlyIncreasePer = input.nextDouble();

        double result = tuitionAmount;
        int year = 0;
        while (result < tuitionAmount * 2){

            result *= 1 + (yearlyIncreasePer / 100);
            year++;
        }

        System.out.println("\nTuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %d years",result,year);

    }
}
