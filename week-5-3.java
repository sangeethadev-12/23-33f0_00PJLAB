import java.util.Scanner;
public class StringBufferEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString=sc.nextLine();
        StringBuffer sb=new StringBuffer(inputString);
        System.out.println("Choose an operation:");
        System.out.println("1. Delete a substring");
        System.out.println("2. Remove a character at a specific index");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the start index of the substring to delete: ");
                int startIndex=sc.nextInt();
                System.out.print("Enter the end index of the substring to delete: ");
                int endIndex=sc.nextInt();
                 if (startIndex >= 0 && endIndex <= sb.length() && startIndex <= endIndex) {
                    sb.delete(startIndex, endIndex);
                    System.out.println("Modified string: " + sb);
                } else {
                    System.out.println("Invalid indices.");
                }
                break;
            case 2:
                System.out.print("Enter the index of the character to remove: ");
                int index = sc.nextInt();
                if (index >= 0 && index < sb.length()) {
                    sb.deleteCharAt(index);
                    System.out.println("Modified string: " + sb);
                } else {
                    System.out.println("Invalid index.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
