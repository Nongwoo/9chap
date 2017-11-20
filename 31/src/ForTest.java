
public class ForTest {

	public static void main(String[] args) {
		int sum= 0, i =0;
		for (i=0; i<100; i+=2) //i값이 0부터 100에 도달할때까지 2씩 증가한다  
			sum = sum+i; //저장된 sum값에 for문이 다 할때까지 i를 더해준다.
		
	System.out.println(sum); //sum값을 출력한다.

	}

}
