package exceptions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FourSevenTest {
    @Test
    public void exampleTests() {
        assertEquals(FourSeven.fourSeven(7), 4);
        assertEquals(FourSeven.fourSeven(4), 7);
        assertEquals(FourSeven.fourSeven(9), 0);
    }
}