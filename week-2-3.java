class employee{
    String name;
    int age;
    String desingnation;
    employee(String name,int age,String desingnation)
    {
        this.name=name;
        this.age=age;
        this.desingnation=desingnation;    
    }
void displayDetails(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Desingnation:"+desingnation);
}
}
public class Const{
    public static void main(String[] args)
    {
        employee emp=new employee("srav",22,"software engineer");
        emp.displayDetails();
    }
}