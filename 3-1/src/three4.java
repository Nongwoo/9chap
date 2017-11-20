public class three4 { //DoWhile 클래스

	public static void main(String[] args) {
		int sum =0 , i=0; 
		do { 
			if (i >= 99) //i가 99이상이 되면 반복을 중단한다
				break;
			sum = sum + i; //저장된 sum값에 i를 더한다.
			i += 2; } //i는 2씩증가
		while (true); //작업문이 사실이 아니면 while문을 벗어남
		System.out.println(sum);
	}
}