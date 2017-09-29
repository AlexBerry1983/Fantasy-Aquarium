import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import enclosures.*;
import aquarium.*;
import humans.*;
import animals.*;

public class AquariumTest {

  @Test
  public void canAddNewEnclosure() {
    Aquarium aquarium = new Aquarium();
    Enclosure salmontank = new Enclosure();
    aquarium.addNewEnclosure("Salmon", salmontank);
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

    @Test
    public void canEvacuateAquarium() {
      Aquarium aquarium = new Aquarium();
      Visitor visitor = new Visitor("Wee Davey", 29, 50);
      Visitor visitor2 = new Visitor("Alex", 34, 100);
      aquarium.addPersonToAquarium(visitor);
      aquarium.addPersonToAquarium(visitor2);
      aquarium.evacuate();
      assertEquals(0, aquarium.countPeople());
    }

    // @Test
    // public void canGetEnclosureNames() {
    //   Aquarium aquarium = new Aquarium();
    //   Salmon salmon = new Salmon("Alan");
    //   Enclosure enclosure = new Enclosure();
    //
    //   aquarium.addNewEnclosure("Salmon", enclosure);
    //   assertEquals("Salmon", aquarium.getEnclosureTankNames());
    // }


}
