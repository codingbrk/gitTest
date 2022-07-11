import java.util.HashSet;
import java.util.stream.IntStream;

public class Algorithm01 {
	public static void main(String[] args) {
		
//		10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//		1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		
		// 1. For문을 이용해서 !!
		int sum = 0;
		for(int i = 1; i< 1000; i++) {
			if(i % 3 == 0 || i %5 == 0) sum += i;
		}
		
		System.out.println("sum : " + sum);
		
		System.out.println("-------------------------------");
		
		// 2. Stream과 람다식을 이용해서!!
		int sum2 = 0;
		
		sum2 = IntStream.range(1, 1000).filter(i -> (i%3 == 0 || i%5 ==0)).sum();
		
		System.out.println("sum2 : " + sum2);
		
		// 3. Set Collection을 이용해서 합집합을 구하는 방식으로!!
		int sum3 = 0;
		HashSet<Integer> j3 = new HashSet<>();
		HashSet<Integer> j5 = new HashSet<>();
		for(int i = 1; i < 1000; i++) {
			if(i % 3 == 0) j3.add(i);
			if(i % 5 == 0) j5.add(i);
		}
		
		j3.addAll(j5);
		
		sum3 = j3.stream().mapToInt(i->i).sum();
		System.out.println("sum3 : " + sum3);
	
		// 수정!!
		// main에서 수정
	}
}





