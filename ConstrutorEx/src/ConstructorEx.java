

public class ConstructorEx {
	int x; 
	public void setX(int x) { this.x= x; } 
	public int getX() { return x; } 
	public ConstructorEx ( int x ) { 
		this.x = x; 
	}
	public ConstructorEx () { 
		this.x = 0; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx a = new ConstructorEx(); 
		int n = a.getX(); 
	}

}
