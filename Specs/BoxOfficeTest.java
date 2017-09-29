import static org.junit.Assert.*;
import org.junit.*;
import aquarium.*;
import humans.*;

public class BoxOfficeTest {

  @Test
  public void checkDiscountedTicketPrice() {
    BoxOffice boxOffice = new BoxOffice();
    assertEquals(5, boxOffice.getDiscountedTicketPrice());
  }

  @Test
  public void checkAdultTicketPrice() {
    BoxOffice boxOffice = new BoxOffice();
    assertEquals(10, boxOffice.getAdultTicketPrice());
  }

  @Test
  public void sellDiscountedTicket() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Leyla", 10, 15);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(10, visitor.countCash());
  }

  @Test
  public void sellAdultTicket() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Christine", 40, 55);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(45, visitor.countCash());
  }

  @Test
  public void sellSeniorTicket() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Jim", 70, 65);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(60, visitor.countCash());
  }

  @Test
  public void checkAddVisitorToAquariumAfterBuysTicket() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Jim", 70, 65);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(1, aquarium.countPeople());
  }

  @Test
  public void checkAddFundsToTakingsForChild() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Leyla", 10, 15);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(5, aquarium.getTakings());
  }

  @Test
  public void checkAddFundsToTakingsForAdult() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Margo", 46, 95);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(10, aquarium.getTakings());
  }

  @Test
  public void checkAddFundsToTakingsForSenior() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Albert", 90, 95);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(5, aquarium.getTakings());
  }

  @Test
  public void checkTakingsNotIncreasedIfVisitorCantBuyTicket(){
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Bill", 20, 0);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(0, aquarium.getTakings());
  }

  @Test
  public void checkTicketTrackerStartsNil() {
    BoxOffice boxOffice = new BoxOffice();
    assertEquals(0, boxOffice.getTicketTracker());
  }

  @Test
  public void checkTicketSaleIncreasesTracker() {
    BoxOffice boxOffice = new BoxOffice();
    Aquarium aquarium = new Aquarium();
    Visitor visitor = new Visitor("Albert", 90, 95);
    boxOffice.sellTicket(aquarium, visitor);
    boxOffice.sellTicket(aquarium, visitor);
    assertEquals(2, boxOffice.getTicketTracker());
  }

}
