import static org.junit.Assert.*;
import org.junit.*;
import humans.*;

public class AquariumStaffTest {

  @Test
  public void canGetName() {
    AquariumStaff staff = new AquariumStaff("Joe");
    assertEquals("Joe", staff.getName());
  }

  @Test
  public void canSetName() {
    AquariumStaff staff = new AquariumStaff("Joe");
    staff.setName("Mike");
    assertEquals("Mike", staff.getName());
  }

}
