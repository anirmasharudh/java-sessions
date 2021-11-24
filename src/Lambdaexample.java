package Collection.Example;

import java.util.function.BiConsumer;

public class Lambdaexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> biConsumer
		= (n1,n2) ->{
			System.out.println(n1+n2);
			
		};
		biConsumer.accept(10,20);
	}

}
