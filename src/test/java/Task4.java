import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt() ;

        int i =0 ;
        int sum = 0;

        while(i <= inputNumber){
            if (i%2 == 0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
