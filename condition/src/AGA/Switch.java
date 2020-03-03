package AGA;
import java.util.Scanner;
public class Switch {
int num1,num2,res,choice;
public void Choice()	
{
	System.out.println("1.Add\n2.Subtract\n3.Multi\n4.Div");
	System.out.println("Enter Your Choice");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
}



public static void main(String[] args) {
	Switch.oo=new Switch();
	oo.Choice();
		// TODO Auto-generated method stub

	}

}
