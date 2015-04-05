package com.github.cbpos1989.BattlingGame;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

public class GameMenu extends JFrame {
	private GameApp ga =  new GameApp();
	private String playerCombatant = null;
	private String aiCombatant = null;
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
	public GameMenu(ArrayList<Character> playerList, ArrayList<Character> aiList) {
		setTitle("Battling Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1228, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblMainTitle = new JLabel("Battling Game");
		lblMainTitle.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblMainTitle.setBounds(351, 11, 158, 40);
		contentPane.add(lblMainTitle);
		
		//Player Combatant 1
		JTextArea txtPlayerChar_0 = new JTextArea(playerList.get(0).toString());
		txtPlayerChar_0.setBackground(new Color(222, 184, 135));
		txtPlayerChar_0.setEditable(false);
		txtPlayerChar_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtPlayerChar_0.setBounds(10, 82, 335, 52);
		contentPane.add(txtPlayerChar_0);
		
		JButton btnBattle_0 = new JButton("Battle");
		btnBattle_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rnd = ga.randomGenerator(aiList.size()-1);
				
				BattleWindow window = new BattleWindow(playerList.get(0),aiList.get(rnd));
				window.setVisible(true);
				}
		});
		btnBattle_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
		btnBattle_0.setBounds(360, 97, 89, 23);
		contentPane.add(btnBattle_0);
		
		//Player Combatant 2
		JTextArea txtPlayerChar_1 = new JTextArea(playerList.get(1).toString());
		txtPlayerChar_1.setBackground(new Color(222, 184, 135));
		txtPlayerChar_1.setEditable(false);
		txtPlayerChar_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtPlayerChar_1.setBounds(10, 145, 335, 52);
		contentPane.add(txtPlayerChar_1);
		
		JButton btnBattle_1 = new JButton("Battle");
		btnBattle_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
		btnBattle_1.setBounds(360, 158, 89, 23);
		contentPane.add(btnBattle_1);
		
		//Player Combatant 3
		JTextArea txtPlayerChar_2 = new JTextArea(playerList.get(2).toString());
		txtPlayerChar_2.setBackground(new Color(222, 184, 135));
		txtPlayerChar_2.setEditable(false);
		txtPlayerChar_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtPlayerChar_2.setBounds(10, 208, 335, 52);
		contentPane.add(txtPlayerChar_2);
		
		JButton btnBattle_2 = new JButton("Battle");
		btnBattle_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
		btnBattle_2.setBounds(360, 229, 89, 23);
		contentPane.add(btnBattle_2);
		
		//Player Combatant 4
		JTextArea txtPlayerChar_3 = new JTextArea(playerList.get(3).toString());
		txtPlayerChar_3.setBackground(new Color(222, 184, 135));
		txtPlayerChar_3.setEditable(false);
		txtPlayerChar_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtPlayerChar_3.setBounds(10, 271, 335, 52);
		contentPane.add(txtPlayerChar_3);
		
		JButton btnBattle_3 = new JButton("Battle");
		btnBattle_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
		btnBattle_3.setBounds(360, 291, 89, 23);
		contentPane.add(btnBattle_3);
		
		//Player Combatant 5
		JTextArea txtPlayerChar_4 = new JTextArea(playerList.get(4).toString());
		txtPlayerChar_4.setBackground(new Color(222, 184, 135));
		txtPlayerChar_4.setEditable(false);
		txtPlayerChar_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtPlayerChar_4.setBounds(10, 337, 335, 52);
		contentPane.add(txtPlayerChar_4);
		
		JButton btnBattle_4 = new JButton("Battle");
		btnBattle_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
		btnBattle_4.setBounds(360, 352, 89, 23);
		contentPane.add(btnBattle_4);
		
		
		//AI Combatant 1
		JTextArea txtAIChar_0 = new JTextArea(aiList.get(0).toString());
		txtAIChar_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtAIChar_0.setEditable(false);
		txtAIChar_0.setBackground(new Color(222, 184, 135));
		txtAIChar_0.setBounds(551, 97, 335, 52);
		contentPane.add(txtAIChar_0);
		
		//AI Combatant 2
		JTextArea txtAIChar_1 = new JTextArea(aiList.get(1).toString());
		txtAIChar_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtAIChar_1.setEditable(false);
		txtAIChar_1.setBackground(new Color(222, 184, 135));
		txtAIChar_1.setBounds(551, 160, 335, 52);
		contentPane.add(txtAIChar_1);
		
		//AI Combatant 3
		JTextArea txtAIChar_2 = new JTextArea(aiList.get(2).toString());
		txtAIChar_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtAIChar_2.setEditable(false);
		txtAIChar_2.setBackground(new Color(222, 184, 135));
		txtAIChar_2.setBounds(551, 223, 335, 52);
		contentPane.add(txtAIChar_2);
		
		//AI Combatant 4
		JTextArea txtAIChar_3 = new JTextArea(aiList.get(3).toString());
		txtAIChar_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtAIChar_3.setEditable(false);
		txtAIChar_3.setBackground(new Color(222, 184, 135));
		txtAIChar_3.setBounds(551, 286, 335, 52);
		contentPane.add(txtAIChar_3);
		
		
		//AI Combatant 5
		JTextArea txtAIChar_4 = new JTextArea(aiList.get(4).toString());
		txtAIChar_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
		txtAIChar_4.setEditable(false);
		txtAIChar_4.setBackground(new Color(222, 184, 135));
		txtAIChar_4.setBounds(551, 352, 335, 52);
		contentPane.add(txtAIChar_4);
		
	
		
		}
}
