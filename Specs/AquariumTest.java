import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import enclosures.*;
import aquarium.*;

public class AquariumTest {

  // @Test
  // public void canAddNewEnclosure() {
  //   Aquarium aquarium = new Aquarium();
  //   Enclosure salmontank = new Enclosure();
  //   aquarium.createNewEnclosure("Salmon", salmontank);
  // }


  @Test
  public void checkEnclosuresStartsEmpty() {
    Aquarium aquarium = new Aquarium();
    assertEquals(0, aquarium.countEnclosures());
  }
}
