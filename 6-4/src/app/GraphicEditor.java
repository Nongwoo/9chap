package app; //app패키지에 소속

import base.Shape; // Shape 클래스의 경로명 알림
import derived.Circle; // Circle 클래스의 경로명 알림


public class GraphicEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle(); // shape란 이름의 circle 객체 생성
		shape.draw();
	}

}
