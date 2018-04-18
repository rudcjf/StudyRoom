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

public class CustoemrView2 extends JFrame {
	private JTextField tfName;
	private JTextField tfTel;
	private JTextField tfAdr;
	private JTextField textMail;
	public CustoemrView2() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{256, 21, 0, 29, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		lblCustomer.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
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
		gbc_panel_Main2.gridy = 2;
		getContentPane().add(panel_Main2, gbc_panel_Main2);
		panel_Main2.setLayout(new BoxLayout(panel_Main2, BoxLayout.X_AXIS));
		
		JLabel label_1 = new JLabel("       ");
		panel_Main2.add(label_1);
		
		JLabel lblName = new JLabel("\uC774\uB984 ");
		panel_Main2.add(lblName);
		
		tfName = new JTextField();
		panel_Main2.add(tfName);
		tfName.setColumns(10);
		
		JLabel label_2 = new JLabel("   ");
		panel_Main2.add(label_2);
		
		JLabel lblTel = new JLabel("\uC804\uD654 ");
		panel_Main2.add(lblTel);
		
		tfTel = new JTextField();
		panel_Main2.add(tfTel);
		tfTel.setColumns(10);
		
		JLabel label_3 = new JLabel("   ");
		panel_Main2.add(label_3);
		
		JLabel lblAdr = new JLabel("\uC8FC\uC18C ");
		panel_Main2.add(lblAdr);
		
		tfAdr = new JTextField();
		panel_Main2.add(tfAdr);
		tfAdr.setColumns(20);
		
		JLabel label_4 = new JLabel("   ");
		panel_Main2.add(label_4);
		
		JLabel lblMail = new JLabel("\uBA54\uC77C ");
		panel_Main2.add(lblMail);
		
		textMail = new JTextField();
		panel_Main2.add(textMail);
		textMail.setColumns(10);
		
		JLabel label = new JLabel("        ");
		panel_Main2.add(label);
		
		JPanel panel_Main3 = new JPanel();
		GridBagConstraints gbc_panel_Main3 = new GridBagConstraints();
		gbc_panel_Main3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_Main3.gridx = 0;
		gbc_panel_Main3.gridy = 3;
		getContentPane().add(panel_Main3, gbc_panel_Main3);
		panel_Main3.setLayout(new BoxLayout(panel_Main3, BoxLayout.X_AXIS));
		
		JLabel label_5 = new JLabel("              ");
		panel_Main3.add(label_5);
		
		JLabel label_6 = new JLabel("                        ");
		panel_Main3.add(label_6);
		
		JLabel label_9 = new JLabel("                        ");
		panel_Main3.add(label_9);
		
		JLabel label_11 = new JLabel("              ");
		panel_Main3.add(label_11);
		
		JButton btnAdd = new JButton("\uCD94\uAC00");
		panel_Main3.add(btnAdd);
		
		JLabel label_7 = new JLabel("   ");
		panel_Main3.add(label_7);
		
		JButton btnModify = new JButton("\uC218\uC815");
		panel_Main3.add(btnModify);
		
		JLabel label_8 = new JLabel("   ");
		panel_Main3.add(label_8);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		panel_Main3.add(btnDelete);
		
		JLabel label_10 = new JLabel("        ");
		panel_Main3.add(label_10);
	}

}
