import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoPracTester {
    //configure classpath to accomodate JUnit tests
    @Test
    public void addition(){
        assertEquals(2, SkillDemoPrac.simpleAdd(1,1)); //fail at first 
    }
}