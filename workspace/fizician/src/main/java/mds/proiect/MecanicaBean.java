package mds.proiect;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mds.servicii.Mecanica;
import mds.servicii.MecanicaPortType;

@ManagedBean(name = "mecanica")
@ViewScoped
public class MecanicaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -550396060199753172L;

	// Forta
	private double masa0;
	
	private double masa1;

	private double accelaratia;

	private double forta = 0;

	// Forta Elastica
	private double x;

	private double k;

	private double fortaElsatica;

	// Forta de frecare
	private double miu;

	private double g;

	private double fortaFrecare;

	public void calcForta() {
		Mecanica mec = new Mecanica();
		MecanicaPortType port1 = mec.getMecanicaHttpSoap11Endpoint();
		System.out.println(masa0);
		System.out.println(accelaratia);
		System.out.println("port " + port1.getForta(masa0, accelaratia));
		forta = port1.getForta(masa0, accelaratia);
	}

	public void calcFortaElastica() {
		Mecanica mec = new Mecanica();
		MecanicaPortType port1 = mec.getMecanicaHttpSoap11Endpoint();
		fortaElsatica = port1.getFortaElastica(k, x);
	}

	public void calcFortaFrecare() {
		Mecanica mec = new Mecanica();
		MecanicaPortType port1 = mec.getMecanicaHttpSoap11Endpoint();
		fortaFrecare = port1.getFortaFrecare(miu, masa1, g);
	}


	public double getAccelaratia() {
		return accelaratia;
	}

	public void setAccelaratia(double accelaratia) {
		this.accelaratia = accelaratia;
	}

	public double getForta() {
		return forta;
	}

	public void setForta(double forta) {
		this.forta = forta;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getK() {
		return k;
	}

	public void setK(double k) {
		this.k = k;
	}

	public double getFortaElsatica() {
		return fortaElsatica;
	}

	public void setFortaElsatica(double fortaElsatica) {
		this.fortaElsatica = fortaElsatica;
	}

	public double getMiu() {
		return miu;
	}

	public void setMiu(double miu) {
		this.miu = miu;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getFortaFrecare() {
		return fortaFrecare;
	}

	public void setFortaFrecare(double fortaFrecare) {
		this.fortaFrecare = fortaFrecare;
	}

	public double getMasa0() {
		return masa0;
	}

	public void setMasa0(double masa0) {
		this.masa0 = masa0;
	}

	public double getMasa1() {
		return masa1;
	}

	public void setMasa1(double masa1) {
		this.masa1 = masa1;
	}
}