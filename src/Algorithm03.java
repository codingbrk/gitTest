import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Algorithm03 {

	public static void main(String[] args) {

//		예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
//		10 = 1, 0
//		11 = 1, 1
//		12 = 1, 2
//		13 = 1, 3
//		14 = 1, 4
//		15 = 1, 5
//		그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
//		
//		1 ~ 1000 각 숫자의 개수
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









