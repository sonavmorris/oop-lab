package sona;
import java.util.*;
public class rectangle {
	int l,b,area,perimeter;
		rectangle(int length, int breadth){
			l = length;
			b = breadth;
		}
		int rectArea(){
			return l*b;
		}
		int rectPeri(){
			return 2*(l+b);
		}
		public static void main(String[] args){
			int l,b;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the length");
			l = in.nextInt();
			System.out.print("Enter the breadth");
			b = in.nextInt();
			rectangle obj1 = new rectangle(l,b);
			System.out.println("Area of the rectangle : "+obj1.rectArea());
			System.out.println("Perimeter of the rectangle : "+obj1.rectPeri());
			System.out.print("Enter the length");
			l = in.nextInt();
			System.out.print("Enter the breadth");
			b = in.nextInt();
			rectangle obj2 = new rectangle(l,b);
			System.out.println("Area of the rectangle : "+obj2.rectArea());
			System.out.println("Perimeter of the rectangle : "+obj2.rectPeri());
			
		}
	}

