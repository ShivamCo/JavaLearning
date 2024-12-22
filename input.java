import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your age.");
//     int age = sc.nextInt();
//     System.out.println("Your age is "+ age);
        System.out.print("Enter Your First Number :");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Your Second Number :");
        int secondNumber = sc.nextInt();
        System.out.print("Result :");
        int result = firstNumber + secondNumber;

        System.out.println(result);
        sc.close();


    }
}
