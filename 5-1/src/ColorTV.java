
public class ColorTV extends TV { //TV�� ��ӹ���
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors; //nColors ������ ȣ��
	}
	
	public void printProperty() {
		System.out.println(getSize() + "��ġ " + nColors + "�÷�");
	}
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();//myTV ��ü�� printProperty�ʵ尪 �޾ƿ�
	}

}
