package com.cts.jsefundas5.ui;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionDemoApp {

	public static void main(String[] args) {
		
		Consumer<String> repeat = userName -> {
			for(int i=1;i<=10;i++)
				System.out.println(userName);
		};

		repeat.accept("Vamsy Kiran");
		
		Supplier<String> today = () -> LocalDate.now().toString();		
		System.out.println(today.get());
		
		Predicate<Integer> isEven = n -> n%2==0;
		Predicate<Integer> isPositive = n -> n>0;
		
		System.out.println(isEven.test(67));
		System.out.println(isPositive.test(67));
		
		
	}

}
