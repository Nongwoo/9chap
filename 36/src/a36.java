import java.util.Scanner; 
public class a36 {

	public static void main(String[] args) {
		int [] a = new int[9]; //ũ�Ⱑ 9�̰� ������ Ÿ���� int�� �迭a�� �����.
		int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //ũ�Ⱑ 9�̰� ������ Ÿ���� int�̸� �����Ͱ� �Էµ� �迭 b�� �����.
		Scanner insert = new Scanner(System.in);
		a[8] = insert.nextInt(); //�Է¹��� ������ �迭�� ����
		for (int i = 0; i<9; i++) { // i���� 0���� 8���� 1�� ��½�Ű�� ���ǹ� �ݺ�
			if (i == 8 )
			{
				System.out.println(b[i]+ "�� ¥��"+ a[i]+ "��"); //i�� 8�� �Ǹ� ���
			}
			else {
				 a[i] = a[8] /b[i];
				 a[8] = a[8] %b[i];
				 System.out.println(b[i]+"�� ¥�� : " + a[i]+ "��"); //i�� 8�� �ƴѰ�� ����Ѵ�
			}}}}
