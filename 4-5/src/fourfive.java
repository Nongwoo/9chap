import java.util.Scanner;
class Circle {
	private double x, y;	
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius; // x,y,radius �ʱ�ȭ
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
}
public class fourfive {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3]; //3���� circle �迭 ����
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); //x�� �б�
			double y = scanner.nextDouble(); //y�� �б�	 
			int radius = scanner.nextInt(); //������ �б�
			c[i] = new Circle(x,y,radius); // circle ��ü ����
		}
		for(int i=0; i<c.length; i++) c[i].show();
		scanner.close();
	}
}