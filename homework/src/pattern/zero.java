package pattern;

public class zero {
	public void star()
	{
		for (int i=0;i<=3;i++)
		{for (int m=1;m<=i;m++) {System.out.print("0");}
			for (int j=0;j<1;j++)
		{
		//for(int m=1;m<=j;m++)
			//{System.out.print("0");}
		System.out.print("*");}
		for (int l=3;l>i;l--)
		{System.out.print("0");}
		for(int k=0;k<1;k++)
		{System.out.print("*");}
		//System.out.println();
		
		for (int p=i;p<=i;p++)
		{for(int u=3;u>p;u--)
		{System.out.print("0");}
		for(int y=0;y<1;y++)
		{System.out.print("*");}
		for(int r=1;r<=p;r++)
		{System.out.print("0");}
		System.out.println();
		}}
		}
		
		
	
	

	public static void main(String[] args) {
		zero oo=new zero();
		oo.star();
		// TODO Auto-generated method stub

	}

}
