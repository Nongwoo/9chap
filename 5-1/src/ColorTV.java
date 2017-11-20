
public class ColorTV extends TV { //TV를 상속받음
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors; //nColors 생성자 호출
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + nColors + "컬러");
	}
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();//myTV 객체의 printProperty필드값 받아옴
	}

}
