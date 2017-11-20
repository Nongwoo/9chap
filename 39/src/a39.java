import java.util.Scanner; 
public class a39 {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int intArray[][];
		intArray = new int[4][4]; // 가로 세로가 4x4인 2차원 배열 생성
		for (int i = 0; i<4;i++) { // i=0 부터 시작해서 1씩 증가하여 3까지 반복하고 4가 되면 반복 중지 배열의 가로 역할
			for (int j =0; j<4; j++) { //ㅓ=0 부터 시작해서 1씩 증가하여 3까지 반복하고 4가 되면 반복 중지 배열의 세로 역할
				int k =(int) Math.round(Math.random()*9+1);
				intArray[i][j] = k;
				System.out.print(intArray[i][j] + " ");	}
			System.out.println();}}}
