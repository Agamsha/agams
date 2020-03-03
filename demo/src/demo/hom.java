package demo;
import java.util.Scanner;

public class hom 
{
	int RollNum;
	String Name;
	char Grade;
	int EnglishMarks;
	int MathsMarks;
	int Scimarks;
	float Totalmarks;
	float Avg;
	Scanner Sc=new Scanner(System.in);
	int arr[]=new int[RollNum];
	//String arr[]=new String[5];
	//System.out.println("Student Details");
	//System.out.println("Roll No\t\tEmp Name\tEnglish\t\tMaths\t\tScience\tTotal\t");
	
	
	public void Details()
	{
		for(RollNum=0;RollNum<5;RollNum++)
		{
			System.out.println("Student Details");
			 arr[RollNum]=Sc.nextInt();
			
		
		System.out.println("Roll No\t\tEmp Name\tEnglish\t\tMaths\t\tScience\t");
		RollNum=Sc.nextInt();
		Name=Sc.next();
		EnglishMarks=Sc.nextInt();
		MathsMarks=Sc.nextInt();
		Scimarks=Sc.nextInt();
		System.out.println("Roll No\t\tEmp Name\tEnglish\t\tMaths\t\tScience\t\tTotal\t\tAverage");
		Totalmarks=Scimarks+MathsMarks+EnglishMarks;
		Avg=Totalmarks/3;
		System.out.println(+RollNum+"\t\t"+Name+"\t\t"+EnglishMarks+"\t\t"+MathsMarks+"\t\t"+Scimarks+"\t\t"+Totalmarks+"\t\t"+Avg);
		}
	}
	
	    //System.out.print("Average"+Avg);}
		//arr[i]=RollNum;}
		//System.out.print(arr[i]);
		//arry[i]=Name;
		//System.out.print(arry[i]);}

		
	/*public void display()
	//{System.out.println(+EnglishMarks);
	//System.out.println(+MathsMarks);
	//System.out.println(+Scimarks);
	//}
	//public void Total() {
		//Totalmarks=Scimarks+MathsMarks+EnglishMarks;
		//System.out.print("Total "+Totalmarks);
		//}
	
	public void Average() {	
		Avg=Totalmarks/3;
		System.out.print("Average Marks"+Avg);
		}*/
	
	 public void Grade()
	{
		if(Avg>50&&Avg<=60)
		{System.out.print("Grade is C");}
		else if(Avg>60&&Avg<=80)
		{System.out.print("Grade is B");}
		else if(Avg>80&&Avg<=1001)
		{System.out.println("Grade is A");}
		else {System.out.print("Fail"); }
		
		} 
	
	

	public static void main(String[] args) { hom oo=new hom();
	oo.Details();
	//oo.display();
	//oo.Total();
	//oo.Average();
	oo.Grade();
		// TODO Auto-generated method stub

	}

}
