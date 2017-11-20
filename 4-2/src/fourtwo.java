import java.util.Scanner;
class Grade {	
	private int math;
	private int science;
	private int english;
	public Grade(int math, int science, int english) {
		this.math = math; this.science = science; this.english = english; // math, science, english 초기화
	}
	 public int average() {	
		return (math+science+english)/3; //3과목 평균값
	}
}

public class fourtwo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average()); //me 객체의 average필드값 받아옴
		
		
		scanner.close();
	}
}


