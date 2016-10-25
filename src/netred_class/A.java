package netred_class;

public class A {
	private int a;
	public void print(){
		System.out.printf("%d, \n",a++);
		
		
	}
	public static class MyRunnable implements Runnable{
		
		@Override
		public void run() {
			System.out.println("hh");
			// TODO Auto-generated method stub
			
		}
	
	}
}
