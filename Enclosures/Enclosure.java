package enclosures;
import animals.*;
import java.util.*;

public class Enclosure {

  private ArrayList<Animal> animals;

  public Enclosure() {
    this.animals = new ArrayList<Animal>();
  }

  public int countAnimals() {
    return animals.size();
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void removeAnimal(int index) {
    animals.remove(index);
  }

  public boolean isEnclosureEmpty() {
    if (countAnimals() == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean matchingAnimalTypes(Animal newAnimal){
    boolean result = true;
    for (Animal animal : animals){
      if (!animal.getType().equals(newAnimal.getType())){
        result = false;
          return result;
      }
    }
    return result;
  }

  

}
