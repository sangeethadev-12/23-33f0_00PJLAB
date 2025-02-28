class Student{
    void displayDetails(String name)
    {
        System.out.println("Name:"+name);
    }
    void displayDetails(String name,int age)
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    void displayDetails(String name,int age,String gender)
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
    }
}
    public class Method{
        public static void main(String[] args)
        {
            Student std=new Student();
            std.displayDetails("san");
            std.displayDetails("san",18);
            std.displayDetails("san",18,"female");
        }
    }