import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare Scanner named "keyboard" to read input from user
        Scanner keyboard = new Scanner(System.in);

        //prompt user to enter address
        System.out.print("Please enter name and address (in correct format): ");

        //declare and initialize variables from user's input
        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();

        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();

        //display inputs
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
