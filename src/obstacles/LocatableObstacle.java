package obstacles;
import common.Location;

/*
* Represents an object that can be located on the map
*/
public abstract class LocatableObstacle implements Obstacle{
    protected final Location location;

    /*
    * Constructs a new LocatableObstacle with the given location
    * @param location the location of the obstacle
    */
    public LocatableObstacle(Location location){
        this.location = location;
    }

    /*
    *Constructs a new LocatableObstacle with the given x and y coordinates
    * @param x the x coordinate of the location
    * @param y the y coordinate of the location
    */
    public LocatableObstacle(int x, int y) {
        this.location = new Location(x, y);
    }

    /*
    * Returns the location of the LocatableObstacle
    * @return The location of the LocatableObstacle
    */
    public Location getLocation() {
        return location;
    }

    public abstract boolean isLocationObstructed(int x, int y);
    public abstract char getSymbol();
}
