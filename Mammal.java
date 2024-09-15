import java.util.ArrayList;

public class Mammal {
  public static void main(String[] args) {
    // Variable a can refer to a Tiger, since Tiger is a subtype of Animal
    Mammal M = new Human();
    M.speak();
    M.Walk();
    M.sleep();
    M.eat();
    M.drink();

    // Variable a could also refer to a Monkey, since Monkey is a subtype of Animal
    // too
    M = new Octopus();
    M.speak();
    M.Walk();
    M.sleep();
    M.eat();

    M = new Dog();
    M.speak();
    M.Walk();
    M.sleep();
    M.eat();

    // We can add all kinds of animals to our zoo, as long as they implement the
    // Animal interface
    MammalOOP Moon = new Moon();
    Moon.addAnimal(new Human());
    Moon.addAnimal(new Monkey());
    Moon.addAnimal(new Octopus());

  }
}

// remaining classes/interfaces are declared without using the public keyword,
// which allows us to put them all in one file for this example

/**
 * Example of an interface to describe operations common to all "Animals".
 */
interface Mammal {
  String getName();

  void speak();

  void Walk();

  void sleep();

  void eat();

  void drink();
}

/**
 * A collection of all types of Animal objects.
 */
class Moon {
  // a list of Animal can hold all kinds of objects, as long
  // as they are subtypes of Animal
  private ArrayList<Mammal> Mammal = new ArrayList<>();

  public void addMammal(Mammal a) {
    mammal.add(a);
  }

class Human implements Mammal
{
  public String getName()
  {
    return "Human";
  }
  
  public void speak()
  {
    System.out.println("Hi There");
  }
  public void walk()
  {
    System.out.println("Walk : Yes");
  }
  
  public void sleep()
  {
    System.out.println("Sleep : Yes");
  }
  
  public void drink()
  {
    System.out.println("Yes");
  }
  
  public void eat()
  {
    System.out.println("Yes");
  }
  
}
