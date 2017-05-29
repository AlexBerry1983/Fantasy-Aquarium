import static org.junit.Assert.*;
import org.junit.*;
import humans.*;

public class VisitorTest {

  @Test
  public void canGetName() {
    Visitor visitor = new Visitor("Alex", 34, 100);
    assertEquals("Alex", visitor.getName());
  }

  @Test
  public void canGetAge() {
    Visitor visitor = new Visitor("Alex", 34, 100);
    assertEquals(34, visitor.getAge());
  }


}
