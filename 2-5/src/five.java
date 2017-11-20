import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.println("3개의 정수를 입력하시오");
		  int x=s.nextInt();
		  int y=s.nextInt();
		  int z=s.nextInt();
		  if ((x>=y+z)||(y>=x+z)||(z>=x+y)) {
		   System.out.println("삼각형이 만들어 질 수 없습니다.");
		  }
		  else {
		   System.out.println("삼각형이 만들어집니다.");
		   
		  }
	}

}
