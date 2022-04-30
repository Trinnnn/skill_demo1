import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class skill_demoTester {
    @Test
    public void Ilove() {
        assertEquals("I love you so much !", skill_demo.ILove("you")); // test that fail
    }

}
