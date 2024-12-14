import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt(); // Read the user's input as an integer


        String binary = Integer.toBinaryString(decimal);


        System.out.println("Binary representation of " + decimal + " is: " + binary);
    }
}
