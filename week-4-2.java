class Animal{
    String name;
    public Animal(String name)
    {
        this.name=name;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
}
class Mammal extends Animal
{
    public Mammal(String name){
    super(name);
    }
    void giveBirth(){
        System.out.println(name+" is giving birth to a baby");
    }
}
class Dog extends Mammal{
    String breed;
    public Dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    public void bark(){
        System.out.println(name+" the" +breed+ " is barking.");
    }
}
public class Multi
{
    public static void main(String[] args)
    {
        Dog myDog=new Dog("Rockyy","Lab");
        myDog.eat();
        myDog.giveBirth();
        myDog.bark();
    }
}