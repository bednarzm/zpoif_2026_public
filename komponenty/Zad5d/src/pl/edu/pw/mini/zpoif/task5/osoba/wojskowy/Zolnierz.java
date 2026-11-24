package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

public class Zolnierz extends Wojskowy {

	public Zolnierz() {
	}
	
	public Zolnierz(String imie, String nazwisko, int wiek) {
		super(imie, nazwisko, wiek);
	}

	private void strzelajPojedynczo() {
		System.out.println("Pach, pach...");
	}

	private void strzelajSeria() {
		System.out.println("Tratatatata...");
	}

	private void pospiewajDoMarszu() {
		System.out.println("Raz, dwa lewa, raz dwa lewa... ");
	}

	private void zlozMeldunek() {
		System.out.println("Melduje poslusznie ze ... ");
	}
}