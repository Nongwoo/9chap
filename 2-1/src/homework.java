import java.util.Scanner; 
public class homework {

	public static void main(String[] args) {
		int [] a = new int[9]; // 9���� ���� ���� �迭 ����. �迭�� �̸��� i
		int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //ȯ���� ���� ����
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner insert = new Scanner(System.in); //�Է¹��� �ݾ�
		a[8] = insert.nextInt(); //�Է¹��� ������ �迭�� ����
		for (int i = 0; i<9; i++) { // i���� 0���� 8���� ���ǹ� �ݺ�
			if (i == 8 )
			{
				System.out.println(b[i]+ "�� ¥��"+ a[i]+ "��"); //i�� 8�� �Ǹ� ���
			}
			else { ////i�� 8�� �ƴѰ�� �迭�� ���� �������� ���
				 a[i] = a[8] /b[i];
				 a[8] = a[8] %b[i];
				 System.out.println(b[i]+"�� ¥�� : " + a[i]+ "��");
			}}}}
