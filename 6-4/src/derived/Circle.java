package derived; //derived패키지에 소속

import base.Shape;  // Shpae 클래스의 경로명 알림

public class Circle extends Shape {
	public void draw() { System.out.println("Circle");
}
}