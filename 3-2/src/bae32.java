import java.util.Scanner;
public class bae32 {
	

		public static void main(String[] args) {
			Scanner num = new Scanner(System.in);

		int n[][] = {{1},{1,2,3},{1,2,3,4},{1,2}}; //2차원 배열 생성
		for(int i=0; i<n.length; i++) { // i를 n.length값 까지 1씩 상승시키며 반복
			for(int j=0; j<n[i].length; j++) // j를 n.length값 까지 1씩 상승시키며 반복
					System.out.print(n[i][j]);
			        System.out.println(); }
		}
	}