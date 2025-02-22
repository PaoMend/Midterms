package com.mycompany.dog;

public class Dog {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Dog Name: " + name + "\n" + "Breed: " + breed + "\n");
    }
  public static void main(String[] args) {
        Dog d1 = new Dog("Princess", " Toy Poodle");
        Dog d2 = new Dog("Bon Bon", "Shih Tzu");
        
        d1.setName("Princess");
        d2.setBreed("Toy Poodle");        
        d2.setName("Bon Bon");
        d1.setBreed("Shih Tzu");
        
        d1.display();
        d2.display();
             
  }
}
