import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class StudyroomPos extends JFrame{
	private JTextField tfId;
	private JTextField tfPass;
	public StudyroomPos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{90, 72, 66, 0, 0, 63, 90, 90, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 39, 33, 0, 0, 0, 37, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblLogin = new JLabel("\uBA40\uD2F0 StudyRoom");
		lblLogin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.gridheight = 3;
		gbc_lblLogin.gridwidth = 6;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 1;
		gbc_lblLogin.gridy = 1;
		getContentPane().add(lblLogin, gbc_lblLogin);
		
		JLabel lblText = new JLabel("\uC544\uC774\uB514\uC640 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		lblText.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		GridBagConstraints gbc_lblText = new GridBagConstraints();
		gbc_lblText.gridwidth = 5;
		gbc_lblText.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblText.insets = new Insets(0, 0, 5, 5);
		gbc_lblText.gridx = 2;
		gbc_lblText.gridy = 6;
		getContentPane().add(lblText, gbc_lblText);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		GridBagConstraints gbc_lbl_id = new GridBagConstraints();
		gbc_lbl_id.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_id.anchor = GridBagConstraints.EAST;
		gbc_lbl_id.gridx = 2;
		gbc_lbl_id.gridy = 8;
		getContentPane().add(lbl_id, gbc_lbl_id);
		
		tfId = new JTextField();
		tfId.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.anchor = GridBagConstraints.WEST;
		gbc_tfId.gridwidth = 3;
		gbc_tfId.insets = new Insets(0, 0, 5, 5);
		gbc_tfId.gridx = 3;
		gbc_tfId.gridy = 8;
		getContentPane().add(tfId, gbc_tfId);
		tfId.setColumns(10);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.WEST;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 6;
		gbc_btnLogin.gridy = 9;
		getContentPane().add(btnLogin, gbc_btnLogin);
		
		JLabel lbl_pass = new JLabel("\uBE44\uBC00\uBC88\uD638");
		GridBagConstraints gbc_lbl_pass = new GridBagConstraints();
		gbc_lbl_pass.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_pass.anchor = GridBagConstraints.EAST;
		gbc_lbl_pass.gridx = 2;
		gbc_lbl_pass.gridy = 9;
		getContentPane().add(lbl_pass, gbc_lbl_pass);
		
		tfPass = new JTextField();
		tfPass.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.anchor = GridBagConstraints.WEST;
		gbc_tfPass.gridwidth = 3;
		gbc_tfPass.insets = new Insets(0, 0, 5, 5);
		gbc_tfPass.gridx = 3;
		gbc_tfPass.gridy = 9;
		getContentPane().add(tfPass, gbc_tfPass);
		tfPass.setColumns(10);
		
	}

	
}
