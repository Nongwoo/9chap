public class one {
	public static void main (String[] args) {
		int intArray[][] = new int[4][4]; //4X4 �迭 ����
		
		for (int i=0; i<intArray.length; i++) //�࿡ ���� �ݺ�
			for (int j=0; j<intArray[i].length; j++) //���� ���� �ݺ�
				intArray[i][j] = (int)(Math.random()*10 + 1); // 1���� 10������ ������ �� �����Ͽ� ����
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}
}
