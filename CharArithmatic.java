class Chararithmatic {
    public static void main(String args[]) {
        char ch = 'X';
        // Print the character stored in ch
        System.out.println("The character is: "+ch);
        // Aplying increment operation on a character.
        ch++; // We can also perform decrement to change it to 'W' instead of 'Y'
        // Print this incremented character to console
        System.out.println("The character is now: "+ch);

        ch = 90; // Gives it the value 'Z' (From ASCII reference.)
        // Check the value stored in ch after this assignment operation in line 11
        System.out.println("The character is: "+ch);
    }
}