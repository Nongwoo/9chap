
public class Mypoint {
	private int x, y;
	
	public Mypoint(int x, int y) {
		this.x = x; //x ������ ȣ��
		this.y = y; //y ������ ȣ��
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) {
		Mypoint po = (Mypoint)p;
		if(x == po.x && y == po.y) //x�� ���� y�� ���� ������ true���
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		Mypoint p = new Mypoint(3, 50); //p��ü�� Mypoint�ʵ忡 x= 3, y= 50���� �޾ƿ�
		Mypoint q = new Mypoint(4, 50); //q��ü�� Mypoint�ʵ忡 x= 4, y= 50���� �޾ƿ�
		System.out.println(p);
		if(p.equals(q)) System.out.println("���� ��");
		else System.out.println("�ٸ� ��");			
	}
}
