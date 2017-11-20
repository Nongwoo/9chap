package main;
import etc.Calc;

public class Mainapp {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20); //c객체의 Calc필드에 x= 10, y= 20값을 받아옴
		System.out.println(c.sum()); //c객체의 sum필드에 x+y값을 받아옴
	}
}
