import java.util.Scanner;
class Grade {	
	private int math;
	private int science;
	private int english;
	public Grade(int math, int science, int english) {
		this.math = math; this.science = science; this.english = english; // math, science, english �ʱ�ȭ
	}
	 public int average() {	
		return (math+science+english)/3; //3���� ��հ�
	}
}

public class fourtwo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average()); //me ��ü�� average�ʵ尪 �޾ƿ�
		
		
		scanner.close();
	}
}


