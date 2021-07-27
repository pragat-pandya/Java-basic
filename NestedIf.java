// In order to use Scanner class.
import java.util.*;
class NestedIf {
    public static void main(String args[]) {
        // Creating an instance of Scanner class with System input stream.
        Scanner inp_scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        // Reading in the value as an integer using nextInt(): from system input stream.
        int inp = inp_scanner.nextInt();
        
        // Following is the nested if with if-else-if ladder.
        if (inp > 0) {
            if (inp % 2  == 0) System.out.println("It's a positive and Even integer.");
            else System.out.println("It's a positive and Odd integer.");
        }
        else if (inp < 0) {
            if (inp % 2 == 0) System.out.println("It's a negative and Even integer.");
            else System.out.println("It's a negative and Odd integer.");
        }
        else System.out.println("You have inputted the zero!");
    }
}