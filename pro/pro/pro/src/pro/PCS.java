package pro;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class PCS extends JFrame implements ActionListener {
	String url="jdbc:sqlserver://DESKTOP-IIFCLSR\\SQLEXPRESS;databaseName=sample;";
	String user="deepak";
	String password="1234";
	DefaultTableModel defaultTableModel;
    JTable table;	   
	
    JFrame home=new JFrame();
	JFrame hr=new JFrame();
	JFrame man=new JFrame();
	JFrame manjobcreate=new JFrame();
	JFrame manjobupdate=new JFrame();
	JFrame manjobdelete=new JFrame();
	JFrame emp=new JFrame();
	JFrame empreg=new JFrame();
	JFrame hrhome=new JFrame();
	
	JTextField t,T,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13;
	JButton b1,b2,B,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,L,L1,L2,L3,L4,L5,L6,L7,L8;
	JPasswordField p;
	
	PCS(){
	home.setVisible(true);
    home.setSize(500, 300);
    home.setTitle("Home page");
    home.setLayout(null);
     
    l1=new JLabel("LoginPage");
    l1.setBounds(130,10,130,20);
    home.add(l1);
   
    l2=new JLabel("Username");
    l2.setBounds(50,50,100,20);
    home.add(l2);
   
    l3=new JLabel("Password");
    l3.setBounds(50,70,120,20);
    home.add(l3);
     
    t=new JTextField();
    t.setBounds(120,50,120,20);
    home.add(t);
    
    p=new JPasswordField();
    p.setBounds(120,70,120,20);
    home.add(p);
    
    b1=new JButton("Login");
    b1.setBounds(50,120,100,20);
    home.add(b1);
    
    b2=new JButton("Register(For new employee)");
    b2.setBounds(200,120,220,20);
    home.add(b2);
    
    l=new JLabel();
    l.setBounds(100,50,200,200);
    home.add(l);
   
    L=new JLabel();
    L.setBounds(130,10,130,20);
    hr.add(L);
    
    B2=new JButton("Approval pending");
    B2.setBounds(50,50,200,20);
    hr.add(B2);
    
    B3=new JButton("Job mapping");
    B3.setBounds(50,100,200,20);
    hr.add(B3);
    
    B4=new JButton("Job creation");
    B4.setBounds(50,50,200,20);
    man.add(B4);
    
    B5=new JButton("Job updation");
    B5.setBounds(50,100,200,20);
    man.add(B5);
    
    B6=new JButton("Job deletion");
    B6.setBounds(50,150,200,20);
    man.add(B6);
    
    l4=new JLabel("Jobpost");
    l4.setBounds(50,50,100,20);
    manjobcreate.add(l4);
   
    l5=new JLabel("Skills");
    l5.setBounds(50,90,120,20);
    manjobcreate.add(l5);
    
    l6=new JLabel("Experience");
    l6.setBounds(50,130,120,20);
    manjobcreate.add(l6);
    
    T9=new JTextField();
    T9.setBounds(120,50,120,20);
    manjobcreate.add(T9);
    
    T10=new JTextField();
    T10.setBounds(120,90,120,20);
    manjobcreate.add(T10);
    
    T11=new JTextField();
    T11.setBounds(120,130,120,20);
    manjobcreate.add(T11);
    
    B9=new JButton("Create");
    B9.setBounds(90,200,100,20);
    manjobcreate.add(B9);
    
    l7=new JLabel();
    l7.setBounds(90,300,1000,20);
    manjobcreate.add(l7);
    
    l8=new JLabel("Update Jobpost");
    l8.setBounds(50,50,100,20);
    manjobupdate.add(l8);
   
    T12=new JTextField();
    T12.setBounds(180,50,120,20);
    manjobupdate.add(T12);
   
    B10=new JButton("Update");
    B10.setBounds(90,100,100,20);
    manjobupdate.add(B10);
    
    l9=new JLabel("Delete Jobpost");
    l9.setBounds(50,50,100,20);
    manjobdelete.add(l9);
   
    T13=new JTextField();
    T13.setBounds(180,50,120,20);
    manjobdelete.add(T13);
    
    B11=new JButton("Delete");
    B11.setBounds(90,100,100,20);
    manjobdelete.add(B11);
    
   
    B7=new JButton("Approval");
    B7.setLayout(new FlowLayout());
    hrhome.add(B7);
    
    B8=new JButton("Exit");
    B8.setLayout(new FlowLayout());
    hrhome.add(B8);
    
    L1=new JLabel();
    L1.setBounds(50,30,100,20);
    empreg.add(L1);
   
    L2=new JLabel();
    L2.setBounds(50,60,120,20);
    empreg.add(L2);
    
    L3=new JLabel();
    L3.setBounds(50,90,150,20);
    empreg.add(L3);
    
    L5=new JLabel();
    L5.setBounds(50,120,150,20);
    empreg.add(L5);

    L6=new JLabel();
    L6.setBounds(50,150,150,20);
    empreg.add(L6);

    L7=new JLabel();
    L7.setBounds(50,180,150,20);
    empreg.add(L7);

    L8=new JLabel();
    L8.setBounds(50,210,170,20);
    empreg.add(L8);

    T=new JTextField();
    T.setBounds(180,30,120,20);
    empreg.add(T);
    
    T1=new JTextField();
    T1.setBounds(180,60,120,20);
    empreg.add(T1);
    
    T2=new JTextField();
    T2.setBounds(180,90,120,20);
    empreg.add(T2);
    
    T3=new JTextField();
    T3.setBounds(180,120,120,20);
    empreg.add(T3);
    
    T4=new JTextField();
    T4.setBounds(180,150,120,20);
    empreg.add(T4);
    
    T5=new JTextField();
    T5.setBounds(180,180,120,20);
    empreg.add(T5);
    
    T6=new JTextField();
    T6.setBounds(180,210,120,20);
    empreg.add(T6);
    
    
    B=new JButton("Register");
    B.setBounds(90,260,100,20);
    empreg.add(B);
	
    B1=new JButton("Exit");
    B1.setBounds(230,260,100,20);
    empreg.add(B1);
    
    
    L4=new JLabel();
    L4.setBounds(50,300,1000,20);
    empreg.add(L4);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    B.addActionListener(this);
    B1.addActionListener(this);
    B2.addActionListener(this);
    B4.addActionListener(this);
    B5.addActionListener(this);
    B6.addActionListener(this);
    B7.addActionListener(this);
    B8.addActionListener(this);
    B9.addActionListener(this);
    B10.addActionListener(this);
    B11.addActionListener(this);
	}

@Override
public void actionPerformed(ActionEvent e){
	//TODO Auto-generated method stub
	if(e.getSource()==b1){
	 String s1=t.getText();
     String s2=p.getText();
    
     /* try{
    	        String q="select *from login where 'userid'='"+s1+"' and 'pass'='"+s2+"';";
    	        Connection con=DriverManager.getConnection(url,user,password);
    	 		Statement st=con.createStatement();
    	 		System.out.println(s1);
    	 		System.out.println(s2);
    	 		//PreparedStatement pre=con.prepareStatement(q);
    	 	    ResultSet rs=st.executeQuery(q);
    	 	    String user1=rs.getString("userid");
                String pas1=rs.getString("password");
          	
    	if(rs.next()) {
    		     System.out.println(user1);
	 		     System.out.println(pas1);
	 		     t.setText("");
    	         p.setText("");
    	         l.setText("Logged in succesful");
    	     	 emp.setSize(500,300);
    	         emp.setTitle("EMPLOYEE-PAGE");
    	         emp.setLayout(null);
    	         emp.setVisible(true);
    	        }
    	        }
    	         
    	     catch(SQLException e1) {
    				System.out.println("Error");
    				e1.printStackTrace();
    			}
        String q="select userid,password from login where designation='employee';";
 	    Connection con=DriverManager.getConnection(url,user,password);
 		Statement st=con.createStatement();
     
 		PreparedStatement pre1=con.prepareStatement(q);
 	    ResultSet rs=st.executeQuery(q);
 	    while(rs.next()) {
        	String user1=rs.getString("userid");
        	String pas1=rs.getString("password");
       
        	if(s1.equals(user1)&&(s2.equals(pas1))) {
        		 t.setText("");
                 p.setText("");
                 l.setText("Logged in succesful");
             	 emp.setSize(500,300);
                 emp.setTitle("EMPLOYEE-PAGE");
                 emp.setLayout(null);
                 emp.setVisible(true);
                }
 	   }
     }         
             catch(SQLException e1) {
        			System.out.println("Error");
        			e1.printStackTrace();
        		}
    update job set post='frontend' where experience='3'; 
   	update job set post='fullstack' where skills=' java';*/ 
     	try {
	 		String q="select userid,password from login  where designation='employee'";
			Connection con=DriverManager.getConnection(url,user,password);
	 		Statement s=con.createStatement();
	 		PreparedStatement pre1=con.prepareStatement(q);
	 		ResultSet rs1=s.executeQuery(q);
		   
	 		while(rs1.next()) {
	 	       	String user1=rs1.getString("userid");
	 	       	String pas1=rs1.getString("password");
	 	       	
	 	        if(s1.equals(user1)&&(s2.equals(pas1))) {
	 	        	// System.out.println("String get2");
	 	       	     t.setText("");
	 	        	 p.setText("");
	 	        	 l.setText("Logged in succesful");
	             	 emp.setSize(500,300);
	                 emp.setTitle("EMPLOYEE-PAGE");
	                 emp.setLayout(null);
	                 emp.setVisible(true);
	 	        
	 	        }
     	}       	   } 	
		catch(SQLException e1) {
			System.out.println("Error");
			e1.printStackTrace();
		}
    try {
	    String q1="select userid,password from login where designation='HR';";
	    Connection con=DriverManager.getConnection(url,user,password);
		Statement st1=con.createStatement();
        PreparedStatement pre1=con.prepareStatement(q1);
	    ResultSet rs1=st1.executeQuery(q1);
	   
	    while(rs1.next()) {
       	String user1=rs1.getString("userid");
       	String pas1=rs1.getString("password");
       	
        if(s1.equals(user1)&&(s2.equals(pas1))) {
        	// System.out.println("String get2");
       	     t.setText("");
        	 p.setText("");
        	 l.setText("Logged in sucessful");
        	 hr.setSize(500, 300);
             hr.setTitle("HR");
             hr.setLayout(null);
             hr.setVisible(true);
             L.setText("HR-PAGE");
             break;    
        }
       }}
	   catch(SQLException e1) {
			System.out.println("Error");
			e1.printStackTrace();
		}
   try {
	    String q2="select userid,password from login where designation='projectmanager';";
        Connection con=DriverManager.getConnection(url,user,password);
		Statement st2=con.createStatement();
        PreparedStatement pre2=con.prepareStatement(q2);
	    ResultSet rs2=pre2.executeQuery();
	
	    while(rs2.next()) {
       	String user2=rs2.getString("userid");
       	String pas2=rs2.getString("password");
       
        if(s1.equals(user2)&&(s2.equals(pas2))) { 
        	t.setText("");
        	p.setText("");
        	t.setText("");
  	        p.setText("");
  	       l.setText("Logged in sucessful");
       	   man.setSize(500,300);
           man.setTitle("PROJECTMANAGER-PAGE");
           man.setLayout(null);
           man.setVisible(true);
            }
       }
       }
	   catch(SQLException e1) {
			System.out.println("Error");
			e1.printStackTrace();
		}
   /*else {     
    	l.setText("Invalid ID or password.. ");
    }*/
}
	if(e.getSource()==B4){
		manjobcreate.setSize(800,700);
		manjobcreate.setTitle("Jobcreation");
		manjobcreate.setLayout(null);
		manjobcreate.setVisible(true);
		}
	if(e.getSource()==B5){
		manjobupdate.setSize(800,700);
		manjobupdate.setTitle("Jobupdation");
		manjobupdate.setLayout(null);
		manjobupdate.setVisible(true);
		}
	if(e.getSource()==B6){
		manjobdelete.setSize(800,700);
		manjobdelete.setTitle("Jobdeletion");
		manjobdelete.setLayout(null);
		manjobdelete.setVisible(true);
		}
	if(e.getSource()==B9){
      String Job=T9.getText();
   	  String Skill=T10.getText();
   	  String Exp=T11.getText();
   	 
   	try {
 		Connection con=DriverManager.getConnection(url,user,password);
 	    Statement st=con.createStatement();
        String state="insert into job values(' "+Job+" ',' "+Skill+" ','"+Exp+"');";
 	    st.executeUpdate(state);
 	    l7.setText("Newjobpost created");	
 	    T9.setText("");
 	    T10.setText("");
 	    T11.setText("");
	 }
 	catch(SQLException e1) {
 			System.out.println("Error");
 			e1.printStackTrace();
 		}
     }
	if(e.getSource()==B11){
		String post=T13.getText();
		try {
	 		String q="delete from job where post=?";
			Connection con=DriverManager.getConnection(url,user,password);
	 		Statement s=con.createStatement();
	 		PreparedStatement pre1=con.prepareStatement(q);
	 	    pre1.setString(1,post);
	 		pre1.executeUpdate();
	 	    
		}       	    	
		catch(SQLException e1) {
 			System.out.println("Error");
 			e1.printStackTrace();
 		}
	}
	if(e.getSource()==b2) {
		    t.setText("");
	    	p.setText("");
		    empreg.setSize(800,700);
	        empreg.setTitle("REGISTRATION-PAGE");
	        empreg.setLayout(null);
	        empreg.setVisible(true);
	        
	        L1.setText("Employee name");
	        L2.setText("User id");
	        L3.setText("Password");
            L5.setText("Contact number");
	        L6.setText("Experience");
	        L7.setText("Skill set");
	        L8.setText("Email-ID");
	      }  
	     if(e.getSource()==B) {        
	    	 String name=T.getText();
	    	 String id=T1.getText();
	    	 String pass=T2.getText();
	    	 String mobile=T3.getText();
	    	 String exp=T4.getText();
	    	 String skill=T5.getText();
	    	 String email=T6.getText();
	    	  
	    	 int len=mobile.length();
		     int len1=name.length();
		     int len2=id.length();
		     int len3=exp.length();
		     int len4=skill.length();
		     int len5=email.length();
	    	 
	if(len!=10) {
		        	JOptionPane.showMessageDialog(null,"enter valid mobile number");
		        }
	    	 
	         String p="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()%–^[{}]:;',?/*~$^+=<>])(?=\\S+$).{8,20}$";
	    	 String p2="^(?=.*[@])(?=.*[.])(?=.*[com]).{10,35}$";
	    	 String p3="[a-z A-Z]{2,20}";
	    	 
            if(name.matches(p3)) {
	    		 
	    	 }
	    	 else {
	    			JOptionPane.showMessageDialog(null,"Name should have only alphabet");
	    	 }
	    	 
	    	 if(email.matches(p2)) {
	    		 
	    	 }
	    	 else {
	    			JOptionPane.showMessageDialog(null,"Enter valid Email id");
                   }
	    	 if(pass.matches(p)){
	    		 L4.setText("");
	    	 }
	    	 else {
	    		 L4.setText("Password should have minimum 1 upper,lowercase,specialcharacter,number and minimum length of password is 8");
                  }
	   if(pass.matches(p)&&len==10&&len1>2&&len2>3&&len3>0&&len4>0&&len5>9&&email.matches(p2)&&name.matches(p3))
	        {   L4.setText("Registered  succesfully wait for HR approval");
	        	JOptionPane.showMessageDialog(null,"Registered sucessfully"); 
	        	try {
	         		Connection con=DriverManager.getConnection(url,user,password);
	         	    Statement st=con.createStatement();
	          //String statement="create table regtable(Name varchar(20),Userid varchar(20) primary key,Password varchar(20) ,Contact bigint,Experience int,Skillset varchar(35),Emailid  nvarchar(35),Approvalflag varchar(20))";
	          //String statement="drop table regtable"; 
	            String statement1="insert into regtable values(' "+name+" ',' "+id+" ',' "+pass+" ',' "+mobile+" ',' "+exp+" ',' "+skill+" ',' "+email+" ','f');";
	         	 st.executeUpdate(statement1);
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
	     if(e.getSource()==B2) {
	    	    hrhome.setSize(500,500);
	    	    hrhome.setTitle("Approval-pending page");
	    	    hrhome.setLayout(new FlowLayout());
	    	    
	    		defaultTableModel=new DefaultTableModel();
	    	    table=new JTable(defaultTableModel);
	    	    table.setPreferredScrollableViewportSize(new Dimension(400,200));
	    	    table.setFillsViewportHeight(true);
	    	    hrhome.add(new JScrollPane(table));
	    	    defaultTableModel.addColumn("Name");
	    	    defaultTableModel.addColumn("Contact");
	    	    defaultTableModel.addColumn("Emailid");
	    	    
	    	 try {
	    	 	Connection con=DriverManager.getConnection(url,user,password);
	    	 	Statement st=con.createStatement();
	    	    ResultSet rs=st.executeQuery("select Name,Contact,Emailid from  regtable where Approvalflag='f'"); 	 
	    	    
	    	    while(rs.next()) {
	    		String name=rs.getString("Name");
	    		String cont=rs.getString("Contact");
	    		String mail=rs.getString("Emailid");
	    		defaultTableModel.addRow(new Object[] {name,cont,mail});
	    		hrhome.setVisible(true);
	    		 }	    		
	    		}
	    	 	catch(SQLException e1) {
	    	 			System.out.println("Error");
	    	 			e1.printStackTrace();
	    	 		}
	    	}
	    if(e.getSource()==B7){
	    		try {
	         		Connection con=DriverManager.getConnection(url,user,password);
	         	    Statement st=con.createStatement();
	                String stat="update regtable set Approvalflag='t' where Approvalflag='f';"; 
                    String stat1="insert into login select Userid,Password,'employee' from regtable where Approvalflag='t';";
	                
                   PreparedStatement pre=con.prepareStatement(stat);
                   PreparedStatement pre1=con.prepareStatement(stat1);
                   pre.executeUpdate();
                   pre1.executeUpdate(); 
                    
	               //st.executeUpdate(stat1);
	               //st.executeUpdate(stat);
	                 }
	         	catch(SQLException e1) {
	         			System.out.println("Error");
	         			e1.printStackTrace();
	         		}
	    		}
	if(e.getSource()==B8) { 
		int res=JOptionPane.showConfirmDialog(null,"Do you want to exit?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        	 if(res==JOptionPane.YES_OPTION) {	 
        		table.setPreferredScrollableViewportSize(new Dimension(0,0));
        		hrhome.setVisible(false);
        	 }
	     }
	     if(e.getSource()==B1) { 
	    	 int response=JOptionPane.showConfirmDialog(null,"Do you want to exit?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        	 if(response==JOptionPane.YES_OPTION) {
        		 T.setText("");
    	    	 T1.setText("");
    	    	 T2.setText("");
    	    	 T3.setText("");
    	    	 T4.setText("");
    	    	 T5.setText("");
    	    	 T6.setText("");
    	    	 empreg.setVisible(false);           }        	 
        	 }	     
          }
public static void main(String[] args)
{    PCS ob=new PCS();
}
}