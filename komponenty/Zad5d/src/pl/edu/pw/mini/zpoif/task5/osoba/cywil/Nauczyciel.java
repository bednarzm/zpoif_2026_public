package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

public class Nauczyciel extends Cywil{
	
	protected String opisSukcesow;

	public Nauczyciel() {
		
	}
	
	public Nauczyciel(String imie, String nazwisko, int wiek, String opisSukcesow) {
		super(imie, nazwisko, wiek);
		this.opisSukcesow = opisSukcesow;
	}
	
}
