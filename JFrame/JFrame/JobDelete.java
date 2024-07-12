package Registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jdelete extends JFrame{
	String url="jdbc:mysql://localhost:3306/Registration2";
	String user="root";
	String password="selva12345";
	JPanel jel;
	JLabel delj;
	JTextField deljarea;
	JButton deel;
	public Jdelete()
	{
		jel=new JPanel();
		delj=new JLabel("Delete Jobpost");
		deljarea=new JTextField(20);
		deel=new JButton("Delete");
		add(jel);
		jel.add(delj);
		jel.add(deljarea);
		jel.add(deel);
		deel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==deel){
					String post=deljarea.getText();
					try {
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration2","root","selva12345");
				 		PreparedStatement pre1=con.prepareStatement("delete from jobcreate where jobpost=?");
				 		JOptionPane.showMessageDialog(null,"Job Deleted Successfully");
				 	    pre1.setString(1,post); 
				 		deljarea.setText("");
					}       	    	
					catch(SQLException e1) {
			 			System.out.println("Error");
			 			e1.printStackTrace();
			 		}
				}
			}
		});
		setVisible(true);
		setSize(400,400);
		setTitle("Job Deletion");
	}
		public static void main(String[] args) {
		Jdelete del=new Jdelete();	
		}
}


