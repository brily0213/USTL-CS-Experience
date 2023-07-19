package demo6;
//事件处理
//界面有一个按钮、一个标签；每按动一次按钮，在标签内显示按动的次数。
//请在标记处添加必要的代码。
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T6 extends JFrame implements ActionListener {
	Container c = this.getContentPane();
	JButton B1 = new JButton("按动");
	JLabel l1 = new JLabel("显示按动次数");
	T6() {
		c.setLayout(new FlowLayout());
		//填写代码
		
		
	}
	int i = 0;
	public static void main(String args[]) {
		T6 my = new T6();
		my.setSize(500, 500);
		my.setTitle("GUI事件管理");
		my.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		//填写代码
		
	}
}
