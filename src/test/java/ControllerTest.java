import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ControllerTest {

    @Nested
    public class TestExecute {

        @Test
        public void testExecuteScenarioOne() {

            Coordinate coordinate = new Coordinate(1, 2);

            Rover rover = new Rover(coordinate, Direction.N);

            Coordinate upperBound = new Coordinate(5, 5);

            Mars mars = new Mars(upperBound);

            Controller controller = new Controller(mars, rover);

            Instructions instructions = new Instructions("LMLMLMLMM");

            controller.execute(instructions);

            assertEquals(new Coordinate(1, 3), rover.getCoordinate());
            assertEquals(Direction.N, rover.getDirection());

        }

        @Test
        public void testExecuteScenarioTwo() {

            Coordinate coordinate = new Coordinate(4, 4);

            Rover rover = new Rover(coordinate, Direction.N);

            Coordinate upperBound = new Coordinate(5, 5);

            Mars mars = new Mars(upperBound);

            Controller controller = new Controller(mars, rover);

            Instructions instructions = new Instructions("MMMMM");

            assertThrows(UnsupportedOperationException.class, () -> controller.execute(instructions));

        }

    }

}
