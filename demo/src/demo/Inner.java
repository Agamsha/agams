package demo;

class CPU {
    double price;
    class Processor{
        double cores=600;
        String manufacturer;
        
    }
    protected class RAM{
        double memory=30.00;
        String manufacturer;
        void str() {
        	int i=5;
        	System.out.println(+i);
        }
      
    }
}
public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU oo=new CPU();
		CPU.Processor OJ=oo.new Processor();
		CPU.RAM kl=oo.new RAM();
		kl.str();
	

	}

}
