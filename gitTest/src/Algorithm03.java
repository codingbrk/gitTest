import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Algorithm03 {

	public static void main(String[] args) {

//		���� 10 ~ 15 ������ �� ������ ������ ���غ���
//		10 = 1, 0
//		11 = 1, 1
//		12 = 1, 2
//		13 = 1, 3
//		14 = 1, 4
//		15 = 1, 5
//		�׷��Ƿ� �� ����� ���� 0:1��, 1:7��, 2:1��, 3:1��, 4:1��, 5:1��
//		
//		1 ~ 1000 �� ������ ����
		StringBuffer sb = new StringBuffer();
	    IntStream.rangeClosed(1, 1000).forEach(i -> sb.append(i));
//	    HashMap<String, Integer> resultMap = new HashMap<>();
	    int[] resultArr = new int[10];
	    
	    String[] arr = sb.toString().split("");
	    
	    for(String s : arr) {
	    	resultArr[Integer.valueOf(s)] += 1 ;
	    }
	    
	    for(int i : resultArr) {
	    	System.out.println(i);
	    }
	}
}









