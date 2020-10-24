import java.util.Objects;

public class Coordinate {

    private final int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate getOneUp() {
        return new Coordinate(x, y + 1);
    }

    Coordinate getOneDown() {
        return new Coordinate(x, y - 1);
    }

    Coordinate getOneLeft() {
        return new Coordinate(x + 1, y);
    }

    boolean isInBound(Coordinate bound) {
        return x <= bound.x && y <= bound.y;
    }

    Coordinate getOneRight() {
        return new Coordinate(x - 1, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
