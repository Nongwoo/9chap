import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y,z;
		  int a,b,c,d,e,f;
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("정수 3개 입력");
		  x = scanner.nextInt();
		  y = scanner.nextInt();	 
		  z = scanner.nextInt();
		  
		  a = (x >= y )? x:y ;
		  b = (y >= z )? y:z;
		  c = (z >= x )? z:x;
		  
		  d = a <= b? a : b;
		  e = b <= c? b : c;
		  f = d <= e? d : e;
		  System.out.println("중간 값은 " + f);
	}

}
