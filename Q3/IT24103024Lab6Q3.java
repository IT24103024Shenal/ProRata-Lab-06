import java.util.Scanner;

public class IT24103024Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SENTINEL = -99;
        int sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number != SENTINEL) {
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares += number * number;
                count++;
            }
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        double rms = Math.sqrt((double) sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}