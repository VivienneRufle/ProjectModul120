import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TermininformationGUI extends JFrame implements ActionListener{
	int zusagen;
	String zusageString;
	int absage;
	String absageString;
	
	//frames
	JFrame frameStartbildschirm = null;
	JFrame frameTermineditieren = null;
	
	//Panel
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
	JLabel labelZusgae = new JLabel("2");
	//Absage
	JLabel labelAbsagenText = new JLabel("Absagen:");
	JLabel labelAbsage = new JLabel("1");
	//Infos
	JLabel labelInfos = new JLabel("Info Info Info");
	//Button
	JButton buttonzuruck = new JButton("Zurück");
	JButton buttoneditieren = new JButton ("editieren");
	JButton buttonloschen = new JButton ("löschen");
	JButton buttonZusagen = new JButton("Zusagen");
	JButton buttonAbsagen = new JButton("Absagen");
	
	
	public TermininformationGUI() {
		//layout
		setLayout(new BorderLayout());
		
		//"grund" layout
		add((centerPanel), BorderLayout.CENTER);
		add((southPanel), BorderLayout.SOUTH);
		
		//Center Panel Labels setzen
		centerPanel.setLayout(new GridLayout(8, 2));
		//titel
		centerPanel.add(labelTitel);
		centerPanel.add(labelTitelLeer);
		//beschreibung
		centerPanel.add(labelBeschreibung);
		centerPanel.add(labelBeschreibungLeer);
		//datum
		centerPanel.add(labelDatumText);
		centerPanel.add(labelDatum);
		//start zeit
		centerPanel.add(labelStartZeitText);
		centerPanel.add(labelStartZeit);
		//endzeit
		centerPanel.add(labelEndzeitText);
		centerPanel.add(labelEndzeit);
		//zusagen
		centerPanel.add(labelZusagenText);
		centerPanel.add(labelZusgae);
		//absagen
		centerPanel.add(labelAbsagenText);
		centerPanel.add(labelAbsage);
		//infos
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
		
		//view allgemein
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 350);
		setVisible(true);
		setTitle("Termininformation");
	}
		
	//view wechsel zu termineditieren
	public void setframeTermineditieren(JFrame frameTermineditieren) {
        this.frameTermineditieren = frameTermineditieren;
    }
	//view wechsel zu startbildschirm
	public void setframeStartbildschirm(JFrame frameStartbildschirm) {
        this.frameStartbildschirm = frameStartbildschirm;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//wenn button -> view wechsel zu startbildschirm
		if (e.getSource() == buttonzuruck) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
		}
		//wenn Button -> view wechsel zu startbildschirm
		if (e.getSource() == buttonloschen) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
		}
		//wenn button ->vie wechsel zu termineditieren
		if (e.getSource() == buttoneditieren) {
			frameTermineditieren.setVisible(true);
			setVisible(false);
		}
		
		//wenn button -> zu termin zusagen
		if (e.getSource() == buttonZusagen) {
			zusagen = Integer.parseInt(labelZusgae.getText());
			zusagen++;
			zusageString = Integer.toString(zusagen);
			labelZusgae.setText(zusageString);
		}
		
		//wenn button -> termin absagen
		if (e.getSource() == buttonAbsagen) {
			absage = Integer.parseInt(labelAbsage.getText());
			absage++;
			absageString = Integer.toString(absage);
			labelAbsage.setText(absageString);
		}
	}
}
