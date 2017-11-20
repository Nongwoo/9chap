import java.util.Scanner;
public class two {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}}; //2차원 배열 5개
		for(int i = 0; i<n.length; i++) { //n배열의 크기 반복
			for(int j=0; j<n[i].length; j++) // j가 n배열의 크기보다 작으면 반복
	System.out.print(n[i][j]);
	System.out.println();
	} 
	}
}


