import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LaunchApp1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(5,8,3,9,2,6,1);

		// pick odd numbers, double it, and sum it.

		int sum = 0;

//		Predicate<Integer> predicate = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer n) {
//				System.out.println("predicate for value " + n);
//				return n%2 != 0;
//			}
//		};
//		Function<Integer, Integer> function = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer n) {
//				System.out.println("function for value " + n);
//				return n * 2;
//			}
//		};
//		BinaryOperator<Integer> op = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer c, Integer e) {
//				System.out.println("biOp for value " + e);
//				return c + e;
//			}
//		};

		Predicate<Integer> predicate =  n -> n%2 != 0;
		Function<Integer, Integer> function = n -> n * 2;
		BinaryOperator<Integer> op = (c, e) -> c + e;


		Stream<Integer> stream1 = nums.stream();
		Stream<Integer> stream2 = stream1.filter(predicate); // intermediate
		Stream<Integer> stream3 = stream2.map(function); // intermediate
		int result = stream3.reduce(0, op);       // terminal

		//System.out.println(result);

		int sum1 = nums.stream()
				.filter(n -> n%2!=0)
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+e);





//		for(int i=0;i<nums.size();i++){
//			if(nums.get(i) % 2 != 0){
//				int dou = nums.get(i) * 2;
//				sum = sum + dou;
//			}
//		}




//		System.out.println(sum1);
//		System.out.println(nums);

	}

}
