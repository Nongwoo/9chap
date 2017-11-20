import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyPlusMinusFrame extends JFrame {
	public KeyPlusMinusFrame() {
		super("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");//�ʱ� ���̺� ����  
		c.add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		label.addKeyListener(new KeyAdapter() {//arial ��Ʈ�� 10�ȼ� ũ�� 
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {//+ Ű�� �������� 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}                      // arial ��Ʈ�� ������ 5 �÷���                
				else if(e.getKeyChar() == '-') { // - Ű�� �������� 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				 // arial ��Ʈ�� ������ 5 ���̳ʽ� 
			}});
		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true); 
		label.requestFocus();
	}
	static public void main(String [] args) {
		new KeyPlusMinusFrame();//������ ���� 
	}
}