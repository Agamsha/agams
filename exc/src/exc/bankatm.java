package exc;
//
import java.util.Scanner;
//
//public class bankatm 
//	{
//		 int atmId;
//		static int choice;
//		 static int balance=15000;
//		int value;
//		int add;
//		int draw;
//		 String bankName,location;
//		 static Scanner sc=new Scanner(System.in);
//		 
//		 public void deposit()
//		 { 
//			System.out.println("Enter the amount to deposit:");
//			add=sc.nextInt();
//			balance+=add;
//			System.out.println("Available Balace is:"+balance);		
//		 }	
//		 public void withdraw() throws invalidbalance,bankatmgreaterexc
//		 {
//			 System.out.println("Enter the amount to withdraw:");
//			 value=sc.nextInt();
//			 draw=balance-value;
//			 System.out.println("Left Over balance will be:"+draw);
//			 
//			 if(draw<10000) 
//			 {
//				 throw new invalidbalance();			 
//			 }
//			 else if(value>balance)
//			 {
//				 throw new bankatmgreaterexc();
//			 }
//		 }	 	 
//		public static void main(String[] args) throws invalidbalance,bankatmgreaterexc
//		{
//			bankatm ba=new bankatm();
//			//ba.deposit();
//			//ba.withdraw();
//			System.out.println("Available Balance is:"+balance);
//			System.out.println("Enter Your choice:\nPress 1 to Deposit and Press 2 for Withdrawl:");
//			choice=sc.nextInt();	
//			 switch(choice) 
//			 {
//				 case 1:		 
//				 ba.deposit();		 
//				 break;
//				 case 2:		 
//				 ba.withdraw();	 
//				 break;		 		 
//			 	 default:
//				 ba.withdraw();
//			 }
//		}
//	
//
//}
import java.util.Scanner;
public class EmployeeDemo {
//data members	
	int empid;
	
	String name;
	float slary;
	Scanner sc=new Scanner(System.in);
	
	public void EnterDetails() {
		System.out.println("enter empid");
		empid=sc.nextInt();
		System.out.println("name");
		name=sc.next();
		System.out.println("slary");
		slary=sc.nextFloat();
	}
	
	public void display() {
		System.out.println("empid is:" +empid);
		System.out.println("name is:" +name);
		System.out.println("slary is:" +slary);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDemo obj= new EmployeeDemo();
		obj.EnterDetails();
		obj.display();

	}

}

