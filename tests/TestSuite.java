import org.junit.Test;
import static org.junit.Assert.*;

public class TestSuite {

    @Test
    public void check_random() 
    {
        First tester = new First();
        
        // assert statements
        assertEquals(4, tester.randomNumber());
    }
}
