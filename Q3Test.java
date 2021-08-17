import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q3Test
{
    public Q3Test()
    {
    }

    @Test
    public void concatRem()
    {
        Q3 q31 = new Q3();
        String result = q31.concatRemove(new String[] {"bla", "bla", "bla", "bla"}, new String[] {"blablabcde"}, 3);
        assertEquals("yes", result);
        result = q31.concatRemove(new String[] {"bla", "bla", "bla", "bla"}, new String[] {"blablabcde"}, 2);
        assertEquals("no", result);
        result = q31.concatRemove(new String[] {"bla", "bla", "bla", "bla"}, new String[] {"blablabcde"}, 4);
        assertEquals("yes", result);
        result = q31.concatRemove(new String[] {"bla", "bla", "bla", "bla"}, new String[] {"blablabcde"}, 4);
        assertNotEquals("no", result);
    }
}

