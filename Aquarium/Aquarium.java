package aquarium;

import java.util.*;
import enclosures.*;

public class Aquarium {
  HashMap<String, ArrayList> enclosures = new HashMap<>();

  public void createNewEnclosure(String name, ArrayList aquariumTank) {
    enclosures.put(name, aquariumTank);
  }


}
