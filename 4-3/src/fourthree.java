public class fourthree {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public fourthree() { }
	public fourthree(String title, String artist, int year, String country) {
		this.title = title; // title ������ ȣ��
		this.artist = artist; // artist ������ ȣ��
		this.year = year; // year ������ ȣ��
		this.country = country; // country ������ ȣ��
	}

	public void show() {
		System.out.print(year + "�� ");
		System.out.print(country + "������ ");
		System.out.print(artist + "�� �θ� ");
		System.out.println(title);
	}
	public static void main(String[] args) {
		fourthree myFavorite = new fourthree("Dancing Queen", "ABBA", 1978, "������");
		myFavorite.show(); //myFavorite��ü�� show�ʵ尪 �޾ƿ�
	}

}