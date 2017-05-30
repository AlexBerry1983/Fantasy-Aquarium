import static org.junit.Assert.*;
import org.junit.*;
import aquarium.*;
import animals.*;
import humans.*;

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
    Visitor visitor = new Visitor("Wee Davey", 24, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);
    lab.secureTestSubject(visitor);
    lab.secureTestSubject(visitor2);
    lab.secureTestSubject(visitor3);
    lab.liquidateTestSubject();
    assertEquals(2, lab.countTestSubjects());
  }


}
