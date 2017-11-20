

public class Circle {
	private int x, y,radius;
	
	public Circle(int x, int y,int radius) {
		this.x = x; //x ������ ȣ��
		this.y = y;//y ������ ȣ��
		this.radius = radius;
	}
	
	public String toString() {
		return "�� a : Circle(" + x + "," + y + ")" + " ������ " + radius;
	}

	public boolean equals(Object p) {
		 Circle po = (Circle)p;
		if(x == po.x && y == po.y) //x�� ���� y�� ���� ������ true���
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		 Circle p = new Circle(2, 3, 5); //p��ü�� Circle�ʵ忡 x= 2, y= 3, radius = 5���� �޾ƿ�
		 Circle q = new Circle(2, 3, 50); //q��ü�� Circle�ʵ忡 x= 2, y= 3, radius = 50���� �޾ƿ�
		System.out.println(p);
		System.out.println(q);
		if(p.equals(q)) System.out.println("���� ��");
		else System.out.println("�ٸ� ��");			
	}
}
