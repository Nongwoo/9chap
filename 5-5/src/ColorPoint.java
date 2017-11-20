public class ColorPoint extends Point { //Point�� ��ӹ���
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color; //color ������ ȣ��
	}
	public void setXY(int x, int y) { move(x, y); }
	
	public void setColor(String color) { this.color = color; }
	
	public String toString() {
		return color + "���� (" + getX() + "," + getY() + ")�� ��";
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20); //cp��ü�� setXY�ʵ忡 x= 10, y= 20���� �޾ƿ�
		cp.setColor("RED"); //cp��ü�� setColor�ʵ忡 RED���� �޾ƿ�
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}
}
