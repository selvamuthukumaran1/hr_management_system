package Registration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Hrpage extends JFrame{
	JPanel jp;
	JLabel hr;
	JButton ap,jm;
	  public Hrpage() {
		  jp=new JPanel();
		  hr=new JLabel("HR Page");
		  ap=new JButton("Approval Pending");
		  jm=new JButton("Job Mapping");
		  jp.setBorder(new EmptyBorder(10,150,10,150));
		  jp.add(hr);
		  jp.add(ap);
		  jp.add(jm);
		  ap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Approve ojb=new Approve();
			}
		  });
		  add(jp);
		  setVisible(true);
		  setSize(500,500);
		  setTitle("HR Page");
	  }
	public static void main(String[] args) {
	Hrpage obj = new Hrpage();
	}
}
