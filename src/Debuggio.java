/*This is a debugging program where it fixes issues with an io program. */
import java.util.Scanner;
public class Debuggio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your DOB year: ");
        int dob = input.nextInt();
        System.out.println("\nSummary: " + "Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}