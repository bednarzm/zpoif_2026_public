package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

public class Lekarz extends Cywil {
	
	protected String opisSukcesow;

	public Lekarz() {
		
	}
	
	public Lekarz(String imie, String nazwisko, int wiek, String opisSukcesow) {
		super(imie, nazwisko, wiek);
		this.opisSukcesow = opisSukcesow;
	}

}
