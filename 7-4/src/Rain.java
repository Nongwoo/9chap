import java.util.*;

public class Rain {
		public static void printavg(Vector<Integer> ra) { //벡터함수
			int avg = 0;
			int sum = 0;
			for(int i =0; i<ra.size(); i++) {//입력한 수만큼 반복 
				int n = ra.elementAt(i); //벡터의 i 번째 정수 
				sum += n;
				avg = sum / ra.size();}
			System.out.println("현재 평균 " + avg );}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> ra = new Vector<Integer>();
		
		while(true) {
		System.out.println("강수량 입력(0 입력시 종료)");
		int r = scanner.nextInt();	
		ra.add(r);	
		printavg(ra);
		
		if(r == 0) // 0이면 종료
 			break;
	}
	
	
	}
}

	
