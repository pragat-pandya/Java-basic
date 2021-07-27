/**
 * Claculate the distance from the lightning given the speed of sound(1100ft/s) and delay between 
 * visual of lightning and sound.
 */
class Sound {
    public static void main(String args[]) {
        double interval = 7.2, distance = interval * 1100;
        System.out.println("The lightning was " + distance + " feets away from you.");
    }
}