package obstacles;

import common.Location;

/*
* Represents a guard on a map
*/
public class Guard extends LocatableObstacle {

    /*
    * Constructs a new Guard object with the given location
    * @param location
    */
    public Guard(Location location) {
        super(location);
    }

    /*
    * */
    @Override
    public boolean isLocationObstructed(int x, int y) {
        return location.getX() == x && location.getY() == y;
    }

    @Override
    public char getSymbol() {
        return ObstacleType.GUARD.getSymbol();
    }

    public static Guard parse(String arg) {
        Location location = Location.parse(arg);
        return new Guard(location);
    }
}
