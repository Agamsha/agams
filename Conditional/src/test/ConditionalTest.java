package test;
import java.util.Scanner;

public class ConditionalTest {
	int num1,num2,choice,res;
	public void choiceAS()	
	{
		
		System.out.println("1.Add\t2.Subtract\n3.Multi\t4.Div");
		System.out.println("Enter Your Choice");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		System.out.println( "Enter First Number" );
		num1=sc.nextInt();
		System.out.println( "Enter Second Numbe" );
		num2=sc.nextInt();
			
	
	
switch (choice)
	   {
	   case 1:
		   res=num1+num2;
	   System.out.println( "Result of Addition="+res);
	   break;
	   
	   case 2:
		   res=num1-num2;
	   System.out.println( "result of Subtraction="+res);
	   break;
	   
	   case 3:
		   res=num1*num2;
	   System.out.println( "Result of Multipication="+res);
	   break;
		   
	   case 4:
		   res=num1/num2;
	   System.out.println( "Result of Div="+res);
	  break;
	   }
	}
public static void main(String[] args){
			ConditionalTest oo= new ConditionalTest();
			oo.choiceAS();
}}
	
