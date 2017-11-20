class fourfour {
	int x, y, width, height;
	
	public  fourfour(int x, int y, int w, int h) { // 생성자 작성
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	public int square() { // 넓이를 구하는 메소드
		return width * height ;
	}
	void show() { // 화면에 출력시키는 메소드
		System.out.print("(" + x + "," + y + ")" + "에서 크기가" + width + "x" + height + "인 사각형");
	}
	boolean contains( fourfour r) {
		return true;
	}
	public static void main(String[] args) { // main 메소드
		// TODO Auto-generated method stub
		 fourfour r = new  fourfour(2, 2, 8, 7);
		 fourfour s = new  fourfour(5, 5, 6, 6);
		 fourfour t = new  fourfour(1, 1, 10, 10);	
		r.show();
		System.out.println(" s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println(" t는 r을 포함합니다. ");
		if (t.contains(s))
		    System.out.println(" t는 s을 포함합니다. ");
	}
 
}