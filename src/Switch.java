import java.util.Scanner;

public class Switch {


    public static void Switch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter 1, 2, 3, 4, 5, 6, or 7");
        int switchValue = scan.nextInt();

        switch (switchValue) {
            case 1:
                System.out.println("Value entered was 1");
                break;
            case 2:
                System.out.println("Value entered was 2");
                break;
            case 3:
                System.out.println("Value entered was 3");
                break;
            case 4:
                System.out.println("Value entered was 4");
                break;
            case 5: case 6: case 7:
                System.out.println("Value entered was a 5, or a 6, or a 7");
                System.out.println("More precisely, it was a " + switchValue);
                break;
            default:
                System.out.println("\nInvalid entry");
                Switch();
        }
    }

}
