class Animal
{
    void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    void makeSound()
    {
        System.out.println("Dog barks:woof!");
    }
}
class Cat extends Animal{
    void makeSound()
    {
        System.out.println("Cat meows:Meow!");
    }
}
public class Polymorphism{
    public static void main(String[] args)
    {
        Animal myAnimal1=new Dog();
        myAnimal1.makeSound();
        Animal myAnimal2=new Cat();
        myAnimal2.makeSound();
    }
}