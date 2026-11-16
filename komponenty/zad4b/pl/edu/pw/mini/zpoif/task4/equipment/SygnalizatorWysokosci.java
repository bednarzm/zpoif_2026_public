package pl.edu.pw.mini.zpoif.task4.equipment;

public class SygnalizatorWysokosci {

	private int wysokoscProstej;
	private int wysokoscOtwarcia;
	private int wysokoscWejscia;

	public SygnalizatorWysokosci() {
		wysokoscProstej = 100;
		wysokoscOtwarcia = 1200;
		wysokoscWejscia = 500;
	}

	public SygnalizatorWysokosci(int wysokoscProstej, int wysokoscOtwarcia, int wysokoscWejscia) {
		super();
		this.wysokoscProstej = wysokoscProstej;
		this.wysokoscOtwarcia = wysokoscOtwarcia;
		this.wysokoscWejscia = wysokoscWejscia;
	}

	public Integer getWysokoscOtwarcia() {
		return wysokoscOtwarcia;
	}

	public Integer getWysokoscWejscia() {
		return wysokoscWejscia;
	}

	public void setWysokoscOtwarcia(int wysokoscOtwarcia) {
		this.wysokoscOtwarcia = wysokoscOtwarcia;
	}

	public void setWysokoscWejscia(int wysokoscWejscia) {
		this.wysokoscWejscia = wysokoscWejscia;
	}
	
}
