
public class Algorithm05 {
	
	public static void main(String[] args) {
		
//	    6 6
//		  0   1   2   3   4   5
//		 19  20  21  22  23   6
//		 18  31  32  33  24   7
//		 17  30  35  34  25   8
//		 16  29  28  27  26   9
//		 15  14  13  12  11  10
//		위처럼 6 6이라는 입력을 주면 6 X 6 매트릭스에 나선형 회전을 한 값을 출력해야 한다.
		
		int i = 9;
		int ii = 8;
		int[][] resultArr = new int[ii][i];
		
		int x = 0, y = 0;
		int xMax = i, yMax = ii;
		int xMin = 0, yMin = 0;
		int xInc = 0, yInc = 0;
		boolean first = false;
		
		for(int r = 0; r < i *ii; r++) {
			x += xInc;
			y += yInc;
			
			resultArr[y][x] = r;
			
			if(x == xMin && y == yMin) {
				xInc = 1;
				yInc = 0;
				xMax -= 1;
			}
			
			if(x == xMax && y == yMin) {
				xInc = 0;
				yInc = 1;
				yMax -= 1;
			}
			
			if(x == xMax && y == yMax) {
				xInc = -1;
				yInc = 0;
				if(first)xMin += 1;
				first  = true;
			}
			
			if(x == xMin && y == yMax) {
				xInc = 0;
				yInc = -1;
				yMin += 1;
			}
		}
		
		for(int k = 0; k < i; k++) {
			for(int j = 0; j < i; j++) {
				System.out.print(resultArr[k][j] + "\t");
			}
			System.out.println();
		}
	}
}


























