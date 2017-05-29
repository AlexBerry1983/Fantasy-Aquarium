package aquarium;

import java.util.*;
import enclosures.*;
import humans.Visitor;

public class Aquarium {

  private HashMap<String, Enclosure> enclosures;
  private int takings;

  public Aquarium() {
    this.enclosures = new HashMap<String, Enclosure>();
    this.takings = takings;
  }

  public void createNewEnclosure(String name, Enclosure aquariumTank) {
    this.enclosures.put(name, aquariumTank);
  }

  public int countEnclosures() {
    return enclosures.size();
  }

  public int countTakings() {
    return this.takings;
  }

  public void setNewTakings(int newTakings) {
    this.takings = newTakings;
  }

  public void addToTakings(int payment) {
    this.takings += payment;
  }

}
