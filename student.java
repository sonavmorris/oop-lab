package student;
import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the rollno: ");
        int rollno = sc.nextInt();
        System.out.println("Enter the mark: ");
        int mark = sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Mark: "+mark);
        sc.close();
    }
}