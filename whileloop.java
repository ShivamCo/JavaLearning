import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        int i = 0;

        while(i<5){
            System.out.println(i);
            i++;

        }

        Scanner sc = new Scanner(System.in );
        int finalNumber = 10;
        System.out.println("Enter you initial number: ");
        int initalNumber = sc.nextInt();

        while(initalNumber < finalNumber){
            initalNumber++;
            System.out.println(initalNumber);
        }


    }
}
