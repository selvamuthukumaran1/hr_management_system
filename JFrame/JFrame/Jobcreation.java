package Registration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Jobc extends JFrame {
	String url="jdbc:mysql://localhost:3306/Registration2";
	String user="root";
	String password="selva12345";
	JPanel jal;
	JLabel jb,sk,exp,created;
	JTextField jbarea, skarea, exparea;
	JButton crt;
	public Jobc() {
		jal=new JPanel();
		created=new JLabel();
		jb=new JLabel("Jobpost");
		sk=new JLabel("Skills");
		exp=new JLabel("Experience");
		jbarea=new JTextField(20);
		skarea=new JTextField(20);
		exparea=new JTextField(20);
		crt=new JButton("Create");
		crt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==crt){
				      String jobpost=jbarea.getText();
				   	  String skills=skarea.getText();
				   	  String experience=exparea.getText();
				   	try {
				 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration2","root","selva12345");
				 	    Statement st=con.createStatement();
				        String state="insert into jobcreate values(' "+jobpost+" ',' "+skills+" ','"+experience+"');";
				 	    st.executeUpdate(state);
				 	    JOptionPane.showMessageDialog(null,"Jobpost Successfully Created");
				 	    jbarea.setText("");
				 	    skarea.setText("");
				 	    exparea.setText("");
					 }
				 	catch(SQLException e1) {
				 			System.out.println("Error");
				 			e1.printStackTrace();
				 		}
				   }
			}	
		});
		jal.setBorder(new EmptyBorder(10,50,10,50));
		add(jal);
		jal.add(jb);
		jal.add(jbarea);
		jal.add(sk);
		jal.add(skarea);
		jal.add(exp);
		jal.add(exparea);
		jal.add(crt);
		setVisible(true);
		setTitle("Job Creation");
		setSize(400,400);
	}
	public static void main(String[] args) {
		Jobc object=new Jobc();
	}
}