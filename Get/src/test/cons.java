package test;

public class cons 
	{int id;
	String name;
	cons(int q,String R){
		id=q;
		name=R;
	}
	cons (){
	//cons(cons A){
		//id=A.id;
		//name=A.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
		public static void main(String[] args) {
		cons s2=new cons(13,"dsa");
		// cons s3=new cons(s2);
		cons s3=new cons();
		s3.id=s2.id;
		s2.display();
		s3.display();
	

}}
