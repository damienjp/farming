package farming;

/**
 * Created with IntelliJ IDEA.
 * User: damienjp
 * Date: 8/13/12
 * Time: 12:32 AM
 */

//@todo need to recheck code as i learn more :o


// Creates  Type Class

public class Type {
    public int type;
    private String name;

    //Creates Type constructor
    public Type(int type, String name) {
        this.type = type;
        this.name = name;

    }

    // returns type
    public int returnType() {
        return type;
    }

    // returns name
    public String returnName() {
        return name;
    }

    // Starts subclass and prints results
    public void printArray() {
        if (type > 3) {
            System.out.println("System Error");
        } else {
            GetArrayType type = this.new GetArrayType();

            System.out.println(type.GetType());
        }
    }

    //subclass
    private class GetArrayType {

        //declare variables
        String kind;
        String[] types = {"Herbs", "Trees", "Fruit Trees"};

        int aLength = types.length;

        //method for cycling through array
        public String GetType() {
            for (int i = 0; i < aLength; i++) {
                for (int j = 0; j < type; j++) {
                    kind = types[j];
                }

            }

            return kind;
        }

    }


}



