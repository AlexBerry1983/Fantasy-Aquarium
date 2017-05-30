package aquarium;

import humans.*;

public class BoxOffice {

  private int childTicket;
  private int adultTicket;
  private int seniorTicket;
  private int takings;

  public BoxOffice() {
    this.childTicket = 5;
    this.adultTicket = 10;
    this.seniorTicket = 5;
  }

  public int getChildTicketPrice() {
    return this.childTicket;
  }

  public int getAdultTicketPrice() {
    return this.adultTicket;
  }

  public int getSeniorTicketPrice() {
    return this.seniorTicket;
  }

  public void sellTicket(Aquarium aquarium, Visitor visitor) {
    if (visitor.getAge() <= 15 && visitor.buyTicket(this.childTicket) == true) {
      // visitor.buyTicket(this.childTicket);
      aquarium.addToTakings(this.childTicket);
    }
    else if (visitor.getAge() >15 && visitor.getAge() <60) {
      visitor.buyTicket(this.adultTicket);
      aquarium.addToTakings(this.adultTicket);
    }
    else if (visitor.getAge() >= 60) {
      visitor.buyTicket(this.seniorTicket);
      aquarium.addToTakings(this.seniorTicket);
    }
    aquarium.addPersonToAquarium(visitor);
  }





}
