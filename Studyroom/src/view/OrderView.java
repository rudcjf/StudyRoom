package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderView extends JFrame {
   
   public OrderView() {
      setSize(800, 600);
      setResizable(false);
      
      getContentPane().setBackground(Color.LIGHT_GRAY);
      getContentPane().setLayout(new BorderLayout(0, 0));
      
      JPanel panel_Main1 = new JPanel();
      panel_Main1.setBackground(Color.LIGHT_GRAY);
      getContentPane().add(panel_Main1, BorderLayout.NORTH);
      GridBagLayout gbl_panel_Main1 = new GridBagLayout();
      gbl_panel_Main1.columnWidths = new int[]{0, 273, 0, 0};
      gbl_panel_Main1.rowHeights = new int[]{37, 482, 0};
      gbl_panel_Main1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
      gbl_panel_Main1.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
      panel_Main1.setLayout(gbl_panel_Main1);
      
      JLabel lblPay = new JLabel("\uACB0\uC81C");
      lblPay.setFont(new Font("맑은 고딕", Font.BOLD, 30));
      GridBagConstraints gbc_lblPay = new GridBagConstraints();
      gbc_lblPay.anchor = GridBagConstraints.WEST;
      gbc_lblPay.insets = new Insets(0, 0, 5, 5);
      gbc_lblPay.gridx = 1;
      gbc_lblPay.gridy = 0;
      panel_Main1.add(lblPay, gbc_lblPay);
      
      JScrollPane scrollPane = new JScrollPane();
      GridBagConstraints gbc_scrollPane = new GridBagConstraints();
      gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
      gbc_scrollPane.fill = GridBagConstraints.BOTH;
      gbc_scrollPane.gridx = 1;
      gbc_scrollPane.gridy = 1;
      panel_Main1.add(scrollPane, gbc_scrollPane);
      
      JPanel panel_Main2 = new JPanel();
      panel_Main2.setBackground(Color.LIGHT_GRAY);
      getContentPane().add(panel_Main2, BorderLayout.CENTER);
      panel_Main2.setLayout(new BorderLayout(0, 0));
      
      JPanel panel_Sub1 = new JPanel();
      panel_Sub1.setBackground(Color.LIGHT_GRAY);
      panel_Main2.add(panel_Sub1, BorderLayout.EAST);
      GridBagLayout gbl_panel_Sub1 = new GridBagLayout();
      gbl_panel_Sub1.columnWidths = new int[]{0, 0, 0, 0};
      gbl_panel_Sub1.rowHeights = new int[]{100, 0};
      gbl_panel_Sub1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_panel_Sub1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
      panel_Sub1.setLayout(gbl_panel_Sub1);
      
      JButton btnPay = new JButton("결제");
      btnPay.setBackground(Color.LIGHT_GRAY);
      btnPay.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnPay.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
      GridBagConstraints gbc_btnPay = new GridBagConstraints();
      gbc_btnPay.insets = new Insets(0, 0, 0, 5);
      gbc_btnPay.gridx = 0;
      gbc_btnPay.gridy = 0;
      panel_Sub1.add(btnPay, gbc_btnPay);
      
      JButton btnCancel = new JButton("취소");
      btnCancel.setBackground(Color.LIGHT_GRAY);
      btnCancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
      GridBagConstraints gbc_btnCancel = new GridBagConstraints();
      gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
      gbc_btnCancel.gridx = 1;
      gbc_btnCancel.gridy = 0;
      panel_Sub1.add(btnCancel, gbc_btnCancel);
   }

}