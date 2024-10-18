import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter the number between 1-50 ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(50)+1;
        int guess = scanner.nextInt();

        while(guess != randomNumber){
            guess = scanner.nextInt();
            if(guess > randomNumber){
                System.out.println("The guess was too high");
            } else if (guess < randomNumber) {
                System.out.println("The guess was too low");
            }else {
                System.out.println("You are correct");
            }
        }
    }
}
