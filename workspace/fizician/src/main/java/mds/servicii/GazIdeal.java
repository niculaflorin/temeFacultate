
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
 *         &lt;element name="k" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "k",
    "t"
})
@XmlRootElement(name = "gaz_ideal")
public class GazIdeal {

    protected double n;
    protected double k;
    protected double t;

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
     * Gets the value of the k property.
     * 
     */
    public double getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     */
    public void setK(double value) {
        this.k = value;
    }

    /**
     * Gets the value of the t property.
     * 
     */
    public double getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     */
    public void setT(double value) {
        this.t = value;
    }

}
