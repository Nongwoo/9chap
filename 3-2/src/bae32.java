import java.util.Scanner;
public class bae32 {
	

		public static void main(String[] args) {
			Scanner num = new Scanner(System.in);

		int n[][] = {{1},{1,2,3},{1,2,3,4},{1,2}}; //2���� �迭 ����
		for(int i=0; i<n.length; i++) { // i�� n.length�� ���� 1�� ��½�Ű�� �ݺ�
			for(int j=0; j<n[i].length; j++) // j�� n.length�� ���� 1�� ��½�Ű�� �ݺ�
					System.out.print(n[i][j]);
			        System.out.println(); }
		}
	}