import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점 (x,y)의 좌표를 입력하시오 >>");
		  Scanner s = new Scanner(System.in);
		  int x = s.nextInt();
		  int y = s.nextInt();
		  if(x>=100 && x<=200) {
		   if (y>=100 && y<=200) {
		    System.out.println("(" + x + "," + y + ")" + "는 사각형 안에 있습니다.");
		   }
		  }
		   else 
		     System.out.println("(" + x + "," + y + ")" + "는 사각형 밖에 있습니다.");		    
		   		  }
	}


