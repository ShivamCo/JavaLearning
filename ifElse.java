public class ifElse {
    public static void main(String[] args) {

        int age = 50;

        if (age >= 18) {

            if (age > 100) {
                System.out.println("You are over aged.");
            } else {
                System.out.println("You can vote.");
            }
        } else {
            System.out.println("You can't vote.");
        }


    }
}
