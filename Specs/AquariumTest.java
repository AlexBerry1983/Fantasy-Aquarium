import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import enclosures.*;
import aquarium.*;
import humans.*;

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
    assertEquals(0, aquarium.getTakings());
  }

  @Test
  public void checkChargeForTickets() {
    Aquarium aquarium = new Aquarium();
    aquarium.addToTakings(10);
    assertEquals(10, aquarium.getTakings());
  }

  @Test
  public void checkChargeForTicketsOnVisitor() {
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Alex", 34, 100);
    visitor.buyTicket(10);
    assertEquals(90, visitor.countCash());
  }

  @Test
  public void canAddPersonToAquarium() {
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Wee Davey", 29, 50);
    aquarium.addPersonToAquarium(visitor);
    assertEquals(1, aquarium.countPeople());
  }

  @Test
  public void checkCanAddStaffToAquarium() {
    Aquarium aquarium = new Aquarium();
    AquariumStaff staff = new AquariumStaff("Dan the man");
    aquarium.addPersonToAquarium(staff);
    assertEquals(1, aquarium.countPeople());
  }


}
