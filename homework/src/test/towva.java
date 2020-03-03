package test;

public class towva {
	int A=30,B=50;
public void swap()
{A=B-A;
B=B-A;
System.out.println("Value of B="+B);
A=B+A;
System.out.println("Value of A="+A);	
}
	public static void main(String[] args) {towva oo=new towva();
	oo.swap();
		// TODO Auto-generated method stub

	}

}
