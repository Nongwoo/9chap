import java.util.*;

public class Rain {
		public static void printavg(Vector<Integer> ra) { //�����Լ�
			int avg = 0;
			int sum = 0;
			for(int i =0; i<ra.size(); i++) {//�Է��� ����ŭ �ݺ� 
				int n = ra.elementAt(i); //������ i ��° ���� 
				sum += n;
				avg = sum / ra.size();}
			System.out.println("���� ��� " + avg );}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> ra = new Vector<Integer>();
		
		while(true) {
		System.out.println("������ �Է�(0 �Է½� ����)");
		int r = scanner.nextInt();	
		ra.add(r);	
		printavg(ra);
		
		if(r == 0) // 0�̸� ����
 			break;
	}
	
	
	}
}

	
