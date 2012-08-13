/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farming;

/**
 * @author damienjp
 */
public class Herbs extends Validate {

    //herbs need to define which one
    private String name;


    public Herb(String herbType, int seedPrice, int collected, int farmLevel, int total) {
        super(seedPrice, collected, farmLevel, total);
        this.name = herbType;
    }

}


}
