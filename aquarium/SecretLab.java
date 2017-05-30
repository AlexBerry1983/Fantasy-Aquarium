package aquarium;
import java.util.*;
import animals.Salmon.*;
import humans.*;

public class SecretLab {

  HashMap<String, Humans> ExperimentationRoom;

  public SecretLab() {
    this.ExperimentationRoom = new HashMap<String, Humans>();
  }

  public int countTestSubjects() {
    return this.ExperimentationRoom.size();
  }

}
