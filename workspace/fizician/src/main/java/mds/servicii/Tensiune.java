
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
 *         &lt;element name="l" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="q" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "l",
    "q"
})
@XmlRootElement(name = "tensiune")
public class Tensiune {

    protected double l;
    protected double q;

    /**
     * Gets the value of the l property.
     * 
     */
    public double getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     */
    public void setL(double value) {
        this.l = value;
    }

    /**
     * Gets the value of the q property.
     * 
     */
    public double getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     */
    public void setQ(double value) {
        this.q = value;
    }

}
