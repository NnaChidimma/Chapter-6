import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        try {

            int decimal = Integer.parseInt(binary, 2);


            System.out.println("Decimal representation of binary " + binary + " is: " + decimal);
        } catch (NumberFormatException e) {

            System.out.println("Invalid binary number. Please enter only 0s and 1s.");
        }
    }
}

