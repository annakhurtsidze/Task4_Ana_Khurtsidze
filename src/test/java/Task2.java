import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter character: ");

        String character = scanner.next();
        scanner.close();

        switch (character){
            case "a", "A":
                System.out.println("Vowel");
                break;
            case "e", "E":
                System.out.println("Vowel");
                break;
            case "i", "I" :
                System.out.println("Vowel");
                break;
            case "o", "O" :
                System.out.println("Vowel");
                break;
            case "u", "U" :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

}
