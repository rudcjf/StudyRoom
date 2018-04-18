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
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class CustoemrView extends JFrame {
	private JTextField tfName;
	private JTextField tfTel;
	private JTextField tfAdr;
	private JTextField tfMail;
	public CustoemrView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{345, 0, 29, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_Main1 = new JPanel();
		GridBagConstraints gbc_panel_Main1 = new GridBagConstraints();
		gbc_panel_Main1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Main1.fill = GridBagConstraints.BOTH;
		gbc_panel_Main1.gridx = 0;
		gbc_panel_Main1.gridy = 0;
		getContentPane().add(panel_Main1, gbc_panel_Main1);
		GridBagLayout gbl_panel_Main1 = new GridBagLayout();
		gbl_panel_Main1.columnWidths = new int[]{17, 490, 0, 0};
		gbl_panel_Main1.rowHeights = new int[]{41, 242, 0};
		gbl_panel_Main1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Main1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_Main1.setLayout(gbl_panel_Main1);
		
		JLabel lblCustomer = new JLabel("\uD68C\uC6D0\uAD00\uB9AC");
		lblCustomer.setFont(new Font("���� ����", Font.PLAIN, 30));
		GridBagConstraints gbc_lblCustomer = new GridBagConstraints();
		gbc_lblCustomer.anchor = GridBagConstraints.NORTH;
		gbc_lblCustomer.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_lblCustomer.gridx = 1;
		gbc_lblCustomer.gridy = 0;
		panel_Main1.add(lblCustomer, gbc_lblCustomer);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel_Main1.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_Main2 = new JPanel();
		GridBagConstraints gbc_panel_Main2 = new GridBagConstraints();
		gbc_panel_Main2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Main2.fill = GridBagConstraints.BOTH;
		gbc_panel_Main2.gridx = 0;
		gbc_panel_Main2.gridy = 1;
		getContentPane().add(panel_Main2, gbc_panel_Main2);
		panel_Main2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Sub1 = new JPanel();
		panel_Main2.add(panel_Sub1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Sub1 = new GridBagLayout();
		gbl_panel_Sub1.columnWidths = new int[]{28, 0, 57, 28, 28, 0, 12, 28, 32, 0, 0, 0};
		gbl_panel_Sub1.rowHeights = new int[]{0, 21, 0};
		gbl_panel_Sub1.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Sub1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_Sub1.setLayout(gbl_panel_Sub1);
		
		JLabel lblName = new JLabel("\uC774\uB984 ");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.fill = GridBagConstraints.VERTICAL;
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		panel_Sub1.add(lblName, gbc_lblName);
		
		JLabel lblTel = new JLabel("\uC804\uD654 ");
		GridBagConstraints gbc_lblTel = new GridBagConstraints();
		gbc_lblTel.anchor = GridBagConstraints.WEST;
		gbc_lblTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTel.gridx = 2;
		gbc_lblTel.gridy = 0;
		panel_Sub1.add(lblTel, gbc_lblTel);
		
		JLabel lblAdr = new JLabel("\uC8FC\uC18C ");
		GridBagConstraints gbc_lblAdr = new GridBagConstraints();
		gbc_lblAdr.anchor = GridBagConstraints.WEST;
		gbc_lblAdr.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdr.gridx = 3;
		gbc_lblAdr.gridy = 0;
		panel_Sub1.add(lblAdr, gbc_lblAdr);
		
		JLabel lblMail = new JLabel("\uBA54\uC77C ");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.gridx = 7;
		gbc_lblMail.gridy = 0;
		panel_Sub1.add(lblMail, gbc_lblMail);
		
		tfName = new JTextField();
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 0, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 1;
		panel_Sub1.add(tfName, gbc_tfName);
		tfName.setColumns(10);
		
		tfTel = new JTextField();
		tfTel.setColumns(10);
		GridBagConstraints gbc_tfTel = new GridBagConstraints();
		gbc_tfTel.insets = new Insets(0, 0, 0, 5);
		gbc_tfTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTel.gridx = 2;
		gbc_tfTel.gridy = 1;
		panel_Sub1.add(tfTel, gbc_tfTel);
		
		tfAdr = new JTextField();
		tfAdr.setColumns(10);
		GridBagConstraints gbc_tfAdr = new GridBagConstraints();
		gbc_tfAdr.gridwidth = 4;
		gbc_tfAdr.insets = new Insets(0, 0, 0, 5);
		gbc_tfAdr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAdr.gridx = 3;
		gbc_tfAdr.gridy = 1;
		panel_Sub1.add(tfAdr, gbc_tfAdr);
		
		tfMail = new JTextField();
		tfMail.setColumns(10);
		GridBagConstraints gbc_tfMail = new GridBagConstraints();
		gbc_tfMail.gridwidth = 3;
		gbc_tfMail.insets = new Insets(0, 0, 0, 5);
		gbc_tfMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMail.gridx = 7;
		gbc_tfMail.gridy = 1;
		panel_Sub1.add(tfMail, gbc_tfMail);
		
		JPanel panel_Main3 = new JPanel();
		GridBagConstraints gbc_panel_Main3 = new GridBagConstraints();
		gbc_panel_Main3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_Main3.gridx = 0;
		gbc_panel_Main3.gridy = 2;
		getContentPane().add(panel_Main3, gbc_panel_Main3);
		panel_Main3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Sub2 = new JPanel();
		panel_Main3.add(panel_Sub2, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setFont(new Font("���� ����", Font.PLAIN, 13));
		panel_Sub2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.setFont(new Font("���� ����", Font.PLAIN, 13));
		panel_Sub2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC0AD\uC81C");
		btnNewButton_2.setFont(new Font("���� ����", Font.PLAIN, 13));
		panel_Sub2.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("   ");
		panel_Sub2.add(lblNewLabel);
	}

}
