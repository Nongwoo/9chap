import java.util.Scanner; 
public class a39 {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		int intArray[][];
		intArray = new int[4][4]; // ���� ���ΰ� 4x4�� 2���� �迭 ����
		for (int i = 0; i<4;i++) { // i=0 ���� �����ؼ� 1�� �����Ͽ� 3���� �ݺ��ϰ� 4�� �Ǹ� �ݺ� ���� �迭�� ���� ����
			for (int j =0; j<4; j++) { //��=0 ���� �����ؼ� 1�� �����Ͽ� 3���� �ݺ��ϰ� 4�� �Ǹ� �ݺ� ���� �迭�� ���� ����
				int k =(int) Math.round(Math.random()*9+1);
				intArray[i][j] = k;
				System.out.print(intArray[i][j] + " ");	}
			System.out.println();}}}
