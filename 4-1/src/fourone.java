
public class fourone {


	private String manufacturer;
	private int year;
	private int size;
		
	public fourone(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year; // year������ ȣ��		
		this.size = size; //size������ ȣ��
	}
	
	public void show() {
		System.out.print(this.manufacturer + "���� ���� ");
		System.out.print(this.year + "���� ");
		System.out.println(this.size + "��ġ TV");
	}
	
	public static void main(String [] args) {
		fourone myTV = new fourone("LG", 2017, 32); // LG���� ���� 2017�� 32��ġ, ������ fourone() ȣ��
		myTV.show();
	}
}



