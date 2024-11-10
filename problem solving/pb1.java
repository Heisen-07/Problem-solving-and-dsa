import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        int basicSalary = scanner.nextInt();
        System.out.print("Enter the grade (A/B/C): ");
        char grade = scanner.next().charAt(0);
        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double pf = 0.11 * basicSalary;
        double totalSalary = basicSalary + hra + da + allow - pf;
        int roundedSalary = (int) Math.round(totalSalary);
        System.out.println("The total salary is: " + roundedSalary);
        scanner.close();
    }
}