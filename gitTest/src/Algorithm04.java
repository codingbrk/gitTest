import java.util.stream.IntStream;

public class Algorithm04 {
	public static void main(String[] args) {
		
//		1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
//		8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
//		(�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
		  long stTime = System.currentTimeMillis();
		  
		  StringBuffer sb = new StringBuffer();
		  IntStream.rangeClosed(1, 10000).forEach(i -> sb.append(i));
		  
		  System.out.println(" 8�� ������ : "   +  (sb.toString().split("8").length -1));
		  
		  long edTime = System.currentTimeMillis();
		  System.out.println(" ��� �ð� : " + (edTime - stTime));
		  
	}
}
