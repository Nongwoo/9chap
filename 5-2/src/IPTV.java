
public class IPTV extends TV {  //TV�� ��ӹ���
	private int nColors;
	public IPTV(String ip, int size, int nColors) {
		super(ip,size);	
		this.nColors = nColors; //nColors ������ ȣ��
	}
	public void printProperty() {
		System.out.println("���� IPTV�� " + getIp() + "�ּ��� " + getSize() + "��ġ " + nColors + "�÷�");
	}
	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
		myTV.printProperty();//myTV ��ü�� printProperty�ʵ尪 �޾ƿ�
	


	}

}

