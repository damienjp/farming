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

        //creates objects
        Type herb1 = new Type(4, "Ranarr");
        Type type1 = new Type(2, "Magic Tree");
        Type tree = new Type(3, "Papaya");

        //prints test object
        System.out.println(title + version);
        System.out.println('\n');

        //TESTING
        System.out.println("Class: " + herb1.returnType() + " Name : " + herb1.returnName());
        System.out.println('\n');

        // MORE TESTING
        tree.printArray();
        type1.printArray();
        herb1.printArray();


    }
}
