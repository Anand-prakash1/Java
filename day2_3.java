import java.util.*; // Importing the utility package for the Scanner class

public class day2_3 {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a day number
        System.out.println("Enter a day number (1-7):");
        int day = sc.nextInt(); // Read the integer input

        // Switch statement to print the day of the week based on the number
        switch (day) {
            case 1: 
                System.out.println("Monday"); // If day is 1, print Monday
                break; // Exit the switch statement
            case 2:
                System.out.println("Tuesday"); // If day is 2, print Tuesday
                break;
            case 3:
                System.out.println("Wednesday"); // If day is 3, print Wednesday
                break;
            case 4:
                System.out.println("Thursday"); // If day is 4, print Thursday
                break;
            case 5:
                System.out.println("Friday"); // If day is 5, print Friday
                break;
            case 6:
                System.out.println("Saturday"); // If day is 6, print Saturday
                break;
            case 7:
                System.out.println("Sunday"); // If day is 7, print Sunday
                break;
            default:
                // If the input is not 1–7, print "invalid day"
                System.out.println("Invalid day");
                break;
        }
    }
}