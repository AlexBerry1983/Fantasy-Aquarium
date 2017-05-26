import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;

public class SalmonTest {

  @Test
  public void canGetName() {
    Salmon salmon = new Salmon("Alan");
    assertEquals("Alan", salmon.getName());
  }

  @Test
  public void canEat() {
    Salmon salmon = new Salmon("Alan");
    assertEquals("munch munch", salmon.eat());
  }

}