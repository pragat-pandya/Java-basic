class CharInp {
    public static void main(String args[]) throws java.io.IOException { 
        char ch;
        System.out.print("Press a key followed by Enter: ");
        // Read the character enter by the user using read().
        ch = (char) System.in.read();   // Have to cast it to char because it's an integer by default.
        System.out.println("The character you entered is: "+ch);
    }
}