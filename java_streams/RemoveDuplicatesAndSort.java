package java_streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndSort {
	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(8,5,6,3,3,6,8,7,1,2);
		nums.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}
}
