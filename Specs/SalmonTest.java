import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;
import foods.*;

public class SalmonTest {

  @Test
  public void canGetName() {
    Salmon salmon = new Salmon("Alan");
    assertEquals("Alan", salmon.getName());
  }

  @Test
  public void canEat() {
    Salmon salmon = new Salmon("Alan");
    FishFood food = new FishFood();
    salmon.eat(food);
    assertEquals(1, salmon.countFood());
  }

  @Test
  public void checkBellyStartsEmpty() {
    Salmon salmon = new Salmon("Alan");
    assertEquals(0, salmon.countFood());
  }

  @Test
  public void canEmptyBellyWhenSleep() {
    Salmon salmon = new Salmon("Alan");
    FishFood food1 = new FishFood();
    FishFood food2 = new FishFood();
    salmon.eat(food1);
    salmon.eat(food2);
    salmon.sleep();
    assertEquals(0, salmon.countFood());
  }




}
