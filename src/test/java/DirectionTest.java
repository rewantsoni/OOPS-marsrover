import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Nested
    public class TestRotate {

        @Test
        public void testRotateRightFromNorth() {
            assertEquals(Direction.E, Direction.N.rotate(true));
        }

        @Test
        public void testRotateLeftFromNorth() {
            assertEquals(Direction.W, Direction.N.rotate(false));
        }

        @Test
        public void testRotateRightFromSouth() {
            assertEquals(Direction.W, Direction.S.rotate(true));
        }

        @Test
        public void testRotateLeftFromSouth() {
            assertEquals(Direction.E, Direction.S.rotate(false));
        }

        @Test
        public void testRotateRightFromEast() {
            assertEquals(Direction.S, Direction.E.rotate(true));
        }

        @Test
        public void testRotateLeftFromEast() {
            assertEquals(Direction.N, Direction.E.rotate(false));
        }

        @Test
        public void testRotateRightFromWest() {
            assertEquals(Direction.N, Direction.W.rotate(true));
        }

        @Test
        public void testRotateLeftFromWest() {
            assertEquals(Direction.S, Direction.W.rotate(false));
        }
    }

    @Test
    public void testMove() {

        Coordinate coordinate = new Coordinate(1, 2);

        assertEquals(new Coordinate(1, 3), Direction.N.move(coordinate));
        assertEquals(new Coordinate(1, 1), Direction.S.move(coordinate));
        assertEquals(new Coordinate(2, 2), Direction.E.move(coordinate));
        assertEquals(new Coordinate(0, 2), Direction.W.move(coordinate));

    }

}