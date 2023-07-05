package TheHomeBuilder;

import java.awt.*;
import java.util.ArrayList;

public class Architect {
    public static void main(String[] args) {
      ArrayList<Room> rooms = new RoomListBuilder().addList()
              .addRoom().setFloorNumber(2).addRoomToList()
              .addRoom().setFloorNumber(1).addRoomToList()
              .buildList();
    }//end main
}//end class

