import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TermininformationGUI extends JFrame implements ActionListener{
	JFrame frameStartbildschirm = null;
	JFrame frameTermininformation = null;
	JFrame frameTerminhinzufuegen = null;
	JFrame frameTermineditieren = null;
	
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JPanel southPanelup = new JPanel();
	JPanel southPaneldown = new JPanel();
	//Titel
	JLabel labelTitel = new JLabel("<html><b>Titel</b><html>");
	JLabel labelTitelLeer = new JLabel("");
	//Beschreibung
	JLabel labelBeschreibung = new JLabel("Beschreibung");
	JLabel labelBeschreibungLeer = new JLabel("");
	//Datum
	JLabel labelDatumText = new JLabel("Datum:");
	JLabel labelDatum = new JLabel("DD.MM.YYYY");
	//StartZeit
	JLabel labelStartZeitText = new JLabel ("Beginn:");
	JLabel labelStartZeit = new JLabel("HH:MM");
	//EndZeit
	JLabel labelEndzeitText = new JLabel("Ende:");
	JLabel labelEndzeit = new JLabel("HH:MM");
	//Zusage
	JLabel labelZusagenText = new JLabel("Zusagen:");
	JLabel labelZusgae = new JLabel("X Zusagen     | XX%");
	//Absage
	JLabel labelAbsagenText = new JLabel("Absagen:");
	JLabel labelAbsage = new JLabel("X Absagen     | XX%");
	//Infos
	JLabel labelInfos = new JLabel("Info Info Info");
	//Button
	JButton buttonzuruck = new JButton("Zurück");
	JButton buttoneditieren = new JButton ("editieren");
	JButton buttonloschen = new JButton ("löschen");
	JButton buttonZusagen = new JButton("Zusagen");
	JButton buttonAbsagen = new JButton("Absagen");
	
	
	public TermininformationGUI() {
		setLayout(new BorderLayout());
		
		add((centerPanel), BorderLayout.CENTER);
		add((southPanel), BorderLayout.SOUTH);
		
		//Center Panel Labels setzen
		centerPanel.setLayout(new GridLayout(8, 2));
		centerPanel.add(labelTitel);
		centerPanel.add(labelTitelLeer);
		centerPanel.add(labelBeschreibung);
		centerPanel.add(labelBeschreibungLeer);
		centerPanel.add(labelDatumText);
		centerPanel.add(labelDatum);
		centerPanel.add(labelStartZeitText);
		centerPanel.add(labelStartZeit);
		centerPanel.add(labelEndzeitText);
		centerPanel.add(labelEndzeit);
		centerPanel.add(labelZusagenText);
		centerPanel.add(labelZusgae);
		centerPanel.add(labelAbsagenText);
		centerPanel.add(labelAbsage);
		centerPanel.add(labelInfos);

		//SouthPanel Panel setzen
		southPanel.setLayout(new GridLayout(2, 1));
		southPanel.add(southPanelup);
		southPanel.add(southPaneldown);
		
		//southPanelUp Buttons setzen
		southPanelup.setLayout(new GridLayout(1, 3));
		southPanelup.add(buttonzuruck);
		southPanelup.add(buttoneditieren);
		southPanelup.add(buttonloschen);
		
		//SouthPanelDown Buttons setzen
		southPaneldown.setLayout(new GridLayout(1, 2));
		southPaneldown.add(buttonZusagen);
		southPaneldown.add(buttonAbsagen);
		
		//Button aktivieren
		buttonzuruck.addActionListener(this);
		buttoneditieren.addActionListener(this);
		buttonloschen.addActionListener(this);
		buttonZusagen.addActionListener(this);
		buttonAbsagen.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 300);
		setVisible(true);
		setTitle("Termininformation");
	}
	
	public static void main(String[] args) {
		TermininformationGUI gui = new TermininformationGUI();
		
		StartbildschirmGUI startbildschirm = new StartbildschirmGUI();
		TerminHinzufuegenGUI terminhinzufuegen = new TerminHinzufuegenGUI();
		TermininformationGUI termininformation = new TermininformationGUI();
		TerminEditierenGUI termineditieren = new TerminEditierenGUI();
		
		termininformation.setframeStartbildschirm(startbildschirm);
		
		termininformation.setframeTermineditieren(termineditieren);
		
		termininformation.setVisible(true);
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == buttonzuruck) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
			System.out.println("zurück auf Startbildschirm");
		}
		
		if (e.getSource() == buttonloschen) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
			System.out.println("löschen auf Startbildschirm");
		}
		
		if (e.getSource() == buttoneditieren) {
			frameTermineditieren.setVisible(true);
			setVisible(false);
			System.out.println("editieren auf Termin editieren");
		}
	}
}
