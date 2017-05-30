package humans;

import java.util.*;

public class Visitor implements Humans {

  private String name;
  private int age;
  private int cash;

  public Visitor(String name, int age, int cash) {
    this.name = name;
    this.age = age;
    this.cash = cash;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int countCash() {
    return this.cash;
  }

  public int updateCash(int newCash) {
    return this.cash = newCash;
  }

  public boolean buyTicket(int ticketPrice) {
    if (this.cash >= ticketPrice) {
      this.cash -= ticketPrice;
        return true;
    }
    return false;
  }


}
