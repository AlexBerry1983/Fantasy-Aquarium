package animals;
import java.util.*;
import aquarium.*;
import humans.*;

public class TeamOctopus {

  private String name;

  public TeamOctopus(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void abductHumanForLab(Aquarium aquarium, Visitor visitor, SecretLab lab) {
    if (aquarium.countPeople() >= 3) {
      aquarium.removePersonFromAquarium();
      lab.secureTestSubject(visitor);
    }
  }
}
