package pl.edu.pw.mini.zpoif.task5;

public class Silnik {

	protected int moc;
	protected int momentObrotowy;
	protected int masa;

	public Silnik(Integer moc) {
		this.moc = moc;
	}

	public Silnik(Integer moc, Integer momentObrotowy) {
		this.moc = moc;
		this.momentObrotowy = momentObrotowy;
	}

	public Silnik(Integer moc, Integer momentObrotowy, Integer masa) {
		this.moc = moc;
		this.momentObrotowy = momentObrotowy;
		this.masa = masa;
	}

	@Override
	public String toString() {
		return "Silnik [moc=" + moc + ", momentObrotowy=" + momentObrotowy + "]";
	}
	
}

