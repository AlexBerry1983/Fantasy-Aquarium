package humans;
import foods.*;
import java.util.*;
import animals.*;

public class AquariumStaff implements Humans {

  private String name;
  private ArrayList<Meat> bagOfMeat;
  private ArrayList<FishFood> bagOfFlakes;

  public AquariumStaff(String name) {
    this.name = name;
    this.bagOfMeat = new ArrayList<Meat>();
    this.bagOfFlakes = new ArrayList<FishFood>();
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

  public int countFishFoodInBag() {
    return bagOfFlakes.size();
  }

  public void getMeat(Meat meat) {
    bagOfMeat.add(meat);
  }

  public void getFishFood(FishFood flakes) {
    bagOfFlakes.add(flakes);
  }

  public void feedCarnivore(Meat meat, Carnivorous animal) {
    bagOfMeat.remove(0);
    animal.eat(meat);
  }

  public void feedHerbivore(FishFood food, Herbivorous animal) {
    bagOfFlakes.remove(0);
    animal.eat(food);
  }
}
