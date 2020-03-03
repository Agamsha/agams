package test;
import java.util.Scanner;

public class Pizza {
	int choice,Size,Flavour,Quantity,a=500,price;
	public void options() {
		System.out.println("1.Pizza\n2.French Freis");
		System.out.println("Enter Choice");
		Scanner S=new Scanner (System.in);
		choice=S.nextInt();
		
	switch (choice)
	{
	case 1:
		System.out.println("Select Flavour");
		System.out.println("1.Cheese Capsicum\t2.Corns   \t3.Farm House");
		Flavour=S.nextInt();
	switch (Flavour)
	{
	case 1:
		System.out.println("Select Size");
		System.out.println("1.Large\t2.Medium\t3.Small");
		Size=S.nextInt();
		
		switch(Size)
		{
	case 1:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			price=a*Quantity;
			System.out.println("Quantity is 1");
			break;
		case 2:
			price=a*Quantity;
			System.out.println("Price is"+price);
			break;
		}
		break;
		
	case 2:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			price=a*Quantity;
			System.out.println("Quantity is 1");
			break;
		case 2:
			System.out.println("Quantity is 2");
			break;
		}
		break;
	case 3:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			System.out.println("Quantity is 1");
			break;
		case 2:
			System.out.println("Quantity is 2");
			break;
		}break;
	}
	break;
	case 2:
		System.out.println("Select Size");
		System.out.println("1.Large\t2.Medium\t3.Small");
		Size=S.nextInt();
		
		switch(Size)
		{
	case 1:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			System.out.println("Quantity is 1");
			break;
		case 2:
			System.out.println("Quantity is 2");
			break;
		}
		break;
	case 2:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			System.out.println("Quantity is 1");
			break;
		case 2:
			System.out.println("Quantity is 2");
			break;
		}break;
		
	case 3:
		System.out.println("Select Quantity");
		System.out.println("1.One\t2.Two");
		Quantity=S.nextInt();
		
		switch(Quantity)
		{
		case 1:
			System.out.println("Quantity is 1");
			break;
		case 2:
			System.out.println("Quantity is 2");
			break;
		}break;
	}
	break;
	case 3:
		System.out.println("Select Size");
		System.out.println("1.Large\t2.Medium\t3.Small");
		Size=S.nextInt();
		
		switch(Size)
		{
		case 1:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}
			break;
		case 2:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}break;
			
		case 3:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}break;
		}}
		break;
		case 2:
	{
		System.out.println("Select Flavour");
		System.out.println("1.Perry Perry\t2.Salted");
		Flavour=S.nextInt();
		switch (Flavour)
		{
		
		case 1:
			System.out.println("Select Size");
			System.out.println("1.Large\t2.Medium\t3.Small");
			Size=S.nextInt();
			
			switch(Size)
			{
		case 1:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}
			break;
			
		case 2:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}
			break;
		case 3:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}break;
		}
		break;
		case 2:
			System.out.println("Select Size");
			System.out.println("1.Large\t2.Medium\t3.Small");
			Size=S.nextInt();
			
			switch(Size)
			{
		case 1:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}
			break;
		case 2:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}break;
			
		case 3:
			System.out.println("Select Quantity");
			System.out.println("1.One\t2.Two");
			Quantity=S.nextInt();
			
			switch(Quantity)
			{
			case 1:
				System.out.println("Quantity is 1");
				break;
			case 2:
				System.out.println("Quantity is 2");
				break;
			}break;
		}
			break;
		}
	}
	}}
	

	public static void main(String[] args) {
		Pizza oo=new Pizza();
		oo.options();
		// TODO Auto-generated method stub

	}

}
