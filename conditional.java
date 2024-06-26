import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("to check the person eligible to vote: ");
        System.out.print("Enter a age : ");
        int age= sc.nextInt();

        if(age >= 18) {
            System.out.println("eligible to vote: "+ age);
        } else {
            System.out.println(" Not eligible to vote: "+ age);
        }
        sc.close();
}
}