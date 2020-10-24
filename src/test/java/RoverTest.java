import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    public void testRoverRotateLeft() {

        Coordinate coordinate = new Coordinate(1, 2);

        Rover rover = new Rover(coordinate, Direction.N);

        rover.rotateLeft();


        assertEquals(Direction.W, rover.getDirection());
    }

    @Test
    public void testRoverRotateRight() {

        Coordinate coordinate = new Coordinate(1, 2);

        Rover rover = new Rover(coordinate, Direction.N);

        rover.rotateRight();

        assertEquals(Direction.E, rover.getDirection());
    }

    @Nested
    public class testRoverMove {

        @Test
        public void testMoveSuccess() {
            Coordinate coordinate = new Coordinate(1, 2);

            Rover rover = new Rover(coordinate, Direction.N);

            rover.move();
            assertEquals(new Coordinate(1, 3), rover.getCoordinate());

            rover.rotateRight();
            rover.move();
            assertEquals(new Coordinate(2, 3), rover.getCoordinate());

            rover.rotateRight();
            rover.move();
            assertEquals(new Coordinate(2, 2), rover.getCoordinate());

            rover.rotateRight();
            rover.move();
            assertEquals(new Coordinate(1, 2), rover.getCoordinate());
        }

    }

}