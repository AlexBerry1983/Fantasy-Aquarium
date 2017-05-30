package aquarium;

import humans.*;

public class BoxOffice {

  private int discountedTicket;
  private int adultTicket;

  public BoxOffice() {
    this.discountedTicket = 5;
    this.adultTicket = 10;
  }

  public int getDiscountedTicketPrice() {
    return this.discountedTicket;
  }

  public int getAdultTicketPrice() {
    return this.adultTicket;
  }

  public void sellTicket(Aquarium aquarium, Visitor visitor) {
    if (visitor.getAge() <= 15 || visitor.getAge() >=60) {
      if (visitor.buyTicket(this.discountedTicket)) {
        aquarium.addToTakings(this.discountedTicket);
      }
    } else {
      if (visitor.buyTicket(this.adultTicket)) {
        aquarium.addToTakings(this.adultTicket);
      }
    }
    aquarium.addPersonToAquarium(visitor);
  }





}
