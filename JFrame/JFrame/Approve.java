package Registration;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Approve extends JFrame {
	JFrame frame;
	JPanel jlp;
	JButton appo,etx,ref;
	DefaultTableModel defaultTableModel;
	JTable table;
	public Approve() {
		jlp=new JPanel();
		defaultTableModel=new DefaultTableModel();
	    table=new JTable(defaultTableModel);
	    table.setPreferredScrollableViewportSize(new Dimension(400,200));
	    table.setFillsViewportHeight(true);
	    defaultTableModel.addColumn("Name");
	    defaultTableModel.addColumn("Contact");
	    defaultTableModel.addColumn("Emailid");
		appo=new JButton("Approve");
		ref=new JButton("Refresh");
		etx=new JButton("Exit");
 	    setVisible(true);
 	    setSize(500,500);
 	    setTitle("Approval Pending Page");
 	    jlp.add(appo);
 	    jlp.add(ref);
 	    jlp.add(etx);
 	    jlp.add(new JScrollPane(table));
 	    ref.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
		    	 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration2","root","selva12345");
		    	 	Statement st=con.createStatement();
		    	    ResultSet rs=st.executeQuery("select name,mobile,email from  employee where Approvalflag='f'"); 	 
		    	    
		    	    while(rs.next()) {
		    		String name=rs.getString("name");
		    		String cont=rs.getString("mobile");
		    		String mail=rs.getString("email");
		    		defaultTableModel.addRow(new Object[] {name,cont,mail});
		    		jlp.setVisible(true);
		    		}	    		
		    		}
		    	 	catch(SQLException e1) {
		    	 			System.out.println("Error");
		    	 			e1.printStackTrace();
		    	 		}
			}
 	    });
 	    appo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==appo){
		    		try {
		         		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration2","root","selva12345");
		         	    Statement st=con.createStatement();
		                String stat="update employee set Approvalflag='t' where Approvalflag='f';"; 
	                    String stat1="insert into login select id,pass,'employee' from employee where Approvalflag='t';";
	                   PreparedStatement pre=con.prepareStatement(stat);
	                   PreparedStatement pre1=con.prepareStatement(stat1);
	                   pre.executeUpdate();
	                   pre1.executeUpdate(); 
		                 }
		         	catch(SQLException e1) {
		         			System.out.println("Error");
		         			e1.printStackTrace();
		         		}
		    		}
			}
 	    	
 	    });
 	    etx.addActionListener(new ActionListener() {
			
			

			public void actionPerformed(ActionEvent e) {
				setVisible(false);				
				
				
			}
 	    });
 	    add(jlp);
	}	
	public static void main(String[] args) {
		Approve ojb=new Approve();
	}
}
