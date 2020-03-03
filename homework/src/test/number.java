package test;

public class number {
	public void star() {
		for(int i =1;i<=5;i++)
		{	
		for(int j=5;j>=i;j--) {System.out.print(" ");
			}
		 for(int k=1;k<=i;k++) {System.out.print("*");
		 }System.out.println();
		}
		}

	public static void main(String[] args) {number oo= new number();
	oo.star();
	}
		// TODO Auto-generated method stub

	}


