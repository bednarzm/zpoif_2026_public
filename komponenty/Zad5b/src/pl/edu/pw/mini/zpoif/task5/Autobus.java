package pl.edu.pw.mini.zpoif.task5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobus {

	protected List<Kierowca> kierowcy = new ArrayList<>();
	protected List<DoroslyPasazer> pasazerowie = new ArrayList<>();
	protected Set<Bagaz> bagaze = new HashSet<>();
	protected Silnik silnik;

	private void sayHello() {
		System.out.println("Hello!");
	}

	private double calculateSqrt(int value) {
		return Math.sqrt(value);
	}

	@Override
	public String toString() {
		return "Autobus [kierowcy=" + kierowcy + ", pasazerowie=" + pasazerowie + ", bagaze=" + bagaze + ", silnik="
				+ silnik + "]";
	}

}