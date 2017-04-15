package mds.proiect;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mds.servicii.Electricitate;
import mds.servicii.ElectricitatePortType;

@ManagedBean(name = "electricitate")
@ViewScoped
public class ElectricitateBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6246430389853854210L;

	Electricitate elec = new Electricitate();

	ElectricitatePortType port = elec.getElectricitateHttpSoap11Endpoint();

	private double l;

	private double q;

	private double u0;

	private double i0;

	private double u1;

	private double i1;

	private double tens;

	private double rez;

	private double putere;

	public void tensiune() {
		tens = port.tensiune(l, q);
	}

	public void rezistenta() {
		rez = port.rezistenta(u0, i0);
	}

	public void putere() {
		putere = port.putere(u1, i1);
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getQ() {
		return q;
	}

	public void setQ(double q) {
		this.q = q;
	}

	public double getTens() {
		return tens;
	}

	public void setTens(double tens) {
		this.tens = tens;
	}

	public double getRez() {
		return rez;
	}

	public void setRez(double rez) {
		this.rez = rez;
	}

	public double getPutere() {
		return putere;
	}

	public void setPutere(double putere) {
		this.putere = putere;
	}

	public double getU0() {
		return u0;
	}

	public void setU0(double u0) {
		this.u0 = u0;
	}

	public double getI0() {
		return i0;
	}

	public void setI0(double i0) {
		this.i0 = i0;
	}

	public double getU1() {
		return u1;
	}

	public void setU1(double u1) {
		this.u1 = u1;
	}

	public double getI1() {
		return i1;
	}

	public void setI1(double i1) {
		this.i1 = i1;
	}

}
