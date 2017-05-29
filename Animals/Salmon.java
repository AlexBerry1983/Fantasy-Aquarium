package animals;
import java.util.*;
import foods.FishFood;

public class Salmon extends Animal{

  private String name;
  private ArrayList<FishFood> belly;

  public Salmon(String name) {
    this.name = name;
    this.belly = new ArrayList<FishFood>();
  }

  public String getName() {
    return this.name;
  }

  public int countFood() {
    return belly.size();
  }

  public void eat(FishFood food) {
    belly.add(food);
  }
}
