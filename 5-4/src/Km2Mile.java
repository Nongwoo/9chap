
public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio; //ratio 생성자 호출
	}
	@Override
	protected double convert(double src) { //오버라이딩
		return src/ratio;
	}

	@Override
	protected String srcString() { return "Km"; } //오버라이딩

	@Override
	protected String destString() { return "mile"; } //오버라이딩
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run(); //toMile객체의 run필드값 받아옴
	}
}