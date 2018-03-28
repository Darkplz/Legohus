
package FunctionLayer;

import java.util.ArrayList;

public class BrickFactory {

    private static ArrayList<Brick> Bricks;
    
    public BrickFactory(ArrayList<Brick> Bricks) {
        Bricks.add(new Brick(1,1,2,1));
        Bricks.add(new Brick(2,1,2,2));
        Bricks.add(new Brick(4,1,2,4));
        this.Bricks = Bricks;
    }

}
