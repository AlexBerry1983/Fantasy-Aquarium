import static org.junit.Assert.*;
import org.junit.Test;

public class SalmonTest {
  @Test
  public void canGetName() {
    Salmon salmon = new Salmon("Alan");
    assertEquals("Alan", salmon.getname());
  }

}
