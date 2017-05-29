package animals;
public class Shark extends Animal{

  private String name;


  public Shark(String name) {
    this.name = name;
    // this.belly = new ArrayList<Meat>();
  }

  public String getName() {
    return this.name;
  }

}
