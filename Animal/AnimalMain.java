import java.lang.*;

class Animal {
  Animal(){

  }
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

public class AnimalMain {
  public static void main(String[] args) {
    Animal [] an = new Animal[3];

    Animal myAnimal = new Animal();
    myAnimal.animalSound();

    Animal myPig = new Pig();
    myAnimal.animalSound();

    Animal myDog = new Dog();
    myAnimal.animalSound();
        
     //an[0] = pig;
    //an[0].animalSound();
     System.out.println();
    myAnimal.animalSound(); 
    myAnimal.animalSound(); 
    myPig.animalSound(); //The pig says: wee wee
    myDog.animalSound(); //The pig says: bow bow
  }
}