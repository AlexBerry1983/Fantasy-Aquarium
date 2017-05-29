package animals;
import java.util.*;
import foods.FishFood;

public class Salmon extends Animal implements Herbivorous {

  private String name;
  private ArrayList<FishFood> belly;
  private AnimalType type;

  public Salmon(String name) {
    this.name = name;
    this.belly = new ArrayList<FishFood>();
    this.type = AnimalType.HERBIVORE;
  }

  public String getName() {
    return this.name;
  }

  public AnimalType getType() {
    return this.type;
  }

  public int countFood() {
    return belly.size();
  }

  public void eat(FishFood food) {
    belly.add(food);
  }

  public void sleep() {
    belly.clear();
  }
}
