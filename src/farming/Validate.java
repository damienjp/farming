/*
 * This is the Super Class for the farming sub-classes
 * 
 */
package farming;

/**
 * @author damienjp
 */
public class Validate {

    //declare stoof :D
    private int seedPrice;
    private int farmLevel;
    private int collected;
    private double total;

    // creates obj constructor //
    public Validate(int seedPrice, int collected, int farmLevel, int total) {
        this.seedPrice = seedPrice;
        this.farmLevel = farmLevel;
        this.collected = collected;
        this.total = total;
    }

    /* Simple test to theory
    * testing the creating and using of class's within classes or nested classes
    */
    //here is a nested class
    public static class Level {

        private int startLevel;

        {
            startLevel = 0;
        }

        public int returnLevel(int a) {
            startLevel = a;
            return startLevel;
        }

    }

    //returns seedprice
    public int getSeedPrice() {
        return seedPrice;
    }

    //returns farmlevel
    public int getFarmLevel() {
        return farmLevel;
    }

    public void collected(int collected) {
        this.collected = collected;
    }

    //returns collected
    public int getCollected() {
        return collected;
    }

    // returns the final price
    public double finalPrice() {
        return total * collected - seedPrice;
    }

}

    

