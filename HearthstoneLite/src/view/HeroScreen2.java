package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.heroes.Hero;

public class HeroScreen2 extends JFrame{
	private JLabel background;
	private JButton Hunter;
	private JButton Mage;
	private JButton Priest;
	private JButton Warlock;
	private JButton Paladin;
	private ArrayList<JButton> heroes;

	public HeroScreen2() {
		heroes = new ArrayList<JButton>();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double swidth = screenSize.getWidth();
		double sheight = screenSize.getHeight();
		
		
		setTitle("Hearthstone: Heroes Of Warcraft");
		setBounds(160, 20, 1600,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		
		ImageIcon ss=new ImageIcon("images/pickP2Hero.jpg");
		
	    background=new JLabel(ss);
		background.setPreferredSize(new Dimension(1580, 880));
		background.setLayout(new BoxLayout(background,BoxLayout.X_AXIS));
		
		Hunter=new JButton();
		Hunter.setIcon(new ImageIcon("images/RexxarUp.png"));
		Hunter.setOpaque(false);
		Hunter.setContentAreaFilled(false);
		Hunter.setBorderPainted(false);
		Hunter.setFocusPainted(false);
	    heroes.add(Hunter);
	
	  
		Mage = new JButton();
		Mage.setIcon(new ImageIcon("images/JainaUp.png"));
		Mage.setOpaque(false);
		Mage.setContentAreaFilled(false);
		Mage.setBorderPainted(false);
		Mage.setFocusPainted(false);
	    heroes.add(Mage);
	
		Paladin=new JButton();
		Paladin.setIcon(new ImageIcon("images/utherUp.png"));
		Paladin.setOpaque(false);
		Paladin.setContentAreaFilled(false);
		Paladin.setBorderPainted(false);
		Paladin.setFocusPainted(false);
	    heroes.add(Paladin);
	
	    Priest = new JButton();
		Priest.setIcon(new ImageIcon("images/AnduinUp.png"));
		Priest.setOpaque(false);
		Priest.setContentAreaFilled(false);
		Priest.setBorderPainted(false);
		Priest.setFocusPainted(false);
	    heroes.add(Priest);
	
	    Warlock = new JButton();
		Warlock.setIcon(new ImageIcon("images/GuldanUp.png"));
		Warlock.setOpaque(false);
		Warlock.setContentAreaFilled(false);
		Warlock.setBorderPainted(false);
		Warlock.setFocusPainted(false);
	    heroes.add(Warlock);
	
	    background.add(Box.createRigidArea(new Dimension(200,0)));
	    background.add(Hunter);
	    background.add(Box.createRigidArea(new Dimension(10,0)));
	    background.add(Mage);
	    background.add(Box.createRigidArea(new Dimension(10,0)));
	    background.add(Paladin);
	    background.add(Box.createRigidArea(new Dimension(10,0)));
	    background.add(Priest);
	    background.add(Box.createRigidArea(new Dimension(10,0)));
	    background.add(Warlock);
	
	add(background);
	
    pack();
    setResizable(false);
    revalidate();
    repaint();
}


	public ArrayList<JButton> getHeroes() {
		return heroes;
	}




	public JLabel getBackgroundd() {
		return background;
	}




	public JButton getHunter() {
		return Hunter;
	}




	public JButton getMage() {
		return Mage;
	}




	public JButton getPriest() {
		return Priest;
	}




	public JButton getWarlock() {
		return Warlock;
	}




	public JButton getPaladin() {
		return Paladin;
	}

}
