package aquarium;

import java.util.*;
import enclosures.*;

public class Aquarium {

  HashMap<String, ArrayList<Enclosure>> enclosures = new HashMap<String, ArrayList<Enclosure>>();

  public Aquarium() {
    // this.enclosures = new HashMap<String, ArrayList<Enclosure>>();
  }

  public void createNewEnclosure(String name, ArrayList<Enclosure> aquariumTank) {
    this.enclosures.put(name, aquariumTank);
  }


}
