class Inches {
    public static void main (String args[]) {
        long cubicInches, inchesPerMile;
        
        // Compute inches per mile
        inchesPerMile = 5280 * 12;

        // Compute the number of cubic inches.
        cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;

        System.out.println("There are "+cubicInches+" cubicInches in a cubic mile.");
    }
}