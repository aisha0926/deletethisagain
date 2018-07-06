import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class JavaTest {

    @Test
    public void returnOneString(){
        //Split the words
        //Check each character
        //Add another character to the original one
        //return it
        Main a = new Main();
        assertEquals("The, he", a.returnOneString("The, he"));
    }

    @Test
    public void doubleChar(){
        Main a = new Main();
        assertEquals("jam", a.doubleChar("breadjambread"));
    }


    @Test
    @Ignore
    public void getSandwich(){
        Main a = new Main();
        assertEquals("TThhee", a.returnOneString("The"));
    }

    @Test
    @Ignore
    public void nTwice(){
        Main a = new Main();
        assertEquals("TThhee", a.nTwice(" ", 2));
    }

    @Test
    @Ignore
    public void endsly(){
        Main a = new Main();
        assertEquals("yza", a.endsly("yyzzza"));
    }

    @Test
    public void stringClean(){
        Main a = new Main();
        assertEquals("yza", a.stringClean("yyzzza"));
    }

    @Test
    public void fibononacci(){
        Main a = new Main();
        assertEquals(8, a.fibonacci(4));
    }

}
