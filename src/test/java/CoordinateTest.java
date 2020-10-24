import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Nested
    public class TestIsInBound {

        @Test
        public void testIsInBoundTrue() {
            Coordinate coordinate = new Coordinate(1, 2);
            assertTrue(coordinate.isInBound(new Coordinate(5, 5)));
        }

        @Test
        public void testIsInBoundFalse() {
            Coordinate coordinate = new Coordinate(6, 2);
            assertFalse(coordinate.isInBound(new Coordinate(5, 5)));
        }

    }

}