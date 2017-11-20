public class ColorPoint extends Point { //Point를 상속받음
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color; //color 생성자 호출
	}
	public void setXY(int x, int y) { move(x, y); }
	
	public void setColor(String color) { this.color = color; }
	
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20); //cp객체의 setXY필드에 x= 10, y= 20값을 받아옴
		cp.setColor("RED"); //cp객체의 setColor필드에 RED값을 받아옴
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
