import static org.junit.Assert.*;
import org.junit.Test;
import animals.*;
import foods.Meat;
import aquarium.*;
import humans.*;

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

  @Test
  public void emptyBellyAfterSleep() {
    TeamOctopus octopus = new TeamOctopus("Grabby");
    Meat meat = new Meat();
    octopus.eat(meat);
    octopus.sleep();
    assertEquals(0, octopus.countFood());
  }

  @Test
  public void canAbductVisitorsForLab() {
    Aquarium aquarium = new Aquarium();
    TeamOctopus octopus = new TeamOctopus("Grabby");
    SecretLab lab = new SecretLab();
    Visitor visitor = new Visitor("Wee Davey", 24, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);

    aquarium.addPersonToAquarium(visitor);
    aquarium.addPersonToAquarium(visitor2);
    aquarium.addPersonToAquarium(visitor3);

    octopus.abductHumanForLab(aquarium, visitor, lab);
    assertEquals(true, lab.checkForPerson(visitor));
  }



}
