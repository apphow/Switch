import java.util.Scanner;

public class SwitchMonth {

    public static void switchMonth() {
        Scanner months = new Scanner(System.in);
        System.out.println("\nPlease enter a month.");

        String switchMonth = months.next();

        switch(switchMonth.toLowerCase()) {
            case "january":
                System.out.println("You entered January.");
                break;
            case "february":
                System.out.println("You entered February.");
                break;

            case "march": case "april": case "may": case "june": case "july":
            case "august": case "september": case "october": case "november": case "december":
                System.out.println("You entered " + switchMonth.substring(0, 1).toUpperCase() + switchMonth.substring(1).toLowerCase());
                break;
            default:
                System.out.println("Oops, invalid entry.");
            switchMonth();
        }
        switchMonth();
    }
}
