package lvt.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


public class RitenBraucejs {

	
	
	public static void main(String[] args) {
		String izvele;
		int izvelesID;
		String[] darbibas = {"Jauns ritenis", "Noņemt riteni", "Riteņu saraksts", "Kartot pēc cenas", "Izsaukt metodi", "Aizver programmu"};
		String[] veidi = {"Velosipēds", "Kalnu velosipēds", "Bērnu velosipēds"};
		String[] atbildes = {"Jā", "Nē"};
		ArrayList<Object> riteni = new ArrayList<>();
		
		do {
			izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēlne", JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			if(izvele == null)
				break;
			
			izvelesID = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesID) {
			case 0:
				String izv;
				izv = (String) JOptionPane.showInputDialog(null, "Izvēlies kādu riteni taisīsi", "Izvēlne", JOptionPane.QUESTION_MESSAGE, null, veidi, veidi[0]);
				
				izvelesID = Arrays.asList(veidi).indexOf(izvele);		
				
				double ritenaD = 
						metodes.skaitlaParbaude("Ievadi riteņa diametru", 12, 26);
				
				double sedeklaPoz = 
						metodes.iestatitSedekli();
				
				double cena =
						metodes.skaitlaParbaude("Ievadi riteņa cenu", 1.0, 9999.99);
				
				String razotajs =
						metodes.virknesParbaude("Ievadi saimnieka vārdu", "Pjotrs");
				
				Velosipeds velosipeds = new Velosipeds(ritenaD, sedeklaPoz, cena, razotajs);
				
			switch(izv) {
			
			case "Velosipēds":
				
				
				
				riteni.add(velosipeds);
				break;
			case "Kalnu velosipēds":
				
				
				break;
				
			case "KBērnu velosipēds":
				
				
				
				break;
			
			}
				break;
			}
			
		}while(izvelesID != 5);
	}

}
