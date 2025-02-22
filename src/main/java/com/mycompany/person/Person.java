package com.mycompany.person;

public class Person {
    String name;
    int age;
    String address;
    
    public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
}
    public void display() {
        System.out.println ("Name: " + name + "\n" + "Age: " + age + "\n");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Paola", 18, "Greece");
        Person person2 = new Person("Michaela", 15, "Canada");
        Person person3 = new Person ("Mira", 26, "Japan");
        Person person4 = new Person ("Miranda", 43, "US");
        Person person5 = new Person ("Andrea", 28, "Ohio");
        
        person1.display();
        person2.display();
        person3.display();
        person4.display();
        person5.display();
        
    }
}