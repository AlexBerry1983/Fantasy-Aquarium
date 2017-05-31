import static org.junit.Assert.*;
import org.junit.*;
import humans.*;
import foods.*;
import animals.*;
import aquarium.*;

public class AquariumStaffTest {

  @Test
  public void canGetName() {
    AquariumStaff staff = new AquariumStaff("Joe");
    assertEquals("Joe", staff.getName());
  }

  @Test
  public void canSetName() {
    AquariumStaff staff = new AquariumStaff("Joe");
    staff.setName("Mike");
    assertEquals("Mike", staff.getName());
  }

  @Test
  public void canAddMeatToBag() {
    Aquarium aquarium = new Aquarium();
    SecretLab lab = new SecretLab();
    AquariumStaff staff = new AquariumStaff("Jules");
    Visitor visitor = new Visitor("Anne the Merciless", 50, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);
    TeamOctopus octopus = new TeamOctopus("Grabby");
    Meat meat = new Meat();

    aquarium.addPersonToAquarium(visitor);
    aquarium.addPersonToAquarium(visitor2);
    aquarium.addPersonToAquarium(visitor3);
    octopus.abductHumanForLab(aquarium, visitor, lab);
    lab.makeMeatSludge(visitor, meat);
    staff.getMeat(meat, lab);
    assertEquals(1, staff.countMeat());
  }

  @Test
  public void canAddFishFoodToBag() {
    AquariumStaff staff = new AquariumStaff("Joe");
    FishFood flakes = new FishFood();
    staff.getFishFood(flakes);
    assertEquals(1, staff.countFishFoodInBag());
  }

  @Test
  public void canFeedCarnivores() {
    Aquarium aquarium = new Aquarium();
    SecretLab lab = new SecretLab();
    AquariumStaff staff = new AquariumStaff("Jules");
    Visitor visitor = new Visitor("Anne the Merciless", 50, 1000);
    Visitor visitor2 = new Visitor("Fat Eric", 35, 1000);
    Visitor visitor3 = new Visitor("Blind Fred", 24, 1000);
    TeamOctopus octopus = new TeamOctopus("Grabby");
    Meat meat = new Meat();
    Shark shark = new Shark("Manuel");

    aquarium.addPersonToAquarium(visitor);
    aquarium.addPersonToAquarium(visitor2);
    aquarium.addPersonToAquarium(visitor3);
    octopus.abductHumanForLab(aquarium, visitor, lab);
    lab.makeMeatSludge(visitor, meat);
    staff.getMeat(meat, lab);
    staff.feedCarnivore(meat, shark);
    assertEquals(1, shark.countFood());
  }

  @Test
  public void canFeedHerbivores() {
    AquariumStaff staff = new AquariumStaff("Joe");
    Salmon salmon = new Salmon("Alan");
    FishFood yumFlakes = new FishFood();
    staff.getFishFood(yumFlakes);
    staff.feedHerbivore(yumFlakes,salmon);
    assertEquals(1, salmon.countFood());
  }
}
