package animals;
import foods.Meat;
import java.util.*;

public class Shark extends Animal{

  private String name;
  private ArrayList<Meat> belly;

  public Shark(String name) {
    this.name = name;
    this.belly = new ArrayList<Meat>();
  }

  public String getName() {
    return this.name;
  }

  public int countFood() {
    return belly.size();
  }

  public void eat(Meat meat) {
    belly.add(meat);
  }

  public void sleep() {
    belly.clear();
  }
}
