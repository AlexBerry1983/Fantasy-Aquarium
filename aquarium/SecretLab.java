package aquarium;
import java.util.*;
import animals.Salmon.*;
import humans.*;
import foods.*;

public class SecretLab {

  ArrayList<Humans> experimentationRoom;
  ArrayList<Meat> meatBucket;

  public SecretLab() {
    this.experimentationRoom = new ArrayList<Humans>();
    this.meatBucket = new ArrayList<Meat>();
  }

  public int checkMeatBucketLevels() {
    return this.meatBucket.size();
  }

  public void getMeatFromBucket() {
    this.meatBucket.remove(0);
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

  public void addMeatToBucket(Meat meat) {
    this.meatBucket.add(meat);
  }

  public void makeMeatSludge(Visitor visitor, Meat meat) {
    removeTestSubject();
    addMeatToBucket(meat);
  }

  public String makeDrone(Visitor visitor) {
    removeTestSubject();
    return "New Drone created, all hail our glorious leader, Alan";
  }

}
