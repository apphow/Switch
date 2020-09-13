import java.util.Scanner;

public class SwitchChar {

    public static void SwitchChar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter a letter of the alphabet.");
        String switchChar = scanner.next();

        switch(switchChar) {

            case "A": case "a": case "B": case "b": case "C": case "c":
            case "D": case "d": case "E": case "e": case "F": case "f":
            case "G": case "g": case "H": case "h": case "I": case "i":
            case "J": case "j": case "K": case "k": case "L": case "l":
            case "M": case "m": case "N": case "n": case "O": case "o":
            case "P": case "p": case "Q": case "q": case "R": case "r":
            case "S": case "s": case "T": case "t": case "U": case "u":
            case "V": case "v": case "W": case "w": case "X": case "x":
            case "Y": case "y": case "Z": case "z":
                System.out.println("you entered " + switchChar);
                break;
            default:
                System.out.println("Oops, that's an invalid input!");
                SwitchChar();
        }
    }
}
