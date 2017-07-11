import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Input

        Scanner scan = new Scanner(System.in);
        double length;
        double width;
        double height;
        double area;
        double perimeter;
        double volume;
        String letterToContinue;

        do {
            System.out.print("Enter classroom length: ");
            length = scan.nextDouble();
            scan.nextLine();

            System.out.print("Enter classroom width: ");
            width = scan.nextDouble();
            scan.nextLine();

            System.out.print("Enter classroom height: ");
            height = scan.nextDouble();
            scan.nextLine();

            // Processing
            area = length * width;
            perimeter = 2 * (length + width);
            volume = length * width * height;

            // Output
            System.out.println("Area of your classroom is: " + area);
            System.out.println("Perimeter of your classroom is: " + perimeter);
            System.out.println("Volume of your classroom is: " + volume);
            System.out.println();

            System.out.println("Would you like to continue? Y/N ");

            letterToContinue = scan.next().toUpperCase();

        } while (letterToContinue.equals("Y"));


    }
}
