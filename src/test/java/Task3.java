import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int value = scanner.nextInt();
            scanner.close();

            for (int i=1; i<=10; i++){
                System.out.println(value + " x " + i +" = " + value*i);
            }
        }
    }

