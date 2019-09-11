import java.util.Scanner;
    //name of package

public class balance {

    public static void main( String[] args ) {

        int balance = 100;
        int amount = 0;
        String text = "";
        while (balance> 0) {
            text = "Your balance: \u0024" + balance + ".";
            text += "\nAmount to withdraw:";

            System.out.println(text);
            //user input
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            balance -= amount;

        }

        text = "Your balance is empty!";
        System.out.println("\nIt is now \u0024" + balance + ".");

        }
       // System.out.println(amount);

    }
