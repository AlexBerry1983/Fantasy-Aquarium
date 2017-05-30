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

  



}
