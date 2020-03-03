package test;

class para {int id;
String name;
int m;
para(int q,String R){
	id=q;
	name=R;
}
para(int e,String f,int z){
	id=e;
	name=f;
	m=z;
}
void display() {
	System.out.println(id+" "+name+" "+m);
}
	public static void main(String[] args) {
	para s2=new para(13,"dsa",45);
	s2.display();
		// TODO Auto-generated method stub

	}

}
