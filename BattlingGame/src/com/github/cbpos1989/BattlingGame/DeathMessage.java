package com.github.cbpos1989.BattlingGame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class DeathMessage extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public DeathMessage(String name, JFrame battleWindow) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JLabel lblNewLabel = new JLabel(name + " has been slain");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 33, 351, 80);
		getContentPane().add(lblNewLabel);
		
		JButton btnNextBattle = new JButton("Next Battle");
		btnNextBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				battleWindow.setVisible(false);
				DeathMessage.this.dispose();
			}
		});
		btnNextBattle.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 14));
		btnNextBattle.setBounds(131, 180, 155, 43);
		getContentPane().add(btnNextBattle);
	}
	
	
}
