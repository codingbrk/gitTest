import java.util.HashSet;
import java.util.stream.IntStream;

public class Algorithm01 {
	public static void main(String[] args) {
		
//		10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
//		1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
		
		// 1. For���� �̿��ؼ� !!
		int sum = 0;
		for(int i = 1; i< 1000; i++) {
			if(i % 3 == 0 || i %5 == 0) sum += i;
		}
		
		System.out.println("sum : " + sum);
		
		System.out.println("-------------------------------");
		
		// 2. Stream�� ���ٽ��� �̿��ؼ�!!
		int sum2 = 0;
		
		sum2 = IntStream.range(1, 1000).filter(i -> (i%3 == 0 || i%5 ==0)).sum();
		
		System.out.println("sum2 : " + sum2);
		
		// 3. Set Collection�� �̿��ؼ� �������� ���ϴ� �������!!
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
	
		// ����!!
		// main���� ����
	}
}





