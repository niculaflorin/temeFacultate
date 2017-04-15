package mds.servicii;

public class TermoDinamica {
	
	/*
	 * numarul de moli
	 * masa / miu
	 */
	public double moli(double m, double miu) {
		return m / miu;
	}
	
	/*
	 * presiune gaz
	 * (1 / 3) * (n * m * v^2)
	 */
	public double presiune(double n, double m, double v) {
		return (1 / 3) * (n * m * (v * v));
	}
	
	/*
	 * ecuatia termica a gazului ideal
	 * n * k * T
	 */
	public double gaz_ideal(double n, double k, double t) {
		return n * k * t;
	}
}