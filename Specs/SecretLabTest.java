import static org.junit.Assert.*;
import org.junit.*;
import aquarium.*;
import animals.*;
import humans.*;
import foods.*;


public class SecretLabTest {

  @Test
  public void checkExperimentationRoomBeginsEmpty() {
    SecretLab lab = new SecretLab();
    assertEquals(0, lab.countTestSubjects());
  }

  @Test
  public void canAddVisitorToExperimentationHash() {
    SecretLab lab = new SecretLab();
    Visitor visitor = new Visitor("Wee Davey", 24, 1000);
    lab.secureTestSubject(visitor);
    assertEquals(1, lab.countTestSubjects());
  }

  @Test
  public void canRemoveVisitorToExperimentationHash() {
    SecretLab lab = new SecretLab();
    Visitor visitor = new Visitor("Wee Davey", 22, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);
    Visitor visitor4 = new Visitor("Hairy Jo", 38, 1000);
    Visitor visitor5 = new Visitor("Sweaty Ralph", 19, 1000);
    Visitor visitor6 = new Visitor("Adam", 30, 1000);
    lab.secureTestSubject(visitor);
    lab.secureTestSubject(visitor2);
    lab.secureTestSubject(visitor3);
    lab.secureTestSubject(visitor4);
    lab.secureTestSubject(visitor5);
    lab.secureTestSubject(visitor6);

    lab.liquidateTestSubject();
    assertEquals(4, lab.countTestSubjects());
  }

  @Test
  public void canMakeMeatSludge() {
    Aquarium aquarium = new Aquarium();
    SecretLab lab = new SecretLab();
    Visitor visitor = new Visitor("Anne the Merciless", 50, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);
    TeamOctopus octopus = new TeamOctopus("Grabby");

    aquarium.addPersonToAquarium(visitor);
    aquarium.addPersonToAquarium(visitor2);
    aquarium.addPersonToAquarium(visitor3);
    octopus.abductHumanForLab(aquarium, visitor, lab);
    assertEquals("Conversion to delicious and nutritious meatSludge complete", lab.makeMeatSludge(visitor));
  }

  
}
