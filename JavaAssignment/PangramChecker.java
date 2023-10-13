import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkIfPangram(String text) {
        int[] letterCount = new int[26];

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letterCount[c - 'a']++;
            }
        }

        for (int count : letterCount) {
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}
