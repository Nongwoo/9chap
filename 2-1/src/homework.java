import java.util.Scanner; 
public class homework {

	public static void main(String[] args) {
		int [] a = new int[9]; // 9개의 정수 공간 배열 생성. 배열의 이름은 i
		int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //환산할 돈의 종류
		System.out.print("금액을 입력하시오>>");
		Scanner insert = new Scanner(System.in); //입력받을 금액
		a[8] = insert.nextInt(); //입력받은 정수를 배열에 저장
		for (int i = 0; i<9; i++) { // i값은 0에서 8까지 조건문 반복
			if (i == 8 )
			{
				System.out.println(b[i]+ "원 짜리"+ a[i]+ "개"); //i가 8이 되면 출력
			}
			else { ////i가 8이 아닌경우 배열을 나눈 나머지값 출력
				 a[i] = a[8] /b[i];
				 a[8] = a[8] %b[i];
				 System.out.println(b[i]+"원 짜리 : " + a[i]+ "개");
			}}}}
