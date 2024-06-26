import java.util.Scanner;
public class task3_hollowtriangle { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            // Print spaces for the left side of the triangle
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == length) {
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else { // Print stars only at the beginning and end of the middle rows
                System.out.print("*");
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            // Move to the next line after each row is printed
            System.out.println();
        }
        
        scanner.close();
        }
        
    
}

