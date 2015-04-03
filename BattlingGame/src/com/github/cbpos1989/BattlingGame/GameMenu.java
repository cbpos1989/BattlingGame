package com.github.cbpos1989.BattlingGame;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

public class GameMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenu frame = new GameMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public GameMenu(ArrayList<Character> list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JLabel lblMainTitle = new JLabel("Battling Game");
		lblMainTitle.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblMainTitle.setBounds(284, 11, 256, 40);
		contentPane.add(lblMainTitle);
		
		JLabel lblPlayerChar_1 = new JLabel(list.get(0).toString());
		lblPlayerChar_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerChar_1.setBounds(10, 54, 400, 40);
		contentPane.add(lblPlayerChar_1);
		
		JLabel lblPlayerChar_2 = new JLabel(list.get(1).toString());
		lblPlayerChar_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerChar_2.setBounds(10, 105, 400, 40);
		contentPane.add(lblPlayerChar_2);
		
		JLabel lblPlayerChar_3 = new JLabel(list.get(2).toString());
		lblPlayerChar_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerChar_3.setBounds(10, 156, 400, 40);
		contentPane.add(lblPlayerChar_3);
		
		JLabel lblPlayerChar_4 = new JLabel(list.get(3).toString());
		lblPlayerChar_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerChar_4.setBounds(10, 207, 400, 40);
		contentPane.add(lblPlayerChar_4);
		
		JLabel lblPlayerChar_5 = new JLabel(list.get(4).toString());
		lblPlayerChar_5.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerChar_5.setBounds(10, 258, 400, 40);
		contentPane.add(lblPlayerChar_5);
		
	}
	
	
}
