package demo6;
//�¼�����
//������һ����ť��һ����ǩ��ÿ����һ�ΰ�ť���ڱ�ǩ����ʾ�����Ĵ�����
//���ڱ�Ǵ���ӱ�Ҫ�Ĵ��롣
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T6 extends JFrame implements ActionListener {
	Container c = this.getContentPane();
	JButton B1 = new JButton("����");
	JLabel l1 = new JLabel("��ʾ��������");
	T6() {
		c.setLayout(new FlowLayout());
		//��д����
		
		
	}
	int i = 0;
	public static void main(String args[]) {
		T6 my = new T6();
		my.setSize(500, 500);
		my.setTitle("GUI�¼�����");
		my.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		//��д����
		
	}
}
