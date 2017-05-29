import static org.junit.Assert.*;
import org.junit.*;
import humans.*;
import foods.*;
import animals.*;

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
    AquariumStaff staff = new AquariumStaff("Joe");
    Meat meat = new Meat();
    staff.getMeat(meat);
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
    AquariumStaff staff = new AquariumStaff("Joe");
    Shark shark = new Shark("Manuel");
    Meat tBone = new Meat();
    staff.getMeat(tBone);
    staff.feedCarnivore(tBone, shark);
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
