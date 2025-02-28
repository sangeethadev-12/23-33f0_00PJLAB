class Student{
    String name;
    int age;
    String gender;
    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
    }
}
    public class Main{
        public static void main(String[] args){
            Student std=new Student();
            std.name="sathi";
            std.age=24;
            std.gender="male";
            std.displayDetails();
        } 
    }
