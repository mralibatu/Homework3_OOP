import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hoursInWeek = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hourlyPayRate * hoursInWeek;
        double federalWithholding = hourlyPayRate * hoursInWeek * federalTaxRate;
        double stateWithholding = hourlyPayRate * hoursInWeek * stateTaxRate;
        double totalTax = federalWithholding + stateWithholding;
        System.out.println();
        System.out.println("Employee Name : " + name);
        System.out.println("Hours worked : " + hoursInWeek);
        System.out.println("Pay rate : $" + hourlyPayRate);
        System.out.println("Gross Pay : $" + grossPay);
        System.out.printf("Deductions %n  " +
                "Federal Withholding (%2.1f): $%5.2f %n " +
                " State Withholding (%2.1f): $%5.2f %n" +
                "  Total Deduction : $%5.2f %n", (federalTaxRate * 100),(federalWithholding),
                (stateTaxRate * 100),(stateWithholding),(stateWithholding+federalWithholding));
        System.out.printf("Net pay : $%5.2f", (grossPay - totalTax));

    }
}
