class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio; //ratio ������ ȣ��
	}
	
	@Override 
	protected double convert(double src) {//�������̵�
		return src/ratio;
	}

	@Override 
	protected String srcString() { return "��"; } //�������̵�

	@Override 
	protected String destString() { return "�޷�"; } //�������̵�
	
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200��
		toDollar.run(); //toDollar ��ü�� run�ʵ尪 �޾ƿ�
	}
}