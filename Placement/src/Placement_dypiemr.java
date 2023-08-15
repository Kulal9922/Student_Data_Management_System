import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Placement_dypiemr extends JFrame implements ActionListener {

//___________All Static Declarations_________/
	
	static JFrame login,f,f1,f2,f3,f4,f5,fk1,fk2,fk3,fk4,fk5,fk6;
    static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,  s13,s14,s16;
    static int a1,a2,a3,a4,a5;
    static JTextField tk1,tk2,tk3,tk4,tk5,tk6,tk7,tk8,tk9,tk10,tk11,tk12,tk13,tk14,tk15,tk16,tk17,tk18,tk19,tk20,tk21,tk22,tk23,tk24,tk25,tk26,tk27,tk28,tk29,tk30;
    static JLabel l12,lk1,lk2,lk3,lk4,lk5,lk6,lk7,lk8,lk9,lk10,lk11,lk12,lk13,lk14,lk15,lk16,lk17,lk18,lk19,lk20,lk21,lk22,lk23,lk24,lk25,lk26,lk27,lk28  ,lk29,lk30,lk31,lk32,lk33,lk34,lk35,lk36,lk37,lk38,lk39,lk40,lk41,lk42,lk43,lk44,lk45,lk46,lk47,lk48,lk49,lk50;
    
	static JTextArea txt1,txt2,txt3;
    static JButton bk1,bk2,bk3,bk4,bk5,bk6,bk7,bk8,bk9,bk10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29  ,b30,b31,b32,b33,b34;
	@SuppressWarnings("deprecation")
	static int ssn=1;
	Border border1 = BorderFactory.createLineBorder(Color.white, 2);
	
	Placement_dypiemr(){
		
		
		//___________All Frames One By One__________/
		

		//__________Login Frame_________/
		login=new JFrame();
		login.setLayout(null);
	    Container c=login.getContentPane();
	    Color cl1=new Color(241,241,241);
		c.setBackground(cl1);
		//login.setVisible(true);
		login.setVisible(false);
		login.setBounds(0, 0,1920, 1080);
	

		Image imgs1=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip.jpg");
  	    ImageIcon is1=new ImageIcon(imgs1);
  	    JLabel i1=new JLabel(is1);
  	    i1.setForeground(Color.white);
  	    i1.setBounds(0,0, 1919, 176);
  	    login.add(i1);
  	    
  	    /*Image imgs2=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_lower.jpg");
	    ImageIcon is2=new ImageIcon(imgs2);
	    JLabel i2=new JLabel(is2);
	    i2.setForeground(Color.white);
	    i2.setBounds(0,656, 1919, 424);
	    login.add(i2);
  	    
		l12=new JLabel("Welcome to DYPIEMR Placement Cell");
		l12.setFont(l12.getFont().deriveFont(50.85632412f));
		l12.setBounds(500, 200, 1000, 60);
		login.add(l12);
	
		
		b1=new JButton("Colleage");
		b1.setFont(b1.getFont().deriveFont(30.85632412f));
		b1.setBounds(800, 350, 300, 70);
		b1.enable();
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBorder(border1);
		b1.setVisible(true);
		login.add(b1);
		
		b2=new JButton("Company ");
		b2.setFont(b2.getFont().deriveFont(30.85632412f));
		b2.setBounds(800, 450, 300, 70);
		b2.enable();
		b2.addActionListener(this);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.white);
		b2.setBorder(border1);
		b2.setVisible(true);
		login.add(b2);
		
		b3=new JButton("Student");
		b3.setFont(b3.getFont().deriveFont(30.85632412f));
		b3.setBounds(800, 550, 300, 70);
		b3.enable();
		b3.addActionListener(this);
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.white);
		b3.setBorder(border1);
		b3.setVisible(true);
		login.add(b3);
		
		b4=new JButton("Exit");
		b4.setFont(b4.getFont().deriveFont(30.85632412f));
		b4.setBounds(800, 650, 300, 70);
		b4.enable();
		b4.addActionListener(this);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b4.setBorder(border1);
		b4.setVisible(true);
		login.add(b4);*/

	
	
	//-----------------------------------frame -------------------------------------/
	
			//__________Company Registration From_________/
	
	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
	    ImageIcon is4=new ImageIcon(imgs4);
	    JLabel i5=new JLabel(is4);
	    i4.setForeground(Color.white);
	    i4.setBounds(0,0, 1919, 64);
	    
	f5=new JFrame();
	f5.setLayout(null);
    Container c5=f5.getContentPane();
	c5.setBackground(cl1);
	f5.setVisible(true);
	//f4.setVisible(false);
	f5.setBounds(0, 0,1920, 1080);
	f5.setTitle("Company Registration ");
	f5.add(i4);
	
	l29=new JLabel("Company Registration From");
	l29.setFont(l16.getFont().deriveFont(40.85632412f));
	l29.setBounds(200, 100, 600, 50);
	f5.add(l29);
	
	l30=new JLabel("Register your Company by using this form. Required fields are marked with an asterisk(*)");
	l30.setFont(l30.getFont().deriveFont(20.85632412f));
	l30.setForeground(Color.GRAY);
	l30.setBounds(200, 160, 1800, 30);
	f5.add(l30);
	
	l31=new JLabel("___________________________________________________________________________________________________________________");
	l31.setFont(l31.getFont().deriveFont(24.85632412f));
	l31.setForeground(Color.GRAY);
	l31.setBounds(200, 170, 1800, 50);
	f5.add(l31);
	
	l32=new JLabel("Company Name*");
	l32.setFont(l32.getFont().deriveFont(24.85632412f));
	l32.setForeground(Color.GRAY);
	l32.setBounds(200, 250, 250, 30);
	f5.add(l32);
	
	t19=new JTextField();
	t19.setBounds(200, 290, 220, 30);
	t19.setText("    ");
	t19.setFont(t19.getFont().deriveFont(18.85632412f));
	t19.setVisible(true);
	t19.setBorder(border3);
	f5.add(t19);
	
	l33=new JLabel("Owner*");
	l33.setFont(l33.getFont().deriveFont(24.85632412f));
	l33.setForeground(Color.GRAY);
	l33.setBounds(450, 250, 250, 30);
	f5.add(l33);
	
	t20=new JTextField();
	t20.setBounds(450, 290, 220, 30);
	t20.setText("    ");
	t20.setFont(t20.getFont().deriveFont(18.85632412f));
	t20.setVisible(true);
	t20.setBorder(border3);
	f5.add(t20);
	
	l34=new JLabel("Company malling address*");
	l34.setFont(l34.getFont().deriveFont(24.85632412f));
	l34.setForeground(Color.GRAY);
	l34.setBounds(200, 350, 400, 30);
	f5.add(l34);
	
	l35=new JLabel("Street Address");
	l35.setFont(l35.getFont().deriveFont(20.85632412f));
	l35.setForeground(Color.GRAY);
	l35.setBounds(200, 390, 250, 30);
	f5.add(l35);
	
	t21=new JTextField();
	t21.setBounds(200, 420, 470, 30);
	t21.setText("    ");
	t21.setFont(t21.getFont().deriveFont(18.85632412f));
	t21.setVisible(true);
	t21.setBorder(border3);
	f5.add(t21);
	
	l36=new JLabel("City");
	l36.setFont(l36.getFont().deriveFont(20.85632412f));
	l36.setForeground(Color.GRAY);
	l36.setBounds(200, 460, 250, 30);
	f5.add(l36);
	
	t22=new JTextField();
	t22.setBounds(200, 490, 220, 30);
	t22.setText("    ");
	t22.setFont(t22.getFont().deriveFont(18.85632412f));
	t22.setVisible(true);
	t22.setBorder(border3);
	f5.add(t22);
	
	l37=new JLabel("State");
	l37.setFont(l37.getFont().deriveFont(20.85632412f));
	l37.setForeground(Color.GRAY);
	l37.setBounds(450, 460, 250, 30);
	f5.add(l37);
	
	t23=new JTextField();
	t23.setBounds(450, 490, 220, 30);
	t23.setText("    ");
	t23.setFont(t23.getFont().deriveFont(18.85632412f));
	t23.setVisible(true);
	t23.setBorder(border3);
	f5.add(t23);
	
	l38=new JLabel("Pin Code");
	l38.setFont(l38.getFont().deriveFont(20.85632412f));
	l38.setForeground(Color.GRAY);
	l38.setBounds(200, 530, 250, 30);
	f5.add(l38);
	
	t24=new JTextField();
	t24.setBounds(200, 560, 220, 30);
	t24.setText("    ");
	t24.setFont(t24.getFont().deriveFont(18.85632412f));
	t24.setVisible(true);
	t24.setBorder(border3);
	f5.add(t24);
	
	l39=new JLabel("Country");
	l39.setFont(l39.getFont().deriveFont(20.85632412f));
	l39.setForeground(Color.GRAY);
	l39.setBounds(450, 530, 250, 30);
	f5.add(l39);
	
	String Contry[]={"India","China","United States","Germany","Russia","United Kingdom","Singapore","Israel","Switzerland"};
	JComboBox a=new JComboBox(Contry);
	a.setBounds(450, 560, 220, 30);
	f5.add(a);
	
	l40=new JLabel("Email*");
	l40.setFont(l40.getFont().deriveFont(24.85632412f));
	l40.setForeground(Color.GRAY);
	l40.setBounds(200, 610, 400, 30);
	f5.add(l40);
	
	t25=new JTextField();
	t25.setBounds(200, 640, 220, 30);
	t25.setText("    ");
	t25.setFont(t25.getFont().deriveFont(18.85632412f));
	t25.setVisible(true);
	t25.setBorder(border3);
	f5.add(t25);
	
	l41=new JLabel("Phone Number*");
	l41.setFont(l41.getFont().deriveFont(24.85632412f));
	l41.setForeground(Color.GRAY);
	l41.setBounds(450, 610, 400, 30);
	f5.add(l41);
	
	t26=new JTextField();
	t26.setBounds(450, 640, 220, 30);
	t26.setText("    ");
	t26.setFont(t26.getFont().deriveFont(18.85632412f));
	t26.setVisible(true);
	t26.setBorder(border3);
	f5.add(t26);
	
	l42=new JLabel("Nominal Capital*");
	l42.setFont(l42.getFont().deriveFont(24.85632412f));
	l42.setForeground(Color.GRAY);
	l42.setBounds(200, 680, 400, 30);
	f5.add(l42);
	
	t27=new JTextField();
	t27.setBounds(200, 710, 220, 30);
	t27.setText("    ");
	t27.setFont(t27.getFont().deriveFont(18.85632412f));
	t27.setVisible(true);
	t27.setBorder(border3);
	f5.add(t27);
	
	l43=new JLabel("Industry*");
	l43.setFont(l43.getFont().deriveFont(24.85632412f));
	l43.setForeground(Color.GRAY);
	l43.setBounds(450, 680, 400, 30);
	f5.add(l43);
	
	String Industry[]={"Hardware","Software","Software as a Service","Platforms","Systems Integrator", "Business Process Outsourcing", "Infrastructure", "Data Centers"};
	JComboBox b=new JComboBox(Industry);
	b.setBounds(450, 710, 220, 30);
	f5.add(b);
	
	l44=new JLabel("Website*");
	l44.setFont(l44.getFont().deriveFont(24.85632412f));
	l44.setForeground(Color.GRAY);
	l44.setBounds(200, 750, 400, 30);
	f5.add(l44);
	
	t28=new JTextField();
	t28.setBounds(200, 780, 220, 30);
	t28.setText("    ");
	t28.setFont(t28.getFont().deriveFont(18.85632412f));
	t28.setVisible(true);
	t28.setBorder(border3);
	f5.add(t28);
	
	l45=new JLabel("Company description*");
	l45.setFont(l45.getFont().deriveFont(24.85632412f));
	l45.setForeground(Color.GRAY);
	l45.setBounds(200, 820, 400, 30);
	f5.add(l45);
	
	t29=new JTextField();
	t29.setBounds(200, 850, 470, 60);
	t29.setText("    ");
	t29.setFont(t29.getFont().deriveFont(18.85632412f));
	t29.setVisible(true);
	t29.setBorder(border3);
	f5.add(t29);*/
	
	
	//-----------------------------------frame fk1 -------------------------------------//
	
	         //__________Resume_________//

	
	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
    ImageIcon is4=new ImageIcon(imgs4);
    JLabel i5=new JLabel(is4);
    i4.setForeground(Color.white);
    i4.setBounds(0,0, 1919, 64);*/
    
    
	fk1=new JFrame();
	fk1.setLayout(null);
    Container c5=fk1.getContentPane();
	c5.setBackground(cl1);
	//fk1.setVisible(true);
	fk1.setVisible(false);
	fk1.setBounds(0, 0,1920, 1080);
	fk1.setTitle("Resume");
	
	lk1=new JLabel("What's the best way for employers to contact you ?");
	lk1.setFont(lk1.getFont().deriveFont(40.85632412f));
	lk1.setForeground(Color.BLUE);
	lk1.setBounds(200, 100, 1100, 50);
	fk1.add(lk1);

	lk2=new JLabel("We suggest including an email and phone number.");
	lk2.setFont(lk2.getFont().deriveFont(28.85632472f));
	lk2.setForeground(Color.GRAY);
	lk2.setBounds(200,150,1000,50);
	fk1.add(lk2);
	
	lk3=new JLabel("First Name");
	lk3.setFont(lk3.getFont().deriveFont(25.85632472f));
	lk3.setBounds(450,250,300,50);
	fk1.add(lk3);
	
	tk1=new JTextField();
	tk1.setBounds(450, 300, 300, 30);
	tk1.setText("    ");
	tk1.setFont(tk1.getFont().deriveFont(18.85632412f));
	tk1.setVisible(true);
	tk1.setBorder(border1);
	fk1.add(tk1);
	
	lk4=new JLabel("SirName");
	lk4.setFont(lk4.getFont().deriveFont(25.85632472f));
	lk4.setBounds(800,250,300,50);
	fk1.add(lk4);
	
	tk2=new JTextField();
	tk2.setBounds(800, 300, 300, 30);
	tk2.setText("    ");
	tk2.setFont(tk2.getFont().deriveFont(18.85632412f));
	tk2.setVisible(true);
	tk2.setBorder(border1);
	fk1.add(tk2);
	
	lk5=new JLabel("Profession");
	lk5.setFont(lk5.getFont().deriveFont(25.85632472f));
	lk5.setBounds(450,350,300,50);
	fk1.add(lk5);
	
	tk3=new JTextField();
	tk3.setBounds(450, 400, 650, 30);
	tk3.setText("    ");
	tk3.setFont(tk3.getFont().deriveFont(18.85632412f));
	tk3.setVisible(true);
	tk3.setBorder(border1);
	fk1.add(tk3);
	
	lk6=new JLabel("City");
	lk6.setFont(lk6.getFont().deriveFont(25.85632472f));
	lk6.setBounds(450,450,200,50);
	fk1.add(lk6);
	
	tk4=new JTextField();
	tk4.setBounds(450, 500, 200, 30);
	tk4.setText("    ");
	tk4.setFont(tk4.getFont().deriveFont(18.85632412f));
	tk4.setVisible(true);
	tk4.setBorder(border1);
	fk1.add(tk4);
	
	lk7=new JLabel("Country");
	lk7.setFont(lk7.getFont().deriveFont(25.85632472f));
	lk7.setBounds(675,450,200,50);
	fk1.add(lk7);
	
	tk5=new JTextField();
	tk5.setBounds(675, 500, 200, 30);
	tk5.setText("    ");
	tk5.setFont(tk5.getFont().deriveFont(18.85632412f));
	tk5.setVisible(true);
	tk5.setBorder(border1);
	fk1.add(tk5);
	
	lk8=new JLabel("Pin Code");
	lk8.setFont(lk8.getFont().deriveFont(25.85632472f));
	lk8.setBounds(900,450,200,50);
	fk1.add(lk8);
	
	tk6=new JTextField();
	tk6.setBounds(900, 500, 200, 30);
	tk6.setText("    ");
	tk6.setFont(tk6.getFont().deriveFont(18.85632412f));
	tk6.setVisible(true);
	tk6.setBorder(border1);
	fk1.add(tk6);
	
	lk9=new JLabel("Phone Number");
	lk9.setFont(lk9.getFont().deriveFont(25.85632472f));
	lk9.setBounds(450,550,300,50);
	fk1.add(lk9);
	
	tk7=new JTextField();
	tk7.setBounds(450, 600, 300, 30);
	tk7.setText("    ");
	tk7.setFont(tk7.getFont().deriveFont(18.85632412f));
	tk7.setVisible(true);
	tk7.setBorder(border1);
	fk1.add(tk7);
	
	lk10=new JLabel("Email Id");
	lk10.setFont(lk10.getFont().deriveFont(25.85632472f));
	lk10.setBounds(800,550,300,50);
	fk1.add(lk10);
	
	tk8=new JTextField();
	tk8.setBounds(800, 600, 300, 30);
	tk8.setText("    ");
	tk8.setFont(tk8.getFont().deriveFont(18.85632412f));
	tk8.setVisible(true);
	tk8.setBorder(border1);
	fk1.add(tk8);
	
	bk1=new JButton("Next");
	bk1.setFont(bk1.getFont().deriveFont(30.85632412f));
	bk1.setBounds(675, 680, 200, 50);
	bk1.enable();
	bk1.addActionListener(this);
	bk1.setBackground(Color.DARK_GRAY);
	bk1.setForeground(Color.white);
	bk1.setBorder(border1);
	bk1.setVisible(true);
	fk1.add(bk1);
	
	
	//-----------------------------------frame fk2 -------------------------------------//
	
                           //__________Resume_________//


	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
    ImageIcon is4=new ImageIcon(imgs4);
    JLabel i5=new JLabel(is4);
    i4.setForeground(Color.white);
    i4.setBounds(0,0, 1919, 64);*/
    
    
	fk2=new JFrame();
	fk2.setLayout(null);
    Container c6=fk2.getContentPane();
	c6.setBackground(cl1);
	//fk2.setVisible(true);
	fk2.setVisible(false);
	fk2.setBounds(0, 0,1920, 1080);
	fk2.setTitle("Resume");
	
	lk11=new JLabel("Tell us about your education");
	lk11.setFont(lk11.getFont().deriveFont(40.85632412f));
	lk11.setForeground(Color.BLUE);
	lk11.setBounds(200, 100, 1100, 50);
	fk2.add(lk11);

	lk12=new JLabel("Include every school, even if you're still there or didn't graduate. ");
	lk12.setFont(lk12.getFont().deriveFont(28.85632472f));
	lk12.setForeground(Color.GRAY);
	lk12.setBounds(200,150,1000,50);
	fk2.add(lk12);
	
	lk13=new JLabel("School Name");
	lk13.setFont(lk13.getFont().deriveFont(25.85632472f));
	lk13.setBounds(450,250,300,50);
	fk2.add(lk13);
	
	tk9=new JTextField();
	tk9.setBounds(450, 300, 300, 30);
	tk9.setText("    ");
	tk9.setFont(tk9.getFont().deriveFont(18.85632412f));
	tk9.setVisible(true);
	tk9.setBorder(border1);
	fk2.add(tk9);
	
	lk14=new JLabel("City");
	lk14.setFont(lk14.getFont().deriveFont(25.85632472f));
	lk14.setBounds(800,250,300,50);
	fk2.add(lk14);
	
	tk10=new JTextField();
	tk10.setBounds(800, 300, 300, 30);
	tk10.setText("    ");
	tk10.setFont(tk10.getFont().deriveFont(18.85632412f));
	tk10.setVisible(true);
	tk10.setBorder(border1);
	fk2.add(tk10);
	
	lk15=new JLabel("State");
	lk15.setFont(lk15.getFont().deriveFont(25.85632472f));
	lk15.setBounds(450,350,300,50);
	fk2.add(lk15);
	
	tk11=new JTextField();
	tk11.setBounds(450, 400, 300, 30);
	tk11.setText("    ");
	tk11.setFont(tk11.getFont().deriveFont(18.85632412f));
	tk11.setVisible(true);
	tk11.setBorder(border1);
	fk2.add(tk11);
	
	lk16=new JLabel("Degree");
	lk16.setFont(lk16.getFont().deriveFont(25.85632472f));
	lk16.setBounds(800,350,300,50);
	fk2.add(lk16);
	
	String Degree[]={"Select a degree","High School Diploma","GED","Associate of Arts","Associate of Science","Bachelor of Arts","Bachelor of Science","BBA","Master of Arts","Master of Science","MBA","J.D.","M.D.","Ph.D.","Custom Degree"};
	JComboBox a=new JComboBox(Degree);
	a.setBounds(800, 400, 220, 30);
	fk2.add(a);
	
	lk17=new JLabel("Field of study");
	lk17.setFont(lk17.getFont().deriveFont(25.85632472f));
	lk17.setBounds(450,450,200,50);
	fk2.add(lk17);
	
	tk12=new JTextField();
	tk12.setBounds(450, 500, 650, 30);
	tk12.setText("    ");
	tk12.setFont(tk12.getFont().deriveFont(18.85632412f));
	tk12.setVisible(true);
	tk12.setBorder(border1);
	fk2.add(tk12);
	
	lk18=new JLabel("Graduation date");
	lk18.setFont(lk18.getFont().deriveFont(25.85632472f));
	lk18.setBounds(450,550,200,50);
	fk2.add(lk18);
	
	String months[]={"Jan","Feb","March","April","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
	JComboBox b=new JComboBox(months);
	b.setBounds(450, 600, 200, 30);
	fk2.add(b);
	
	String year[]=new String[10];
	int j=2020;
	for(int i=0;i<10;i++){
			String temp=j+"";
			year[i]=temp;
			j++;
			temp="";
	}
	JComboBox yr=new JComboBox(year);
	yr.setBounds(675, 600, 200, 30);
	fk2.add(yr);
	
	bk2=new JButton("BACK");
	bk2.setFont(bk2.getFont().deriveFont(30.85632412f));
	bk2.setBounds(450,680 , 200, 50);
	bk2.enable();
	bk2.addActionListener(this);
	bk2.setBackground(Color.DARK_GRAY);
	bk2.setForeground(Color.white);
	bk2.setBorder(border1);
	bk2.setVisible(true);
	fk2.add(bk2);
	
	bk3=new JButton("SAVE & NEXT");
	bk3.setFont(bk3.getFont().deriveFont(30.85632412f));
	bk3.setBounds(800,680, 300, 50);
	bk3.enable();
	bk3.addActionListener(this);
	bk3.setBackground(Color.DARK_GRAY);
	bk3.setForeground(Color.white);
	bk3.setBorder(border1);
	bk3.setVisible(true);
	fk2.add(bk3);
	
	
	//-----------------------------------frame fk3 -------------------------------------//
	
                           //__________Resume_________//

	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
    ImageIcon is4=new ImageIcon(imgs4);
    JLabel i5=new JLabel(is4);
    i4.setForeground(Color.white);
    i4.setBounds(0,0, 1919, 64);*/
    
    
	fk3=new JFrame();
	fk3.setLayout(null);
    Container c7=fk3.getContentPane();
	c7.setBackground(cl1);
	fk3.setVisible(true);
	//fk3.setVisible(false);
	fk3.setBounds(0, 0,1920, 1080);
	fk3.setTitle("Resume");

	
	lk19=new JLabel("EXPERIENCE");
	lk19.setFont(lk19.getFont().deriveFont(40.85632412f));
	lk19.setForeground(Color.BLUE);
	lk19.setBounds(200, 100, 1100, 50);
	fk3.add(lk19);

	lk20=new JLabel("List your experience, from the most recent to the oldest. Feel free to use our pre-writte examples. ");
	lk20.setFont(lk20.getFont().deriveFont(28.85632472f));
	lk20.setForeground(Color.GRAY);
	lk20.setBounds(200,150,1400,50);
	fk3.add(lk20);
	
	lk21=new JLabel("Employer");
	lk21.setFont(lk21.getFont().deriveFont(25.85632472f));
	lk21.setBounds(450,250,300,50);
	fk3.add(lk21);
	
	tk13=new JTextField();
	tk13.setBounds(450, 300, 300, 30);
	tk13.setText("    ");
	tk13.setFont(tk13.getFont().deriveFont(18.85632412f));
	tk13.setVisible(true);
	tk13.setBorder(border1);
	fk3.add(tk13);
	
	lk22=new JLabel("Job Title");
	lk22.setFont(lk22.getFont().deriveFont(25.85632472f));
	lk22.setBounds(800,250,300,50);
	fk3.add(lk22);
	
	tk14=new JTextField();
	tk14.setBounds(800, 300, 300, 30);
	tk14.setText("    ");
	tk14.setFont(tk14.getFont().deriveFont(18.85632412f));
	tk14.setVisible(true);
	tk14.setBorder(border1);
	fk3.add(tk14);
	
	lk23=new JLabel("City");
	lk23.setFont(lk23.getFont().deriveFont(25.85632472f));
	lk23.setBounds(450,350,300,50);
	fk3.add(lk23);
	
	tk15=new JTextField();
	tk15.setBounds(450, 400, 300, 30);
	tk15.setText("    ");
	tk15.setFont(tk15.getFont().deriveFont(18.85632412f));
	tk15.setVisible(true);
	tk15.setBorder(border1);
	fk3.add(tk15);
	
	lk24=new JLabel("State");
	lk24.setFont(lk24.getFont().deriveFont(25.85632472f));
	lk24.setBounds(800,350,300,50);
	fk3.add(lk24);
	
	tk16=new JTextField();
	tk16.setBounds(800, 400, 300, 30);
	tk16.setText("    ");
	tk16.setFont(tk16.getFont().deriveFont(18.85632412f));
	tk16.setVisible(true);
	tk16.setBorder(border1);
	fk3.add(tk16);
	
	lk26=new JLabel("Start Date");
	lk26.setFont(lk26.getFont().deriveFont(25.85632472f));
	lk26.setBounds(450,450,200,50);
	fk3.add(lk26);
	
	String month[]={"Jan","Feb","March","April","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
	JComboBox e=new JComboBox(month);
	e.setBounds(450, 500, 200, 30);
	fk3.add(e);
	
	String years[]=new String[10];
	int k=2020;
	for(int i=0;i<10;i++){
			String temp=k+"";
			year[i]=temp;
			k++;
			temp="";
	}
	JComboBox y=new JComboBox(year);
	y.setBounds(675, 500, 200, 30);
	fk3.add(y);
	
	lk27=new JLabel("End Date");
	lk27.setFont(lk27.getFont().deriveFont(25.85632472f));
	lk27.setBounds(450,550,200,50);
	fk3.add(lk27);
	
	String months1[]={"Jan","Feb","March","April","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
	JComboBox f=new JComboBox(months1);
	f.setBounds(450, 600, 200, 30);
	fk3.add(f);
	
	String year1[]=new String[10];
	int l=2020;
	for(int i=0;i<10;i++){
			String temp=l+"";
			year[i]=temp;
			l++;
			temp="";
	}
	JComboBox yr1=new JComboBox(year);
	yr1.setBounds(675, 600, 200, 30);
	fk3.add(yr1);
	
	lk28=new JLabel("Job Description");
	lk28.setFont(lk28.getFont().deriveFont(25.85632472f));
	lk28.setBounds(1150,250,300,50);
	fk3.add(lk28);
	
	txt2 = new JTextArea();
	txt2.setBounds(1150, 300, 400, 300);
	txt2.setText("    ");
	txt2.setFont(txt2.getFont().deriveFont(18.85632412f));
	txt2.setVisible(true);
	fk3.add(txt2);
	

	bk4=new JButton("BACK");
	bk4.setFont(bk4.getFont().deriveFont(30.85632412f));
	bk4.setBounds(450,680 , 200, 50);
	bk4.enable();
	bk4.addActionListener(this);
	bk4.setBackground(Color.DARK_GRAY);
	bk4.setForeground(Color.white);
	bk4.setBorder(border1);
	bk4.setVisible(true);
	fk3.add(bk4);
	
	bk5=new JButton("SAVE & NEXT");
	bk5.setFont(bk5.getFont().deriveFont(30.85632412f));
	bk5.setBounds(800,680, 300, 50);
	bk5.enable();
	bk5.addActionListener(this);
	bk5.setBackground(Color.DARK_GRAY);
	bk5.setForeground(Color.white);
	bk5.setBorder(border1);
	bk5.setVisible(true);
	fk3.add(bk5);
	
	//-----------------------------------frame fk4-------------------------------------//
	
                             //__________Resume_________//

	
	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
    ImageIcon is4=new ImageIcon(imgs4);
    JLabel i5=new JLabel(is4);
    i4.setForeground(Color.white);
    i4.setBounds(0,0, 1919, 64);*/
    
    
	fk4=new JFrame();
	fk4.setLayout(null);
    Container c8=fk4.getContentPane();
	c8.setBackground(cl1);
	//fk4.setVisible(true);
	fk4.setVisible(false);
	fk4.setBounds(0, 0,1920, 1080);
	fk4.setTitle("Resume");
	

	lk29=new JLabel("SKILLS");
	lk29.setFont(lk29.getFont().deriveFont(40.85632412f));
	lk29.setForeground(Color.BLUE);
	lk29.setBounds(400, 100, 1100, 50);
	fk4.add(lk29);

	lk30=new JLabel("Highlight 6-8 of your top skills. ");
	lk30.setFont(lk20.getFont().deriveFont(28.85632472f));
	lk30.setForeground(Color.GRAY);
	lk30.setBounds(400,150,1400,50);
	fk4.add(lk30);
	
	lk31=new JLabel("Skill");
	lk31.setFont(lk31.getFont().deriveFont(25.85632472f));
	lk31.setBounds(450,250,300,50);
	fk4.add(lk31);
	
	tk18=new JTextField();
	tk18.setBounds(450, 300, 300, 30);
	tk18.setText("    ");
	tk18.setFont(tk18.getFont().deriveFont(18.85632412f));
	tk18.setVisible(true);
	tk18.setBorder(border1);
	fk4.add(tk18);
	
	lk32=new JLabel("Level");
	lk32.setFont(lk32.getFont().deriveFont(25.85632472f));
	lk32.setBounds(800,250,300,50);
	fk4.add(lk32);
	
	String level[]={"Expert","Experienced","Skillful","Beginner","Novice","Don't show level"};
	JComboBox g=new JComboBox(level);
	g.setBounds(800, 300, 200, 30);
	fk4.add(g);
	
	lk33=new JLabel("Skill");
	lk33.setFont(lk33.getFont().deriveFont(25.85632472f));
	lk33.setBounds(450,350,300,50);
	fk4.add(lk33);
	
	tk19=new JTextField();
	tk19.setBounds(450, 400, 300, 30);
	tk19.setText("    ");
	tk19.setFont(tk19.getFont().deriveFont(18.85632412f));
	tk19.setVisible(true);
	tk19.setBorder(border1);
	fk4.add(tk19);
	
	lk34=new JLabel("Level");
	lk34.setFont(lk34.getFont().deriveFont(25.85632472f));
	lk34.setBounds(800,350,300,50);
	fk4.add(lk34);
	
	String level1[]={"Expert","Experienced","Skillful","Beginner","Novice","Don't show level"};
	JComboBox h=new JComboBox(level1);
	h.setBounds(800, 400, 200, 30);
	fk4.add(h);
	
	lk35=new JLabel("Skill");
	lk35.setFont(lk35.getFont().deriveFont(25.85632472f));
	lk35.setBounds(450,450,300,50);
	fk4.add(lk35);
	
	tk20=new JTextField();
	tk20.setBounds(450, 500, 300, 30);
	tk20.setText("    ");
	tk20.setFont(tk20.getFont().deriveFont(18.85632412f));
	tk20.setVisible(true);
	tk20.setBorder(border1);
	fk4.add(tk20);
	
	lk36=new JLabel("Level");
	lk36.setFont(lk36.getFont().deriveFont(25.85632472f));
	lk36.setBounds(800,450,300,50);
	fk4.add(lk36);
	
	String level2[]={"Expert","Experienced","Skillful","Beginner","Novice","Don't show level"};
	JComboBox i=new JComboBox(level2);
	i.setBounds(800, 500, 200, 30);
	fk4.add(i);
	
	bk6=new JButton("BACK");
	bk6.setFont(bk6.getFont().deriveFont(30.85632412f));
	bk6.setBounds(450,600 , 200, 50);
	bk6.enable();
	bk6.addActionListener(this);
	bk6.setBackground(Color.DARK_GRAY);
	bk6.setForeground(Color.white);
	bk6.setBorder(border1);
	bk6.setVisible(true);
	fk4.add(bk6);
	
	bk7=new JButton("SAVE & NEXT");
	bk7.setFont(bk7.getFont().deriveFont(30.85632412f));
	bk7.setBounds(800,600, 300, 50);
	bk7.enable();
	bk7.addActionListener(this);
	bk7.setBackground(Color.DARK_GRAY);
	bk7.setForeground(Color.white);
	bk7.setBorder(border1);
	bk7.setVisible(true);
	fk4.add(bk7);
	
	//-----------------------------------frame fk5-------------------------------------//
	
                               //__________Resume_________//

	
	/*Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
    ImageIcon is4=new ImageIcon(imgs4);
    JLabel i5=new JLabel(is4);
    i4.setForeground(Color.white);
    i4.setBounds(0,0, 1919, 64);*/
    
    
	fk5=new JFrame();
	fk5.setLayout(null);
    Container c9=fk5.getContentPane();
	c9.setBackground(cl1);
	fk5.setVisible(true);
	//fk5.setVisible(false);
	fk5.setBounds(0, 0,1920, 1080);
	fk5.setTitle("Resume");
	
	lk37=new JLabel("PROFESSIONAL SUMMARY");
	lk37.setFont(lk37.getFont().deriveFont(40.85632412f));
	lk37.setForeground(Color.BLUE);
	lk37.setBounds(200, 100, 1100, 50);
	fk5.add(lk37);

	lk38=new JLabel("Write a short summary telling more about yourself, your strengths and experience.");
	lk38.setFont(lk28.getFont().deriveFont(28.85632472f));
	lk38.setForeground(Color.GRAY);
	lk38.setBounds(200,150,1400,50);
	fk5.add(lk38);
	
	lk39=new JLabel("Summary");
	lk39.setFont(lk39.getFont().deriveFont(25.85632472f));
	lk39.setBounds(450,250,300,50);
	fk5.add(lk39);
	
	
	
	txt1 = new JTextArea();
	txt1.setBounds(450, 300, 500, 400);
	txt1.setText("    ");
	txt1.setFont(txt1.getFont().deriveFont(18.85632412f));
	txt1.setVisible(true);
	//((JComponent) txt1).setBorder(border1);
	fk5.add(txt1);
	}
	
	
	
	
	
	

	
   public static void main (String[] args) 
	{
		new  Placement_dypiemr();
	}

	
   public void actionPerformed(ActionEvent e) {
		
		
	}

}
