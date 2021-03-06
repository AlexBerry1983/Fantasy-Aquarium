import static org.junit.Assert.*;
import org.junit.*;
import humans.*;
import aquarium.*;

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

  @Test
  public void countCashOnPerson() {
    Visitor visitor = new Visitor("Alex", 34, 100);
    assertEquals(100, visitor.countCash());
  }

  @Test
  public void canUpdateCash() {
    Visitor visitor = new Visitor("Alex", 34, 100);
    visitor.updateCash(70);
    assertEquals(70, visitor.countCash());
  }

  @Test
  public void canBuyTicket() {
    Visitor visitor = new Visitor("Louise", 28, 0);
    visitor.buyTicket(10);
    assertEquals(false, visitor.buyTicket(10));
  }



}
