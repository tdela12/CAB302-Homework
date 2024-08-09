package obstacles;

public interface Obstacle {
    char getSymbol();
    boolean isLocationObstructed(int x, int y);
}
