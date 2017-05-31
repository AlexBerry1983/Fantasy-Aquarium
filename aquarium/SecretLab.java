package aquarium;
import java.util.*;
import animals.Salmon.*;
import humans.*;
import foods.*;

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

  public void removeTestSubject() {
    this.experimentationRoom.remove(0);
  }

  public String liquidateTestSubject() {
    while (countTestSubjects() >= 5) {
    this.experimentationRoom.remove(0);
    System.out.println("Commencing liquidation in 5 .. 4 ..");
    }
    return "Excess humans eradicated, Have a nice day.";
  }

  public boolean checkForPerson(Visitor visitor) {
    return this.experimentationRoom.contains(visitor);
  }

  public String makeMeatSludge(Visitor visitor) {
    removeTestSubject();
    return "Conversion to delicious and nutritious meatSludge complete";
  }
}
