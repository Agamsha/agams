package len;
import java.util.Scanner;
public class andop {
	String uname,pass;
	Scanner fd= new Scanner(System.in);
	public void ifof()
	{
		System.out.println("e u");
		uname=fd.next();
		System.out.println("pa");
		pass=fd.next();
		if(uname.equalsIgnoreCase("admin")&& pass.equalsIgnoreCase("admin"))
		{System.out.println("you are va");}
		else
		{
			System.out.println("you not");
		}
	}
	

	public static void main(String[] args) {andop oo=new andop();
	oo.ifof();
		// TODO Auto-generated method stub

	}

}
