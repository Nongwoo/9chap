import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >>");
		  Scanner s = new Scanner(System.in);
		  int x = s.nextInt();
		  int y = s.nextInt();
		  if(x>=100 && x<=200) {
		   if (y>=100 && y<=200) {
		    System.out.println("(" + x + "," + y + ")" + "�� �簢�� �ȿ� �ֽ��ϴ�.");
		   }
		  }
		   else 
		     System.out.println("(" + x + "," + y + ")" + "�� �簢�� �ۿ� �ֽ��ϴ�.");		    
		   		  }
	}


