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


}
