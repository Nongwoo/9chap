class fourfour {
	int x, y, width, height;
	
	public  fourfour(int x, int y, int w, int h) { // ������ �ۼ�
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	public int square() { // ���̸� ���ϴ� �޼ҵ�
		return width * height ;
	}
	void show() { // ȭ�鿡 ��½�Ű�� �޼ҵ�
		System.out.print("(" + x + "," + y + ")" + "���� ũ�Ⱑ" + width + "x" + height + "�� �簢��");
	}
	boolean contains( fourfour r) {
		return true;
	}
	public static void main(String[] args) { // main �޼ҵ�
		// TODO Auto-generated method stub
		 fourfour r = new  fourfour(2, 2, 8, 7);
		 fourfour s = new  fourfour(5, 5, 6, 6);
		 fourfour t = new  fourfour(1, 1, 10, 10);	
		r.show();
		System.out.println(" s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println(" t�� r�� �����մϴ�. ");
		if (t.contains(s))
		    System.out.println(" t�� s�� �����մϴ�. ");
	}
 
}