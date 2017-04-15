
package mds.servicii;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="m" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="v" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "n",
    "m",
    "v"
})
@XmlRootElement(name = "presiune")
public class Presiune {

    protected double n;
    protected double m;
    protected double v;

    /**
     * Gets the value of the n property.
     * 
     */
    public double getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     */
    public void setN(double value) {
        this.n = value;
    }

    /**
     * Gets the value of the m property.
     * 
     */
    public double getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     */
    public void setM(double value) {
        this.m = value;
    }

    /**
     * Gets the value of the v property.
     * 
     */
    public double getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     * 
     */
    public void setV(double value) {
        this.v = value;
    }

}
