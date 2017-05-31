package aquarium;
import java.util.*;
import animals.Salmon.*;
import humans.*;

public class SecretLab {

  ArrayList<Humans> experimentationRoom;

  public SecretLab() {
    this.experimentationRoom = new ArrayList<Humans>();
  }

  public int countTestSubjects() {
    return this.experimentationRoom.size();
  }

  public void secureTestSubject(Humans visitor) {
    this.experimentationRoom.add(visitor);
  }

  public String liquidateTestSubject() {
    while (countTestSubjects() >= 5) {
    this.experimentationRoom.remove(0);
    System.out.println("Commencing liquidation in 5 ...");
    }
    return "Excess humans eradicated, Have a nice day.";
  }

  public boolean checkForPerson(Visitor visitor) {
    return this.experimentationRoom.contains(visitor);
  }

}
