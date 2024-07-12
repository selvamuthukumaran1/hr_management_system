package Registration;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Registration extends JFrame {
	String url="jdbc:mysql://localhost:3306/Registration2";
	String user="root";
	String password="selva12345";
	JFrame frame;
	JPanel jPael;
	JLabel employee, userid, pass, contnum, exper,skill, emai, label;
	JTextField empname, usre, pasw, ctn, expe, sk, mil;
	JButton regi, exit;
public Registration()
{
	frame=new JFrame();
	label=new JLabel();
	jPael = new JPanel();
	jPael.setBackground(Color.WHITE);
	employee = new JLabel("Employee Name");
	userid = new JLabel("User ID");
	pass = new JLabel("Password");
	contnum = new JLabel("Contact Number");
	exper = new JLabel("Experience");
	skill = new JLabel("Skill Set");
	emai = new JLabel("Email-ID");
	empname = new JTextField(20);
	usre = new JTextField(20);
	pasw = new JTextField(20);
	ctn = new JTextField(20);
	expe = new JTextField(20);
	sk = new JTextField(20);
	mil = new JTextField(20);
	label.setText("");
	regi = new JButton("Register");
	exit = new JButton("Exit");
	regi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==regi) {        
		    	 String name=empname.getText();
		    	 String id=usre.getText();
		    	 String pass=pasw.getText();
		    	 String mobile=ctn.getText();
		    	 String exp=expe.getText();
		    	 String skill=sk.getText();
		    	 String email=mil.getText();
		    	  
		    	 int lengh=mobile.length();
			     int lengh1=name.length();
			     int lengh2=id.length();
			     int lengh3=exp.length();
			     int lengh4=skill.length();
			     int lengh5=email.length();
		    	 
		if(lengh!=10) {
			        	JOptionPane.showMessageDialog(null,"Enter valid mobile number");
			        }
		         String pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()%–^[{}]:;',?/*~$^+=<>])(?=\\S+$).{8,20}$";
		    	 String pattern2="^(?=.*[@])(?=.*[.])(?=.*[com]).{10,35}$";
		    	 String pattern3="[a-z A-Z]{2,20}";
	            if(name.matches(pattern3)) {

		    	 }
		    	 else {
		    			JOptionPane.showMessageDialog(null,"Name must have only alphabet");
		    	 }
		    	 
		    	 if(email.matches(pattern2)) {
		    		 
		    	 }
		    	 else {
		    			JOptionPane.showMessageDialog(null,"Enter valid Email ID");
	                   }
		    	 if(pass.matches(pattern)){
		    		 label.setText("");
		    	 }
		    	 else {
		    		 label.setText("Password should have minimum 1 upper,lowercase,specialcharacter,number and minimum length of password is 8");
	                  }
		   if(pass.matches(pattern)&&lengh==10&&lengh1>2&&lengh2>3&&lengh3>0&&lengh4>0&&lengh5>9&&email.matches(pattern2)&&name.matches(pattern3))
		        {   
		        	JOptionPane.showMessageDialog(null,"Registered sucessfully");	
		try {
     		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration2","root","selva12345");
     	    Statement st=con.createStatement();
        String statement1="insert into employee values(' "+name+" ',' "+id+" ',' "+pass+" ',' "+mobile+" ',' "+exp+" ',' "+skill+" ',' "+email+" ','f');";
        String statement2="insert into login values(' "+id+" ',' "+pass+" ','employee');";
     	 st.executeUpdate(statement1);
        st.execute(statement2);
     	}
     	catch(SQLException e1) {
     			System.out.println("Error");
     			e1.printStackTrace();
     	}
		        }
    else
    {
    	JOptionPane.showMessageDialog(null,"Fill all fields correctly");   
    }
			}
		}	
	});
	exit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
	});
	jPael.setBorder(new EmptyBorder(30,120,30,120));
	employee.setBorder(new EmptyBorder(10,50,10,50));
	userid.setBorder(new EmptyBorder(10,50,10,90));
	pass.setBorder(new EmptyBorder(10,50,10,70));
	contnum.setBorder(new EmptyBorder(10,50,10,50));
	exper.setBorder(new EmptyBorder(10,50,10,70));
	skill.setBorder(new EmptyBorder(10,50,10,80));
	emai.setBorder(new EmptyBorder(10,50,10,80));
	jPael.add(employee);
	jPael.add(empname);
	jPael.add(userid);
	jPael.add(usre);
	jPael.add(pass);
	jPael.add(pasw);
	jPael.add(contnum);
	jPael.add(ctn);
	jPael.add(exper);
	jPael.add(expe);
	jPael.add(skill);
	jPael.add(sk);
	jPael.add(emai);
	jPael.add(mil);
	jPael.add(regi);
	jPael.add(exit);
	add(jPael);
	setVisible(true);
	setTitle("Registration Page");
	setSize(700,700);
}
public static void main(String[] args) {
	Registration obj=new Registration();
		}
}