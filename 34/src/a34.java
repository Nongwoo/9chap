import java.util.Scanner; 
public class a34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num; 
		char alp;
		do {
			System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>>");
			alp = scanner.next().charAt(0); //���� �Է�
			} while((alp>'z'&&alp>= 'a')||(alp>'Z'&&alp<'A')); // || ������ ������� �� ���� �� �ϳ��� ���̾ �ݺ��� ����
		if (alp<='Z'&& alp >='A' ) // ���� �Ѵ� ���� ��쿡�� ����
			num = (int)alp -'A';
		else 
			num = (int)alp - 'a';
		for (int i =num; i>= 0; i--)
		{
			for (int j = 0; j<= i; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
		

	}

}
