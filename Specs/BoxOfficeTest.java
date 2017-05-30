import static org.junit.Assert.*;
import org.junit.*;
import aquarium.*;
import humans.*;

public class BoxOfficeTest {

  @Test
  public void checkChildTicketPrice() {
    BoxOffice boxOffice = new BoxOffice();
    assertEquals(5, boxOffice.getChildTicketPrice());
  }
}
