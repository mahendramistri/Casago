import org.example.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        int result = App.add(3, 4);
        assertEquals(7, result);
    }
    @Test
    public void testTwo() {
        int result = App.add(3, 4);
        assertEquals(7, result);
    }
}