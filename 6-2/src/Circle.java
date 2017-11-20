

public class Circle {
	private int x, y,radius;
	
	public Circle(int x, int y,int radius) {
		this.x = x; //x 생성자 호출
		this.y = y;//y 생성자 호출
		this.radius = radius;
	}
	
	public String toString() {
		return "원 a : Circle(" + x + "," + y + ")" + " 반지름 " + radius;
	}

	public boolean equals(Object p) {
		 Circle po = (Circle)p;
		if(x == po.x && y == po.y) //x의 값과 y의 값이 같으면 true출력
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		 Circle p = new Circle(2, 3, 5); //p객체의 Circle필드에 x= 2, y= 3, radius = 5값을 받아옴
		 Circle q = new Circle(2, 3, 50); //q객체의 Circle필드에 x= 2, y= 3, radius = 50값을 받아옴
		System.out.println(p);
		System.out.println(q);
		if(p.equals(q)) System.out.println("같은 원");
		else System.out.println("다른 원");			
	}
}
