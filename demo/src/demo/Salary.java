package demo;

import java.util.Scanner;

class Salary extends details {
	int Salary;
	
	 void Info() {
		 Enter();
		 System.out.println("Employment Salary");
		 Salary=sc.nextInt();
		 
	 }
	 public class details {
		    String Name;
		    int EmpId;
			Scanner sc=new Scanner(System.in);
			void Enter()
			{
				System.out.println("Employment Name");
				Name=sc.next();
				
				System.out.println("Employment ID");
				EmpId=sc.nextInt();
			}
	 }

	public static void main(String[] args) {Salary oo=new Salary();
	oo.Info();
		// TODO Auto-generated method stub

	}

}
