package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

public class OficerKontrwywiadu extends Wojskowy {
	
	protected String nazwaOperacji;
	
	public OficerKontrwywiadu() {
		
	}
	
	public OficerKontrwywiadu(String imie, String nazwisko, int wiek, String nazwaOperacji) {
		super(imie, nazwisko, wiek);
		this.nazwaOperacji = nazwaOperacji;
	}

}
