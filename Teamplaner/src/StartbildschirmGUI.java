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
	//Frames
	JFrame frameTermininformation = null;
	JFrame frameTerminhinzufuegen = null;
	
	//Panel
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	//Buttons | Termineinträge
	JButton example1 = new JButton("<html><b>Termin1</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example2 = new JButton("<html><b>Termin2</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example3 = new JButton("<html><b>Termin3</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example4 = new JButton("<html><b>Termin4</b><br>19.09.2018 - 19:00Uhr<html>");
	JButton example5 = new JButton("<html><b>Termin5</b><br>19.09.2018 - 19:00Uhr<html>");
	
	//Button
	JButton add = new JButton("+");
	
	public StartbildschirmGUI(){
		//Layout
		setLayout(new BorderLayout());
		
		//"grund" Panel
		add((centerPanel), BorderLayout.CENTER);
		add((southPanel), BorderLayout.SOUTH);
		
		//center Panel
		centerPanel.setLayout(new GridLayout(4, 1));
		//Buttons platzieren
		centerPanel.add(example1);
		centerPanel.add(example2);
		centerPanel.add(example3);
		centerPanel.add(example4);
		//Buttons ToolTip | Termineinträge
		example1.setToolTipText("<html><b>Termin1</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example2.setToolTipText("<html><b>Termin2</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example3.setToolTipText("<html><b>Termin3</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		example4.setToolTipText("<html><b>Termin4</b><br>Beschreibung des Termins<br>19.09.2018<br>19:00Uhr - 20:00Uhr<br>zugesagt");
		//Button Farbe | Termineinträge
		example1.setOpaque(true);
		example2.setOpaque(true);
		example3.setOpaque(true);
		example4.setOpaque(true);
		//Button Farbe | Termineinträge
		example1.setBackground(Color.GREEN);
		example2.setBackground(Color.GREEN);
		example3.setBackground(Color.GRAY);
		example4.setBackground(Color.RED);
		
		//south Panel
		southPanel.setLayout(new GridLayout(1, 1));
		//Button
		southPanel.add(add);
		//Button aktivieren | Termineinträge
		example1.addActionListener(this);
		example2.addActionListener(this);
		example3.addActionListener(this);
		example4.addActionListener(this);
		//Button aktivieren
		add.addActionListener(this);
		
		//View allgemein
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 350);
		setVisible(true);
		setTitle("Termin übersicht");
		
	}
	
	public static void main(String[] args) {
		//starter
		StartbildschirmGUI gui = new StartbildschirmGUI();
		
		//Views
		StartbildschirmGUI startbildschirm = new StartbildschirmGUI();
		TerminHinzufuegenGUI terminhinzufuegen = new TerminHinzufuegenGUI();
		TermininformationGUI termininformation = new TermininformationGUI();
		TerminEditierenGUI termineditieren = new TerminEditierenGUI();
		
		//View wechsel startbildschirm -> termininformation|terminhinzufügen
		startbildschirm.setframeTermininformation(termininformation);
		startbildschirm.setframeTerminhinzufuegen(terminhinzufuegen);
		
		//View wechsel terminhinzufügen -> startbildschirm
		terminhinzufuegen.setframeStartbildschirm(startbildschirm);
		
		//View wechsel termininformation -> startbildschirm|termineditieren
		termininformation.setframeStartbildschirm(startbildschirm);
		termininformation.setframeTermineditieren(termineditieren);
		
		//View wechsel termineditieren -> Termininfo
		termineditieren.setframeTermininformation(termininformation);
		
		//aktuelles view sichtbar
		startbildschirm.setVisible(true);
	}
	
	//View wechsel zu termininfo
	public void setframeTermininformation(JFrame frameTermininformation) {
        this.frameTermininformation = frameTermininformation;
    }
	//View  wechsel zu terminhinzufügen
	public void setframeTerminhinzufuegen(JFrame frameTerminhinzufuegen) {
        this.frameTerminhinzufuegen = frameTerminhinzufuegen;
    }
	

	public void actionPerformed(ActionEvent e) {
		
		//wenn Button -> view wechsel zu termininfo
		if (e.getSource() == example1) {
			frameTermininformation.setVisible(true);
			setVisible(false);
		}
		//wenn Button -> view wechsel zu termininfo
		if(e.getSource() == add) {
			frameTerminhinzufuegen.setVisible(true);
			setVisible(false);
		}
	}
	

}
