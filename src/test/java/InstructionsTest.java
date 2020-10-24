import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstructionsTest {

    @Nested
    public class testCreateNewInstructions {

        @Test
        public void testCreateNewInstructionSuccessful() {

            Instructions instructions = new Instructions("LMLMLMLMM");

            List<Instruction> expectedInstructions = Arrays.asList(
                    Instruction.L, Instruction.M, Instruction.L, Instruction.M,
                    Instruction.L, Instruction.M, Instruction.L, Instruction.M,
                    Instruction.M
            );

            int i = 0;
            while (instructions.hasNext()) {
                assertEquals(expectedInstructions.get(i), instructions.next());
                i++;
            }

        }

        @Test
        public void testCreateNewInstructionFailure() {
            assertThrows(IllegalArgumentException.class, () -> new Instructions("DDD"));
        }

    }

    @Test
    public void testInstructionExecuteL() {
        Coordinate coordinate = new Coordinate(1, 2);

        Rover rover = new Rover(coordinate, Direction.N);

        Instruction instruction = Instruction.L;

        instruction.execute(rover);

        assertEquals(Direction.W, rover.getDirection());
    }

    @Test
    public void testInstructionExecuteR() {
        Coordinate coordinate = new Coordinate(1, 2);

        Rover rover = new Rover(coordinate, Direction.N);

        Instruction instruction = Instruction.R;

        instruction.execute(rover);

        assertEquals(Direction.E, rover.getDirection());
    }

    @Test
    public void testInstructionExecuteM() {
        Coordinate coordinate = new Coordinate(1, 2);

        Rover rover = new Rover(coordinate, Direction.N);

        Instruction instruction = Instruction.M;

        instruction.execute(rover);

        assertEquals(new Coordinate(1, 3), rover.getCoordinate());
    }
}