import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal representation of " + decimal + " is: " + hexadecimal);
    }
}

