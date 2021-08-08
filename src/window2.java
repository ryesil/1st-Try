

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window2 {
public static void main(String[] args) {

	
	JFrame yourframe = new JFrame("HELLO");
	JTextField a = new JTextField();
	yourframe.setLocation(300,300);
	JLabel b = new JLabel("Mr Enes is...");
	JButton c = new JButton("worse");
	JButton d = new JButton("the worst");
	
	
	GridLayout gl = new GridLayout();
	gl.setColumns(3);
	gl.setRows(1);
	yourframe.setLayout(gl);
	yourframe.add(b);
	yourframe.add(c);
	yourframe.add(d);
	yourframe.setSize(500 , 200);
	yourframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	yourframe.setVisible(true);
	
	}
	
	
	
	
	
	
	
	

	}

