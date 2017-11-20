
public class WhileTest {
	public  static void main(String[]args) { 
		int sum = 0, i = 0; 
		while (i < 100) { 
			sum = sum+ i;  //sum에 저장된 값에 i서 더해준다.
			i +=2 ; } //i값은 2씩 증가하는 값이다.
		System.out.println(sum);//sum값을 출력
	}

}
