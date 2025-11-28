package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfElements {

	public static void main(String args[]) {
		List<String> items = Arrays.asList("apple","banana","apple");
		Map<String, Long> freq = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
	}
}
