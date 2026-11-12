package Vezbe;

import geometry.Point;

public class Auto {
	
	private int brzina;
	private String marka;
	boolean ukljucen;
	
	public Auto() {
		
	}
	
	public Auto(int brzina, String marka) {
		this.brzina = brzina;
		this.marka = marka;
	}
	
	public Auto(int brzina, String marka, boolean ukljucen) {
		this(brzina, marka);
		this.ukljucen = ukljucen;
	}
	
	@Override
	public String toString() {
		if(ukljucen == true)
			return "Objekat klase Auto, marke " + marka + ", koji je trenutno ukljucen i krece se brzinom od " + brzina + "km/h.";
		else
			return "Objekat klase Auto, marke " + marka + ", koji je trenutno iskljucen i ne krece se";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Auto) {
			Auto temp = (Auto)o;
			if(this.marka == temp.marka)
				return true;
		}
		return false;
	}
	
	public int getBrzina() {
		return brzina;
	}
	
	public String getMarka() {
		return marka;
	}

	
	public boolean ukljucen() {
		return ukljucen;
	}
	
	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	
	public void ubrzaj(int brzina) {
		if(ukljucen == true)
		{
			this.brzina = brzina;
			System.out.println("Nova bzrina auta je: " + brzina);
		}
		else
			System.out.println("Auto je iskljucen!");
	}
	
	public void stani() {
		if (ukljucen == true) {
			if(brzina<50)
				System.out.println("Automobil se zaustavio za 4 sekunde");
			else if(brzina > 50 || brzina < 100)
				System.out.println("Automobil se zaustavio za 8 sekudni");
			else if(brzina > 100)
				System.out.println("Automobil se zaustavio za 12 sekudni!!");
		}
		else
			System.out.println("Automobil je iskljucen!!");
	}
	
	public void oAutu() {
		if(ukljucen == true)
			System.out.println("Marka automobila je: " + marka + ". Automobil je ukljucen i krece se brzinom od " + brzina + " km/h.");
		else
			System.out.println("Marka automobila je: " + marka + ". Automobil je iskljucen i ne krece se");
	}


}
