class Animal{
    String name;
    public Animal(String name)
    {
        this.name=name;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    public void bark(){
        System.out.println(name+" the"+breed"is barking.");
    }
}
public class Single
{
    public static void main(String[] args)
    {
        Dog myDog=new Dog("Buddy","Golden Retriever");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}