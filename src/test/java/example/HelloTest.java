package example;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testHi() {
        String message = new Hello().sayHi();
        assertEquals(message, "hi");
    }
}
