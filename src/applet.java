/*
This is the code for a Java applet that allows visitors to book jobs with DT Electrics (a
fictional company). 
License: GPL
Author: Harry Rickards <hrickards@l33tmyst.com>
*/

//Imports the neccessary classes for the GUI (Swing and AWT).
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

//Imports the classes needed to connect to a MySQL datase. Needs the Java DataBase Connector
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Imports the class needed for the code to be a Java applet
import java.applet.*;

//Sets up the class 'applet' as extending Applet (from java.applet.*)
public class applet extends Applet  {

	
    /**
     * This method checks if a String contains only numbers
     */
    public boolean anyNumbers(String str) {
        
        //It can't contain only numbers if it's null or empty...
        if (str == null || str.length() == 0)
            return true;
        
        for (int i = 0; i < str.length(); i++) {

            //If we find a digit character we return true.
            if (Character.isDigit(str.charAt(i)))
                return true;
        }
        
        return false;
    }
    
	//Adds a serialVersionUID string to shut Eclipse up
	private static final long serialVersionUID = -663433958959361836L;
	
	
	//Creates the variables for all the text fields, labels and combo boxes
	private JTextField jTextField0 = null;
	private JTextField jTextField1 = null;
	private JTextField jTextField2 = null;
	private JTextField jTextField3 = null;
	private JTextField jTextField4 = null;
	private JTextField jTextField5 = null;
	private JTextField jTextField6 = null;
	private JTextField jTextField7 = null;
	private JTextField jTextField8 = null;
	private JTextField jTextField9 = null;
	private JTextField jTextField10 = null;
	private JComboBox jComboBox1 = null;
	private JTextField jTextField11 = null;
	private JTextField jTextField12 = null;
	private JButton jButton = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JComboBox jComboBox2 = null;
	private JLabel jLabel14 = null;
	

	//The main class
	//Initialises everything
	public applet() {
		super();
		initialize();

	}

	//This method is referenced by applet() and sets the location and text of everything
	private void initialize() {
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.gridx = 0;
		gridBagConstraints31.gridy = 18;
		jLabel14 = new JLabel();
		jLabel14.setText("Postcode*");
		GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
		gridBagConstraints30.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints30.gridy = 1;
		gridBagConstraints30.weightx = 1.0;
		gridBagConstraints30.gridx = 0;
		GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
		gridBagConstraints29.gridx = 0;
		gridBagConstraints29.gridy = 28;
		jLabel13 = new JLabel();
		jLabel13.setText("Mobile Number");
		GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
		gridBagConstraints28.gridx = 0;
		gridBagConstraints28.gridy = 26;
		jLabel12 = new JLabel();
		jLabel12.setText("Fax Number");
		GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
		gridBagConstraints27.gridx = 0;
		gridBagConstraints27.gridy = 24;
		jLabel11 = new JLabel();
		jLabel11.setText("Type");
		GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
		gridBagConstraints26.gridx = 0;
		gridBagConstraints26.gridy = 22;
		jLabel10 = new JLabel();
		jLabel10.setText("Email Address*");
		GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
		gridBagConstraints25.gridx = 0;
		gridBagConstraints25.gridy = 20;
		jLabel9 = new JLabel();
		jLabel9.setText("Telephone Number");
		GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
		gridBagConstraints24.gridx = 0;
		gridBagConstraints24.gridy = 16;
		jLabel8 = new JLabel();
		jLabel8.setText("Address Line 6");
		GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
		gridBagConstraints23.gridx = 0;
		gridBagConstraints23.gridy = 14;
		jLabel7 = new JLabel();
		jLabel7.setText("Address Line 5");
		GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
		gridBagConstraints22.gridx = 0;
		gridBagConstraints22.gridy = 12;
		jLabel6 = new JLabel();
		jLabel6.setText("Address Line 4");
		GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
		gridBagConstraints21.gridx = 0;
		gridBagConstraints21.gridy = 10;
		jLabel5 = new JLabel();
		jLabel5.setText("Address Line 3");
		GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
		gridBagConstraints20.gridx = 0;
		gridBagConstraints20.gridy = 8;
		jLabel4 = new JLabel();
		jLabel4.setText("Address Line 2");
		GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
		gridBagConstraints19.gridx = 0;
		gridBagConstraints19.gridy = 6;
		jLabel3 = new JLabel();
		jLabel3.setText("Address Line 1*");
		GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
		gridBagConstraints18.gridx = 0;
		gridBagConstraints18.gridy = 4;
		jLabel2 = new JLabel();
		jLabel2.setText("Surname*");
		GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
		gridBagConstraints17.gridx = 0;
		gridBagConstraints17.gridy = 2;
		jLabel1 = new JLabel();
		jLabel1.setText("Forename*");
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		gridBagConstraints16.gridx = 0;
		gridBagConstraints16.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Title*");
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.gridx = 0;
		gridBagConstraints15.gridheight = 2;
		gridBagConstraints15.gridy = 30;
		GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
		gridBagConstraints14.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints14.gridy = 29;
		gridBagConstraints14.weightx = 1.0;
		gridBagConstraints14.gridx = 0;
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints13.gridy = 27;
		gridBagConstraints13.weightx = 1.0;
		gridBagConstraints13.gridx = 0;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints12.gridy = 25;
		gridBagConstraints12.weightx = 1.0;
		gridBagConstraints12.gridx = 0;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints11.gridy = 23;
		gridBagConstraints11.weightx = 1.0;
		gridBagConstraints11.gridx = 0;
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints10.gridy = 21;
		gridBagConstraints10.weightx = 1.0;
		gridBagConstraints10.gridx = 0;
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints9.gridy = 19;
		gridBagConstraints9.weightx = 1.0;
		gridBagConstraints9.gridx = 0;
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints8.gridy = 17;
		gridBagConstraints8.weightx = 1.0;
		gridBagConstraints8.gridx = 0;
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints7.gridy = 15;
		gridBagConstraints7.weightx = 1.0;
		gridBagConstraints7.gridx = 0;
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints6.gridy = 13;
		gridBagConstraints6.weightx = 1.0;
		gridBagConstraints6.gridx = 0;
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints5.gridy = 11;
		gridBagConstraints5.weightx = 1.0;
		gridBagConstraints5.gridx = 0;
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints4.gridy = 9;
		gridBagConstraints4.weightx = 1.0;
		gridBagConstraints4.gridx = 0;
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints3.gridy = 7;
		gridBagConstraints3.weightx = 1.0;
		gridBagConstraints3.gridx = 0;
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints2.gridy = 5;
		gridBagConstraints2.weightx = 1.0;
		gridBagConstraints2.gridx = 0;
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints1.gridy = 3;
		gridBagConstraints1.weightx = 1.0;
		gridBagConstraints1.gridx = 0;
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.gridx = 0;
		this.setSize(580, 600);
		this.setLayout(new GridBagLayout());
		this.add(getJTextField(), gridBagConstraints1);
		this.add(getJTextField1(), gridBagConstraints2);
		this.add(getJTextField2(), gridBagConstraints3);
		this.add(getJTextField3(), gridBagConstraints4);
		this.add(getJTextField4(), gridBagConstraints5);
		this.add(getJTextField5(), gridBagConstraints6);
		this.add(getJTextField6(), gridBagConstraints7);
		this.add(getJTextField7(), gridBagConstraints8);
		this.add(getJTextField8(), gridBagConstraints9);
		this.add(getJTextField9(), gridBagConstraints10);
		this.add(getJTextField10(), gridBagConstraints11);
		this.add(getJComboBox1(), gridBagConstraints12);
		this.add(getJTextField11(), gridBagConstraints13);
		this.add(getJTextField12(), gridBagConstraints14);
		this.add(getJButton(), gridBagConstraints15);
		this.add(jLabel, gridBagConstraints16);
		this.add(jLabel1, gridBagConstraints17);
		this.add(jLabel2, gridBagConstraints18);
		this.add(jLabel3, gridBagConstraints19);
		this.add(jLabel4, gridBagConstraints20);
		this.add(jLabel5, gridBagConstraints21);
		this.add(jLabel6, gridBagConstraints22);
		this.add(jLabel7, gridBagConstraints23);
		this.add(jLabel8, gridBagConstraints24);
		this.add(jLabel9, gridBagConstraints25);
		this.add(jLabel10, gridBagConstraints26);
		this.add(jLabel11, gridBagConstraints27);
		this.add(jLabel12, gridBagConstraints28);
		this.add(jLabel13, gridBagConstraints29);
		this.add(getJComboBox2(), gridBagConstraints30);
		this.add(jLabel14, gridBagConstraints31);
	}


	//Creates jTextField0 and sets the field length, tooltip etc.
	private JTextField getJTextField() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setToolTipText("Forename");
			jTextField0.setDocument
				(new JTextFieldLimit(25));
			jTextField0.setColumns(25);
		}
		return jTextField0;
	}

	//Creates jTextField1 and sets the field length, tooltip etc.
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setToolTipText("Surname");
			jTextField1.setDocument
				(new JTextFieldLimit(27));
			jTextField1.setColumns(27);
		}
		return jTextField1;
	}

	//Creates jTextField2 and sets the field length, tooltip etc.
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setToolTipText("Address Line 1");
			jTextField2.setDocument
				(new JTextFieldLimit(30));
			jTextField2.setColumns(30);
		}
		return jTextField2;
	}

	//Creates jTextField3 and sets the field length, tooltip etc.
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setToolTipText("Address Line 2");
			jTextField3.setDocument
				(new JTextFieldLimit(30));
			jTextField3.setColumns(30);
		}
		return jTextField3;
	}

	//Creates jTextField4 and sets the field length, tooltip etc.
	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setToolTipText("Address Line 3");
			jTextField4.setDocument
				(new JTextFieldLimit(30));
			jTextField4.setColumns(30);
		}
		return jTextField4;
	}

	//Creates jTextField5 and sets the field length, tooltip etc.
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setToolTipText("Address Line 4");
			jTextField5.setDocument
				(new JTextFieldLimit(30));
			jTextField5.setColumns(30);
		}
		return jTextField5;
	}

	//Creates jTextField6 and sets the field length, tooltip etc.
	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.setToolTipText("Address Line 5");
			jTextField6.setDocument
				(new JTextFieldLimit(30));
			jTextField6.setColumns(30);
		}
		return jTextField6;
	}

	//Creates jTextField7 and sets the field length, tooltip etc.
	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
			jTextField7.setToolTipText("Address Line 6");
			jTextField7.setDocument
				(new JTextFieldLimit(30));
			jTextField7.setColumns(30);
		}
		return jTextField7;
	}

	//Creates jTextField8 and sets the field length, tooltip etc.
	private JTextField getJTextField8() {
		if (jTextField8 == null) {
			jTextField8 = new JTextField();
			jTextField8.setToolTipText("Postcode");
			jTextField8.setDocument
				(new JTextFieldLimit(8));
			jTextField8.setColumns(8);
		}
		return jTextField8;
	}

	//Creates jTextField9 and sets the field length, tooltip etc.
	private JTextField getJTextField9() {
		if (jTextField9 == null) {
			jTextField9 = new JTextField();
			jTextField9.setToolTipText("Telephone Number");
			jTextField9.setDocument
				(new JTextFieldLimit(12));
			jTextField9.setColumns(11);
		}
		return jTextField9;
	}

	//Creates jTextField10 and sets the field length, tooltip etc.
	private JTextField getJTextField10() {
		if (jTextField10 == null) {
			jTextField10 = new JTextField();
			jTextField10.setToolTipText("Email Address");
			jTextField10.setDocument
				(new JTextFieldLimit(50));
			jTextField10.setColumns(50);
			//Not 150 for feasible size of text box. Is 50 instead
		}
		return jTextField10;	
	}

	//Creates the string array variable jobs. It contains a list of all the jobs DT Electrics do.
	String[] jobs = { "Rectify Security Light Failure", "Repair cable damage from poor DIY", "Repair cooker socket", "Repair wiring to garage light", "Repair wiring to immersion heater", "Replace Broken Switch", "Replace damaged shaving socket", "Replace faulty wiring to shower", "Replace faulty fuse box", "Replace RCD socket", "Replace wiring to extractor fan", "Rewire dimmer switch", "Rewire wall light", "Test system" }; 
	
	//Creates jComboBox1 and sets the options to the string array jobs
	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox(jobs);
		}
		return jComboBox1;
	}

	//Creates jTextField11 and sets the field length, tooltip etc.
	private JTextField getJTextField11() {
		if (jTextField11 == null) {
			jTextField11 = new JTextField();
			jTextField11.setToolTipText("Fax Number");
			jTextField11.setDocument
				(new JTextFieldLimit(11));
			jTextField11.setColumns(11);
			
		}
		return jTextField11;
	}

	//Creates jTextField12 and sets the field length, tooltip etc.
	private JTextField getJTextField12() {
		if (jTextField12 == null) {
			jTextField12 = new JTextField();
			jTextField12.setToolTipText("Mobile Number");
			jTextField12.setDocument
				(new JTextFieldLimit(11));
			jTextField12.setColumns(11);
		}
		return jTextField12;
	}

	//Creates jButton and sets it so that when clicked, the method database() is called.
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Submit");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					database();
				}
			});
		}
		return jButton;
	}

	//Creates the string array variable titles. It contains a list of all the possible titles
	//people can select in the form
	String[] titles = { "Mr", "Mrs", "Miss", "Ms" };
	
	//Creates jComboBox2 and sets the options to the string array titles
	private JComboBox getJComboBox2() {
		if (jComboBox2 == null) {
			jComboBox2 = new JComboBox(titles);
		}
		return jComboBox2;
	}

	//Sets up the standard class database()
	public void database() {
		
			int valid = 0;
			String forename = null, surname = null, address0 = null, address1 = null;
			String address2 = null, address3 = null, address4 = null, address5 = null;
			String postcode = null, phone = null, email = null, fax = null, mobile = null;
			
			//Creates a string called title that get's the selected item from jComboBox2
			String title = (String) jComboBox2.getSelectedItem();
			

			if (jTextField0.getText().equals("") || anyNumbers(jTextField0.getText()))
			{
				jLabel1.setForeground(Color.red);
				valid = 1;
			} else {
				jLabel1.setForeground(Color.black);
				//Creates a string called forename that get's the text from jTextField0
				forename = jTextField0.getText();
				
			}
			
			if (jTextField1.getText().equals("") || anyNumbers(jTextField1.getText()))
			{
				jLabel2.setForeground(Color.red);
				valid = 1;
			} else {
				jLabel2.setForeground(Color.black);
				//Creates a string called surname that get's the text from jTextField1
				surname = jTextField1.getText();
			}
			
			if (jTextField2.getText().equals("") || jTextField2.getText().length() <= 1)
			{
				jLabel3.setForeground(Color.red);
				valid = 1;
			} else {
				jLabel3.setForeground(Color.black);
				//Creates a string called address0 that get's the text from jTextField2
				address0 = jTextField2.getText();
			}


			
			if (jTextField3.getText().length() == 1)
			{
					jLabel4.setForeground(Color.red);
					valid = 1;
			} else {
					jLabel4.setForeground(Color.black);
					//Creates a string called address1 that get's the text from jTextField3
					address1 = jTextField3.getText();
			}

			if (jTextField4.getText().length() == 1)
			{
					jLabel5.setForeground(Color.red);
					valid = 1;
			} else {
					jLabel5.setForeground(Color.black);
					//Creates a string called address2 that get's the text from jTextField4
					address2 = jTextField4.getText();
			}

			if (jTextField5.getText().length() == 1)
			{
					jLabel6.setForeground(Color.red);
					valid = 1;
			} else {
					jLabel6.setForeground(Color.black);
					//Creates a string called address3 that get's the text from jTextField5
					address3 = jTextField5.getText();
			}
		
			if (jTextField6.getText().length() == 1)
			{
					jLabel7.setForeground(Color.red);
					valid = 1;
			} else {
					jLabel7.setForeground(Color.black);
					//Creates a string called address1 that get's the text from jTextField6
					address4 = jTextField6.getText();
			}
			
			if (jTextField7.getText().length() == 1)
			{
					jLabel8.setForeground(Color.red);
					valid = 1;
			} else {
					jLabel8.setForeground(Color.black);
					//Creates a string called address1 that get's the text from jTextField7
					address5 = jTextField7.getText();
			}
						
			if (jTextField8.getText().equals("") || jTextField8.getText().length() <6 || jTextField8.getText().length() >8)
			{
				jLabel14.setForeground(Color.red);
				valid = 1;
			} else {
				if (jTextField8.getText().matches("[A-Z]{1,2}[1-9][0-9]? ?[0-9][A-Z]{2}"))
				{
					jLabel14.setForeground(Color.black);
					//Creates a string called postcode that get's the text from jTextField8
					postcode = jTextField8.getText();					
				} else {
					jLabel14.setForeground(Color.red);
					valid = 1;					
				}
			}
			
			
			if (jTextField9.getText().matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{5})$"))
			{
				jLabel9.setForeground(Color.black);
				//Creates a string called phone that get's the text from jTextField9
				phone = jTextField9.getText();
			} else if (jTextField9.getText().equals(""))
			{
				jLabel9.setForeground(Color.black);
				//Creates a string called phone that get's the text from jTextField9
				phone = jTextField9.getText();
			} else {
				jLabel9.setForeground(Color.red);
				valid = 1;
			}
			
			if (jTextField10.getText().equals("") || jTextField10.getText().length() < 7)
			{
				jLabel10.setForeground(Color.red);
				valid = 1;
			} else {
				if (jTextField10.getText().matches("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}"))
				{
					jLabel10.setForeground(Color.black);
					//Creates a string called email that get's the text from jTextField10
					email = jTextField10.getText();
				} else {
					jLabel9.setForeground(Color.red);
					valid = 1;					
				}
			}
		
			//Creates a string called type that get's the selected item from jComboBox1
			String type = (String) jComboBox1.getSelectedItem();
			
			if (jTextField11.getText().matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{5})$"))
			{
				jLabel12.setForeground(Color.black);
				//Creates a string called fax that get's the text from jTextField11
				fax = jTextField11.getText();
			} else if (jTextField11.getText().equals(""))
			{
				jLabel12.setForeground(Color.black);
				//Creates a string called fax that get's the text from jTextField11
				fax = jTextField11.getText();
			} else {
				jLabel12.setForeground(Color.red);
				valid = 1;
			}
			
			if (jTextField12.getText().matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{5})$"))
			{
				jLabel13.setForeground(Color.black);
				//Creates a string called mobile that get's the text from jTextField12
				mobile = jTextField12.getText();
			} else if (jTextField12.getText().equals(""))
			{
				jLabel13.setForeground(Color.black);
				//Creates a string called mobile that get's the text from jTextField12
				mobile = jTextField12.getText();
			} else {
				jLabel13.setForeground(Color.red);
				valid = 1;
			}
			
			if (valid == 0)
			{
				//Creates a string called insertString that will insert the variables (see above)
				//into the relevant fields in the MySQL table
				String insertString = "insert into customers (title, forename, surname, address0, address1, address2, address3, address4, address5, postcode, phone, email, type, fax, mobile) values('"+title+"', '"+forename+"', '"+surname+"', '"+address0+"', '"+address1+"', '"+address2+"', '"+address3+"', '"+address4+"', '"+address5+"', '"+postcode+"', '"+phone+"', '"+email+"', '"+type+"', '"+fax+"', '"+mobile+"')";
			
				//Uses Statement from java.sql to create a statement called stmt
				//Needs to be directly referenced as java.sql.Statement to avoid confusion with
				//java.beans.Statement
				java.sql.Statement stmt;
			
				//Uses Connection to create a null connection called con
				Connection con = null;
			
					try
					{

						//Creates a new JDBC instance
						Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	        	   	
						/*
						 * IMPORTANT: For obvious reasons the following variables such as
						 * mydatabase, username and password have been changed so that an
						 * attacker can't fill up the database with meaningless entries.	        	   	
						 */
	        	   	
	        	   	
						//Creates a variable called serverName with the value of localhost
						//This will set the server name as localhost
						//Needs to be changed in a production environment
						String serverName = "localhost";
	        	   	
						//Creates a variable called mydatabase with the value of dtelectrics
						//This will set the name of the database to dtelectrics
						//Needs to be changed in a production environment
						String mydatabase = "dtelectrics";
	        	   	
						//Creates a variable called url that combines the previous along with
						//some other info
						String url = "jdbc:mysql://" + serverName +  "/" + mydatabase;
	        	   	
						//Creates a variable called username with the value of dtelectrics
						//This will set the username to log in as to dtelectrics
						//Needs to be changed in a production environment
						String username = "dtelectrics";
	        	   	
						//Creates a variable called password with the value of cr1ppl34t0r
						//This will set the password to log in with to cr1ppl34t0r
						//Needs to be changed in a production environment
						String password = "passw0rd";
	        	   	
						//Uses the previously created connection con to connect to the database
						//using the variables url, username and password
						con = DriverManager.getConnection(url, username, password);

						//The previously created statement stmt uses the previously created
						//connection con to create a statement
						stmt = con.createStatement();
	        	   	
		        	   	//stmt then runs the SQL command in the variable insertString
		        	   	stmt.executeUpdate(insertString);

	            
		        	   	//Checks for any SQL errors
					} catch (SQLException ex) {
						//If there are errors prints out the following debugging info:
		        	   	//SQL Exception number, SQL State and Vendor Error Number
		        	   	System.out.println("SQLException: " + ex.getMessage());
		        	   	System.out.println("SQLState: " + ex.getSQLState());
		        	   	System.out.println("VendorError: " + ex.getErrorCode());
	        	
		        	   	//Checks for any other errors
					} catch (Exception e) {
						//Prints out an error message informing the user about the unknown error
						//Clarification: Will show up in the Java console not the form
						System.err.println ("UNKOWN ERROR: Cann't connect to database");
	           
	               
                

	           
					} finally {
						//If connection isn't null
						//(although confusing means connection is finished)
						if (con != null)
						{
							try
							{
								//Close the connection
								con.close ();
								
								//Print out a message to the Java console saying that the
								//connection has been disconnected
								System.out.println ("Disconnected from database");
	                       
								//Increases the length of jButton so more text can fit
								jButton.setSize(90, 25);               
	    	               
								//Sets the text of jButton to thanks
								jButton.setText("Thanks");	       
	    	               
								//Sets the text colour of jButton to red
								jButton.setForeground(Color.red);
							}
							catch (Exception e) {
								/* Ignores any errors that happen when
								 *closing the connection
								 */ 
	                	   }
	               }
	           }
					
					
					
			}
	}
	

	
}
