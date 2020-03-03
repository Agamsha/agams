package test;

abstract class abs {
	abstract int getrate();
	}
class SBI extends abs{
	int getrate() {return 7;}
	class PNB extends abs{
		int getrate() {return 8;}
	}
	
class testabs{

	public static  void main(String[] args) {
		abs b;
		b=new SBI();
		System.out.println(+b.getrate());
		
		// TODO Auto-generated method stub

	}

}}
