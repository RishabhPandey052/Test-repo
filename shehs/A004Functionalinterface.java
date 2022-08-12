package shehs;

import java.util.Date;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class A004Functionalinterface {
	
	public static void main(String[] args) {
		
		Predicate<String> checklength = s -> s.length() >= 5;
		System.out.println("Length of abcdef is greater than 5  :" + checklength.test("abcdef"));
		
		// checklength.and(containsA).test("XYZ");
		// checkLength.netgate.test("XYSZ")
		
				// datatype , returning 
		Function<Integer,Integer> Double = i -> i * 2;
		System.out.println(Double.apply(5));
		
		// f1.andThen(f2).andThen(f3).apply(input) 
		
		Consumer<String> cn = s ->{System.out.println(s);};
		cn.accept("ABCDEF");
		//No compose
		
		Supplier<Integer> sp = () -> new Random().nextInt(1000);
		System.out.println(sp.get());
		
		Supplier<Date> currentDate = () ->new Date();
		System.out.println(currentDate.get());
		
		
		//Bi func
		
		BiPredicate<Integer,Integer> greater = (a,b) -> a+b >10;
		System.out.println("BiPredicate "+greater.test(2, 19));
		
		BiFunction<Integer,Integer,Integer> product = (a,b) -> a*b;
		System.out.println("BiFunction "+ product.apply(5, 2));
		
		BiConsumer<String,Integer> two = (a,b) -> {System.out.println(a +"  "+ b );};
		two.accept("StringIIS" , 5);
	}
	
}
