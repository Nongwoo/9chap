public class three4 { //DoWhile Ŭ����

	public static void main(String[] args) {
		int sum =0 , i=0; 
		do { 
			if (i >= 99) //i�� 99�̻��� �Ǹ� �ݺ��� �ߴ��Ѵ�
				break;
			sum = sum + i; //����� sum���� i�� ���Ѵ�.
			i += 2; } //i�� 2������
		while (true); //�۾����� ����� �ƴϸ� while���� ���
		System.out.println(sum);
	}
}