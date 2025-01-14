
import java.util.Scanner;

public class CheckConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        double d = sc.nextDouble();
        String s = sc.nextLine();
    }
    
}
