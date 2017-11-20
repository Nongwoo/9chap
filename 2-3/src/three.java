import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("돈의 액수를 입력하세요 : ");
		  Scanner a = new Scanner(System.in);
		  int money = a.nextInt();
		  int aoman, aman, achoen, aobak, abak, aosib, asib, ail;
		  aoman = money/50000;
		  money = money%50000;
		  System.out.println("오만 원권 : " + aoman + "매");
		  
		  aman = money/10000;
		  money = money%10000;
		  System.out.println("만 원권 : " + aman + "매");
		  
		  achoen = money/1000;
		  money = money%1000;
		  System.out.println("천 원권 : " + achoen + "매");
		  
		  aobak = money/500;
		  money = money%500;
		  System.out.println("오백원 : " + aobak + "개");
		  
		  abak = money/100;
		  money = money%100;
		  System.out.println("백 원 : " + abak + "개");
		  
		  aosib = money/50;
		  money = money%50;
		  System.out.println("오십원 : " + aosib + "개");
		  
		  asib = money/10;
		  money = money%10;
		  System.out.println("십 원 : " + asib + "개");
		  
		  ail = money;
		  System.out.println("일 원 : " + ail + "개");
	}

}
