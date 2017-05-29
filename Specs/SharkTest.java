import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;
import foods.Meat;

public class SharkTest {

  @Test
  public void canGetName() {
    Shark shark = new Shark("Gregory");
    assertEquals("Gregory", shark.getName());
  }

  @Test
  public void canEat() {
    Shark shark = new Shark("Gregory");
    Meat meat = new Meat();
    shark.eat(meat);
    assertEquals(1, shark.countFood());
  }



}
