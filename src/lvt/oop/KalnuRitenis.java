package lvt.oop;

public class KalnuRitenis extends Velosipeds {

	
		//atributi
		private int iestatAtrums;
		private boolean atsperes;
		
		//Konstruktors
		public KalnuRitenis(int ritenaD, int sedeklaPoz, double cena, String razotajs, int iestatAtrums, boolean atsperes) {
			super(ritenaD, sedeklaPoz, cena, razotajs);
			this.iestatAtrums = iestatAtrums;
			this.atsperes = atsperes;
		}
		
		//Metodes
		public int getIestatAtr() {
			return iestatAtrums;
		}

		public void parslegtAtr(int atr) {
			iestatAtrums = atr;
		}

		public String izvadit() {
			return "Riteņa ražotājs: "+getRazotajs()+
					"\nRiteņa cena: "+getCena()+" EUR"+
					"\nRiteņa lielums collās: "+getRitenaD()+
					"\nIestatītais sedekļa augstums: "+getSedeklaPoz()
					+"\nKustības ātrums: "+kustibasAtr()+"m\s"+
					"\nIestatītais ātrums: "+getIestatAtr()+
					"\nPapiluds amortizācija: "+((atsperes)? "Ir" : "Nav");
		}

}
