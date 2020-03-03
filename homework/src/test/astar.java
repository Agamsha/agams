package test;

import java.util.Arrays;

public class astar {

	public static void main(String[] args) {
		int[] arr= {3,6,7,1,2,8,9,11,10,4};
		int temp,x;
		for (int i=0;i<arr.length;i++)
		{ 
			for(int j=0;j<arr.length-1;j++)
		{ 
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		int mid=arr[arr.length/2];
		if(x==arr[mid])
		{
		}
		else if(x<arr[mid])
		{
			for(i=0;i<mid;i++)
			{
				if(arr[i]==x)
					System.out.println();
			}}
		else {
			for(i=mid+1;i<arr.length;i++)
			{
			}
		}
		// TODO Auto-generated method stub

	}


