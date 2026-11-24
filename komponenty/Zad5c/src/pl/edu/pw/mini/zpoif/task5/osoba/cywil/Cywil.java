package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

import pl.edu.pw.mini.zpoif.task5.osoba.Zawodowiec;

public abstract class Cywil extends Zawodowiec {

	protected String opisDzialalnosci;

	public Cywil() {
		
	}
	
	public Cywil(String imie, String nazwisko, int wiek) {
		super(imie, nazwisko, wiek);
	}

}
