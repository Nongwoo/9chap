import java.util.Scanner;
public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		  int number;
		  int first;
		  int last;
		  while(true) {
		   System.out.println("1~99������ ������ �Է��Ͻÿ�");
		   number = a.nextInt();
		   first = number/10;
		   last = number%10;
		   if(first%3==0 || last%3==0)
		    if(first%3==0 && last%3==0)
		     System.out.println("�ڼ�¦¦");
		    else
		     System.out.println("�ڼ�¦");
		  }
	}

}
