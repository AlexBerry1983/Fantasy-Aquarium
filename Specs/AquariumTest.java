import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import enclosures.*;
import aquarium.*;
import humans.Visitor;

public class AquariumTest {

  @Test
  public void canAddNewEnclosure() {
    Aquarium aquarium = new Aquarium();
    Enclosure salmontank = new Enclosure();
    aquarium.createNewEnclosure("Salmon", salmontank);
    assertEquals(1, aquarium.countEnclosures());
  }

  @Test
  public void checkEnclosuresStartsEmpty() {
    Aquarium aquarium = new Aquarium();
    assertEquals(0, aquarium.countEnclosures());
  }

  @Test
  public void checkAquariumTakingsStartsNil() {
    Aquarium aquarium = new Aquarium();
    assertEquals(0, aquarium.countTakings());
  }

  @Test
  public void checkChargeForTickets() {
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Alex", 34, 100);
    visitor.buyTicket();
    aquarium.addToTakings(10);
    assertEquals(10, aquarium.countTakings());
  }

}
