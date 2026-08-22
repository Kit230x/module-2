import java.util.Scanner;

public class groceryBill {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a coupon amount as a decimal (e.g., .10): ");
        double coupon = scanner.nextDouble();

        while (coupon <= 0.0 || coupon > 1.0) {
            System.out.print("ERROR: Please enter a value between 0.0 and 1.0: ");
            coupon = scanner.nextDouble();
        }

        System.out.print("Enter Week 1 grocery bills: ");
        double week1 = scanner.nextDouble();

        System.out.print("Enter Week 2 grocery bill: ");
        double week2 = scanner.nextDouble();

        System.out.print("Enter Week 3 grocery bill: ");
        double week3 = scanner.nextDouble();

        System.out.print("Enter Week 4 grocery bill: ");
        double week4 = scanner.nextDouble();

        // Without Coupon
        double monthlyTotal = week1 + week2 + week3 + week4;
        double weeklyAvg = monthlyTotal / 4.0;

        // With Coupon
        double discountedMonthlyTotal = monthlyTotal * (1.0 - coupon);
        double discountedWeeklyAvg = discountedMonthlyTotal / 4.0;

        // Output results
        System.out.println("\n--- WITHOUT COUPON ---");
        System.out.printf("Monthly Total: $%.2f%n", monthlyTotal);
        System.out.printf("Weekly Average: $%.2f%n", weeklyAvg);
        
        System.out.printf("\n--- WITH COUPON (%.0f%%) ---%n", coupon * 100);
        System.out.printf("Monthly Total: $%.2f%n", discountedMonthlyTotal);
        System.out.printf("Weekly Average: $%.2f%n", discountedWeeklyAvg);

        scanner.close();
    }
}