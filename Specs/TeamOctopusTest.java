import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;
import foods.Meat;

public class TeamOctopusTest {

  @Test
  public void canGetName() {
    TeamOctopus octopus = new TeamOctopus("Grabby");
    assertEquals("Grabby", octopus.getName());
  }

  @Test
  public void canGetType() {
    TeamOctopus octopus = new TeamOctopus("Grabby");
    assertEquals(AnimalType.CARNIVORE, octopus.getType());
  }

  @Test
  public void canEat() {
    TeamOctopus octopus = new TeamOctopus("Grabby");
    Meat meat = new Meat();
    octopus.eat(meat);
    assertEquals(1, octopus.countFood());
  }

  



}