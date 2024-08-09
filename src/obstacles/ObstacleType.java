package obstacles;

/*
* Represents the types of obstacles that can be on the map
*/
public enum ObstacleType {
    GUARD("g", 'g');
    private final String argumentName;
    private final char symbol;

    /*
    * ObstacleType is initialised with a given argument name and flag
    * @param argumentName the argument name of the obstacle type
    * @param symbol the flage of the obstacle type
    * */
    ObstacleType(String argumentName, char symbol) {
        this.argumentName = argumentName;
        this.symbol = symbol;
    }

    /*
    * Returns the argument name of the obstacle type
    * @return The argument name of the obstacle type
    * */
    public String getArgumentName() {
        return argumentName;
    }

    /*
    * Returns the symbol of the obstacle type
    * @return The symbol of the obstacle type
    * */
    public char getSymbol() {
        return symbol;
    }
}
