class IfElseIf {
    public static void main (String args[]) throws java.io.IOException {
        System.out.print("Please enter a character: ");
        char ch = (char) System.in.read();
        if (ch == '!') System.out.println("The character is an exclamation mark!");
        else if (ch == '.') System.out.println("The character is a full-stop.");
        else System.out.println("Sorry! I don't recognize this character.");
    }
}