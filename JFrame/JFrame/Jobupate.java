package Registration;
import javax.swing.*;
public class Jupd extends JFrame {
	String url="jdbc:mysql://localhost:3306/Registration2";
	String user="root";
	String password="selva12345";
	JPanel jpel;
	JLabel ut;
	JTextField utarea;
	JButton ute;
	public Jupd() {
		jpel=new JPanel();
		ut=new JLabel("Update Jobpost");
		utarea=new JTextField(20);
		ute=new JButton("Update");
		add(jpel);
		jpel.add(ut);
		jpel.add(utarea);
		jpel.add(ute);
		setVisible(true);
		setTitle("Job Updation");
		setSize(400,400);
	}
	public static void main(String[] args) {
		Jupd upd=new Jupd();
	}
}
