package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

public class Szpieg extends Wojskowy {
	
	protected String pseudonim;

	public Szpieg() {
	}
	
	public Szpieg(String imie, String nazwisko, int wiek, String pseudonim) {
		super(imie, nazwisko, wiek);
		this.pseudonim = pseudonim;
	}

	private void porozmawiajZ(OficerKontrwywiadu oficerKontrwywiadu) {
		System.out.println("Rozmawiam z " + oficerKontrwywiadu);
	}
}