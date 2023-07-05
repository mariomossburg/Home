package TheHomeBuilder;

import java.awt.*;

//telescoping constructor pattern is too complex: multiple constructors. The size is exponential
//TheHomeBuilder.Builder pattern is better alternative

public class Room {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;


    public Room(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors){
        this.dimensions=dimensions;
        this.ceilingHeight=ceilingHeight;
        this.floorNumber=floorNumber;
        this.wallColor=wallColor;
        this.numberOfWindows=numberOfWindows;
        this.numberOfDoors=numberOfDoors;
    }

}//end class
