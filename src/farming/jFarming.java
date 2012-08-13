package farming;

/**
 * Created with IntelliJ IDEA.
 * User: damienjp
 * Date: 8/12/12
 * Time: 10:35 PM
 */


public class jFarming {
    // Declare static final title & version


    static final double version = 0.1;
    static final String title = "Welcome to jFarm Calculator v";


    public static void main(String[] args) {
        Herbs herb = new Herbs("Ranarr", 2323, 0, 32, 0);

        herb.collected(1200);
        double total = herb.finalPrice();

        //test objects nested classes
        Validate.Level testing = new Validate.Level();

        //part of above test
        int test = testing.returnLevel(herb.getSeedPrice());

        //prints test object
        System.out.println(title + version);
        System.out.println('\n');


        System.out.println("Currently have a : " + herb.getHerbName() + " Which costs : " + herb.getSeedPrice() + " And you collected : " + herb.getCollected());
        System.out.println("For a grand total : " + total + "\n");
        System.out.println("testing something " + test);


    }
}
