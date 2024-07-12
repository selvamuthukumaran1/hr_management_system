package Registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Projectmng extends JFrame {
	JPanel jpl;
	JButton jc,ju,jd;
	public Projectmng()
	{
	jpl=new JPanel();
	jpl.setBorder(new EmptyBorder(10,100,10,100));
	jc=new JButton("Job Creation");
	ju=new JButton("Job Updation");
	jd=new JButton("Job Deletion");
	jpl.add(jc);
	jc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Jobc object=new Jobc();	
		}		
	});
	jd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Jdelete del=new Jdelete();
		}
	});
	ju.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Jupd del=new Jupd();
		}
	});
	jpl.add(jd);
	jpl.add(ju);
	add(jpl);
	setVisible(true);
	setTitle("Project Manager");
	setSize(400,400);
	}
	public static void main(String[] args) {
		Projectmng ob=new Projectmng();
	}
}
