package humans;
import foods.*;
import java.util.*;

public class AquariumStaff {

  private String name;
  private ArrayList<Meat> bagOfMeat;

  public AquariumStaff(String name) {
    this.name = name;
    this.bagOfMeat = new ArrayList<Meat>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public int countMeat() {
    return bagOfMeat.size();
  }

  public void getMeat(Meat meat) {
    bagOfMeat.add(meat);
  }

}
