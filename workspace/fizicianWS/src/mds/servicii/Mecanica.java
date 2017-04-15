package mds.servicii;

public class Mecanica {

	/*
	 * Forta masa * acceleratie
	 */
	public double getForta(double masa, double acc) {
		return masa * acc;
	}

	/*
	 * Forta elastica elasticitatea * deformatia
	 */
	public double getFortaElastica(double k, double x) {
		return ((-1) * k) * x;
	}

	/*
	 * Forta de frecare miu * Normala
	 */
	public double getFortaFrecare(double miu, double masa, double g) {
		return miu * masa * g;
	}

	/*
	 * Lucru mecanic\ forta * distanta * cos(X)
	 */
	public double getLucruMecanic(double forta, double dist, double x) {
		return forta * dist * Math.cos(x);
	}
}