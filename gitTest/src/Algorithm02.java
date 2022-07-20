import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Algorithm02 {
	
	public static void main(String[] args) {
		
//		� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
//		���� ���
//		d(91) = 9 + 1 + 91 = 101
//		�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
//		� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
//		�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. 
//		���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
//		1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
		       
			HashSet<Integer> set = new HashSet<>();
			ArrayList<Integer> list = new ArrayList<>();
			IntStream.range(1,  5000).forEach(i -> set.add(i)); 
			
			String[] arr;
			int tmp = 0;
			
			for(int i = 0; i <= 5000; i++) {
				arr = (i + "").split("");
				tmp = i + Arrays.asList(arr).stream().mapToInt(p -> Integer.valueOf(p)).sum();
				set.remove(tmp);
			}
			
			System.out.println(set.stream().mapToInt(i->i).sum());
	}
}











