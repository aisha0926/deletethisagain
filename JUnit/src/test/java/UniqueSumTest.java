import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniqueSumTest {

    @Test
    public void testUnique(){
        UniqueSum unique = new UniqueSum();

        assertEquals(6, unique.unique(1,2,3));
        assertEquals(0, unique.unique(3,3,3));
        assertEquals(2, unique.unique(1,1,2));

    }
}
