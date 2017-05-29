import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import enclosures.*;
import aquarium.*;

public class AquariumTest {

  @Test
  public void canAddNewEnclosure() {
    Aquarium aquarium = new Aquarium();
    ArrayList<Enclosure> salmontank = new ArrayList<Enclosure>();
    aquarium.createNewEnclosure("Salmon", salmontank);
  }

}
