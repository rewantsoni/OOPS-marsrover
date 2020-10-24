import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsTest {

    @Nested
    public class TestIsValidCoordinate {

        @Test
        public void testIsValidSuccessful() {
            Mars mars = new Mars(new Coordinate(5, 5));
            assertTrue(mars.isValidCoordinate(new Coordinate(1, 2)));
        }

        @Test
        public void testIsValidFailure() {
            Mars mars = new Mars(new Coordinate(5, 5));
            assertFalse(mars.isValidCoordinate(new Coordinate(6, 2)));
        }

    }

}