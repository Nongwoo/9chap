import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class fourseven {
	private int nDays; 
	private Day [] days; // Day 객체 배열
	private Scanner scanner;
	
	public fourseven(int nDays) {
		this.nDays = nDays;		
		this.days = new Day [nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);		
	}
	