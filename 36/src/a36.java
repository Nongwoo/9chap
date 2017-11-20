import java.util.Scanner; 
public class a36 {

	public static void main(String[] args) {
		int [] a = new int[9]; //크기가 9이고 데이터 타입이 int인 배열a를 만든다.
		int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //크기가 9이고 데이터 타입이 int이며 데이터가 입력된 배열 b를 만든다.
		Scanner insert = new Scanner(System.in);
		a[8] = insert.nextInt(); //입력받은 정수를 배열에 저장
		for (int i = 0; i<9; i++) { // i값을 0부터 8까지 1씩 상승시키며 조건문 반복
			if (i == 8 )
			{
				System.out.println(b[i]+ "원 짜리"+ a[i]+ "개"); //i가 8이 되면 출력
			}
			else {
				 a[i] = a[8] /b[i];
				 a[8] = a[8] %b[i];
				 System.out.println(b[i]+"원 짜리 : " + a[i]+ "개"); //i가 8이 아닌경우 출력한다
			}}}}
