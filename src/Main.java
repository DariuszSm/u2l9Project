import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String firstCoordRaw;
        String secondCoordRaw;
        int customX;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first Coordinate Point: ");
        firstCoordRaw = s.nextLine();
        System.out.println("Enter your second Coordinate Point: ");
        secondCoordRaw = s.nextLine();

        LinearEquation equation = new LinearEquation(firstCoordRaw, secondCoordRaw);
        System.out.println(equation);

        while (true) {
            System.out.println("\nEnter a custom X integer for the equation: ");
            customX = Integer.parseInt(s.nextLine());
            System.out.println(equation.solveForCustomX(customX));
        }

    }
}