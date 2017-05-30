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

  public void liquidateTestSubject() {
    this.experimentationRoom.remove(0);
  }
}
