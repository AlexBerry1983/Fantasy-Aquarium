import static org.junit.Assert.*;
import org.junit.*;
import animals.*;
import enclosures.*;


public class EnclosureTest {
  @Test
  public void canCountAnimals() {
    Enclosure enclosure = new Enclosure();
    assertEquals(0, enclosure.countAnimals());
  }

  @Test
  public void canAddAnimals() {
    Enclosure enclosure = new Enclosure();
    Shark shark = new Shark("Pete");
    enclosure.addAnimal(shark);
    assertEquals(1, enclosure.countAnimals());
  }
}
