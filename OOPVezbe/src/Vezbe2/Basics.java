package Vezbe2;

import java.util.Scanner;

public class Basics {
	
	
	public static void prvaVezba() {
		int broj = 50;
		double decimalnaVrednost;
		String tekst = "Ovo je nas prvi string.";
		
		decimalnaVrednost = 20.25;
		
		System.out.println(broj);
		decimalnaVrednost = 22.10;
		System.out.println(decimalnaVrednost);
		System.out.println(tekst);
	}
	
	public static void Provera () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Unesite celobrojnu vrednost");
		int broj = scanner.nextInt();
		if (broj % 2 == 0)
		{
				System.out.println("Broj je paran");
		}
		else {
			System.out.println("Broj je neparan");
		}
	}
	
	public static void Petlja () {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Uneiste broj");
		int broj = scanner.nextInt();
		for (int i = 1; i <= broj; i++)
		{
			System.out.println(i);
		}
		
		/*int brojac = 0;
		while (brojac <= broj)
		{
			System.out.println(brojac);
			brojac++;
		}*/
	}


	public static void main(String[] args) {
		Petlja();

	}

}
