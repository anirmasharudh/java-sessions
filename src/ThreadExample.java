public class ThreadExample {




	public static void main(String[] args) {


		/*
		Runnable lambdar = ()->{ System.out.println("Hello"); };

		new Thread(lambdar).run();

		Comparator<Integer> comparator= (Integer o1,Integer o2)->{return o1-o2;};
		System.out.println(comparator.compare(6,4));


		List<String> names = Arrays.asList("Ani","Rudh","Shar","Ma");
		System.out.println(names);

		Collections.sort(names,(String a,String b)-> {return a.compareTo(b);});
		System.out.println(names);

		Consumer<Integer> consumer = (integer -> {});

		consumer.accept(5);


		Supplier<Integer> supplier=()->{return 5;};
		supplier.get();

		Predicate<Integer> predicate = (y -> {return y>5;});
		System.out.println(predicate.test(4));

		Function<Double,Double> function = (x -> {return Math.sqrt(x);});
		*/
		class innie {

			private int innervar = 10;
		}

		ThreadExample threadExample = new ThreadExample();

		System.out.println();

		/*
		Runnable obj1= ()-> {
			for(int i=0;i<6;i++) {
				System.out.println("Hello"+200);
				try {Thread.sleep(500);} catch(Exception e) {}
				}
			};
		Runnable obj2 = () -> {
			
				for(int i=0;i<6;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1500);} catch(Exception e) {}
				}
			};

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start(); */
		//System.out.println(PlayingClass.empx);

		//NEW WAY, Passing whole lambda as the argument:
		//Arguments, as we know, are usually an object of a certain type.
		//By passing a whole lambda as argument, we get the same convenience
		//of passing a class object.
		//Check the type of the parameter being passed in a method, and if that parameter
		//type is a functional interface, just throw in the lambda expression.
		//That would be same as a class implementing that interface followed by an
		//object of that class being created followed by that object as argument.
		/*
		Thread t3 = new Thread(
				() -> {try {
					System.out.println("Thread example");
					Thread.sleep(1500);
					System.out.println("Thread example break ke baad");
				} catch(Exception e) {}	}
		);
		t3.start();

		//OLD FASHIONED WAY, using the run() method overriden in this class:
		ThreadExample te4 = new ThreadExample(); //Class that implements Runnable type
		Thread t4 = new Thread(te4); //For starting thread of class that implements runnable
		t4.start();

		ExecutorService es = Executors.newFixedThreadPool(5);
		es.submit(()-> System.out.println("Naya executive zamana"));
		*/

	/*
		Runnable r = ()-> System.out.println("Thread starting");
		new Thread(()-> System.out.println("Thread starting"))
		.start();
		*/

	}
}
