import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the factorail no: ");
        int num = sc.nextInt();
       
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }

        System.out.println("Factorial of " + num + ": " + result);
        sc.close();
    }
}