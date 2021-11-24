package LamdaExpression;


public class RunnableExample {

	public static void main(String[] args) {
		
		//Writing Lambda expression for functional interface 'Runnable'
		Runnable r = () -> System.out.println("From inside run interface");
		r.run();
		
		//Passing Runnable Lambda expression as argument when creating Thread class object
		//I just noticed Thread class has a constructor that takes Runnable interface 
		//as argument so this should be possible
		
		Thread myThread = new Thread(()-> System.out.println("From Thread class constructor"));
		Thread myThread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("From inside runnable as argument");
			}
		});
		myThread.run();
		myThread1.start();
		
	}

}
