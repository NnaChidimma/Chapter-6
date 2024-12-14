import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();

        try {
            int decimal = Integer.parseInt(hexadecimal, 16);


            System.out.println("Decimal representation of " + hexadecimal + " is: " + decimal);
        } catch (NumberFormatException e) {

            System.out.println("Invalid hexadecimal number. Please enter a valid hexadecimal value.");
        }
    }
}

