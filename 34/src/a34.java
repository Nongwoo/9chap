import java.util.Scanner; 
public class a34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num; 
		char alp;
		do {
			System.out.print("알파벳 한 문자를 입력하세요>>>");
			alp = scanner.next().charAt(0); //문자 입력
			} while((alp>'z'&&alp>= 'a')||(alp>'Z'&&alp<'A')); // || 연산자 사용으로 두 조건 중 하나만 참이어도 반복문 실행
		if (alp<='Z'&& alp >='A' ) // 조건 둘다 참일 경우에만 실행
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
