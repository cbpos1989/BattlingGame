/**
 * 
 */

package com.github.cbpos1989.BattlingGame;
/**
 * Class that open a Battle Window. Player attacks opponents then defends.
 * 
 * @author Colm O'Sullivan
 *
 */

import java.awt.BorderLayout;
//import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BattleWindow extends JFrame {
	public static String combatReport = null;
	public static boolean isPlayerTurn = false;
	
	private GameApp ga = new GameApp();
	private JPanel contentPane;
	
	private JLabel lblPlayerWillpower = new JLabel();
	private JLabel lblAIWillpower = new JLabel();
	private JLabel lblCombat = new JLabel(combatReport);
	

	/**
	 * Create the frame.
	 */
	public BattleWindow(Character playerCombatant, Character aiCombatant) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblBattle = new JLabel("Battle");
		lblBattle.setHorizontalAlignment(SwingConstants.CENTER);
		lblBattle.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblBattle.setBounds(215, 11, 158, 40);
		contentPane.add(lblBattle);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isPlayerTurn = true;
				
				if(GameMenu.isBattling){
					ga.attack(playerCombatant, aiCombatant);
					
					lblPlayerWillpower.setText("Willpower: " + playerCombatant.getWillpower());
					lblAIWillpower.setText("Willpower: " + aiCombatant.getWillpower());
					lblCombat.setText(combatReport);
				}
			}
		});
		btnAttack.setBounds(241, 73, 111, 40);
		contentPane.add(btnAttack);
		
		JButton btnDefend = new JButton("Defend");
		btnDefend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isPlayerTurn = false;
				
				if(GameMenu.isBattling){
					ga.attack(aiCombatant, playerCombatant);
					
					lblPlayerWillpower.setText("Willpower: " + playerCombatant.getWillpower());
					lblAIWillpower.setText("Willpower: " + aiCombatant.getWillpower());
					lblCombat.setText(combatReport);
				}
			}
		});
		btnDefend.setBounds(241, 153, 111, 40);
		contentPane.add(btnDefend);
		
		//Combatant Player
		JLabel lblPlayer = new JLabel(playerCombatant.getName());
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayer.setBounds(23, 101, 184, 40);
		contentPane.add(lblPlayer);
		
		lblPlayerWillpower.setText("Willpower: " + playerCombatant.getWillpower());
		lblPlayerWillpower.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerWillpower.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblPlayerWillpower.setBounds(23, 170, 184, 40);
		contentPane.add(lblPlayerWillpower);
		
		//Combatant AI
		JLabel lblAI = new JLabel(aiCombatant.getName());
		lblAI.setHorizontalAlignment(SwingConstants.CENTER);
		lblAI.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblAI.setBounds(376, 101, 184, 40);
		contentPane.add(lblAI);
		
		lblAIWillpower.setText("Willpower: " + aiCombatant.getWillpower());
		lblAIWillpower.setHorizontalAlignment(SwingConstants.CENTER);
		lblAIWillpower.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblAIWillpower.setBounds(376, 170, 184, 40);
		contentPane.add(lblAIWillpower);
		
		lblCombat.setText(combatReport);
		lblCombat.setHorizontalAlignment(SwingConstants.CENTER);
		lblCombat.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 18));
		lblCombat.setBounds(164, 242, 256, 40);
		contentPane.add(lblCombat);
		
		
			
		
	}

}
