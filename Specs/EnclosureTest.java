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

  @Test
  public void canRemoveAnimal() {
    Enclosure enclosure = new Enclosure();
    Shark shark1 = new Shark ("Helen");
    Shark shark2 = new Shark ("Leslie");
    Shark shark3 = new Shark ("Steve");
    enclosure.addAnimal(shark1);
    enclosure.addAnimal(shark2);
    enclosure.addAnimal(shark3);
    enclosure.removeAnimal(0);
    assertEquals(2, enclosure.countAnimals());
  }
}
