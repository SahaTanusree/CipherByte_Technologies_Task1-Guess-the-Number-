import java.util.*;

class GuassingTheNumber {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        int ran = rm.nextInt(100);
        int count = 0;
        System.out.println("Limit is: 10");
        while (count < 10) {
            System.out.print("Enter a number(0-100):");
            int n = sc.nextInt();
            if (ran == n) {
                System.out.println("You win\n you choose a correct number.....");
                System.out.println("The Random number you are Guessing in " + count + " trial");
                System.out.println("Your Score is:" + (10 - count) + " Out of 10");
                break;
            } else if (ran > n)
                System.out.println("Choose a Higher number...");
            else
                System.out.println("Choose a Lower number...\"");
            count++;
            System.out.println("You have done the " + count + " Guessing");
            System.out.println("The Chance of Guessing:" + (10 - count));
            if (count == 10) {
                System.out.println("Your Limit is Exceed....");
            }
            System.out.println("\n");
        }
    }
}