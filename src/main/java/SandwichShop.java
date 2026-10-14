import java.util.*;

public class SandwichShop {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print ("Would you like a regular or large sandwich? ");
        String sizeSandwich = myScanner.nextLine();

        if (sizeSandwich == "regular") {
            double basePrice = 5.45;
            System.out.println("You will have to pay: $ " + basePrice);
        } else{
            double basePrice = 8.95;
            System.out.println("You will have to pay: $ " + basePrice);

        }

        Scanner newScanner = new Scanner(System.in);
        System.out.print ("How old are you? ");
        int userAge = myScanner.nextInt();

        if (userAge <= 17) {
            System.out.print ("You will receive a 10% discount.");
        } else if (userAge >= 65){
            System.out.print ("You will receive a 20% discount.");

        } else{
            System.out.print ("No discount for you boo!");

        }



    }
}
