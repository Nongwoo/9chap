import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.println("3���� ������ �Է��Ͻÿ�");
		  int x=s.nextInt();
		  int y=s.nextInt();
		  int z=s.nextInt();
		  if ((x>=y+z)||(y>=x+z)||(z>=x+y)) {
		   System.out.println("�ﰢ���� ����� �� �� �����ϴ�.");
		  }
		  else {
		   System.out.println("�ﰢ���� ��������ϴ�.");
		   
		  }
	}

}
