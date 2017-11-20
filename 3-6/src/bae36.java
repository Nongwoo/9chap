import java.util.Scanner;
public class bae36 {
	

		public static void main(String[] args) {

			int [] b = {50000,10000,5000,1000,500,100,50,10,1}; //크기가 9이고 데이터 타입이 int이며 데이터가 입력된 배열 b를 만든다.
			Scanner insert = new Scanner(System.in);
			System.out.println("금액을 입력하시오 : ");
			int won = insert.nextInt(); //입력받은 정수를 배열에 저장
			int su=0;
			for (int i = 0; i<b.length; i++) { // i값을 0부터 8까지 1씩 상승시키며 조건문 반복
				{ su = won/b[i];
				won = won % b[i];
				System.out.println(b[i] + "원" + su + "개");
				}
			}
		}
}