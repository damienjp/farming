/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farming;

/**
 * @author damienjp
 */
public class Type extends Validate {

    //herbs need to define which one
    private String name;


    //Herb subclass constructor
    public Type(String Type, int seedPrice, int collected, int farmLevel, int total) {
        super(seedPrice, collected, farmLevel, total);
        this.name = Type;
    }


    public class Herb extends Validate {
        public Herb(String herbType, int seedPrice, int collected, int farmLevel, int total) {
            super(seedPrice, collected, farmLevel, total);
            this.name = herbType;
        }

    }

    public class Trees extends Validate {
        public Trees(String treeType, int seedPrice, int collected, int farmLevel, int total) {
            super(seedPrice, collected, farmLevel, total);
            this.name = treeType;
        }

    }

}
