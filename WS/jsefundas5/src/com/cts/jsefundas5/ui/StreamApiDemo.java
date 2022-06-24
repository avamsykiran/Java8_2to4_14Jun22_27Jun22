package com.cts.jsefundas5.ui;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		Integer[] nums = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		Stream<Integer> s1 = Arrays.stream(nums);
		s1.forEach(System.out::println);
		Arrays.stream(nums).forEach(ele -> {ele+=10;});
		Arrays.stream(nums).forEach(System.out::println);
		
		List<Integer> numsList =Arrays.stream(nums).collect(Collectors.toList());
		System.out.println(numsList);
		
		Arrays.stream(nums).map(n -> n*n).forEach(System.out::println);
		
		Integer sum = Arrays.stream(nums).reduce((n1,n2) -> n1+n2).get();
		System.out.println(sum);
		
		Arrays.stream(nums).filter(n->n%2==0).forEach(System.out::println);
	}

}
