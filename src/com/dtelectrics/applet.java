package com.dtelectrics;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;





//This is gonna be the main class
public class applet extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField forename = null;
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

	/**
	 * This is the default constructor
	 */
	public applet() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.gridx = 0;
		gridBagConstraints31.gridy = 18;
		jLabel14 = new JLabel();
		jLabel14.setText("Postcode");
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
		jLabel10.setText("Email Address");
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
		jLabel3.setText("Address Line 1");
		GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
		gridBagConstraints18.gridx = 0;
		gridBagConstraints18.gridy = 4;
		jLabel2 = new JLabel();
		jLabel2.setText("Surname");
		GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
		gridBagConstraints17.gridx = 0;
		gridBagConstraints17.gridy = 2;
		jLabel1 = new JLabel();
		jLabel1.setText("Forename");
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		gridBagConstraints16.gridx = 0;
		gridBagConstraints16.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Title");
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
		this.setSize(581, 834);
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
		this.add(getJTextField112(), gridBagConstraints14);
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

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
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
	


	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (forename == null) {
			forename = new JTextField();
			forename.setToolTipText("Forename");
			forename.setDocument
				(new JTextFieldLimit(25));
			forename.setColumns(25);
		}
		return forename;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField4	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField5	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField6	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField7	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField8	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField9	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField9() {
		if (jTextField9 == null) {
			jTextField9 = new JTextField();
			jTextField9.setToolTipText("Telephone Number");
			jTextField9.setDocument
				(new JTextFieldLimit(11));
			jTextField9.setColumns(11);
		}
		return jTextField9;
	}

	/**
	 * This method initializes jTextField10	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jComboBox1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	
	String[] jobs = { "Rectify Security Light Failure", "Repair cable damage from poor DIY", "Repair cooker socket", "Repair wiring to garage light", "Repair wiring to immersion heater", "Replace Broken Switch", "Replace damaged shaving socket", "Replace faulty wiring to shower", "Replace faulty fuse box", "Replace RCD socket", "Replace wiring to extractor fan", "Rewire dimmer switch", "Rewire wall light", "Test system" }; 
	
	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox(jobs);
		}
		return jComboBox1;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
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

	/**
	 * This method initializes jTextField11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField112() {
		if (jTextField12 == null) {
			jTextField12 = new JTextField();
			jTextField12.setToolTipText("Mobile Number");
			jTextField12.setDocument
				(new JTextFieldLimit(11));
			jTextField12.setColumns(11);
		}
		return jTextField12;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Submit");
		}
		return jButton;
	}

	/**
	 * This method initializes jComboBox2	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	
	String[] titles = { "Mr", "Mrs", "Miss", "Ms" };
	private JComboBox getJComboBox2() {
		if (jComboBox2 == null) {
			jComboBox2 = new JComboBox(titles);
		}
		return jComboBox2;
	}


}
