
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
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="acc" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "masa",
    "acc"
})
@XmlRootElement(name = "getForta")
public class GetForta {

    protected double masa;
    protected double acc;

    /**
     * Gets the value of the masa property.
     * 
     */
    public double getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     */
    public void setMasa(double value) {
        this.masa = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     */
    public double getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     */
    public void setAcc(double value) {
        this.acc = value;
    }

}
