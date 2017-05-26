import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;

public class SharkTest {

  @Test
  public void canGetName() {
    Shark shark = new Shark("Gregory");
    assertEquals("Gregory", shark.getName());
  }

  @Test
  public void canEat() {
    Shark shark = new Shark("Gregory");
    assertEquals("munch munch", shark.eat());
  }

  @Test
  public void canSleep() {
    Shark shark = new Shark("Gregory");
    assertEquals("Zzzzz", shark.sleep());
  }

}
