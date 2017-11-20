class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio; //ratio 생성자 호출
	}
	
	@Override 
	protected double convert(double src) {//오버라이딩
		return src/ratio;
	}

	@Override 
	protected String srcString() { return "원"; } //오버라이딩

	@Override 
	protected String destString() { return "달러"; } //오버라이딩
	
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run(); //toDollar 객체의 run필드값 받아옴
	}
}