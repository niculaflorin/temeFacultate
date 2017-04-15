package mds.servicii;

public class Electricitate {
	
	/*
	 * tensiunea electrica
	 * Lucru / sarcina
	 */
	public double tensiune(double l, double q) {
		return l / q;
	}
	
	/*
	 * Reistenta
	 * U /I
	 */
	public double rezistenta(double u, double i) {
		return u / i;
	}
	
	/*
	 * Putere
	 * U * I
	 */
	public double putere(double u, double i) {
		return u * i;
	}
}
