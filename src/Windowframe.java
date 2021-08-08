import javax.swing.JFrame;

public class Windowframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame myframe = new JFrame();
String myTitle = "blank frame";
myframe.setTitle(myTitle);
myframe.setSize(200 , 300);
myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myframe.setVisible(true);

	}

}
