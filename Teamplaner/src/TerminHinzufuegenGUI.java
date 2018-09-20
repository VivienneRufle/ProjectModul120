import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class TerminHinzufuegenGUI extends JFrame implements ActionListener{
	
	JFrame frameStartbildschirm = null;
	JFrame frameTermininformation = null;
	JFrame frameTerminhinzufuegen = null;
	JFrame frameTermineditieren = null;
	
	//JPanel
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	//Titel
	JLabel labelTitel = new JLabel("Titel:");
	JTextField textTitel = new JTextField();
	//Beschreibung
	JLabel labelBeschreibung = new JLabel("Beschreibung:");
	JTextField textBeschreibung = new JTextField();
	//Datum
	JLabel labelDatum = new JLabel("Datum:");
	JTextField textDatum = new JTextField();
	//Start Zeit
	String[] stringStartZeit = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};
	JComboBox comboBoxStartZeit = new JComboBox(stringStartZeit);
	JLabel labelStartZeit = new JLabel("Start Zeit:");
	JTextField textStartZeit = new JTextField();
	//Endzeit
	String[] stringEndzeit = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};
	JComboBox comboBoxEndzeit = new JComboBox(stringStartZeit);
	JLabel labelEndzeit = new JLabel("Endzet:");
	JTextField textEndzeit = new JTextField();
	//Infos
	JLabel labelInfos = new JLabel("Informationen:");
	JTextField textInfos = new JTextField();
	//Buttons
	JButton buttonAbbrechen = new JButton("Abbrechen");
	JButton buttonHinzufuegen = new JButton("Hinzufügen");
	
	public TerminHinzufuegenGUI() {
		setLayout(new BorderLayout());
		
		add((centerPanel), BorderLayout.CENTER);
		add((southPanel), BorderLayout.SOUTH);
		
		centerPanel.setLayout(new GridLayout(6, 2));
		
		//Titel
		centerPanel.add(labelTitel);
		centerPanel.add(textTitel);
		//Beschreibung
		centerPanel.add(labelBeschreibung);
		centerPanel.add(textBeschreibung);
		//Datum
		centerPanel.add(labelDatum);
		centerPanel.add(textDatum);
		//Start Zeit
		centerPanel.add(labelStartZeit);
		centerPanel.add(comboBoxStartZeit);
		//Endzeit
		centerPanel.add(labelEndzeit);
		centerPanel.add(comboBoxEndzeit);
		//Infos
		centerPanel.add(labelInfos);
		centerPanel.add(textInfos);

		southPanel.setLayout(new GridLayout(1, 2));
		
		southPanel.add(buttonAbbrechen);
		southPanel.add(buttonHinzufuegen);
		
		//Buttons
		buttonAbbrechen.addActionListener(this);
		buttonHinzufuegen.addActionListener(this);
		
		//comboBox Start Zeit
		comboBoxStartZeit.setSelectedIndex(17);
		comboBoxStartZeit.addActionListener(this);
		//comboBox Endzeit
		comboBoxEndzeit.setSelectedIndex(20);
		comboBoxEndzeit.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 300);
		setVisible(true);
		setTitle("Termin hinzufügen");
	}
	
	
	
	public static void main(String[] args) {
		TerminHinzufuegenGUI gui = new TerminHinzufuegenGUI();
		
		StartbildschirmGUI startbildschirm = new StartbildschirmGUI();
		TerminHinzufuegenGUI terminhinzufuegen = new TerminHinzufuegenGUI();
		TermininformationGUI termininformation = new TermininformationGUI();
		TerminEditierenGUI termineditieren = new TerminEditierenGUI();
		
		terminhinzufuegen.setframeStartbildschirm(startbildschirm);
		
		terminhinzufuegen.setframeStartbildschirm(startbildschirm);
		
		terminhinzufuegen.setVisible(true);
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
		if (e.getSource() == buttonAbbrechen) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
		}
		if (e.getSource() == buttonHinzufuegen) {
			frameStartbildschirm.setVisible(true);
			setVisible(false);
		}
		
	}
}
