/**
 * 
 */
package com.github.cbpos1989.BattlingGame;
/**

 * 
 * @author Colm O'Sullivan
 *
 */
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
/**
 * Class that handles the main Game menu. Displaying the opposing sets of characters and allowing the player to choose who goes into combat.
 * 
 * @author Colm O'Sullivan
 *
 */
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
	public static boolean isBattling = false;
	public static int playerScore = 0;
	public static int aiScore = 0;
	
	private GameApp ga =  new GameApp();
	
	private Character playerCombatant_0 = null;
	private Character playerCombatant_1 = null;
	private Character playerCombatant_2 = null;
	private Character playerCombatant_3 = null;
	private Character playerCombatant_4 = null;
	
	private Character aiCombatant_0 = null;
	private Character aiCombatant_1 = null;
	private Character aiCombatant_2 = null;
	private Character aiCombatant_3 = null;
	private Character aiCombatant_4 = null;
	
	private JPanel contentPane;
	
	private JTextArea txtPlayerChar_0 = new JTextArea();
	private JTextArea txtPlayerChar_1 = new JTextArea();
	private JTextArea txtPlayerChar_2 = new JTextArea();
	private JTextArea txtPlayerChar_3 = new JTextArea();
	private JTextArea txtPlayerChar_4 = new JTextArea();
	
	private JTextArea txtAIChar_0 = new JTextArea();
	private JTextArea txtAIChar_1 = new JTextArea();
	private JTextArea txtAIChar_2 = new JTextArea();
	private JTextArea txtAIChar_3 = new JTextArea();
	private JTextArea txtAIChar_4 = new JTextArea();

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
	public GameMenu() {
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
		
		intializeCharacters();
		
		updatePlayerText();
		updateAIText();
		
		
		}
	
		void intializeCharacters(){
			playerCombatant_0 = GameApp.playerList.get(0);
			playerCombatant_1 = GameApp.playerList.get(1);
			playerCombatant_2 = GameApp.playerList.get(2);
			playerCombatant_3 = GameApp.playerList.get(3);
			playerCombatant_4 = GameApp.playerList.get(4);
			
			aiCombatant_0 = GameApp.aiList.get(0);
			aiCombatant_1 = GameApp.aiList.get(1);
			aiCombatant_2 = GameApp.aiList.get(2);
			aiCombatant_3 = GameApp.aiList.get(3);
			aiCombatant_4 = GameApp.aiList.get(4);
		}

		void updatePlayerText(){
			//Player Combatant 1
			
			txtPlayerChar_0.setText(playerCombatant_0.toString());
			if(playerCombatant_0.getStatus() == false){
				updateCharacterText(playerCombatant_0, txtPlayerChar_0);
			}
			txtPlayerChar_0.setBackground(new Color(222, 184, 135));
			txtPlayerChar_0.setEditable(false);
			txtPlayerChar_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtPlayerChar_0.setBounds(10, 82, 335, 52);
			contentPane.add(txtPlayerChar_0);
			
			JButton btnBattle_0 = new JButton("Battle");
			btnBattle_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (playerScore < 5 && aiScore < 5) {
						openBattleWindow(GameApp.playerList.get(0));
					} else if(playerScore == 5){
						//TODO Add Pop-up Winning Message
						System.out.println("Player Wins");
					} else{
						//TODO Add Pop-up Losing Message
						System.out.println("Player Loses");
					}
					
				}
			});
			btnBattle_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
			btnBattle_0.setBounds(360, 97, 89, 23);
			contentPane.add(btnBattle_0);
			
			//Player Combatant 2
			txtPlayerChar_1.setText(playerCombatant_1.toString());
			if(playerCombatant_1.getStatus() == false){
				updateCharacterText(playerCombatant_1, txtPlayerChar_1);
			}
			txtPlayerChar_1.setBackground(new Color(222, 184, 135));
			txtPlayerChar_1.setEditable(false);
			txtPlayerChar_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtPlayerChar_1.setBounds(10, 145, 335, 52);
			contentPane.add(txtPlayerChar_1);
			
			JButton btnBattle_1 = new JButton("Battle");
			btnBattle_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (playerScore < 5 && aiScore < 5) {
						openBattleWindow(GameApp.playerList.get(1));
					} else if(playerScore == 5){
						//TODO Add Pop-up Winning Message
						System.out.println("Player Wins");
					} else{
						//TODO Add Pop-up Losing Message
						System.out.println("Player Loses");
					}
				}
			});
			btnBattle_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
			btnBattle_1.setBounds(360, 158, 89, 23);
			contentPane.add(btnBattle_1);
			
			//Player Combatant 3
			txtPlayerChar_2.setText(playerCombatant_2.toString());
			if(playerCombatant_2.getStatus() == false){
				updateCharacterText(playerCombatant_2, txtPlayerChar_2);
			}
			txtPlayerChar_2.setBackground(new Color(222, 184, 135));
			txtPlayerChar_2.setEditable(false);
			txtPlayerChar_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtPlayerChar_2.setBounds(10, 208, 335, 52);
			contentPane.add(txtPlayerChar_2);
			
			JButton btnBattle_2 = new JButton("Battle");
			btnBattle_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (playerScore < 5 && aiScore < 5) {
						openBattleWindow(GameApp.playerList.get(2));
					} else if(playerScore == 5){
						//TODO Add Pop-up Winning Message
						System.out.println("Player Wins");
					} else{
						//TODO Add Pop-up Losing Message
						System.out.println("Player Loses");
					}
				}
			});
			btnBattle_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
			btnBattle_2.setBounds(360, 229, 89, 23);
			contentPane.add(btnBattle_2);
			
			//Player Combatant 4
			txtPlayerChar_3.setText(playerCombatant_3.toString());
			if(playerCombatant_3.getStatus() == false){
				updateCharacterText(playerCombatant_3, txtPlayerChar_3);
			}
			txtPlayerChar_3.setBackground(new Color(222, 184, 135));
			txtPlayerChar_3.setEditable(false);
			txtPlayerChar_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtPlayerChar_3.setBounds(10, 271, 335, 52);
			contentPane.add(txtPlayerChar_3);
			
			JButton btnBattle_3 = new JButton("Battle");
			btnBattle_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (playerScore < 5 && aiScore < 5) {
						openBattleWindow(GameApp.playerList.get(3));
					} else if(playerScore == 5){
						//TODO Add Pop-up Winning Message
						System.out.println("Player Wins");
					} else{
						//TODO Add Pop-up Losing Message
						System.out.println("Player Loses");
					}
				}
			});
			btnBattle_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
			btnBattle_3.setBounds(360, 291, 89, 23);
			contentPane.add(btnBattle_3);
			
			//Player Combatant 5
			txtPlayerChar_4.setText(playerCombatant_4.toString());
			if(playerCombatant_4.getStatus() == false){
				updateCharacterText(playerCombatant_4, txtPlayerChar_4);
			}
			txtPlayerChar_4.setBackground(new Color(222, 184, 135));
			txtPlayerChar_4.setEditable(false);
			txtPlayerChar_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtPlayerChar_4.setBounds(10, 337, 335, 52);
			contentPane.add(txtPlayerChar_4);
			
			JButton btnBattle_4 = new JButton("Battle");
			btnBattle_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (playerScore < 5 && aiScore < 5) {
						openBattleWindow(GameApp.playerList.get(4));
					} else if(playerScore == 5){
						//TODO Add Pop-up Winning Message
						System.out.println("Player Wins");
					} else{
						//TODO Add Pop-up Losing Message
						System.out.println("Player Loses");
					}
				}
			});
			btnBattle_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 11));
			btnBattle_4.setBounds(360, 352, 89, 23);
			contentPane.add(btnBattle_4);
		}
		
		void updateAIText(){
			//AI Combatant 1
			txtAIChar_0.setText(aiCombatant_0.toString());
			if(aiCombatant_0.getStatus() == false){
				updateCharacterText(aiCombatant_0, txtAIChar_0);
			}
			txtAIChar_0.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtAIChar_0.setEditable(false);
			txtAIChar_0.setBackground(new Color(222, 184, 135));
			txtAIChar_0.setBounds(551, 97, 335, 52);
			contentPane.add(txtAIChar_0);
			
			//AI Combatant 2
			txtAIChar_1.setText(aiCombatant_1.toString());
			if(aiCombatant_1.getStatus() == false){
				updateCharacterText(aiCombatant_1, txtAIChar_1);
			}
			txtAIChar_1.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtAIChar_1.setEditable(false);
			txtAIChar_1.setBackground(new Color(222, 184, 135));
			txtAIChar_1.setBounds(551, 160, 335, 52);
			contentPane.add(txtAIChar_1);
			
			//AI Combatant 3
			txtAIChar_2.setText(aiCombatant_2.toString());
			if(aiCombatant_2.getStatus() == false){
				updateCharacterText(aiCombatant_2, txtAIChar_2);
			}
			txtAIChar_2.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtAIChar_2.setEditable(false);
			txtAIChar_2.setBackground(new Color(222, 184, 135));
			txtAIChar_2.setBounds(551, 223, 335, 52);
			contentPane.add(txtAIChar_2);
			
			//AI Combatant 4
			txtAIChar_3.setText(aiCombatant_3.toString());
			if(aiCombatant_3.getStatus() == false){
				updateCharacterText(aiCombatant_3, txtAIChar_3);
			}
			txtAIChar_3.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtAIChar_3.setEditable(false);
			txtAIChar_3.setBackground(new Color(222, 184, 135));
			txtAIChar_3.setBounds(551, 286, 335, 52);
			contentPane.add(txtAIChar_3);
			
			
			//AI Combatant 5
			txtAIChar_4.setText(aiCombatant_4.toString());
			if(aiCombatant_4.getStatus() == false){
				updateCharacterText(aiCombatant_4, txtAIChar_4);
			}
			txtAIChar_4.setFont(new Font("Lithos Pro Regular", Font.PLAIN, 16));
			txtAIChar_4.setEditable(false);
			txtAIChar_4.setBackground(new Color(222, 184, 135));
			txtAIChar_4.setBounds(551, 352, 335, 52);
			contentPane.add(txtAIChar_4);
		}
	
		void updateCharacterText(Character character, JTextArea textArea){
			textArea.setText(character.getName() + " is Dead");
		}
	
		void openBattleWindow(Character playerCombatant){
			if(playerCombatant.getStatus()){
				isBattling = true;
				BattleWindow.combatReport = null;
				//Cycles through aiList to find a character who is alive
				while(true){
					int rnd = ga.randomGenerator(GameApp.aiList.size());
					System.out.println(rnd);
					if(GameApp.aiList.get(rnd).getStatus()){
						BattleWindow window = new BattleWindow(playerCombatant,GameApp.aiList.get(rnd));
						window.setVisible(true);
						break;
					}
				}
			} else {
				//TODO Add Pop-up Message about character state
				System.out.println(playerCombatant.getName() + " is Dead");
			}
		}
}
