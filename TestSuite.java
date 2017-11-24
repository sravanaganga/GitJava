import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSuite {

    @Test
    public void check_random() 
    {
        First tester = new First();
        
        // assert statements
        assertEquals(4, tester.randomNumber());
    }
}
