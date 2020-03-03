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
