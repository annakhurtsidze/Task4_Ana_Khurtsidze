import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your score between 0-100");
        int score = scanner.nextInt();

        scanner.close();

        if (score >=90 && score <=100){
            System.out.println("Your grade is A");
        }else if(score >=80 && score < 90){
            System.out.println("Your grade is B");
        } else if (score >=70 && score < 80) {
            System.out.println("Your grade is C");
        } else if (score >=60 && score < 70) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }
    }
}
