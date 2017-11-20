
public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio; //ratio ������ ȣ��
	}
	@Override
	protected double convert(double src) { //�������̵�
		return src/ratio;
	}

	@Override
	protected String srcString() { return "Km"; } //�������̵�

	@Override
	protected String destString() { return "mile"; } //�������̵�
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); // 1������ 1.6km
		toMile.run(); //toMile��ü�� run�ʵ尪 �޾ƿ�
	}
}