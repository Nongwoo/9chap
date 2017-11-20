
public class fourone {


	private String manufacturer;
	private int year;
	private int size;
		
	public fourone(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year; // year생성자 호출		
		this.size = size; //size생성자 호출
	}
	
	public void show() {
		System.out.print(this.manufacturer + "에서 만든 ");
		System.out.print(this.year + "년형 ");
		System.out.println(this.size + "인치 TV");
	}
	
	public static void main(String [] args) {
		fourone myTV = new fourone("LG", 2017, 32); // LG에서 만든 2017년 32인치, 생성자 fourone() 호출
		myTV.show();
	}
}



