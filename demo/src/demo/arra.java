
package demo;
import java.util.Scanner;

public class arra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int []arr;
		int temp;
		int i,k;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter size");
		size=Sc.nextInt();
		arr=new int[size];
		System.out.println("Enter array");
		for(i=0;i<size;i++)
		{
		arr[i]=Sc.nextInt()	;
		k=arr[i];
		}
   
		for( i=0;i<size;i++) {//k=arr[i];
        //int j=k % 2;
			for(int j=i+1;j<size;j++)
		{if(arr[i]==arr[j])
				//if(j==0 )
			{
				System.out.println(+arr[i]);
			}
			}
		}}}

	


