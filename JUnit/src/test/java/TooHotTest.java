import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TooHotTest {

    @Test
    public void testHot(){
        TooHot hotTest = new TooHot();

        assertEquals(true, hotTest.summer(90,true));
        assertEquals(false, hotTest.summer(50,false));
        assertEquals(true, hotTest.summer(100,true));
        assertEquals(true, hotTest.summer(70,true));
        assertEquals(false, hotTest.summer(101,true));
        assertEquals(true, hotTest.summer(95,true));

    }
}
