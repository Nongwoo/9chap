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

System.out.print("���� ���� ���� ������ ������ �Է��ϼ� " );
int m = scanner.nextInt(); 
int s = scanner.nextInt(); 
int e = scanner.nextInt(); 
Grade a = new Grade(m,s,e); 
System.out.println( "�� ������ �����" + a.average() +" �Դϴ� ");
scanner.close(); 
	}

}
