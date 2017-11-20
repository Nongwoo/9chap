
public class Mypoint {
	private int x, y;
	
	public Mypoint(int x, int y) {
		this.x = x; //x 생성자 호출
		this.y = y; //y 생성자 호출
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) {
		Mypoint po = (Mypoint)p;
		if(x == po.x && y == po.y) //x의 값과 y의 값이 같으면 true출력
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		Mypoint p = new Mypoint(3, 50); //p객체의 Mypoint필드에 x= 3, y= 50값을 받아옴
		Mypoint q = new Mypoint(4, 50); //q객체의 Mypoint필드에 x= 4, y= 50값을 받아옴
		System.out.println(p);
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");			
	}
}
