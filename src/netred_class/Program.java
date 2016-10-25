package netred_class;

import netred_class.A.MyRunnable;

public class Program {
	public static void main(String[] args){
		A a= new A();
		a.print();
		MyRunnable r = a.new MyRunnable();
		
	}
	

}
