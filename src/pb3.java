import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char userInput = scanner.next().toLowerCase().charAt(0);
        if (Character.isLetter(userInput)) {
            if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') {
                System.out.println(userInput + " is a vowel.");
            } else {
                System.out.println(userInput + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid alphabet.");
        }
        scanner.close();
    }
}
