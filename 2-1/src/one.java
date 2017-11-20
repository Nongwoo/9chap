public class one {
	public static void main (String[] args) {
		int intArray[][] = new int[4][4]; //4X4 배열 생성
		
		for (int i=0; i<intArray.length; i++) //행에 대한 반복
			for (int j=0; j<intArray[i].length; j++) //열에 대한 반복
				intArray[i][j] = (int)(Math.random()*10 + 1); // 1부터 10사이의 임의의 수 생성하여 저장
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}
}
