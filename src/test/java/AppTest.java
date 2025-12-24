import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class AppTest {
    
    @Test
    public void testMainOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        App.main(new String[]{});
        
        assertEquals("Hello Jenkins! Java app is running.\r\n", outContent.toString());
    }
}