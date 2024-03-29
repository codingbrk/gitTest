import java.util.stream.IntStream;

public class Algorithm04 {
	public static void main(String[] args) {
		
//		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
//		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		  long stTime = System.currentTimeMillis();
		  
		  StringBuffer sb = new StringBuffer();
		  IntStream.rangeClosed(1, 10000).forEach(i -> sb.append(i));
		  
		  System.out.println(" 8의 갯수는 : "   +  (sb.toString().split("8").length -1));
		  
		  long edTime = System.currentTimeMillis();
		  System.out.println(" 경과 시간 : " + (edTime - stTime));
		  
	}
}
