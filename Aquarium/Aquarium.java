package aquarium;

import java.util.*;
import enclosures.*;
import humans.*;

public class Aquarium {

  private HashMap<String, Enclosure> enclosures;
  private ArrayList<Humans> peopleInAquarium;
  private int takings;

  public Aquarium() {
    this.enclosures = new HashMap<String, Enclosure>();
    this.takings = takings;
    this.peopleInAquarium = new ArrayList<Humans>();
  }

  public void addNewEnclosure(String name, Enclosure aquariumTank) {
    this.enclosures.put(name, aquariumTank);
  }

  public void addPersonToAquarium(Humans visitor) {
    this.peopleInAquarium.add(visitor);
  }

  public void removePersonFromAquarium() {
    this.peopleInAquarium.remove(0);
  }

  public int countPeople() {
    return peopleInAquarium.size();
  }

  public int countEnclosures() {
    return enclosures.size();
  }

  public int getTakings() {
    return this.takings;
  }

  public void setNewTakings(int newTakings) {
    this.takings = newTakings;
  }

  public void addToTakings(int payment) {
    this.takings += payment;
  }

  public void evacuate() {
    peopleInAquarium.clear();
  }
}
