package main;
import etc.Calc;

public class Mainapp {
	public static void main(String[] args) {
		Calc c = new Calc(10, 20); //c��ü�� Calc�ʵ忡 x= 10, y= 20���� �޾ƿ�
		System.out.println(c.sum()); //c��ü�� sum�ʵ忡 x+y���� �޾ƿ�
	}
}
