public class Mars {

    private final Coordinate upperBound;

    public Mars(Coordinate upperBound) {
        this.upperBound = upperBound;
    }

    public boolean isValidCoordinate(Coordinate coordinate) {
        return coordinate.isInBound(upperBound);
    }
}
