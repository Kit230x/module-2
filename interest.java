import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_COUNT = 5;  
        int count = 0; 
        double ave, min = 0, max = 0, total = 0;
        double interest = 0.2;

        System.out.println("=== Floating-Point Analyzer ===");
        System.out.println("Please input a total of " + MAX_COUNT + " numbers: ");

        while(count < MAX_COUNT) {
            System.out.println("Please enter value " + (count + 1) + ":");

            if (scanner.hasNextDouble()) {
                double currentValue = scanner.nextDouble();
                total += currentValue;

                if (count == 0) {
                    max = currentValue;
                    min = currentValue;
                } else {
                    if (currentValue > max) {
                        max = currentValue;
                    }
                    if (currentValue < min) {
                        min = currentValue;
                    }
                }
                count++; 
            } else { 
                System.out.println("ERROR: INVALID INPUT");
                scanner.next();
            }
        }

     ave = total / MAX_COUNT;
     interest = interest * total; 


    System.out.println("\n================ Results ================");
    System.out.printf("Total:                    $%,10.2f%n", total);
    System.out.printf("Average:                  $%,10.2f%n", ave);
    System.out.printf("Maximum:                  $%,10.2f%n", max);
    System.out.printf("Minimum:                  $%,10.2f%n", min);
    System.out.printf("Interest on Total (20%%):  $%,10.2f%n", interest);
    System.out.println("=========================================");

    scanner.close();

    }
}
