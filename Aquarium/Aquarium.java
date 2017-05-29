package aquarium;

import java.util.*;
import enclosures.*;

public class Aquarium {

  private HashMap<String, Enclosure> enclosures;

  public Aquarium() {
    this.enclosures = new HashMap<String, Enclosure>();
  }

  public void createNewEnclosure(String name, Enclosure aquariumTank) {
    this.enclosures.put(name, aquariumTank);
  }

  public int countEnclosures() {
    return enclosures.size();
  }

  
}
