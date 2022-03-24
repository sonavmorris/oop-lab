package sona;
import java.util.*;
public class cpu {
	int price;
	Scanner sc= new Scanner(System.in);
	void read()
	{
		System.out.println("enter the price of the cpu:");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("the price of the cpu is:"+price);	
	}
	public class processor
		{
			int core;
			String manufacturer;
			void read()
			{
				System.out.println("enter cores of the processor:");
				core=sc.nextInt();
				sc.nextLine();
				System.out.println("enter manufacturer of the processor:");
				manufacturer=sc.nextLine();
				}
			void display()
			{
				System.out.println("the cores of the processor is:"+core);
				System.out.println("the manufacturer of the processor is:"+manufacturer);
		}
			public class ram
			{
				int memory;
				String manufacturer;
				void read()
				{
					System.out.println("enter size of the ram:");
					memory=sc.nextInt();
					sc.nextLine();
					System.out.println("enter manufacturer of the ram:");
					manufacturer=sc.nextLine();
					}
				void display()
				{
					System.out.println("the size of the ram is:"+memory);
					System.out.println("the manufacturer of the ram is:"+manufacturer);
			}
			}
			
	}
	public static void main(String[] args){
	cpu ob=new cpu();
	ob.read();
	ob.display();
	cpu.processor ob1=ob.new processor();
	ob1.read();
	ob1.display();
	processor.ram ob2=ob1.new ram();
	ob2.read();
	ob2.display();
	}
}
