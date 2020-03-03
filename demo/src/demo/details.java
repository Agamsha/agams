package demo;
import java.util.Scanner;

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
