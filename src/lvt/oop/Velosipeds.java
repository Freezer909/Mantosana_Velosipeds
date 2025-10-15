package lvt.oop;

import java.util.Random;

public class Velosipeds {
	double ritenaD;
	//Atributi
	private double sedeklaPoz;
	private Double atrumsMS, cena;
	private String razotajs;
 	
	
	//Konstruktors
	public Velosipeds(double ritenaD, double sedeklaPoz, double cena, String razotajs) {
		this.ritenaD = ritenaD;
		this.sedeklaPoz = sedeklaPoz;
		atrumsMS = kustibasAtr();
		this.cena =cena;
		this.razotajs= razotajs;
	}

	public double kustibasAtr() {
		Random rand = new Random();
		 double celsM, laiksS;
		 celsM = rand.nextDouble()*(1000-1)+1;
		 laiksS = rand.nextDouble()*(60-10)+10;
		 return Math.round(celsM/laiksS);
	}
	
	
	
	public double getRitenaD() {
		return ritenaD;
	}

	public double getSedeklaPoz() {
		return sedeklaPoz;
	}
	
	public Double getAtr() {
		return atrumsMS;
	}

	public Double getCena() {
		return cena;
	}

	public String getRazotajs() {
		return razotajs;
	}

	
	
	public String izvadit() {
		return "Riteņa ražotājs: "+getRazotajs()+
				"\nRiteņa cena: "+getCena()+" EUR"+
				"\nRiteņa lielums collās: "+getRitenaD()+
				"\nIestatītais sedekļa augstums: "+getSedeklaPoz()
				+"\nKustības ātrums: "+kustibasAtr()+"m\s";
	}
	
	public void iestatitSedeklaPoz(int pozicija) {
		sedeklaPoz = pozicija;
	}
	
	public void mities(int minienuSk) {
		atrumsMS =+ getAtr() + (0.15* minienuSk);
	}
	
	public void bremzet(int berze) {
		if(getAtr()>0) {
			atrumsMS -= (getAtr() *0.55) * berze;
			
			if(atrumsMS < 0)
				atrumsMS = 0.0;
		}
	}
	
}
