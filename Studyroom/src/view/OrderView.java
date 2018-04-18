package view;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class OrderView extends JFrame {
	public OrderView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 613, 0, 0};
		gridBagLayout.rowHeights = new int[]{56, 414, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel label = new JLabel("\uACB0\uC81C");
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		getContentPane().add(label, gbc_label);
		
		JPanel panel_Main1 = new JPanel();
		GridBagConstraints gbc_panel_Main1 = new GridBagConstraints();
		gbc_panel_Main1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Main1.fill = GridBagConstraints.BOTH;
		gbc_panel_Main1.gridx = 1;
		gbc_panel_Main1.gridy = 1;
		getContentPane().add(panel_Main1, gbc_panel_Main1);
		GridBagLayout gbl_panel_Main1 = new GridBagLayout();
		gbl_panel_Main1.columnWidths = new int[]{273, 0};
		gbl_panel_Main1.rowHeights = new int[]{2, 0};
		gbl_panel_Main1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_Main1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_Main1.setLayout(gbl_panel_Main1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_Main1.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_Main2 = new JPanel();
		GridBagConstraints gbc_panel_Main2 = new GridBagConstraints();
		gbc_panel_Main2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_Main2.fill = GridBagConstraints.BOTH;
		gbc_panel_Main2.gridx = 1;
		gbc_panel_Main2.gridy = 2;
		getContentPane().add(panel_Main2, gbc_panel_Main2);
		panel_Main2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Sub1 = new JPanel();
		panel_Main2.add(panel_Sub1, BorderLayout.EAST);
		GridBagLayout gbl_panel_Sub1 = new GridBagLayout();
		gbl_panel_Sub1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_Sub1.rowHeights = new int[]{100, 0};
		gbl_panel_Sub1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Sub1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_Sub1.setLayout(gbl_panel_Sub1);
		
		JButton btnPay = new JButton("\uACB0\uC81C");
		btnPay.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		GridBagConstraints gbc_btnPay = new GridBagConstraints();
		gbc_btnPay.insets = new Insets(0, 0, 0, 5);
		gbc_btnPay.gridx = 0;
		gbc_btnPay.gridy = 0;
		panel_Sub1.add(btnPay, gbc_btnPay);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 0;
		panel_Sub1.add(btnCancel, gbc_btnCancel);
	}

}
