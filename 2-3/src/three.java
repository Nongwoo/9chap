import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �׼��� �Է��ϼ��� : ");
		  Scanner a = new Scanner(System.in);
		  int money = a.nextInt();
		  int aoman, aman, achoen, aobak, abak, aosib, asib, ail;
		  aoman = money/50000;
		  money = money%50000;
		  System.out.println("���� ���� : " + aoman + "��");
		  
		  aman = money/10000;
		  money = money%10000;
		  System.out.println("�� ���� : " + aman + "��");
		  
		  achoen = money/1000;
		  money = money%1000;
		  System.out.println("õ ���� : " + achoen + "��");
		  
		  aobak = money/500;
		  money = money%500;
		  System.out.println("����� : " + aobak + "��");
		  
		  abak = money/100;
		  money = money%100;
		  System.out.println("�� �� : " + abak + "��");
		  
		  aosib = money/50;
		  money = money%50;
		  System.out.println("���ʿ� : " + aosib + "��");
		  
		  asib = money/10;
		  money = money%10;
		  System.out.println("�� �� : " + asib + "��");
		  
		  ail = money;
		  System.out.println("�� �� : " + ail + "��");
	}

}
