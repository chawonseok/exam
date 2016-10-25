package thread;

public class Program {
	private static int x = 3;

	public static void main(String[] args) {
		String str = "hello";
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.printf("%d,%sいい\n", x, str);
					try {Thread.sleep(18);} catch (Exception e) {}
				}				
			}});
		thread.start();
		
		while (true) {
			System.out.printf("%s せせ\n", str);
			
			try {
				Thread.sleep(18);
			} catch (Exception e) {
			}
		}
	}

}
