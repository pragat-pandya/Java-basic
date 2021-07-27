class IfStatement {
    public static void main (String args[]) throws java.io.IOException {
        int number;
        System.out.print("Please enter an integer between 0 to 9 followed by Enter: ");
        number = System.in.read(); // No need to cast char we intend it to be an integer.
        if (number % 2 == 0) System.out.println("It's an Even number.");
        else System.out.println("It's an Odd number.");
    }
}