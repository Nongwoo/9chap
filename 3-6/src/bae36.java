import java.util.Scanner;
public class bae36 {
	

		public static void main(String[] args) {

			int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //ũ�Ⱑ 9�̰� ������ Ÿ���� int�̸� �����Ͱ� �Էµ� �迭 b�� �����.
			Scanner insert = new Scanner(System.in);
			System.out.println("�ݾ��� �Է��Ͻÿ� : ");
			int won = insert.nextInt(); //�Է¹��� ������ �迭�� ����
			int su=0;
			for (int i = 0; i<b.length; i++) { // i���� 0���� 8���� 1�� ��½�Ű�� ���ǹ� �ݺ�
				{ su = won/b[i];
				won = won % b[i];
				System.out.println(b[i] + "��" + su + "��");
				}
			}
		}
}