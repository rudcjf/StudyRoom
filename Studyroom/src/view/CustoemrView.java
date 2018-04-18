package view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustoemrView extends JFrame {
	private JTextField tfName;
	private JTextField tfTel;
	private JTextField tfMail;
	private JTextField tfAdr;
	public CustoemrView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 46, 26, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCustomer = new JLabel("\uD68C\uC6D0\uAD00\uB9AC");
		lblCustomer.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		GridBagConstraints gbc_lblCustomer = new GridBagConstraints();
		gbc_lblCustomer.anchor = GridBagConstraints.WEST;
		gbc_lblCustomer.gridwidth = 2;
		gbc_lblCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_lblCustomer.gridx = 1;
		gbc_lblCustomer.gridy = 1;
		getContentPane().add(lblCustomer, gbc_lblCustomer);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.gridwidth = 8;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		JLabel lbl_Name = new JLabel("\uC774\uB984");
		GridBagConstraints gbc_lbl_Name = new GridBagConstraints();
		gbc_lbl_Name.anchor = GridBagConstraints.WEST;
		gbc_lbl_Name.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Name.gridx = 1;
		gbc_lbl_Name.gridy = 11;
		getContentPane().add(lbl_Name, gbc_lbl_Name);
		
		JLabel lbl_Tel = new JLabel("\uC804\uD654\uBC88\uD638");
		GridBagConstraints gbc_lbl_Tel = new GridBagConstraints();
		gbc_lbl_Tel.anchor = GridBagConstraints.WEST;
		gbc_lbl_Tel.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Tel.gridx = 2;
		gbc_lbl_Tel.gridy = 11;
		getContentPane().add(lbl_Tel, gbc_lbl_Tel);
		
		JLabel lbl_Adr = new JLabel("\uC8FC\uC18C");
		GridBagConstraints gbc_lbl_Adr = new GridBagConstraints();
		gbc_lbl_Adr.anchor = GridBagConstraints.WEST;
		gbc_lbl_Adr.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Adr.gridx = 3;
		gbc_lbl_Adr.gridy = 11;
		getContentPane().add(lbl_Adr, gbc_lbl_Adr);
		
		JLabel lbl_Mail = new JLabel("\uC774\uBA54\uC77C");
		GridBagConstraints gbc_lbl_Mail = new GridBagConstraints();
		gbc_lbl_Mail.anchor = GridBagConstraints.WEST;
		gbc_lbl_Mail.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Mail.gridx = 7;
		gbc_lbl_Mail.gridy = 11;
		getContentPane().add(lbl_Mail, gbc_lbl_Mail);
		
		tfName = new JTextField();
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 5, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 12;
		getContentPane().add(tfName, gbc_tfName);
		tfName.setColumns(10);
		
		tfTel = new JTextField();
		GridBagConstraints gbc_tfTel = new GridBagConstraints();
		gbc_tfTel.insets = new Insets(0, 0, 5, 5);
		gbc_tfTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTel.gridx = 2;
		gbc_tfTel.gridy = 12;
		getContentPane().add(tfTel, gbc_tfTel);
		tfTel.setColumns(10);
		
		tfAdr = new JTextField();
		tfAdr.setColumns(10);
		GridBagConstraints gbc_tfAdr = new GridBagConstraints();
		gbc_tfAdr.gridwidth = 4;
		gbc_tfAdr.insets = new Insets(0, 0, 5, 5);
		gbc_tfAdr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAdr.gridx = 3;
		gbc_tfAdr.gridy = 12;
		getContentPane().add(tfAdr, gbc_tfAdr);
		
		tfMail = new JTextField();
		GridBagConstraints gbc_tfMail = new GridBagConstraints();
		gbc_tfMail.gridwidth = 2;
		gbc_tfMail.insets = new Insets(0, 0, 5, 5);
		gbc_tfMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMail.gridx = 7;
		gbc_tfMail.gridy = 12;
		getContentPane().add(tfMail, gbc_tfMail);
		tfMail.setColumns(10);
		
		JButton btnadd = new JButton("\uCD94\uAC00");
		GridBagConstraints gbc_btnadd = new GridBagConstraints();
		gbc_btnadd.insets = new Insets(0, 0, 5, 5);
		gbc_btnadd.gridx = 6;
		gbc_btnadd.gridy = 13;
		getContentPane().add(btnadd, gbc_btnadd);
		
		JButton btnModify = new JButton("\uC218\uC815");
		GridBagConstraints gbc_btnModify = new GridBagConstraints();
		gbc_btnModify.insets = new Insets(0, 0, 5, 5);
		gbc_btnModify.gridx = 7;
		gbc_btnModify.gridy = 13;
		getContentPane().add(btnModify, gbc_btnModify);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.gridx = 8;
		gbc_btnDelete.gridy = 13;
		getContentPane().add(btnDelete, gbc_btnDelete);
	}

}
