public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void rotateLeft() {
        direction = direction.rotate(false);
    }

    public void rotateRight() {
        direction = direction.rotate(true);
    }

    public void move() {
        coordinate = direction.move(coordinate);
    }
}
