
public class IPTV extends TV {  //TV를 상속받음
	private int nColors;
	public IPTV(String ip, int size, int nColors) {
		super(ip,size);	
		this.nColors = nColors; //nColors 생성자 호출
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + getIp() + "주소의 " + getSize() + "인치 " + nColors + "컬러");
	}
	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
		myTV.printProperty();//myTV 객체의 printProperty필드값 받아옴
	


	}

}

