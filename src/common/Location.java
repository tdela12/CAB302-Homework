package common;

import java.util.Objects;

/*
* Represents a location on the map
* */
public class Location {
    private final int x;
    private final int y;

    /*
    * Location is initialised with an x and y coordinate
    * @param x the x coordinate
    * @param y the y coordinate
    */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
    * Returns the x coordinate of the location.
    */
    public int getX() {
        return x;
    }

    /*
    * Returns the y coordinate of the location
    */
    public int getY(){
        return y;
    }

    /*
    * Return whether a given location is equal to this location
    * @param obj the object to compare to
    * @return true if the given location is equal to this location, false otherwise
    * */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return x == location.x && y == location.y;
    }

    /*
    * Return the hash code of this location
    * @return The hash code of this location
    */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /*
    * Returns a string representation of this location
    * @return a string representation of this location
    */
    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y  +
                "}";
    }

    /*
    * Parses a given string input into a location
    * @param s the input string
    * @return the parsed location*/
    public static Location parse(String s) {
        String[] parts = s.split(",");
        return new Location(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}
