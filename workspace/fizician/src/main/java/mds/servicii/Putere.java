
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
 *         &lt;element name="u" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "u",
    "i"
})
@XmlRootElement(name = "putere")
public class Putere {

    protected double u;
    protected double i;

    /**
     * Gets the value of the u property.
     * 
     */
    public double getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     */
    public void setU(double value) {
        this.u = value;
    }

    /**
     * Gets the value of the i property.
     * 
     */
    public double getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     */
    public void setI(double value) {
        this.i = value;
    }

}
