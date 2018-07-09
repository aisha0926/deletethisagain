import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackJackTest {

    @Test
    public void test(){
        BlackJack blackjack = new BlackJack();
        assertEquals(21, blackjack.Jack(18,21));
        assertEquals(20, blackjack.Jack(20,18));
        assertEquals(0, blackjack.Jack(22,22));
    }

}
