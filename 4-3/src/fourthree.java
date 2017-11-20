public class fourthree {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public fourthree() { }
	public fourthree(String title, String artist, int year, String country) {
		this.title = title; // title 생성자 호출
		this.artist = artist; // artist 생성자 호출
		this.year = year; // year 생성자 호출
		this.country = country; // country 생성자 호출
	}

	public void show() {
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "가 부른 ");
		System.out.println(title);
	}
	public static void main(String[] args) {
		fourthree myFavorite = new fourthree("Dancing Queen", "ABBA", 1978, "스웨덴");
		myFavorite.show(); //myFavorite객체의 show필드값 받아옴
	}

}