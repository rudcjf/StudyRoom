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
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Main1 = new JPanel();
		getContentPane().add(panel_Main1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_Main1 = new GridBagLayout();
		gbl_panel_Main1.columnWidths = new int[]{601, 0};
		gbl_panel_Main1.rowHeights = new int[]{0, 0, 97, 0};
		gbl_panel_Main1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_Main1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Main1.setLayout(gbl_panel_Main1);
		
		JLabel lblLogin = new JLabel("\uBA40\uD2F0 StudyRoom");
		lblLogin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 0);
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 1;
		panel_Main1.add(lblLogin, gbc_lblLogin);
		
		JLabel lblInfo = new JLabel("\uB85C\uADF8\uC778 \uC544\uC774\uB514\uC640 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD574 \uC8FC\uC138\uC694.");
		lblInfo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.gridx = 0;
		gbc_lblInfo.gridy = 2;
		panel_Main1.add(lblInfo, gbc_lblInfo);
		
		JPanel panel_Main2 = new JPanel();
		getContentPane().add(panel_Main2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Main2 = new GridBagLayout();
		gbl_panel_Main2.columnWidths = new int[]{117, 57, 62, 115, 98, 0, 116, 0};
		gbl_panel_Main2.rowHeights = new int[]{0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_Main2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Main2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Main2.setLayout(gbl_panel_Main2);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 2;
		gbc_lblId.gridy = 2;
		panel_Main2.add(lblId, gbc_lblId);
		
		tfId = new JTextField();
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.anchor = GridBagConstraints.NORTH;
		gbc_tfId.insets = new Insets(0, 0, 5, 5);
		gbc_tfId.gridx = 3;
		gbc_tfId.gridy = 2;
		panel_Main2.add(tfId, gbc_tfId);
		tfId.setColumns(10);
		
		JLabel lblPass = new JLabel("\uBE44\uBC00\uBC88\uD638");
		GridBagConstraints gbc_lblPass = new GridBagConstraints();
		gbc_lblPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPass.insets = new Insets(0, 0, 5, 5);
		gbc_lblPass.gridx = 2;
		gbc_lblPass.gridy = 3;
		panel_Main2.add(lblPass, gbc_lblPass);
		
		tfPass = new JTextField();
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPass.insets = new Insets(0, 0, 5, 5);
		gbc_tfPass.anchor = GridBagConstraints.NORTH;
		gbc_tfPass.gridx = 3;
		gbc_tfPass.gridy = 3;
		panel_Main2.add(tfPass, gbc_tfPass);
		tfPass.setColumns(10);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 3;
		panel_Main2.add(btnLogin, gbc_btnLogin);
		
	}

	
}
