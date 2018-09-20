import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class StartbildschirmGUI extends JFrame implements ActionListener{
	
	JFrame frameStartbildschirm = null;
	JFrame frameTermininformation = null;
	JFrame frameTerminhinzufuegen = null;
	JFrame frameTermineditieren = null;
	
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();

	JButton example1 = new JButton("<html><b>Termin1</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example2 = new JButton("<html><b>Termin2</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example3 = new JButton("<html><b>Termin3</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example4 = new JButton("<html><b>Termin4</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example5 = new JButton("<html><b>Termin5</b><br>19.09.2018 - 19:00Uhr<html>");
	
	JButton add = new JButton("+");
	
	public StartbildschirmGUI(){
		
		setLayout(new BorderLayout());
		add((centerPanel), BorderLayout.CENTER);
		add((southPanel), BorderLayout.SOUTH);
		
		centerPanel.setLayout(new GridLayout(4, 1));
		//Buttons plazieren
		centerPanel.add(example1);
		centerPanel.add(example2);
		centerPanel.add(example3);
		centerPanel.add(example4);
		//Buttons ToolTip
		example1.setToolTipText("<html><b>Termin1</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example2.setToolTipText("<html><b>Termin2</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example3.setToolTipText("<html><b>Termin3</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example4.setToolTipText("<html><b>Termin4</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		
		example1.setOpaque(true);
		example2.setOpaque(true);
		example3.setOpaque(true);
		example4.setOpaque(true);
		
		example1.setBackground(Color.GREEN);
		example2.setBackground(Color.GREEN);
		example3.setBackground(Color.GRAY);
		example4.setBackground(Color.RED);

		southPanel.setLayout(new GridLayout(1, 1));
		
		southPanel.add(add);
		
		example1.addActionListener(this);
		example2.addActionListener(this);
		example3.addActionListener(this);
		example4.addActionListener(this);
		
		add.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 300);
		setVisible(true);
		setTitle("Termin übersicht");
		
	}

	public static void main(String[] args) {
		StartbildschirmGUI gui = new StartbildschirmGUI();
		
		StartbildschirmGUI startbildschirm = new StartbildschirmGUI();
		TerminHinzufuegenGUI terminhinzufuegen = new TerminHinzufuegenGUI();
		TermininformationGUI termininformation = new TermininformationGUI();
		TerminEditierenGUI termineditieren = new TerminEditierenGUI();
		
		startbildschirm.setframeTermininformation(termininformation);
		startbildschirm.setframeTerminhinzufuegen(terminhinzufuegen);
		
		terminhinzufuegen.setframeStartbildschirm(startbildschirm);
		
		
		startbildschirm.setVisible(true);
	}
	
	public void setframeTermininformation(JFrame frameTermininformation) {
        this.frameTermininformation = frameTermininformation;
    }
	
	public void setframeTerminhinzufuegen(JFrame frameTerminhinzufuegen) {
        this.frameTerminhinzufuegen = frameTerminhinzufuegen;
    }
	
	public void setframeTermineditieren(JFrame frameTermineditieren) {
        this.frameTermineditieren = frameTermineditieren;
    }
	
	public void setframeStartbildschirm(JFrame frameStartbildschirm) {
        this.frameStartbildschirm = frameStartbildschirm;
    }
	
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == example1) {
			frameTermininformation.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource() == add) {
			frameTerminhinzufuegen.setVisible(true);
			setVisible(false);
		}
	}
	

}
