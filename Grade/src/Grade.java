import java.util.Scanner; 
public class Grade {
	int m;
	int s; 
	int e; 
	public Grade ( int m, int s, int e ) { 
		this.e = e ; 
		this.m = m ; 
		this.s = s; 
	}
	public int average() { 
		return (m+e+s)/3 ; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  scanner = new Scanner(System.in); 

System.out.print("수학 과학 영어 순으로 점수를 입력하쇼 " );
int m = scanner.nextInt(); 
int s = scanner.nextInt(); 
int e = scanner.nextInt(); 
Grade a = new Grade(m,s,e); 
System.out.println( "각 과목의 평균은" + a.average() +" 입니다 ");
scanner.close(); 
	}

}
