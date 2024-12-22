import java.util.Scanner;

public class swith {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Day: ");
        String day = sc.nextLine();

        switch (day){
            case "Monday" :
                System.out.println("Day 1");
                break;
            case "Tuesday":
                System.out.println("Day 2");
                break;

            default:
                System.out.println("Invalid Input.");

        }

    }
}
