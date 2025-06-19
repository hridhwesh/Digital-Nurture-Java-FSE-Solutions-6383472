import java.util.Scanner;

public class Financial{
    /*  Recursive method to calculate future value using compound interest.
        Future value =  Present Value * (1+r)^n 
    */
    public static double calculateFutureValue(double present, double growth, int years){
        if (years ==0){
            return present;
        }
        return calculateFutureValue(present*(1+growth), growth, years-1);
    }

    //Main function
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the growth percentage: ");
        double growthPercentage = sc.nextDouble();
        double growthRate = growthPercentage/100.0;

        System.out.println("Enter the number of years: ");
        int n = sc.nextInt();

        double finalValue = calculateFutureValue(principal, growthRate, n);

        System.out.printf("Predicted future value after %d years: %.2f.", n , finalValue);

        sc.close();
    }
}