package test;

public class Demo 
{
	public void postfix ()
	{
int a=100,b=20,c=300,d,f;
d=(a>b)?a:b;
f=(d>c)?d:c;

System.out.println("greater value is ="+f);
	
	}
	public static void main(String[] args) {
		Demo oo=new Demo();
       oo.postfix();
		
	}

}
